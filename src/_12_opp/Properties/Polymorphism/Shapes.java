package _12_opp.Properties.Polymorphism;

public class Shapes {
    void area(){
        System.out.println("Hey, I am from shapes.");
    }

    static void greeting(){
        System.out.println("Hello, world.");
    }

    public static void main(String[] args) {
        Shapes circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        Shapes.greeting();
    }
}
