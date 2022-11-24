package _12_opp.InterfaceDemo;

public class Car implements Engine, Brake, Media {

    @Override
    public void brake() {
        System.out.println("Brake it like a normal car.");
    }

    @Override
    public void start() {
        System.out.println("Start it like a normal car.");
    }

    @Override
    public void stop() {
        System.out.println("Stop it like a normal car.");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerate it like a normal car.");
    }
}
