public class Circle extends Shape {
    private double radius;

    @Override
    public double getArea() {
        return 3.14* radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 6.28 * radius;
    }

    public Circle(boolean filled, String color, double radius) {
        super(filled, color);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(){
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", filled=" + filled +
                ", color='" + color + '\'' +
                '}';
    }
}
