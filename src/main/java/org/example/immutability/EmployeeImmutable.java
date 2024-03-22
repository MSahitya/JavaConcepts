package org.example.immutability;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public final class EmployeeImmutable {
      private String name;
      private int id;
      private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeImmutable that = (EmployeeImmutable) o;
        return id == that.id && age == that.age && Objects.equals(name, that.name) && Objects.equals(employmentHistory, that.employmentHistory) && Arrays.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, id, age, employmentHistory);
        result = 31 * result + Arrays.hashCode(data);
        return result;
    }

    @Override
    public String toString() {
        return "EmployeeImmutable{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", employmentHistory=" + employmentHistory +
                ", data=" + Arrays.toString(data) +
                '}';
    }

    private List<String> employmentHistory;

      private int[] data;


    public EmployeeImmutable(String name, int id, int age, List<String> employmentHistory, int[] data) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.employmentHistory = new ArrayList<>(employmentHistory);// Defensively copy the array
        this.data = data.clone();// Defensively copy the array
    }

    public String getName() {
        return name;
    }

    public int[] getData() {
        return data.clone();// Defensively copy the array before returning
    }

    public List<String> getEmploymentHistory() {
        return new ArrayList<>(employmentHistory);// Defensively copy the list
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }
}
