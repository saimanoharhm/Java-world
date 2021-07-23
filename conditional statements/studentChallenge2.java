import java.util.Scanner;


public class studentChallenge2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number: ");
        // String num = sc.nextLine();
        // if(num.matches("[01]+")){
        //     System.out.println("Binary num Radix: 2");
        // }
        // else if(num.matches("[0-7]+")){
        //     System.out.println("Octal number Radix: 8");
        // }
        // else if(num.matches("[0-9A-F]+")){
        //     System.out.println("Hexa number Radix: 16");
        // }
        // else if(num.matches("[0-9]+")){
        //     System.out.println("Decimal number Radix: 10");
        // }
        // else{
        //     System.out.println("Not a number");
        // }
        //Find a given year is a leap year 
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("It's a leap year.");
                }
                else{
                    System.out.println("Not a leap year.");
                }
            }
            else{
                System.out.println("It's a leap year.");
            }
        }
        else{
            System.out.println("Not a leap year.");
        }
        sc.close();
    }
}
