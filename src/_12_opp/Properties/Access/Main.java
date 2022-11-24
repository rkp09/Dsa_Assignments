package _12_opp.Properties.Access;

public class Main {
    public static void main(String[] args) {
        Modifiers modifier = new Modifiers(9, "Prite");
//        System.out.println(modifier.score);

        SubClass subClass = new SubClass(10, "Prite");
//        System.out.println(subClass.score);

        System.out.println(subClass instanceof Modifiers);
    }
}
