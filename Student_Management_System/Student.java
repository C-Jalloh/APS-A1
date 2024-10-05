package Student_Management_System;

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade =  grade;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getGrade() {
        return grade;
    }
    public void displayStudentInfo() {
        System.out.println( "Name: " + name + "\nAge: " + age + "\nGrade: " + grade);
    }

}
