public class Shapetwo {
    public String color;

    public Shapetwo(String color) {
        this.color = color;
    }

    public double getAreatwo() {
        return 0.0;
    }

    public void draw() {
        System.out.println("Color is " + color);
    }
}

class Circletwo extends Shapetwo {
    public int radius;

    public Circletwo(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getAreatwo() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle of color " + color);
    }
}

class Rectangletwo extends Shapetwo {
    public int width;
    public int length;

    public Rectangletwo(String color, int width, int length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getAreatwo() {
        return width * length;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle of color " + color);
    }
}

class triangle extends Shapetwo {
    int base;
    int height;
    public triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }
    @Override
    public double getAreatwo() {
        return base * height;

    }
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle of color " + color);
    }
}
