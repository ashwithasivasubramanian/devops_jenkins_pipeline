package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class FactorialTest {
    @Test
    public void testFactorialOf5() {
        Factorial f = new Factorial();
        assertEquals(120, f.compute(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeInput() {
        Factorial f = new Factorial();
        f.compute(-1);
    }
}
