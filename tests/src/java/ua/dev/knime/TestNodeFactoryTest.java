package ua.dev.knime;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ua.dev.knime.TestNodeFactory;

public class TestNodeFactoryTest {
	
	@Test
    public void testGetNrNodeViews() {
		TestNodeFactory factory = new TestNodeFactory();
		
		int nrviews = factory.getNrNodeViews();
		
		assertEquals(1, nrviews);
	}
}