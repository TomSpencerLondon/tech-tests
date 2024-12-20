package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PairTest {

    @Test
    void pairsWithTheSameFromAndToCurrenciesAreEqual() {
        Pair pair = new Pair(Currency.USD, Currency.EUR);
        Pair comparing = new Pair(Currency.USD, Currency.EUR);


        assertEquals(pair, comparing);
    }

    @Test
    void pairsWithDifferentToCurrencyAreNotEqual() {
        Pair pair = new Pair(Currency.USD, Currency.EUR);
        Pair comparing = new Pair(Currency.USD, Currency.JPY);


        assertNotEquals(pair, comparing);
    }
}
