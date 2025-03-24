package org.example.oopsconcepts;

public class Encapsulation_Ex {
    public static void main(String[] args) {
        BankAccount bobj=new BankAccount("42323",120);
        bobj.setBalance(145);
        System.out.println(bobj);

    }
}
