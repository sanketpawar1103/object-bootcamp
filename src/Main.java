import com.tw.bootcamp.p1.Rectangle;

public class Main {
    static void main() {
        Rectangle rectangle = Rectangle.createRectangle(2, 3);
        Rectangle square = Rectangle.createSquare(10);

        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());
        System.out.println(square.calculatePerimeter());
        System.out.println(square.calculateArea());
    }
}
