package org.example.immutability;

import java.util.ArrayList;
import java.util.List;

/*Write an Immutable class like String,Integer,Character ...etc*/
public class CustomImmutableClass {
    public static void main(String[] args) {
        List<String> employmentHistory=new ArrayList<>();
        employmentHistory.add("History");
        employmentHistory.add("Biology");
        EmployeeImmutable employeeImmutable=
                new EmployeeImmutable("Sahitya",12,34,employmentHistory,new int[]{1,2,3});
        employmentHistory.add("Chemistry");//failed to modify data
        System.out.println(employeeImmutable.hashCode());
        employeeImmutable=
                new EmployeeImmutable("Sahitya",12,34,employmentHistory,new int[]{1,2,3});
        System.out.println(employeeImmutable.hashCode());//Hashcodes will be different

    }
}
