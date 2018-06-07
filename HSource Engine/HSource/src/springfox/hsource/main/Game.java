package springfox.hsource.main;

import org.lwjgl.input.Keyboard;

public class Game 
{
	public Game()
	{
		
	}
	
	public void input()
	{
		//Mouse and Keyboard Testing
		if(Input.getKeyDown(Keyboard.KEY_0))
			System.out.println("Pressing 0");
		if(Input.getMouseDown(1))
			System.out.println("Right Clicking at " + Input.getMousePosition().toString());
	}
	
	public void update()
	{
		
	}
	
	public void render()
	{
		
	}
}
