package _12_opp.Properties.Inheritance;

public class Car {
    int seat;
    int wheels;
    int height;

    Car() {
        this.seat = -1;
        this.wheels = -1;
        this.height = -1;
    }

    Car(Car car){
        this.seat = car.seat;
        this.wheels = car.wheels;
        this.height = car.height;
    }

    Car(int seat, int wheels, int height) {
        this.seat = seat;
        this.wheels = wheels;
        this.height = height;
    }
}
