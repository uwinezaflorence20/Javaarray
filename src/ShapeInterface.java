public interface ShapeInterface {
    double getArea();
    void draw();
}

class Circle2 implements ShapeInterface {
    private double radius;

    public Circle2(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void draw() {
        System.out.println("Drawing a Circle.");
    }
}

class Rectangle2 implements ShapeInterface {
    private double width, height;

    public Rectangle2(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

class Triangle2 implements ShapeInterface {
    private double base, height;

    public Triangle2(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }

    public void draw() {
        System.out.println("Drawing a Triangle.");
    }
}
