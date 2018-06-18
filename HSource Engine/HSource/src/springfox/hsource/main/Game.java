package springfox.hsource.main;

import org.lwjgl.input.Keyboard;

public class Game 
{
	private Mesh mesh;
	private Shader shader;
	private Transform transform;
	
	public Game()
	{
		mesh = new Mesh();
		shader = new Shader();
		
		Vertex[] data = new Vertex[] {new Vertex(new Vector3f(-1,-1,0)),
				                      new Vertex(new Vector3f(-1,1,0)),
									  new Vertex(new Vector3f(0,1,0))};
		
		mesh.addVertices(data);
		
		transform = new Transform();
		
		shader.addVertexShader(ResourceLoader.loadShader("basicVertex.vs"));
		shader.addFragmentShader(ResourceLoader.loadShader("basicFragment.fs"));
		shader.compileShader();
		
		transform.setTranslation((float)Math.sin(temp),	0, 0);
	}
	
	public void input()
	{
		//Mouse and Keyboard Testing
		if(Input.GetKeyDown(Keyboard.KEY_0))
			System.out.println("Pressing 0");
		if(Input.GetMouseDown(1))
			System.out.println("Right Clicking at " + Input.GetMousePosition().toString());
	}
	
	float temp = 0.0f;
	float tempAmount = 0.0f;
	
	public void update()
	{
		temp += Time.getDelta();
		

		transform.setTranslation((float)Math.sin(temp), 0, 0);
		transform.setRotation(0, 0, (float)Math.sin(temp) * 180);
	}
	
	public void render()
	{
		shader.bind();
		shader.setUniform("transform", transform.getTransformation());
		mesh.draw();
	}
}
