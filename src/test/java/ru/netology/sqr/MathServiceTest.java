package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathServiceTest {

    @Test
    void calculateSqrtCeil() {
        MathService service = new MathService();
        int expected = 10;
        int actual = service.calculateSqrtCeil(99);

        assertEquals(expected, actual);
    }
}