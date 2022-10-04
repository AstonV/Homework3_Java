package com.example;

public class StudentTest {
    public static void main(String[] args) {
        Course course = new Course("CS151", "Object Oriented Design and Programming", "CS", "6:00pm", "Tue");
        Student student1 = new Student("John", "Smith", "Computer Science major", "CS", 20, 3.6f, course);
        Student student2 = null;

        try {
            student2 = (Student) student1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("Student 1");
        student1.printInfo();
        System.out.println("Student 1 clone");
        student2.printInfo();

    }

}
