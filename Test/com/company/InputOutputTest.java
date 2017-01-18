package com.company;

import com.company.InputOutput;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import static org.junit.Assert.assertEquals;

public class InputOutputTest {
    InputOutput inputOutput;

    @Before
    public void setUp() throws Exception {
        String input = "add 5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        inputOutput = new InputOutput();
    }

    @Test
    public void testShouldReturnDataOnInputData() throws Exception {
        assertEquals("add 5", inputOutput.inputData());
        System.setIn(System.in);
    }

    @Test
    public void testShouldDisplayInfoOnOutputData() throws Exception {
        final ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputContent));
        String sample = "sample";

        inputOutput.outputData(sample);

        assertEquals(sample + "\n", outputContent.toString());
        System.setOut(System.out);
    }
}

