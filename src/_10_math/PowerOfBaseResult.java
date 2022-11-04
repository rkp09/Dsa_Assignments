package _10_math;
// Calculate b^p where b = base, p = power
public class PowerOfBaseResult {
    public static void main(String[] args) {
        int base = 2;
        int power = 4;

        System.out.println(result(base, power));
    }

    public static int result(int base, int power){
        // Think about the binary representation of the power
        // Think about the number of set bit. For each set bit
        // base will multiply 1 times more. Otherwise, multiply
        // base by base 1 times.
        int num = 1;
        while (power > 0){
            // Check whether the right most bit is 0 or 1
            if ((power & 1) == 1){
                num *= base;
            }

            // Multiply base by base
            base *= base;
            power >>= 1;
        }

        return num;
    }
}
