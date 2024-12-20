package org.example;

public class Pair {
    private final Currency from;
    private final Currency to;

    public Pair(Currency from, Currency to) {
        this.from = from;
        this.to = to;
    }

    public Currency from() {
        return from;
    }

    public Currency to() {
        return to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pair pair = (Pair) o;

        if (from != pair.from) return false;
        return to == pair.to;
    }

    @Override
    public int hashCode() {
        int result = from.hashCode();
        result = 31 * result + to.hashCode();
        return result;
    }
}
