package Taxes;

public class ProgressiveTaxType extends TaxType {
    @Override
    public double calculateTaxFor(double amount) {

        if (amount >= 100000){
            return amount / 100 * 15;
        } else {
            return amount / 100 * 10;
        }
    }
}