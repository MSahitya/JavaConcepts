package org.example.dtos;

public class SalaryDetails {

    String Amount;
    String payType;
    String currency;
    String location;
    String payFrequency;

    public String getAmount() {
        return Amount;
    }

    @Override
    public String toString() {
        return "SalaryDetails{" +
                "Amount='" + Amount + '\'' +
                ", payType='" + payType + '\'' +
                ", currency='" + currency + '\'' +
                ", location='" + location + '\'' +
                ", payFrequency='" + payFrequency + '\'' +
                '}';
    }

    public void setAmount(String amount) {
        Amount = amount;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPayFrequency() {
        return payFrequency;
    }

    public void setPayFrequency(String payFrequency) {
        this.payFrequency = payFrequency;
    }
}
