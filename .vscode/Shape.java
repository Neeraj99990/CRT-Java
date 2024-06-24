public class Shape {
    void area(double r) {
        System.out.println("Area of circle is " + (3.14 * r * r));
    }

    void area(int s) {
        System.out.println("Area of square is " + (s * s));
    }

    void area(int l, int b) {
        System.out.println("Area of Rectangle is " + (l * b));
    }

    public static void main(String[] args) {
        Shape obj = new Shape();
        obj.area(5.5);
        obj.area(10);
        obj.area(10, 20);

    }
}
