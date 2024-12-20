package org.example;

class ConversionRecord {
    private final int id;
    private final double amount;
    private final String sourceCurrency;
    private final String targetCurrency;

    public ConversionRecord(int id, double amount, String sourceCurrency, String targetCurrency) {
        this.id = id;
        this.amount = amount;
        this.sourceCurrency = sourceCurrency;
        this.targetCurrency = targetCurrency;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public String getSourceCurrency() {
        return sourceCurrency;
    }

    public String getTargetCurrency() {
        return targetCurrency;
    }
}
