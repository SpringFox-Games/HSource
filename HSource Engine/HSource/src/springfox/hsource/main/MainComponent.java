package springfox.hsource.main;

public class MainComponent 
{
	
	public static final int WIDTH = 1920;
	public static final int HEIGHT = 1080;
	public static final String TITLE = "HSource SDK";
	public static final double FRAME_CAP = 5000.0;
	
	private boolean isRunning;
	private Game game;
	
	public MainComponent()
	{
		isRunning = false;
		game = new Game();
	}
	
	public void start()
	{
		if(isRunning)
			return;
		
		run();
	}
	
	public void stop()
	{
		if(!isRunning)
			return;
		
		isRunning = false;
	}
	
	private void run()
	{
		isRunning = true;
		
		int frames = 0;
		long frameCounter = 0;
		
		final double frameTime = 1.0 / FRAME_CAP;
		
		long lastTime = Time.getTime();
		double unprocessedTime = 0;
		
		
		while(isRunning)
		{
			boolean render = false;
			
			long startTime = Time.getTime();
			long passedTime = startTime - lastTime;
			lastTime = startTime;
			
			unprocessedTime += passedTime / (double)Time.SECOND;
			frameCounter += passedTime;
			
			while(unprocessedTime > frameTime)
			{
				render = true;
				
				unprocessedTime -= frameTime;
				
				if(Window.isCloseRequested())
					stop();
				
				game.input();
				game.update();
				
				if(frameCounter >= Time.SECOND)
				{
					System.out.println(frames);
					frames = 0;
					frameCounter = 0;
				}
			}
			if (render)
			{
				render();
				frames++;
			}
			else
			{
				try 
				{
				Thread.sleep(1);
				} catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
		}
		
		cleanUp();
	}
	
	private void render()
	{
		game.render();
		Window.render();
	}
	
	private void cleanUp()
	{
		Window.dispose();
	}
	
    public static void main(String[] args)
    {
    	System.out.println("@-- HSource");
    	System.out.println("@-- Version 0.0.1");
    	System.out.println("Starting!");	
    	Window.createWindow(WIDTH, HEIGHT, TITLE);
    	
    	MainComponent game = new MainComponent();
    	
    	game.start();
    }
}
