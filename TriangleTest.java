package test1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TriangleTest {
	private Triangle tri;

	@Before
	public void setUp() throws Exception {
		tri=new Triangle(3,3,3);
	}

	@Test
	public void testequilateral() {
		assertTrue(tri.isequilateral());
	}
	public void testisosceles() {
		assertTrue(tri.isisosceles());
	}

}
