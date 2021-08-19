import java.util.Scanner;

public class studentChallenge1 {
    // 1. Find a Number is Prime
    static boolean isPrime(int n)
    {
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;  
    }
    // 2. Find GCD of a given number 
    static int GCD(int m, int n){
        while(m!=n){
            if(m>n){
                m = m- n;
            }
            else if(n>m){
                n = n-m;
            }
        }
        return m;
    }
    // 3. Find max element in an array.
    static int max (int A[]){
        int maxval = 0;
        for(int i=0; i<A.length;i++){
            if(A[i] > maxval){
                maxval = A[i];
            }
        }
        return maxval;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number: ");
        // int n = sc.nextInt();
        // if(isPrime(n))
        //     System.out.println("It is a Prime Number. ");
        // else 
        //     System.out.println("It is not a Prime Number. ");
        // int m = sc.nextInt();
        // int gcd = GCD(m,n);
        // System.out.println("GCD of the given number is "+gcd);
        System.out.println("Enter the array elements: ");
        int A[] = new int[5];
        for(int i=0;i<A.length;i++){
            A[i] = sc.nextInt();
        }
        System.out.println("Maximum of a element is: "+max(A)); 
        sc.close();
    }
}
