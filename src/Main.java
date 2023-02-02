public class Main
{

    public static void main(String[] args)
    {
        double purchasePrice = 499.99;
        double taxRate = .05;

        double salesTax = 0;

        salesTax = purchasePrice * taxRate;

        System.out.println("The price of the purchase is $" + purchasePrice + " and the sales tax is $" + salesTax);


    }
}