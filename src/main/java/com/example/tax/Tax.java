package com.example.tax;

public interface Tax {

    void setTaxableAmount(int amount);

    void calculateTaxAmount();

    double getTaxAmount();

    String getTaxType();

    Boolean isTaxPayed();

    void payTax();
}

