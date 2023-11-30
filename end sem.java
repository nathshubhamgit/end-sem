import java.io.*;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private String email;

    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

class StudentRecordManager {
    private static Scanner scanner = new Scanner(System.in);
    private static File studentDataFile = new File("student_data.txt");

    public static void main(String[] args) throws IOException {
        boolean exit = false;
        while (!exit) {
            System.out.println("\nStudent Record Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Delete Student by ID");
            System.out.println("5. Update Student Information");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayAllStudents();
                    break;
                case 3:
                    searchStudentByID();
                    break;
                case 4:
                    deleteStudentByID();
                    break;
                case 5:
                    updateStudentInformation
