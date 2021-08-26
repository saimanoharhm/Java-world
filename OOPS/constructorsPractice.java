import java.util.Scanner;

class Rectangle2{
    private int length;
    private int breadth;
    public Rectangle2(){
        length = 1;
        breadth = 1;
    }
    public Rectangle2(int l, int b){
        setLength(l);
        setBreadth(b);
    }
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
    public void setLength(int l){
        if(l>=0)
            length = l;
        else
            length = 0;
    }
    public void setBreadth(int b){
        if(b>=0)
            breadth = b;
        else
            breadth = 0;
    }
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

public class constructorsPractice  {
    public static void main(String[] args) {
        Rectangle2 r = new Rectangle2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        r.setLength(l);
        r.setBreadth(b);
        System.out.println("The area of rectangle: "+ r.area());
        System.out.println("The perimeter of rectangle: "+ r.perimeter());
        System.out.println("Is it a Square: "+ r.isSquare());
        System.out.println("Length: "+r.getLength());
        System.out.println("Breadth: "+r.getBreadth());
        sc.close();
    }
}
