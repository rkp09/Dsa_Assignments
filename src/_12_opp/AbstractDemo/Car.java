package _12_opp.AbstractDemo;

abstract public class Car {
    String series;

    public Car(String series) {
        this.series = series;
    }
    
    static void seriesName(Car obj){
        System.out.println(obj.series);
    }
    abstract void engine();
    abstract void design();
}
