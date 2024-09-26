// Class: 
// Class is a user-defined Datatypes
// this is a special pointer that stores address of current invoking data member

class Student {
    // state , property | in coding terms := Data members
    int roll_num;
    String name;

    // Behavior | in coding terms := Member function or METHODS
    public Student() {// Default Contructor
        this.roll_num = 0;
        this.name = null;
    }

    public Student(int roll_num, String name) { // Parameterized Constructor
        this.roll_num = roll_num;
        this.name = name;
    }

    public Student(Student st) {// Copy Constructor
        this.roll_num = st.roll_num;
        this.name = st.name;
    }

    void display() {
        System.out.println("Roll_num: " + roll_num);
        System.out.println("Name: " + name);
    }

    // Method Overriding
    public void Hello() {
        System.out.println("Welcome Student");
    }
}

// Inheritance (Single Inheritance):it will access class Student and will call
// default constructor
class FullStackStud extends Student {
    // Method Overriding
    public void Hello() {
        System.out.println("Welcome FullStack Student");
    }
}

class DemoMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(1, "Doe");
        Student s3 = new Student(s2);
        s1.display();
        s2.display();
        s3.display();
        FullStackStud f1 = new FullStackStud();
        f1.display();
        // Method Overriding
        f1.Hello();// Welcome FullStack Student
        s1.Hello();// Welcome Student
        // runtime polymorphism, late polymorphism
        // because the decision to take FullStackStud's Hello() is taken on JAVA runtime
        // Since, in compile-time JAVA looks for Student's Hello() but in runtime it
        // changes to FullStackSud
        Student s4 = new FullStackStud();
        s4.Hello();// Welcome FullStack Student
    }
}