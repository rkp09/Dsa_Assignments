package _12_opp.ExceptionHandling;

public class Main {
    public static void main(String[] args) throws MyException {
        String name = "Kunal";

        if (name.equals("Kunal")){
            throw new MyException("Name is Kunal.");
        }
    }
}
