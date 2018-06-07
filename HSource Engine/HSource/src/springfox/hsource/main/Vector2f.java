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
		double rad = Math.toRadians(angle);
		double cos = Math.cos(angle);
		
		return null;
	}
	
	public Vector2f add(Vector2f r)
	{
		return new Vector2f(x + r.getX(), y + r.getY());
	}
	
	public Vector2f add(float r)
	{
		return new Vector2f(x + r, y + r);
	}
	
	public Vector2f subtract(Vector2f r)
	{
		return new Vector2f(x - r.getX(), y - r.getY());
	}
	
	public Vector2f subtract(float r)
	{
		return new Vector2f(x - r, y - r);
	}
	
	public Vector2f multiply(Vector2f r)
	{
		return new Vector2f(x * r.getX(), y * r.getY());
	}
	
	public Vector2f multiply(float r)
	{
		return new Vector2f(x * r, y * r);
	}
	
	public Vector2f devide(Vector2f r)
	{
		return new Vector2f(x / r.getX(), y / r.getY());
	}
	
	public Vector2f devide(float r)
	{
		return new Vector2f(x / r, y /+ r);
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
