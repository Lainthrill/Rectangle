package Rectangle;

public class RoundedRectangle extends Rectangle{

//    Create private field round radius
//    Create getter for radius

    private int roundRadius;
    private int radius;

    public RoundedRectangle(int width, int heigth, int size) {
        super(width, heigth, size);
    }

    public int getRoundRadius() {
        return roundRadius;
    }

    @Override
    public int calculateArea() {
        return (int) (super.calculateArea() - (4 * (radius * radius)) + (radius * radius * Math.PI));
    }

    @Override
    public String toString() {
        return "RoundedRectangle{" +
                "roundRadius=" + roundRadius +
                ", radius=" + radius +
                '}';
    }

    public void printRoundedRectangle() {
        System.out.println(toString());
    }
}
