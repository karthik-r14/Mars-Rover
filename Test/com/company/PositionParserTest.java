package com.company;

import javafx.geometry.Pos;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PositionParserTest {
    PositionParser positionParser;

    @Before
    public void setUp() throws Exception {
        positionParser = new PositionParser("1 1 N");
    }

    @Test
    public void testShouldReturnPositionWhenParseIsInvoked() throws Exception {
        Position position = new Position(1, 1, 'N');
        assertEquals(position, positionParser.parse());
    }
}