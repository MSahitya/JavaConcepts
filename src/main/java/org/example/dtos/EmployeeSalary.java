package org.example.dtos;

public class EmployeeSalary {
    SalaryDetails salaryDetails;
    Employee employee;
    Department department;

    @Override
    public String toString() {
        return "EmployeeSalary{" +
                "salaryDetails=" + salaryDetails +
                ", employee=" + employee +
                ", department=" + department +
                '}';
    }

    public SalaryDetails getSalaryDetails() {
        return salaryDetails;
    }

    public void setSalaryDetails(SalaryDetails salaryDetails) {
        this.salaryDetails = salaryDetails;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
