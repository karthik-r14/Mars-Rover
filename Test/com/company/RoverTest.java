package com.company;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class RoverTest {
    Rover rover;

    @Before
    public void setUp() throws Exception {
        rover = new Rover("1 2 N", "LMLMLMLMM");
    }

    @Test
    public void testShouldDisplayFinalPositionWhenItIsInvoked() throws Exception {
        final ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputContent));
        String finalPosition = "Position :1 3 N";

        rover.computeFinalPosition();
        rover.displayFinalPosition();

        assertEquals(finalPosition + "\n", outputContent.toString());
        System.setOut(System.out);
    }
}