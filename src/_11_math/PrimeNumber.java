package _11_math;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 30;

        for (int i = 1; i < n; i++) {
            System.out.println(i + " " + isPrime(i));
        }
    }

    public static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }

        // Start checking from 2
        int c = 2;

        while (c * c <= n){
            if (n % c == 0){
                return false;
            }

            c++;
        }

        return true;
    }
}


/*
Time complexity analysis:
    * First for loop will take N steps to complete the task.
    * For each number from 1 till N will call isPrime().
    * isPrime() number actually take square root of each number (n)
    * to complete the task. So the time complexity of isPrime() is
    * O(sqrt(n)).
    * Total time complexity of this algorithm is O(N * sqrt(n))
    * Here N is the end point of the range to find the prime number.
 */