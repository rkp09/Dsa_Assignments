package _11_math;

public class BinarySearchSqrt {
    public static void main(String[] args) {
        double root = sqrt(40, 5);
        System.out.printf("%.8f", root);
    }

    public static double sqrt(int n, int precision){
        double root = 0;
        int s = 0;
        int e = n;
        while (s <= e){
            int m = s + (e - s) / 2;

            if (m * m == n){
                return m;
            }

            if (m * m > n){
                e = m - 1;
            }else{
                s = m + 1;
                root = m;
            }
        }

        // Now we get the root of the integer part. But we need to find number
        // after decimal point.
        double fraction = 0.1;
        for (int i = 0; i < precision; i++) {
            while (root * root <= n){
                root += fraction;
            }

            // Now that we know root is bigger than actual root. So we need to
            // subtract fraction from root.
            root -= fraction;

            // Divide the fraction by 10 because it will apply for the next
            // number after decimal point.
            fraction /= 10;
        }
        return root;
    }
}
