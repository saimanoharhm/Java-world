import java.util.Scanner;

public class studentChallenge4 {
    public static void main(String[] args) {
        //1. Display Arithmetic Progression series
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the starting number: ");
        // int a = sc.nextInt();
        // System.out.println("Enter the common difference between the two number's: ");
        // int d = sc.nextInt();
        // System.out.println("Enter the number of terms: ");
        // int n = sc.nextInt();
        // System.out.print("The Arithmetic progression series are: ");
        // for(int i=0; i<n; i++){
        //     System.out.print(a+", ");
        //     a += d;
        // }
        // System.out.println("....");

         //2. Display Geometric Progression series
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the starting number: ");
        // int a = sc.nextInt();
        // System.out.println("Enter the common ratio between the two number's: ");
        // int r = sc.nextInt();
        // System.out.println("Enter the number of terms: ");
        // int n = sc.nextInt();
        // System.out.print("The Geometric progression series are: ");
        // for(int i=0; i<n; i++){
        //     System.out.print(a+", ");
        //     a *= r;
        // }
        // System.out.println("....");
        //3. Display Fibonacci series.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms: ");
        int n = sc.nextInt();
        int a=0,b=1,c;
        System.out.println("Fibonacci series: ");
        System.out.print(a+","+b+",");
        for(int i = 0; i<n;i++){
            c = a+b;
            System.out.print(c+",");
            a = b;
            b = c;
        }
        System.out.println("...");
        sc.close();
    }
}
