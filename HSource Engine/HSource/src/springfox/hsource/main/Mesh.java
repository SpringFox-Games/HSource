package springfox.hsource.main;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL15.*;

public class Mesh 
{
	private int vbo;
	private int size;
	
	public Mesh()
	{
		vbo = glGenBuffers();
		size = 0;
	}
	
	public void addVertices(Vertex[] vertices)
	{
		size = vertices.length * Vertex.SIZE;
		
		glBindBuffer(GL_ARRAY_BUFFER,vbo);
		//glBufferDate(GL_ARRAY_BUFFER, );
	}
}
