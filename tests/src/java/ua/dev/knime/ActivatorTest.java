package ua.dev.knime;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ActivatorTest {

    @Test
    public void veryStupidTest() {
        assertEquals("sygma-test.plugin", Activator.PLUGIN_ID);
    }
}
