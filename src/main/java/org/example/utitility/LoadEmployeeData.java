package org.example.utitility;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.dtos.Employee;
import org.example.streamAPIS.EmployeeStreamOps;
import org.example.streamAPIS.EmployeesStreamOperations;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

public class LoadEmployeeData {


    public static List<Employee> getEmployeeData() {
        List<Employee> employeesList=null;
        try {
            ClassLoader classLoader = EmployeesStreamOperations.class.getClassLoader();
            InputStream inputStream = classLoader.getResourceAsStream("Employee.json");

            if (inputStream == null) {
                System.err.println("Employee.json not found in resources.");
                return null;
            }

            ObjectMapper objectMapper = new ObjectMapper();

            // Read the JSON into a Map
            Map<String, List<Employee>> employeesMap = objectMapper.readValue(inputStream,
                    new TypeReference<Map<String, List<Employee>>>() {
            });

            // Extract the list of Employees
            employeesList = employeesMap.get("employees");


        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeesList;
    }

    }
