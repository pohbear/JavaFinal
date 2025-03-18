package com.tutormatch.management;

public class InvoiceManager {
    public void generateInvoice(String tutor, double amount) {
        System.out.println("Invoice for " + tutor + ": $" + amount);
    }
}
