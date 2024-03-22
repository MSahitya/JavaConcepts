package org.example.immutability;
/* A class that cannot be further extended is called a final class in Java.*/
final public class FinalClass {
    private int x;

    public int getX() {
        return x;
    }

    public FinalClass(int x) {
        this.x = x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public static void main(String[] args) {
   FinalClass finalClass=new FinalClass(12);
   finalClass.setX(13);
    }
}
/*Can't be overriden*/
/*
class Child extends  FinalClass{

}*/
