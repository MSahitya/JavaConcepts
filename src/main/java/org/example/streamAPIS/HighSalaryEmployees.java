package org.example.streamAPIS;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HighSalaryEmployees {

    public static void main(String[] args) {
        List<EmployeeSalaryDTO> salaries = Arrays.asList(
                new EmployeeSalaryDTO("Engineering", 80000.0, "USD", "Annual", "Senior", "Software Engineer", "Remote", "Salary"),
                new EmployeeSalaryDTO("Marketing", 60000.0, "USD", "Annual", "Mid-level", "Marketing Specialist", "New York", "Salary"),
                new EmployeeSalaryDTO("Engineering", 95000.0, "USD", "Annual", "Lead", "Senior Software Engineer", "Seattle", "Salary"),
                new EmployeeSalaryDTO("Sales", 70000.0, "USD", "Annual", "Mid-level", "Sales Representative", "Chicago", "Salary"),
                new EmployeeSalaryDTO("HR", 55000.0, "USD", "Annual", "Junior", "HR Coordinator", "Austin", "Salary")
        );

        //Employees Avg salary
        double averageSalary = salaries.stream()
                .mapToDouble(EmployeeSalaryDTO::getSalary)
                .average()
                .orElse(0.0);
        //Employees Max salary
        double maxSalary= salaries.stream().mapToDouble(EmployeeSalaryDTO::getSalary).max().orElse(0.0);
        System.out.print("max salary="+maxSalary);

        List<EmployeeSalaryDTO> maxSalariedEmployees=salaries.stream().filter(s->s.getSalary()<maxSalary).collect(Collectors.toList());
        List<EmployeeSalaryDTO> highSalaryEmployees = salaries.stream()
                .filter(employee -> employee.getSalary() > averageSalary)
                .collect(Collectors.toList());

        System.out.println("Average Salary: " + averageSalary);
        System.out.println("Employees with salary above average:");
        highSalaryEmployees.forEach(System.out::println);
    }

    // EmployeeSalaryDTO class (as previously provided)
    public static class EmployeeSalaryDTO {

        // ... (fields, constructors, getters, setters, toString) ...
        private String department;
        private double salary;
        private String currency;
        private String payFrequency;
        private String payGrade;
        private String jobTitle;
        private String location;
        private String payType;

        // Constructors
        public EmployeeSalaryDTO() {
        }

        public EmployeeSalaryDTO(String department, double salary, String currency, String payFrequency, String payGrade, String jobTitle, String location, String payType) {
            this.department = department;
            this.salary = salary;
            this.currency = currency;
            this.payFrequency = payFrequency;
            this.payGrade = payGrade;
            this.jobTitle = jobTitle;
            this.location = location;
            this.payType = payType;
        }

        // Getters and setters
        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public String getPayFrequency() {
            return payFrequency;
        }

        public void setPayFrequency(String payFrequency) {
            this.payFrequency = payFrequency;
        }

        public String getPayGrade() {
            return payGrade;
        }

        public void setPayGrade(String payGrade) {
            this.payGrade = payGrade;
        }

        public String getJobTitle() {
            return jobTitle;
        }

        public void setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getPayType() {
            return payType;
        }

        public void setPayType(String payType) {
            this.payType = payType;
        }

        // toString (Optional, but good for debugging)
        @Override
        public String toString() {
            return "EmployeeSalaryDTO{" +
                    "department='" + department + '\'' +
                    ", salary=" + salary +
                    ", currency='" + currency + '\'' +
                    ", payFrequency='" + payFrequency + '\'' +
                    ", payGrade='" + payGrade + '\'' +
                    ", jobTitle='" + jobTitle + '\'' +
                    ", location='" + location + '\'' +
                    ", payType='" + payType + '\'' +
                    '}';
        }
    }
}