import java.io.*;
import java.util.*;
public class tryWithResources {
  static FileInputStream fl;
  static void Divide() throws Exception{
    fl = new FileInputStream("sample.txt");
    Scanner in = new Scanner(fl);
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    System.out.println(a/b);

    fl.close(); 
    in.close();
  }
  public static void main(String[] args) {
    
  }
}
