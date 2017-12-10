package Week9;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by lab7pc5 on 12/10/2017.
 */
public class ExampleArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> classroom = new ArrayList<Student>();
        Student student1 = new Student("Joy", 22);
        Student student2 = new Student("Araf", 21);
        Student student3 = new Student("Adnan", 24);

        classroom.add(student1);
        classroom.add(student2);
        classroom.add(student3);

        System.out.println(classroom);
        Collections.sort(classroom);
        System.out.println(classroom);
    }
}

class Student implements Comparable<Student>{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return name + " : " + age;
    }

    @Override

    //   sorts according to age
 //   public int compareTo(Student o) {
 //       return this.age - o.age;
 //   }

    //   sorts according to name
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }
}