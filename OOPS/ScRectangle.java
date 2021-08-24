import java.util.Scanner;

class Rectangle{
    public int length;
    public int breadth;
    public int area(){
        return length * breadth;
    }
    public int perimeter(){
        return 2 * (length + breadth);
    }
    public boolean isSquare(){
        if(length == breadth){
            return true;
        }
        else
            return false;
    }
}

public class ScRectangle {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth: ");
        r.length = sc.nextInt();
        r.breadth = sc.nextInt();
        System.out.println("The area of rectangle: "+ r.area());
        System.out.println("The perimeter of rectangle: "+ r.perimeter());
        System.out.println("Is it a Square: "+ r.isSquare());
        sc.close();
    }
}