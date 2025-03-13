package org.example.CollectionsOps;

import org.example.dtos.Employee;
import org.example.utitility.LoadEmployeeData;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListOps {
    public static void main(String[] args) {

        List<Employee> empList= LoadEmployeeData.getEmployeeData();
        Comparator<Employee> comparator=new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getPhone().compareTo(o1.getPhone());
            }
        };
        /**
         * Integer CompareTo logic  public static int compare(int x, int y) {
         *         return (x < y) ? -1 : ((x == y) ? 0 : 1);
         *     }
         */
        empList.sort(comparator);
        empList.forEach(n->System.out.println(n));


    }
}
