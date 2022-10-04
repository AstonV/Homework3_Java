package com.example;

public class Employee {
    private String firstName;
    private String lastName;
    private int id;
    private double hourlyPay;


    public Employee() {
    }

    public Employee(String firstName, String lastName, int id, double hourlyPay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.hourlyPay = hourlyPay;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }


    public void computePay(double hoursWorked) throws TooManyHoursWorkedException {
        if (hoursWorked > 40) {
            throw new TooManyHoursWorkedException("Too many hours");
        } else if (hoursWorked < 0) {
            throw new NumberFormatException("Hours cannot be less than 0");
        } else if (hoursWorked <= 40 && hoursWorked >= 0) {
            System.out.println("Payment receive: $" + hoursWorked * hourlyPay);
        }

    }
}
