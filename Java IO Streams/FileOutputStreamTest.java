import java.io.*;
public class FileOutputStreamTest {
  public static void main(String[] args)
  {
    try{
      FileOutputStream fos=new FileOutputStream("Test.txt");
      String str = "Learn Java Programming";

      byte b[] = str.getBytes();

      // Method - 3 
      fos.write(b,6,str.length()-6);
      // Writing 1 byte at a time.
      //Method - 2 
      // for(byte x:b)
      //   fos.write(x);
      // Method - 1 
      // fos.write(str.getBytes());
      fos.close();
    }
    catch(FileNotFoundException e){
      System.out.println(e);
    }
    catch(IOException e){
      System.out.println(e);
    }
  }
}
