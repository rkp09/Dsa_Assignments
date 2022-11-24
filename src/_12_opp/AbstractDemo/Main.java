package _12_opp.AbstractDemo;

final public class Main {

    public static void main(String[] args) {
        Jaguar jaguar = new Jaguar("XF");
        jaguar.engine();
        Car.seriesName(jaguar);

        LandRover landRover = new LandRover("Dicovery");
        landRover.engine();
//        Car.seriesName(landRover);
    }

}


