package net.minestom.server;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class InsideTest {
    @Test
    public void inside() {
        assertTrue(ServerFlag.INSIDE_TEST);
    }
}
