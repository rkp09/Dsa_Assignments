package _12_opp.Interface2;

public class Main implements  GrandParents, Parents{

    @Override
    public void greet() {
        System.out.println("Hi people");
    }

    @Override
    public void fun() {
        System.out.println("Let's have a fun.");
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.fun();
    }
}
