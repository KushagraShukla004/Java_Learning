import java.util.Scanner;

class Circle {
    double pi = 3.14;
    double r;

    Circle(double radius) {
        r = radius;
    }

    // it is not necessary for the parameter name to be same as the Object name
    Circle(Circle c2) {
        r = c2.r;
    }

    double area() {
        return pi * r * r;
    }

    double circumference() {
        return 2 * pi * r;
    }
}

class Rectangle {
    double length;
    double width;

    Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }

    double area() {
        return length * width;
    }

    double perimeter() {
        return 2 * (length + width);
    }
}

public class Multipleclass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = scan.nextDouble();
        System.out.print("Enter length: ");
        double length = scan.nextDouble();
        System.out.print("Enter width: ");
        double width = scan.nextDouble();
        Circle c = new Circle(r);
        // object inside object
        Circle c1 = new Circle(c);
        Rectangle rect = new Rectangle(length, width);
        System.out.println("Area of Circle: " + c.area());
        System.out.println("Circumference of Circle: " + c.circumference());
        System.out.println("Area of Circle(c1): " + c1.area());
        System.out.println("Circumference of Circle(c1): " + c1.circumference());
        System.out.println("Area of rectangle: " + rect.area());
        System.out.println("Perimeter of rectangle: " + rect.perimeter());

        scan.close();
    }
}
