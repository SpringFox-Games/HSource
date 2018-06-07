package springfox.hsource.main;

public class MainComponent 
{
	
	public static final int WIDTH = 1920;
	public static final int HEIGHT = 1080;
	public static final String TITLE = "HSource SDK";
	
	public MainComponent()
	{
		
	}
	
	public void start()
	{
		run();
	}
	
	public void stop()
	{
		
	}
	
	public void run()
	{
		while(!Window.isCloseRequested())
		{
			render();
		}
	}
	
	public void render()
	{
		Window.render();
	}
	
	public void cleanUp()
	{
		
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
