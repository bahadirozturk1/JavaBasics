package studentmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem {
    private List<Student> students;

    public StudentManagementSystem() {
        this.students = new ArrayList<Student>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Added student: " + student.getName());
    }

    public List<Student> getStudents() {
        return students;
    }
    /*public Student findStudentByID(String studentID){
        for(Student student : students){
            if(student.getStudentID().equals(studentID)){
                return student;
            }
        }
        return null;*/

}

