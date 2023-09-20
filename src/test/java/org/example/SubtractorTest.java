package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubtractorTest {
    @Test
    void testSubtraction(){
        Subtracter subtracter = new Subtracter();
        int result = subtracter.Subtract(5,2);
        assertEquals(3, result);
    }
}
