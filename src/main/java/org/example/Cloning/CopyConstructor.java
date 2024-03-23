package org.example.Cloning;

public class CopyConstructor {
    public static void main(String[] args) {
        Student student=new Student(1,"Amrutha");
        System.out.println(student);

        Student student1=new Student(student);
                System.out.println(student1);
    }
}
 class Student {
    private int id;
    private String name;
    Student() { //default Constructor
    }

    //Parameterised Constructor
    Student(int idNo, String sName) {
        id = idNo;
        name = sName;
    }
    //copy constructor
    Student(Student student) {
        id = student.id;
        name = student.name;
    }
}