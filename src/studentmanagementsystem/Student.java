package studentmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private int studentID;
    private List<Course> courses;
    private List<Grade> grades;

    //constructor
    public Student(String name, int age, int studentID) {
        //to get the data from parent class
        super(name, age);
        this.studentID = studentID;
        this.courses = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    //implementing abstract method from Person class

    @Override
    public String getRole(){
        return "Student";
    }

    //getter for studentID
    public int getStudentID() {
        return studentID;
    }

    //method to enroll in course
    public void enrollInCourse(Course course) {
        courses.add(course);
    }

    //method to add grade
    public void addGrade(Grade grade){
        grades.add(grade);
    }

    //method to calc avg grade
    public double caclculateAverageGrade(){
        double total = 0;
       for (Grade grade : grades){
           total += grade.getScore();
       }

       //checks for students grades if 0 it returns 0 in order to avoid division by 0
       return grades.size() == 0 ? 0 : total / grades.size();
    }

    //method to list enrolled courses
    public List<Course> getCourses(){
        return courses;
    }

    //method to list grades
    public List<Grade> getGrades(){
        return grades;
    }
}
