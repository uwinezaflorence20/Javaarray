public abstract class ShapAbstract {
      abstract double calculateArea();
    public abstract double calculatePerimeter();
}
class RectangleAbstract extends ShapAbstract {

    int width;
    int length;
    public RectangleAbstract( int Width, int length) {
        this.length = length;
        this.width = Width;
    }

    @Override
    double calculateArea() {
        System.out.println("The Area of Rectangle using abstract is : ");
        return width * length;

    }

    @Override
    public double calculatePerimeter() {
        System.out.println("The Perimeter of Rectangle using abstract is : ");
        return 2 * width * length;
    }

}


class CircleAbstract extends ShapAbstract {
int radius;

public CircleAbstract( int Radius) {
    this.radius = Radius;
}
    @Override
    double calculateArea() {
        System.out.println("The Area of Circle using abstract is : ");
     return radius * radius * Math.PI;
    }

    @Override
    public double calculatePerimeter() {
    System.out.println("The Perimeter of Circle using abstract is : ");
    return 2 * radius * Math.PI;
    }

}