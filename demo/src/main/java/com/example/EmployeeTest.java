package com.example;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Smith", 101, 35);
        System.out.println(employee.getFirstName() + " " + employee.getLastName() + ", id: " + employee.getId() + " ,hourly pay $" + employee.getHourlyPay());
        int[] a = {40, 23, 1, 0, -5, 45};
        for (int i = 0; i < 6; i++) {
            try {
                employee.computePay(a[i]);
            } catch (TooManyHoursWorkedException | NumberFormatException e) {
                System.out.println(e);
            }
        }
    }
}
