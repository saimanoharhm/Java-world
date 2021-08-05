import java.util.Scanner;

public class studentChallenge2 {
    public static void main(String[] args) {
        //1. Display Digits of Number.
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int r;
        // while(n!=0){
        //     r = n%10;
        //     System.out.println("Number: "+r);
        //     n /= 10;
        // }
        // 2. Count digits of a Number.
        // int count = 0;
        // while(n!=0){
        //     n = n/10;
        //     count++;
        // }
        // System.out.println("Count of a Number is: "+count);
        //3. Finding a number is Armstrong or not?
        // int r,sum=0;
        // int m = n; 
        // while(n!=0){
        //     r = n%10;
        //     sum += r*r*r;
        //     n /= 10;
        // }
        // if(m==sum)
        //     System.out.println("It is a Amstrong number: "+sum);
        // else 
        //     System.out.println("It is not a Amstrong number: "+sum);
        // 4. Reverse a Number
        int reverse = 0, remainder;
        int m = n;
        while(n!=0){
            remainder = n%10;
            reverse = reverse * 10 + remainder;
            n = n/10;
        }
        System.out.println("Reversed Number: "+ reverse);
        // 5. Check a number is palindrome. 
        if(reverse == m ){
            System.out.println("It is a palindrome number.");
        }
        else{
            System.out.println("It is not a palindrome number.");
        }
        sc.close();
    }
}
