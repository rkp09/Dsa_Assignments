package _12_opp.Properties.Inheritance;

public class Audi extends Car {
    String series;

    public Audi() {
        super();
        this.series = "abc";
    }

    Audi(int seat, int wheels, int height, String series) {
        super(seat, wheels, height);
        this.series = series;
    }


    Audi(Audi other){
        super(other);
        this.series = other.series;
    }

    Audi(String series) {
        this.series = series;
    }



}
