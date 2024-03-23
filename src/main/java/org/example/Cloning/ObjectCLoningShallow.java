package org.example.Cloning;
 import  java.util.*;
        import java.lang.*;
        import java.io.*;

/* Two Points to Remember
1. Class must implement clone() method whose clone object has to be created.
2. The class whose clone object is to be created must implement java.lang.Cloneable interface otherwise it will throw the CloneNotSupportedException when we call clone() method.
*/

class Subject {

    String list[] = new String[4];

    public Subject(String optionalSubject) {

        //Default

        list[0] = "Physics";
        list[1] = "Chemistry";
        list[2] = "Maths";
        list[3] = optionalSubject;

    }
}

 class Student1 implements  Cloneable {

    int id;
    String name;

    Subject subObj;

      Student1(int id, String name, Subject subObj) {
        this.id = id;

        this.name = name;

        this.subObj = subObj;
    }


     protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ObjectCLoningShallow {

    public static void main(String[] args) {

        Subject subject = new Subject("Computer Science");

        Student1 stuObj1 = new Student1(3213, "Kulwinder Kaur", subject);

        Student1 stuObj2 = null;

        try {
            //Explicitly Type conversion is req

            stuObj2 = (Student1) stuObj1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // Print CompSci

        System.out.println(stuObj1.subObj.list[3]);

        stuObj2.subObj.list[3] = "Physical Education";

        System.out.println(stuObj1.subObj.list[3]);//reference data is changed
    }
}