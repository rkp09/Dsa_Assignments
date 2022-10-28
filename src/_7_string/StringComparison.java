package _7_string;

public class StringComparison {
    public static void main(String[] args) {
        /*
        Creating of same value string will be stored in the same
        pool in the heap in the memory. Both reference variable
        pointing towards the same memory address.
         */

        String a = "Prite";
        String b = "Prite";

        // If we use == comparison operator to check whether both are same
        // or not, we will get true as result.
        System.out.println(a == b);


        /*
        But we can create an object of same value but reference variable actually
        pointing towards to different memory address. It actually created object
        outside of pool(which is separate memory structure).
         */
        String name1 = new String("Prite");
        String name2 = new String("Prite");

        // If we check this using == comparison operator we will get
        // false as result because those object are in the different
        // memory address.
        System.out.println(name1 == name2);

        /*
        After having the same value why we get false? Because they
        are in the different memory address. So how can we get the
        actual result as true because both of has same value? So in
        this case we have a method to check whether those memory address
        has same value or not it is (equals) method.
         */

        System.out.println(name1.equals(name2));
    }
}
