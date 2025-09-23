import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    float marks;

    Student(int id, String name, float marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Marks: " + marks;
    }
}

public class StudentManagement {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1: addStudent(); break;
                case 2: viewStudents(); break;
                case 3: updateStudent(); break;
                case 4: deleteStudent(); break;
                case 5: running = false; System.out.println("Exiting... Thank you!"); break;
                default: System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    public static void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        // check if already exists
        for (Student s : students) {
            if (s.id == id) {
                System.out.println("Student with this ID already exists!");
                return;
            }
        }

        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter marks: ");
        float marks = sc.nextFloat();

        students.add(new Student(id, name, marks));
        System.out.println("Student added successfully!");
    }

    public static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found!");
        } else {
            System.out.println("\n--- Student Records ---");
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }

    public static void updateStudent() {
        System.out.print("Enter ID of student to update: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        for (Student s : students) {
            if (s.id == id) {
                System.out.print("Enter new name (current: " + s.name + "): ");
                String newName = sc.nextLine();
                System.out.print("Enter new marks (current: " + s.marks + "): ");
                float newMarks = sc.nextFloat();

                s.name = newName;
                s.marks = newMarks;
                System.out.println("Student record updated successfully!");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found!");
    }

    public static void deleteStudent() {
        System.out.print("Enter ID of student to delete: ");
        int id = sc.nextInt();

        for (Student s : students) {
            if (s.id == id) {
                students.remove(s);
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found!");
    }
}
