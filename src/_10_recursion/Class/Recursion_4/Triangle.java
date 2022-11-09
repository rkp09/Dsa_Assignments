package _10_recursion.Class.Recursion_4;

public class Triangle {
    public static void main(String[] args) {
//        reverseTriangle(4, 0);
        triangle(4, 0);
    }

    public static void reverseTriangle(int r, int c){
        if (r == 0){
            return;
        }

        if (r > c){
            System.out.print("* ");
            reverseTriangle(r, c + 1);
        }else{
            System.out.println();
            reverseTriangle(r - 1, 0);


        }
    }

    public static void triangle(int r, int c){
        if (r == 0){
            return;
        }

        if (r > c){
            triangle(r, c + 1);
            System.out.print("* ");
        }else{
            triangle(r - 1, 0);
            System.out.println();
        }
    }
}
