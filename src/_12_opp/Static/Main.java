package _12_opp.Static;

public class Main {
    public static void main(String[] args) {
        Human ridoy = new Human("Ridoy", 23, 1000);
        Human prite = new Human("Prite", 21, 1000);

//        System.out.println(Human.population);

        Main func = new Main();
        func.funky();
        System.out.println(func);


        // Singleton class stuff
        SingleTon single = SingleTon.getInstance();
        SingleTon single2 = SingleTon.getInstance();
        SingleTon single3 = SingleTon.getInstance();

    }


    void funky(){
        greeting();
    }
    void greeting(){
        System.out.println("Hello world");
    }

    @Override
    public String toString() {
        return "Funcky things";
    }
}
