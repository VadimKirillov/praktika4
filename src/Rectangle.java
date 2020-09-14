public class Rectangle extends  Shape{
    protected double length;
    private double width;

    public Rectangle(boolean filled, String color, double length, double width) {
        super(filled, color);
        this.length = length;
        this.width = width;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public Rectangle() {

    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return 2*(width + length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", filled=" + filled +
                ", color='" + color + '\'' +
                '}';
    }
}
