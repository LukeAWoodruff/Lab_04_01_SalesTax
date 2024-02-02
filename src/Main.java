public class Main
{
    public static void main(String[] args) {
        double purchasePrice = 200.54;
        final double SALES_TAX_RATE = 0.05;
        double salesTax = 0;
        double totalPrice = 0;

        System.out.println("You said your price is " + purchasePrice);

        salesTax = purchasePrice * SALES_TAX_RATE;
        totalPrice = salesTax + purchasePrice;

        System.out.println("The sales tax is " + salesTax);
        System.out.println("The total price is " + totalPrice);

        System.out.printf("\nSales tax rounded is: %6.2f", salesTax);
    }

}