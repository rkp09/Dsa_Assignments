package _12_opp.ExceptionHandling;

public class TryCatch {
    public static void main(String[] args) {
        int a = 3;
        int b = 0;

        try {
            int c = divide(a, b);
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This will get executed.");
        }
    }

    // It may throw an exception (throws means)
    static int divide(int a, int b)throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Please don't divide anything by zero.");
        }
        return a / b;
    }
}
