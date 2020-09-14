public class Square extends Rectangle{
    public Square(boolean filled, String color, double length) {
        super(filled, color, length, length);
    }

    public Square(double length) {
        super(length, length);
    }

    public Square() {
    }
    public double getSide(){
        return length;
    }
    public void SetSide(double length){
        this.length = length;
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", filled=" + filled +
                ", color='" + color + '\'' +
                '}';
    }
}
