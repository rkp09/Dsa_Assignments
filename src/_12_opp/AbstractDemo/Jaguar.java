package _12_opp.AbstractDemo;

public class Jaguar extends Car {

    public Jaguar(String series) {
        super(series);
    }

    @Override
    void engine() {
        System.out.println("I want v8 engine.");
    }

    @Override
    void design() {
        System.out.println("I want gray color will be applied for body.");
    }
}
