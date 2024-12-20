package org.example;

public class IncorrectCurrencyFormat extends RuntimeException {
    public IncorrectCurrencyFormat(String message) {
        super(message);
    }
}
