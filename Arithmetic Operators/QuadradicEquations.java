import java.util.Scanner;
public class QuadradicEquations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a,b,c values: \n");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int r1 = (int)(-b + Math.sqrt((b*b)-(4*a*c))) / (2*a);
        int r2 = (int)(-b - Math.sqrt((b*b)-(4*a*c))) / (2*a);
        System.out.println("Roots of quadratic equation is: "+r1+" "+r2);
        sc.close();
    }
}
