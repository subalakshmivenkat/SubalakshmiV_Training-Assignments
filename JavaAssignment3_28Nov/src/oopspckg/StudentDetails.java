package oopspckg;
import java.util.*;

class Student {
    private String name;
    private int rollNo;
    private int marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) this.marks = marks;
        else this.marks = 0;
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.println("Enter Name:");
        s.setName(sc.nextLine());

        System.out.println("Enter Roll Number:");
        s.setRollNo(sc.nextInt());

        System.out.println("Enter Marks (0-100):");
        s.setMarks(sc.nextInt());

        System.out.println("Name: " + s.getName());
        System.out.println("Roll No: " + s.getRollNo());
        System.out.println("Marks: " + s.getMarks());
    }
}
