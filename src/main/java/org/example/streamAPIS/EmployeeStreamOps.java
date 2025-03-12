package org.example.streamAPIS;

import org.example.dtos.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeStreamOps {

    public List<Employee> getEmployeewithName(String targetName, List<Employee> employees) {
        Predicate<Employee> pred = e -> e.getName().contains(targetName);

        List<Employee> wilsonMatches = employees.stream()
                .filter(pred)
                .collect(Collectors.toList());
        System.out.println("Employees with names containing '" + targetName + "':");
        wilsonMatches.forEach(System.out::println);

        //Case Insensitive
        List<Employee> wilsonCaseInsensitiveMatches = employees.stream()
                .filter(employee -> employee.getName().toLowerCase().contains(targetName.toLowerCase()))
                .collect(Collectors.toList());

        System.out.println("\nEmployees with names containing '" + targetName + "' (case-insensitive):");
        wilsonCaseInsensitiveMatches.forEach(System.out::println);

        //Exact match
        List<Employee> wilsonExactMatches = employees.stream()
                .filter(employee -> employee.getName().equals(targetName))
                .collect(Collectors.toList());

        System.out.println("\nEmployees with names exactly equal to '" + targetName + "':");
        wilsonExactMatches.forEach(System.out::println);

        //Exact Case Insensitive match
        List<Employee> wilsonExactCaseInsensitiveMatches = employees.stream()
                .filter(employee -> employee.getName().equalsIgnoreCase(targetName))
                .collect(Collectors.toList());

        System.out.println("\nEmployees with names exactly equal to '" + targetName + "' (case-insensitive):");
        wilsonExactCaseInsensitiveMatches.forEach(System.out::println);





        return null;
    }


    public void sortEmployeesbyName(List<Employee> employeesList) {
       System.out.println("Employees Sorted -------------");
        List<Employee> sortList=employeesList.stream().sorted().toList();
        //sortList.forEach(e->System.out.println(e));
        //With comparator
        List<Employee> sortListwithComa=employeesList.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        sortListwithComa.forEach(e->System.out.println(e));
    }
}
