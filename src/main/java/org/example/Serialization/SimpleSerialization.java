package org.example.Serialization;

import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = 1L; // Define serialVersion
    private String name;
    private int age;
    transient  private String userId;

    private static int gender;

    public Person(String name, int age, String userId, int gender) {
        this.name = name;
        this.age = age;
        this.userId = userId;
        Person.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", userId=" + userId + ", gender=" + gender + "}";
    }

    public static void saveStaticVariable(ObjectOutput oos) throws IOException {
        oos.writeObject(Person.gender);
    }

    public static void readStaticVariable(ObjectInputStream ois) throws IOException {
       gender= ois.readInt();
    }

}

public class SimpleSerialization {
    public static void main(String[] args) {
        try {
            // Serialize the object
            Person person = new Person("John", 30,"122345",1);
            FileOutputStream fileOut = new FileOutputStream("person.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(person);
            Person.saveStaticVariable(out);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in person.ser");

            // Deserialize the object
            FileInputStream fileIn = new FileInputStream("person.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Person deserializedPerson = (Person) in.readObject();
            Person.readStaticVariable(in);
            in.close();
            fileIn.close();
            System.out.println("Deserialized object: " + deserializedPerson);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}