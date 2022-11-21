package _12_opp.Static;

public class InnerClass {

    // If it is not a static class, It depends on InnerClass. So need an object of InnerClass to create
    // test object.
    static class Test{
        String name;
        Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
//        InnerClass in = new InnerClass();
        Test test = new Test("Ridoy");
        System.out.println(test.name);
    }
}
