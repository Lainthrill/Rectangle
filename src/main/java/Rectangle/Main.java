package Rectangle;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,4,8);
        rectangle.printRectangle();
        RoundedRectangle roundedRectangle = new RoundedRectangle(2,2,2);
        roundedRectangle.printRoundedRectangle();
    }
}
