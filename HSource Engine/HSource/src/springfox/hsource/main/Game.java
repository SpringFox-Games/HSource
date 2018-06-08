package springfox.hsource.main;

import org.lwjgl.input.Keyboard;

public class Game 
{
	private Mesh mesh;
	private Shader shader;
	
	public Game()
	{
		mesh = new Mesh();
		shader = new Shader();
		
		Vertex[] data = new Vertex[] {new Vertex(new Vector3f(-1,-1,0)),
				                      new Vertex(new Vector3f(-1,1,0)),
									  new Vertex(new Vector3f(0,1,0))};
		
		mesh.addVertices(data);
		
		shader.addVertexShader(ResourceLoader.loadShader("basicVertex.vs"));
		shader.addFragmentShader(ResourceLoader.loadShader("basicFragment.fs"));
		shader.compileShader();
	}
	
	public void input()
	{
		//Mouse and Keyboard Testing
		if(Input.GetKeyDown(Keyboard.KEY_0))
			System.out.println("Pressing 0");
		if(Input.GetMouseDown(1))
			System.out.println("Right Clicking at " + Input.GetMousePosition().toString());
	}
	
	public void update()
	{
		
	}
	
	public void render()
	{
		shader.bind();
		mesh.draw();
	}
}
