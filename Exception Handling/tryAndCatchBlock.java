import java.util.Scanner;
public class tryAndCatchBlock {
  public static void main(String[] args) {
    int a,b,c;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter two number: ");
    a = in.nextInt();
    b = in.nextInt();
    try{  
      c = a/b;
      System.out.println(c);
    }
    catch(ArithmeticException e){
      System.out.println("Denominator should not be 0, try again "+e);
    }
    System.out.println("Bye");
    in.close();
  }
}
