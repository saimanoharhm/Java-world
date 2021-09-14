abstract class Shape{
  abstract public double perimeter();
  abstract public double area();
}
class Circle extends Shape{
  double radius; 
  public double perimeter(){
    return 2*Math.PI*radius;
  }
  public double area(){
    return Math.PI*radius*radius;
  }
}
class Rectangle extends Shape{
  double length,breadth;
  public double perimeter(){
    return 2*(length*breadth);
  }
  public double area(){
    return length*breadth;
  }
}

public class scAbstractClassShape {
  public static void main(String[] args) {
    Rectangle r = new Rectangle();
    r.breadth = 5;
    r.length = 10;
    Circle c = new Circle();
    c.radius = 10;
    Shape s = r;
    System.out.println("The Perimeter of the rectangle: "+s.perimeter());
    System.out.println("The area of the rectangle: "+s.area());
    s = c;
    System.out.println("The Perimeter of the circle: "+s.perimeter());
    System.out.println("The area of the circle: "+s.area());
  }
}
