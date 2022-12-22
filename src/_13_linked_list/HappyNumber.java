package _13_linked_list;

class HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
    public static boolean isHappy(int n) {
        int first = squareSum(n, 1);
        int second = squareSum(n, 2);

        while (true){
            if (first == 1 || second == 1){
                return true;
            } 


            if (first == second){
                return false;
            }

            first = squareSum(first, 1);
            second = squareSum(second, 2);
        }
    }

    public static int squareSum(int n, int times){
        int number = n;

        while (times > 0){
            int sum = 0;

            while (number > 0){
                int digit = number % 10;
                int square =
                sum += (int)(Math.pow(digit, 2));
                number /= 10;
            }

            number = sum;

            times--;
        }

        return number;
    }
}