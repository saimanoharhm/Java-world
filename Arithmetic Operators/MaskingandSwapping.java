// import java.util.Scanner;

public class MaskingandSwapping {
    public static void main(String[] args) {
        // int a=10, b=15;
        // Scanner sc = new Scanner(System.in);
        // a = a^b;
        // b=a^b;
        // a=a^b;
        // System.out.println(a+" "+b);
        // sc.close();
        byte c;
        c = (byte)(9<<4);
        c = (byte)(c|12);
        System.out.println((c&0b11110000)>>4);
        System.out.println((c&0b00001111));
    }
}