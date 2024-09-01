package studentmanagementsystem;

public abstract class Person {
    private String name;
    private int age;

    //constructor for name
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getter for the name
    public String getName() {
        return name;
    }

    //setter for name
    public void setName(String name) {
        this.name = name;
    }

    //setter for age
    public int getAge() {
        return age;
    }

    //setter for age
    public void setAge(int age) {
        this.age = age;
    }

    //abstract method
    public abstract String getRole();

}
