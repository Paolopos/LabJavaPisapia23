import java.awt.*;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int width = 10;
        int height = 20;

        int newX = 5;
        int newY = 5;

        double area;
        double perimeter;

        Rectangle rectangle1 = new Rectangle(x,y,width,height);
        System.out.println(rectangle1);
        rectangle1.translate(newX, newY);
        System.out.println(rectangle1);
        Rectangle rectangle2 = new Rectangle(15,5,10,20);
        Rectangle rectangle3 = new Rectangle(25,5,10,20);
        Rectangle rectangle4 = new Rectangle(35,5,10,20);
        int widthfinale = rectangle2.width+rectangle3.width+rectangle4.width+ rectangle1.width;
        Rectangle finale= new Rectangle(5,5,widthfinale,rectangle1.height);
        perimeter = (rectangle1.height+widthfinale)*2;
        area = rectangle1.height*widthfinale;


        System.out.println (area);
        System.out.println (perimeter);

    }
}