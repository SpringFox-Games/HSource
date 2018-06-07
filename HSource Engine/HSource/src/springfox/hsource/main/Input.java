package springfox.hsource.main;

import java.util.ArrayList;
import org.lwjgl.input.Keyboard;

public class Input 
{
	public static final int NUM_KEYCODES = 256;
	
	private static ArrayList<Integer> currentKeys = new ArrayList<Integer>();
	private static ArrayList<Integer> downKeys = new ArrayList<Integer>();
	private static ArrayList<Integer> upKeys = new ArrayList<Integer>();
	
	public static void update()
	{
		upKeys.clear();
		for(int i = 0; i < NUM_KEYCODES; i++)
			if(!getKey(i) && currentKeys.contains(i))
				upKeys.add(i);
		
		downKeys.clear();
		
		for(int i = 0; i < NUM_KEYCODES; i++)
			if(getKey(i) && !currentKeys.contains(i))
				downKeys.add(i);

		currentKeys.clear();
		
		for(int i = 0; i < NUM_KEYCODES; i++)
			if(getKey(i))
				currentKeys.add(i);
	}
	
	public static boolean getKey(int keyCode)
	{
		return Keyboard.isKeyDown(keyCode);
	}
	
	public static boolean getKeyDown(int keyCode)
	{
		if(downKeys.contains(keyCode))
			return true;
		
		return false;
	}
	
	public static boolean getKeyUp(int keyCode)
	{
		if(upKeys.contains(keyCode))
			return false;
		
		return true;
	}
}
