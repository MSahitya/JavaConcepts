package org.example.DataTypesndConstantPools;

public class AutoBoxing {
    public static void main(String[] args) {
        int primitiveInt = 10;
        Integer wrapperInt = primitiveInt; // Autoboxing


        Integer wrapperInt1 = 20;
        int primitiveInt1 = wrapperInt; // Unboxing
    }
}
