 class Shape {
    public String color;

    public Shape(String color) {
        this.color = color;
    }

    public double getArea(){
        return 0.0;
    }
    public void draw(){
        System.out.println("color is " + color);
    }
}
 class Circle extends Shape{

    public int radius;

     public Circle(String color, int radius) {
         super(color);
         this.radius = radius;
     }

     @Override
     public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
     public void draw() {
        System.out.println("Drawing a Rectangle of color" +color);
    }

}
 class Rectangle extends Shape{
    public int width;
    public int length;

     public Rectangle(String color, int width, int length) {
         super(color);
         this.width = width;
         this.length = length;
     }

     @Override
     public double getArea() {
        return length * width;
    }
    @Override
    public void draw(){
        System.out.println("Drawing a Rectangle of color" +color);
        }
    }




