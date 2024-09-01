package studentmanagementsystem;

public class Main {
    public static void main(String[] args) {
        // Create an instance of StudentManagementSystem
        StudentManagementSystem system = new StudentManagementSystem();

        // Create Student objects
        Student student1 = new Student("John Doe", 19, 5002);
        Student student2 = new Student("Jane Smith",20,5001);

        // Add students to the system
        system.addStudent(student1); // Ensure this line is inside the main method
        system.addStudent(student2); // Ensure this line is inside the main method

        // Optional: Print out all students in the system
        for (Student student : system.getStudents()) {
            System.out.println("Student in system: " + student.getName());
        }
    }
}
