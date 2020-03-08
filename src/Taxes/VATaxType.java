package Taxes;

public class VATaxType extends TaxType {
    @Override
    public double calculateTaxFor(double amount) {

        return amount / 100 * 18;

    }
}
