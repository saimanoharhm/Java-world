import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class studentChallenge2 {
    //1. Maximum of numbers using varargs
    static int Max(int ...A){
        if(A.length == 0)return Integer.MIN_VALUE;
        int m = A[0];
        for(int i=1; i<A.length;i++){
            if(A[i] > m){
                m = A[i];
            }
        }
        return m;
    }
    //2. Sum of all elements using varargs
    static int sum(int ...A){
        int sum=0;
        for(int i=0;i<A.length;i++){
            sum += A[i];
        }
        return sum;
    } 
    // 3. Calculate Discount using varargs
    static double Discount(double ...P){
        double sum = 0;
        for(int i=0; i<P.length;i++)
            sum+=P[i];
        if(sum >= 400 && sum <500){
            return sum*0.10;
        }
        else if(sum >=500 && sum<1000)
            return sum*0.15;
        else
            return sum*0.20;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[10];
        System.out.println("Enter the values: ");
        for(int i=0;i<A.length;i++){
            A[i] = sc.nextInt();
        }
        System.out.println(Max());
        System.out.println("The Maximum number is: "+Max(A)); 
        System.out.println("Sum of all elements is: "+sum(A));
        System.out.println("The Price after discount is: "+Discount(92.5,97.6,49.5,78.9,88.6,89.5));
        sc.close();
    }
}
