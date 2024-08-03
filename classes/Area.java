public class Area {
    static double length;
    static double breadth;

    static void exactDimension(double L, double B) {
        length = L;
        breadth = B;
    }

    static void displayArea(double L, double B) {
        double area = (L * B) / 2;
        System.out.println("Area of the triangle: " + area);
    }

    public static void main(String[] args) {
        exactDimension(23.4, 20);
        displayArea(length, breadth);
    }
}
