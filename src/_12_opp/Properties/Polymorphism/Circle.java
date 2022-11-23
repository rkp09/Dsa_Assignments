package _12_opp.Properties.Polymorphism;

public class Circle extends Shapes{

    // Can't override static method.
    static void greeting(){
        System.out.println("Circle, Hello, world.");
    }
    @Override
    void area(){
        System.out.println("Hey, I am from circle.");
    }
}
