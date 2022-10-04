package com.example;

public class Course implements Cloneable {

    private String courseName,courseDescription, department,courseStarts, weekday ;

    public Course(){
        super();
    }

    public Course(String courseName, String courseDescription, String department, String courseStarts, String weekday) {
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.department = department;
        this.courseStarts = courseStarts;
        this.weekday = weekday;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCourseStarts() {
        return courseStarts;
    }

    public void setCourseStarts(String courseStarts) {
        this.courseStarts = courseStarts;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseDescription='" + courseDescription + '\'' +
                ", department='" + department + '\'' +
                ", courseStarts='" + courseStarts + '\'' +
                ", weekday='" + weekday + '\'' +
                '}';
    }
}
