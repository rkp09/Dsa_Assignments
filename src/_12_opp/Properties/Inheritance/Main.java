package _12_opp.Properties.Inheritance;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.seat);

//        Audi car2 = new Audi();
//        System.out.println(car2.seat);

//        Audi car3 = new Audi(2, 4, 8, "tracker");
//        System.out.println(car3.seat + " " + car3.series);

//        Car car4 = new Audi(2, 4, 8, "BC");
//        System.out.println(car4.series);

        // For this case when the object itself is a type how can it call the child constructor
        // that is why we got error.
//        Audi car5 = new Car(2, 3, 4);
//        System.out.println(car5.height);

//        Audi car6 = new Audi(car2);
//        System.out.println(car6.series);
    }
}
