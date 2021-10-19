import java.io.*;
public class BufferedStreamsAndBufferedReaderAndWriter {
  public static void main(String[] args) {
    try{
      FileInputStream fis = new FileInputStream("Test.txt");
      BufferedInputStream bis = new BufferedInputStream(fis);

      System.out.println("FILE: "+fis.markSupported());
      System.out.println("BUFFER: "+bis.markSupported());

      fis.close();
      bis.close();
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}
