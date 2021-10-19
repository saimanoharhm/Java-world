import java.io.*;
public class byteStreamsAndCharArrayReader {
  public static void main(String[] args) {
    try{
      // byte b[] = {'a','b','c','d','e','f','g','h','i','j'};

      // ByteArrayInputStream bis = new ByteArrayInputStream(b);

      //Method - 1 Reading 1 byte at a time  
      // int x;
      // while((x=bis.read())!=-1){
        //   System.out.print((char)x);
      // }
      // Method-2 Reading all the bytes together
      // String str = new String(bis.readAllBytes());
      // System.out.println(bis.markSupported());
      // bis.close();

      // ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
      // bos.write('a');
      // bos.write('b');
      // bos.write('c');
      // bos.write('d');

      // bos.writeTo(new FileOutputStream("Test1.txt"));

      // byte b [] = bos.toByteArray();
      // for(byte x:b)
      //   System.out.print((char)x);

      char c[] = {'a','b','c','d','e','f','g','h','i','j'};
      CharArrayReader cr = new CharArrayReader(c);
      int x;
      while((x=cr.read())!=-1)
        System.out.print((char)x);
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}
