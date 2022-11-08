package _10_recursion.Class.Recursion_2;

public class ProductOfDigitsOfANumber {
    public static void main(String[] args) {
        System.out.println(digitsProduct(21));
    }

    public static int digitsProduct(int n){
        if (n % 10 == n){
            return n;
        }

        return (n % 10) * digitsProduct(n / 10);
    }
}
