public class student {

    void display(int Rollno, String name, String Class, double marks) {
        System.out.println("Rollno:- " + Rollno);
        System.out.println("Name:- " + name);
        System.out.println("Class:- " + Class);
        System.out.println("marks:- " + marks);
        System.out.println();
    }

    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student();
        student s3 = new student();
        s1.display(1, "Kushagra", "A", 80.5);
        s2.display(2, "Hemant", "A", 90.5);
        s3.display(3, "Vyas", "A", 95.5);

    }
}
