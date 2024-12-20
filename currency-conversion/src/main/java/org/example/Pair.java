package org.example;

public class Pair {
    private final Currency from;
    private final Currency currency;

    public Pair(Currency from, Currency to) {
        this.from = from;
        currency = to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pair pair = (Pair) o;

        if (from != pair.from) return false;
        return currency == pair.currency;
    }

    @Override
    public int hashCode() {
        int result = from.hashCode();
        result = 31 * result + currency.hashCode();
        return result;
    }
}
