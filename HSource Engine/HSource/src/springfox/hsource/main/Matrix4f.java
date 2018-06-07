package springfox.hsource.main;

public class Matrix4f 
{
	private float[][] m;
	
	public Matrix4f()
	{
		setM(new float[4][4]);
	}

	public void initIdentity()
	{
		m[0][0] = 1;	m[0][1] = 0;	m[0][2] = 0;	m[0][3] = 0;
		m[1][0] = 0;	m[1][1] = 1;	m[1][2] = 0;	m[1][3] = 0;
		m[2][0] = 0;	m[2][1] = 0;	m[2][2] = 1;	m[2][3] = 0;
		m[3][0] = 0;	m[3][1] = 0;	m[3][2] = 0;	m[3][3] = 1;
	}
	
	public float[][] getM() {
		return m;
	}
	
	public float get(int x, int y)
	{
		return m[x][y];
	}

	public void setM(float[][] m) {
		this.m = m;
	}
	
	public void set(int x, int y, float value)
	{
		m[x][y] = value;
	}
}
