import java.util.Scanner;

public class studentChallenge1 {
    public static void main(String[] args) {
        //Find a number is odd or even
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number: ");
        
        // int a = sc.nextInt();
        
        // if(a%2==0){
        //     System.out.println("It's an even number");
        // }
        // else{
        //     System.out.println("It's a odd number");
        // }
        //Find person is young or not young.
        // System.out.println("Enter your age: ");
        // int age = sc.nextInt();
        // if(age >= 14 && age <= 55){
        //     System.out.println("You are Young.");
        // }
        // else if(age<14 || age>55){
        //     System.out.println("You are not Young.");
        // }
        // Find grades for given marks 
        System.out.println("Enter your maths marks: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int total = m1+m2+m3;
        int average = total/3;
        System.out.println("Total marks: "+total+" Average: "+ average);
        
        if(average>=70)
        {
            System.out.println("Grade A");
        }
        else if(average>=60 && average<70)
        {
            System.out.println("Grade B");
        }
        else if(average>=50 && average<60)
        {
            System.out.println("Grade C");
        }
        else if(average>=40 && average<50)
        {
            System.out.println("Grade D");
        }
        else 
        {
            System.out.println("Grade E");
        }
        sc.close();
    }
}
