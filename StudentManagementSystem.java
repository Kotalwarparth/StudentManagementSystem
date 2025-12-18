import java.util.ArrayList;
import java.util.Scanner;

// Student class
class Student {
    int id;
    String name;
    int age;
    String course;

    // Constructor
    Student(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Display student details
    void display() {
        System.out.println(id + "\t" + name + "\t" + age + "\t" + course);
    }
}

// Main class
public class StudentManagementSystem {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Thank you! Program exited.");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);
    }

    // Add Student
    static void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        students.add(new Student(id, name, age, course));
        System.out.println("Student added successfully!");
    }

    // View All Students
    static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        System.out.println("\nID\tName\tAge\tCourse");
        System.out.println("---------------------------------");
        for (Student s : students) {
            s.display();
        }
    }

    // Search Student
    static void searchStudent() {
        System.out.print("Enter Student ID to search: ");
        int id = sc.nextInt();

        for (Student s : students) {
            if (s.id == id) {
                System.out.println("\nStudent Found:");
                System.out.println("ID\tName\tAge\tCourse");
                s.display();
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Delete Student
    static void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = sc.nextInt();

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).id == id) {
                students.remove(i);
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}



====================================OUTPUT===========================================

===== STUDENT MANAGEMENT SYSTEM =====
1. Add Student
2. View All Students
3. Search Student by ID
4. Delete Student
5. Exit
Enter your choice: 1

Enter Student ID: 101
Enter Student Name: Rahul
Enter Age: 20
Enter Course: BCA
Student added successfully!

===== STUDENT MANAGEMENT SYSTEM =====
1. Add Student
2. View All Students
3. Search Student by ID
4. Delete Student
5. Exit
Enter your choice: 2

ID      Name    Age     Course
---------------------------------
101     Rahul   20      BCA

===== STUDENT MANAGEMENT SYSTEM =====
Enter your choice: 3
Enter Student ID to search: 101

Student Found:
ID      Name    Age     Course
101     Rahul   20      BCA

===== STUDENT MANAGEMENT SYSTEM =====
Enter your choice: 4
Enter Student ID to delete: 101
Student deleted successfully!

===== STUDENT MANAGEMENT SYSTEM =====
Enter your choice: 5
Thank you! Program exited.
