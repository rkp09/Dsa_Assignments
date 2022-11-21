package _12_opp.Static;

public class StaticBlock {
    static int a = 3;
    static int b;

    // This block of code getting executed one time when the first object is created.
    static{
        System.out.println("This block will getting execute one time.");
        b = a * 6;
    }

    public static void main(String[] args) {
        StaticBlock obj1 = new StaticBlock();

        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
