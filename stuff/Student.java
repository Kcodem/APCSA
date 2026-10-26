package stuff;

// stuff.Cat class definition
public class Student {

    // instance variables
    private String name;
    private double gpa;
    private String height;

    // constructor
    public Student(String studentName, double studentGPA, String StudentHeight) {
        name = studentName;
        gpa = studentGPA;
        height = StudentHeight;
    }

    // method that introduces the stuff.Cat
    public void intro() {
        System.out.println("Hello, my name is " + name);
    }

    // method that prints stuff.Cat info
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("GPA: " + gpa);
        System.out.println("height: " + height);
    }
}



