package Rectangle;


//Create empty rectangle class
//Add height and width private fields
//        Add constructor(width, height)

//Create a method in main called printRectangle() which prints it’s parameters

import java.util.SimpleTimeZone;
import java.util.SortedMap;

public class Rectangle {
    private final int HEIGHT;
    private final int WIDTH;
    private final int SIZE;

    public Rectangle(int WIDTH, int HEIGHT, int SIZE) {
        this.WIDTH = WIDTH;
        this.HEIGHT = HEIGHT;
        this.SIZE = SIZE;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "HEIGHT=" + HEIGHT +
                ", WIDTH=" + WIDTH +
                ", SIZE=" + SIZE +
                '}';
    }

    public void printRectangle() {
        System.out.println(toString());
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public int getSIZE() {
        return SIZE;
    }

    public int calculateArea() {
        return HEIGHT * WIDTH;
    }

}
