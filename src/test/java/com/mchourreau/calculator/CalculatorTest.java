package com.mchourreau.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add_devrait_calculer_la_somme_de_deux_int(){

        assertEquals(5, calculator.add(2, 3)); // 2 + 3 = 5

    }

    @Test
    public void divide_devrait_calculer_la_division_de_deux_entier() {
        assertEquals(2, calculator.divide(6, 3)); // 6 / 3 = 2
    }

}