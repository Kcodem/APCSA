package stuff;

class StudentRunner {
    public static void main(String[] args) {

        Student Stud1 = new Student("Bob", 4.0, "6'0");
        Stud1.intro();
        Stud1.printInfo();

        Student Stud2 = new Student("Alice", 3.5, "5,7");
        Stud2.intro();
        Stud2.printInfo();
    }
}
