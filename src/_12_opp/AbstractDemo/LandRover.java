package _12_opp.AbstractDemo;

public class LandRover extends Car {
    public LandRover(String series) {
        super(series);
    }

    @Override
    void engine() {
        System.out.println("I want v9 engine.");
    }

    @Override
    void design() {
        System.out.println("I want white color will be applied for body.");
    }
}
