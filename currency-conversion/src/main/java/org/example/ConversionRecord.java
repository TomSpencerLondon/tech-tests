package org.example;

class ConversionRecord {
    private final int id;
    private final double amount;
    private final Currency sourceCurrency;
    private final Currency targetCurrency;

    public ConversionRecord(int id, double amount, String sourceCurrency, String targetCurrency) {
        this.id = id;
        this.amount = amount;
        this.sourceCurrency = Currency.valueOf(sourceCurrency);
        this.targetCurrency = Currency.valueOf(targetCurrency);
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public String getSourceCurrency() {
        return sourceCurrency.toString();
    }

    public String getTargetCurrency() {
        return targetCurrency.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConversionRecord that = (ConversionRecord) o;

        if (id != that.id) return false;
        if (Double.compare(amount, that.amount) != 0) return false;
        if (sourceCurrency != that.sourceCurrency) return false;
        return targetCurrency == that.targetCurrency;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        temp = Double.doubleToLongBits(amount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + sourceCurrency.hashCode();
        result = 31 * result + targetCurrency.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "ConversionRecord{" +
                "id=" + id +
                ", amount=" + amount +
                ", sourceCurrency=" + sourceCurrency +
                ", targetCurrency=" + targetCurrency +
                '}';
    }
}
