import java.util.Scanner;

public class studentChallenge4switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter day number: ");
        // int day = sc.nextInt();

        // switch(day){
        //     case 1: System.out.println("It's Monday.");
        //         break;
        //     case 2: System.out.println("It's Tuesday.");
        //         break;
        //     case 3: System.out.println("It's Wednesday.");
        //         break;
        //     case 4: System.out.println("It's Thursday.");
        //         break;
        //     case 5: System.out.println("It's Friday.");
        //         break;
        //     case 6: System.out.println("It's Saturday.");
        //         break;
        //     case 7: System.out.println("It's Sunday.");
        //         break;
        //     default : System.out.println("It's a Invalid day.");
        // }
        //Display name of a month based on number.
        // System.out.println("Enter month number: ");
        // int month = sc.nextInt();

        // switch(month){
        //     case 1: System.out.println("It's January.");
        //         break;
        //     case 2: System.out.println("It's February.");
        //         break;
        //     case 3: System.out.println("It's March.");
        //         break;
        //     case 4: System.out.println("It's April.");
        //         break;
        //     case 5: System.out.println("It's May.");
        //         break;
        //     case 6: System.out.println("It's June.");
        //         break;
        //     case 7: System.out.println("It's July.");
        //         break;
        //     case 8: System.out.println("It's Augest.");
        //         break;
        //     case 9: System.out.println("It's September.");
        //         break;
        //     case 10: System.out.println("It's October.");
        //         break;
        //     case 11: System.out.println("It's November.");
        //         break;
        //     case 12: System.out.println("It's December.");
        //         break;
        //     default : System.out.println("It's a Invalid month.");
        // }
        //3. Display type of website
        System.out.println("Enter the website URL: ");
        String URL = sc.nextLine();
        int i = URL.lastIndexOf(".");
        String domain = URL.substring(i+1);
        switch(domain){
            case "com": System.out.println("Commercial");
                break;
            case "org": System.out.println("Organisation");
                break;
            case "gov": System.out.println("Government");
                break;
            case "net": System.out.println("Network");
                break;
        }    
        sc.close();
    }
}
