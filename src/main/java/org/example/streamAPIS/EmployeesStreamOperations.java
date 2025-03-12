package org.example.streamAPIS;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.dtos.Employee;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;


    public class EmployeesStreamOperations {

        public static void main(String[] args) {
            try {
                ClassLoader classLoader = EmployeesStreamOperations.class.getClassLoader();
                InputStream inputStream = classLoader.getResourceAsStream("Employee.json");

                if (inputStream == null) {
                    System.err.println("Employee.json not found in resources.");
                    return;
                }

                ObjectMapper objectMapper = new ObjectMapper();

                // Read the JSON into a Map
                Map<String, List<Employee>> employeesMap = objectMapper.readValue(inputStream, new TypeReference<Map<String, List<Employee>>>() {
                });

                // Extract the list of Employees
                List<Employee> employeesList = employeesMap.get("employees");

                // Process the list
                if (employeesList != null) {
                    for (Employee employee : employeesList) {
                        //   System.out.println(employee); // Or perform other operations
                    }
                } else {
                    // System.out.println("No 'employees' key found in JSON.");
                }

                //EmployeeStreamOps
                //1.Get an Employee whose name is 'Wilson'
                EmployeeStreamOps ops = new EmployeeStreamOps();
                String name = "Wilson";
                //ops.getEmployeewithName(name, employeesList);

                ops.sortEmployeesbyName(employeesList);


            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }