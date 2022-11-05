package _11_math;

// Find the all prime number in the range from 1 till N
public class PrimeNumberInRange {
    public static void main(String[] args) {
        int n = 100;
        boolean[] prime = new boolean[n + 1];
        allPrime(prime, n);
    }

    // Something known as Seive of Eratosthenes
    public static void allPrime(boolean[] prime, int n){
        int c = 2;

        while (c * c <= n){
            if (!prime[c]){
                for (int i = c * 2; i <= n; i += c) {
                    prime[i] = true;
                }
            }

            c++;
        }


        for (int i = 2; i <= n; i++) {
            if (!prime[i]){
                System.out.println(i);
            }
        }

    }
}
