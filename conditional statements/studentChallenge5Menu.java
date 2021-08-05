import java.util.Scanner;
public class studentChallenge5Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("======");
        System.out.println("1. ADD ");
        System.out.println("2. SUB ");
        System.out.println("3. MUL ");
        System.out.println("4. DIV ");
        System.out.println("Enter two number's: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z;
        sc.nextLine();
        System.out.println("Enter option in Words: ");
        String option = sc.nextLine();
        switch(option){
            case "ADD": z = x+y;
                System.out.println("Add of two number's: "+z);
            break;
            case "SUB": z = x-y;
                System.out.println("Add of two number's: "+z);
            break;
            case "MUL": z = x*y;
                System.out.println("Add of two number's: "+z);
            break;
            case "DIV": z = x/y;
                System.out.println("Add of two number's: "+z);
            break;
            default : System.out.println("Invalid Input's.");
        }
        sc.close();
    }
}
