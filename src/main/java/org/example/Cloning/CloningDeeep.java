package org.example.Cloning;

import java.util.*;
        import java.lang.*;
        import java.io.*;

class Subject1 implements Cloneable {
    String list[] = new String[4];

    public Subject1(String optionalSubject) {
        list[0] = "Physics";
        list[1] = "Chemistry";
        list[2] = "Maths";
        list[3] = optionalSubject;

    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Student2 implements Cloneable {
    int id;

    String name;

    Subject1 subObj;

    public Student2(int id, String name, Subject1 subObj) {
        this.id = id;

        this.name = name;

        this.subObj = subObj;
    }

    protected Object clone() throws CloneNotSupportedException {
        Student2 emp = (Student2) super.clone();
        emp.subObj = (Subject1) subObj.clone();
        return emp;
    }
}

public class CloningDeeep {
    public static void main(String[] args) {
        Subject1 subObject = new Subject1("Computer Science");

        Student2 stuObj1 = new Student2(3213, "Kulwinder Kaur", subObject);

        Student2 stuObj2 = null;

        try {
            stuObj2 = (Student2) stuObj1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(stuObj1.subObj.list[3]);

        stuObj2.subObj.list[3] = "Physical Education";

        System.out.println(stuObj1.subObj.list[3]);
    }
}