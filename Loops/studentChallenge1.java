import java.util.Scanner;

public class studentChallenge1 {
    public static void main(String[] args) {
        // 1. Display Multiplication Table
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
        // for(int j=1; j<=10;j++){
        //     System.out.println(n+"X"+j+"="+n*j); 
        // }
        // 2. Find Sum of n Numbers
        // int sum = 0;
        // for(int i=1;i<=n;i++){
        //     sum += i;
        // }
        // System.out.println("Sum of n Numbers: "+sum);
        //3. Factorial of a Number
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact *= i;
        }
        System.out.println("Factorial of a number: "+fact);
        sc.close();
    }
}
