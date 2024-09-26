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
}

class DemoMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(1, "Doe");
        Student s3 = new Student(s2);
        s1.display();
        s2.display();
        s3.display();
    }
}