package springfox.hsource.main;

public class Vector3f 
{
	private float x;
	private float y;
	private float z;
	
	public Vector3f(float x, float y, float z)
	{
		this.setX(x);
		this.setY(y);
		this.setZ(z);
	}

	public float length()
	{
		return (float)Math.sqrt(x * x + y * y + z * z);
	}
	
	public float dot(Vector3f r)
	{
		return x * r.getX()	+ y * r.getY() + x * r.getZ();
	}
	
	public Vector3f normalize()
	{
		float length = length();
		
		x /= length;
		y /= length;
		z /= length;
		
		return this;
	}
	
	public Vector3f rotate()
	{
		return null;
	}
	
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

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}
}
