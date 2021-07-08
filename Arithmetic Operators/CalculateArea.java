// import java.util.Scanner;
// public class CalculateArea {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter base and height to calculate area: \n");
//         float base = sc.nextFloat();
//         float height = sc.nextFloat();
//         float area;
//         area = (base*height)/2;
//         System.out.println("Area of triangle: "+area);
//         sc.close();
//     }
// }
// Find Area of triangle if all three sides are given
import java.util.Scanner;
import java.lang.*;
public class CalculateArea {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        double s,area;
        System.out.println("Enter 3 Sides of a Triangle");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(a+b+c)/2f;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of Triangle is "+area);
        sc.close();
    }
}
