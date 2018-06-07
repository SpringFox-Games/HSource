package springfox.hsource.main;

import org.lwjgl.input.Keyboard;

public class Input 
{
	public boolean getKey(int keyCode)
	{
		return Keyboard.isKeyDown(keyCode);
	}
}
