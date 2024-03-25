package org.example.DataTypesndConstantPools;

public class Upcasting {
    public static void main(String[] args) {
        Child child = new Child(); // Creating an object of Child class
        Parent parent = child; // Upcasting: Child object implicitly converted to Parent object

    }
}
class Parent {
    // Parent class
}

class Child extends Parent {
    // Child class, which inherits from Parent
}