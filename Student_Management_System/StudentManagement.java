package Student_Management_System;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {

    ArrayList<Student> students = new ArrayList<>();

    public void addStudent() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the student's name: ");
        String name = in.nextLine();
        System.out.println("Enter the student's age: ");
        int age = in.nextInt();
        System.out.println("Enter the student's grade: ");
        double grade = in.nextDouble();
        Student student = new Student(name, age, grade);
        students.add(student);
    }
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            for (Student s : students) {
                System.out.println("\tName: " + s.getName() + ", \n\tAge: " + s.getAge() + ", \n\tGrade: " + s.getGrade() + "\n") ;
            }
        }
    }
     public Boolean isEmpty() {
        if (students.isEmpty()){
        return  true;
        }
        return false;
     }
    public void calculateAverageGrade() {
        if (students.isEmpty()) {
            System.out.println("No students to calculate the average grade.");
        } else {
            double total = 0;
            for (Student s : students) {
                total += s.getGrade();
            }
            double average = total / students.size();
            System.out.println("The average grade is: " + average);
        }
    }

    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Add a new student");
            System.out.println("2. Display all students");
            System.out.println("3. Calculate and display the average grade");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    studentManagement.addStudent();
                    break;
                case 2:
                    studentManagement.displayAllStudents();
                    break;
                case 3:
                    studentManagement.calculateAverageGrade();
                    break;
                case 4:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);
scanner.close();

    }


}
