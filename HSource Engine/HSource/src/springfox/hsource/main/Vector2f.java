package springfox.hsource.main;

public class Vector2f 
{
	private float x;
	
	public Vector2f(float x, float y)
	{
		this.setX(x);
		this.setY(y);
	}
	
	public float length()
	{
		return (float)Math.sqrt(x * x + y * y);
	}
	
	public float dot(Vector2f r)
	{
		return x * r.getX()	+ y * r.getY();
	}
	
	public Vector2f normalize()
	{
		float length = length();
		
		x /= length;
		y /= length;
		
		return this;
	}
	
	public Vector2f rotate(float angle)
	{
		return null;
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
		return "(" + x + "x" + " " + y + "y" + ")";
	}
	
}