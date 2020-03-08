package Taxes;

public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[] {
                new Bill(110.60, new IncomeTaxType(), new TaxService()),
                new Bill(350000.45, new ProgressiveTaxType(), new TaxService()),
                new Bill(70.20, new VATaxType(), new TaxService()),
                new Bill(666.15, new ProgressiveTaxType(), new TaxService())
        };

        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}