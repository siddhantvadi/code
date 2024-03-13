abstract class Shapes {
    int sides;

    abstract void area();
    abstract void perimeter();

    void printHello(){
        System.out.println("Hello World");
    }
    Shapes() {
        sides = 4;
    }
}
class Rectangle extends Shape{
    int length,breadth;
    Rectangle(){
        super();
        length=5;
        breadth=10;
    }
    void area(){
        System.out.println("Area Rectangle");
    }
    void perimeter(){
        System.out.println("Perimeter Rectangle");
    }
}
public class Shape{

}
//static methods coming from parent class cannot be overridden