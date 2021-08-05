import java.util.Scanner;

public class studentChallenge3 {
    public static void main(String[] args) {
        //Display name of a day based on number
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your day number: ");
        // int day = sc.nextInt();
        // if(day == 1){
        //     System.out.println("It's Monday");
        // }
        // else if(day == 2){
        //     System.out.println("It's Tuesday.");
        // }
        // else if(day == 3){
        //     System.out.println("It's Wednesday");
        // }
        // else if(day == 4){
        //     System.out.println("It's Thursday.");
        // }
        // else if(day == 5){
        //     System.out.println("It's Friday.");
        // }
        // else if(day == 6){
        //     System.out.println("It's Saturday.");
        // }
        // else if(day == 7){
        //     System.out.println("It's Sunday.");
        // }
        // else {
        //     System.out.println("Invalid day Number.");
        // }
        //Find type of website and the protocol used
        System.out.println("Enter the website URL: ");
        String str = sc.nextLine();
        int i = str.indexOf(":");
        String protocol = str.substring(0, i);
        if(protocol.equals("http")){
            System.out.println("It is a Hyper text transfer protocol.");
        }
        else if(protocol.equals("ftp")){
            System.out.println("It is a file transfer protocol.");
        }
        // Type of website
        int j = str.lastIndexOf(".");
        String type = str.substring(j+1);
        if(type.equals("com")){
            System.out.println("It is a commercial website.");
        }
        else if(type.equals("org")){
            System.out.println("It is a Organization website.");
        }
        else if(type.equals("net")){
            System.out.println("It is a Network website.");
        }
        sc.close();
    }
}
