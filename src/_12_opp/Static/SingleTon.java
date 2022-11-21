package _12_opp.Static;

public class SingleTon {
    // SingleTon class means you can instantiate this class but it will create just one object.

    private SingleTon(){

    }

    private static SingleTon instance;

    public static SingleTon getInstance(){
        if (instance == null){
            instance = new SingleTon();
        }

        return instance;
    }
}
