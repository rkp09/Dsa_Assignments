package _10_math;

// Figure out sum of nth row of pascal triangle
public class PascalTriangle {
    public static void main(String[] args) {
        int rowNo = 21;
        System.out.println(sum(rowNo));
    }

    public static int sum(int n){
        return 1 << (n - 1);
    }
}
