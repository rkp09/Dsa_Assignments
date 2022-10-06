package _03_conditional_loops;

import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input the price and discount
        System.out.print("Enter the price of the product: ");
        double price = in.nextDouble();
        System.out.print("Enter the discount of the product: ");
        double discount = in.nextDouble();

        double discountPrice = price - price * (discount / 100);

        System.out.println("After " + discount + "% off price is now $" + discountPrice);
    }
}
