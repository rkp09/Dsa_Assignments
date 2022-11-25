package _12_opp.Generics.Compare;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(5, 88.55f);
        Student student2 = new Student(9, 92.55f);
        Student student3 = new Student(3, 82.55f);
        Student student4 = new Student(12, 78.55f);
        Student student5 = new Student(13, 95.55f);
        Student student6 = new Student(18, 93.55f);

        Student[] students = {student1, student2, student3, student4, student5, student6};

        System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

//        if (student1.compareTo(student2) > 0){
//            System.out.println("Student1 got more marks.");
//        } else {
//            System.out.println("Student2 got more marks.");
//        }
    }
}
