package com.company;

import com.company.InputOutput;
import com.company.Position;
import org.junit.Before;
import org.junit.Test;
import org.omg.PortableServer.POA;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class PositionTest {
    Position position;

    @Before
    public void setUp() throws Exception {
        position = new Position(1, 1, 'N');
    }

    @Test
    public void testShouldDisplayPosition() throws Exception {

        final ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputContent));
        String position = "Position :1 1 N\n";

        this.position.displayPosition();

        assertEquals(position, outputContent.toString());
        System.setOut(System.out);
    }

    @Test
    public void testShouldReturnXPosition() throws Exception {
        int xPosition = 1;
        assertEquals(xPosition, position.getxPosition());
    }

    @Test
    public void testShouldReturnYPosition() throws Exception {
        int yPosition = 1;
        assertEquals(yPosition, position.getyPosition());
    }

    @Test
    public void testShouldReturnDirection() throws Exception {
        char direction = 'N';

        assertEquals(direction, position.getDirection());
    }
}
