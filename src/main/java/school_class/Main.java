package school_class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student Ann = new Student("Ann", 5.4);
        Student Bill = new Student("Bill", 8.5);
        Student Jack = new Student("Jack", 4.7);
        Student Sophie = new Student("Sophie", 9.4);
        Student Mark = new Student("Mark", 3.5);

        List<Student> studentsOfClassA = Arrays.asList(Ann, Bill, Jack);
        List<Student> studentsOfClassB = Arrays.asList(Sophie, Mark);

        SchoolClass classA = new SchoolClass("5A", studentsOfClassA);
        SchoolClass classB = new SchoolClass("5B", studentsOfClassB);

        System.out.println(classA);
        System.out.println(classB);

    }



}
