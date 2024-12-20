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
}
