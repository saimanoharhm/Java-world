import java.io.*;

public class BufferedStreamsAndBufferedReaderAndWriter { 
  public static void main(String[] args) {
    try{
      // FileInputStream fis = new FileInputStream("Test.txt");
      // BufferedInputStream bis = new BufferedInputStream(fis);
      FileReader fis = new FileReader("Test.txt");
      BufferedReader bis = new BufferedReader(fis);

      System.out.println("FILE: "+fis.markSupported());
      System.out.println("BUFFER: "+bis.markSupported());
      System.out.print((char)bis.read());
      System.out.print((char)bis.read());
      System.out.print((char)bis.read());
      bis.mark(10);
      System.out.print((char)bis.read());
      System.out.print((char)bis.read());
      bis.reset();

      System.out.print((char)bis.read());
      System.out.print((char)bis.read());

      System.out.println(" String: "+bis.readLine());

      fis.close();
      bis.close();
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}
