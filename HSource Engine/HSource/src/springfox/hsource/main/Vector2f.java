package springfox.hsource.main;

public class Vector2f 
{
	private float x;
	
	public Vector2f(float x, float y)
	{
		this.setX(x);
		this.setY(y);
	}

	private float y;

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	public String toString()
	{
		return "(" + x + " " + "y" + ")";
	}
	
}
