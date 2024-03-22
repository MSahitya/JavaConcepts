package org.example.immutability;
/* This includes final classes, final variables, and final methods:

1. A final class cannot be extended by any other class, but objects are normal they can't be final
2. A final variable cannot be reassigned another value
local variable, local reference variable
Static final MAX_HEIGHT=100[any final field must be initialized before the constructor completes.For static it will be in static block,or initialization]
final MAX_HEIGHT=100[initialization upon declaration,in the initialization block,in the constructor]
3. A final method cannot be overridden
4. final method arguments: A final argument can’t be changed inside a method:*/
public class FinalObjects {
    private int x;
    public static void main(String[] args) {
        /*Declaring a reference variable as final means that once it is assigned an object,
        it cannot be reassigned to another object.*/
        final FinalObjects obn=new FinalObjects();
        obn.x=10;
        System.out.println(obn.toString());
        // obn=new FinalObjects();//Can't assing value to a final variable
        obn.x=100;
        System.out.println(obn.toString());
    }
}
