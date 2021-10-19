import java.io.*;
public class fileInputStreamTest {
  public static void main(String[] args)
  {
    /////////FileInputStream/////////////
    // try(FileInputStream fis=new FileInputStream("Test.txt")){

      //Method-1
      // byte b[] = new byte[fis.available()];
      // fis.read(b);
      // String str = new String(b);
      // System.out.println(str);
      
      //Method - 2 
      // int x;
      // do{
      //   x = fis.read();
      //   if(x!=-1)
      //     System.out.print((char)x);
      // }while(x!=-1);

      //Method - 3
    //   int x;
    //   while((x=fis.read())!=-1){
    //     System.out.print((char)x);
    //   }
    // }
    // catch(FileNotFoundException e){
    //   System.out.println(e);
    // }
    // catch(IOException e){
    //   System.out.println(e);
    // }

    /////////FileReader/////////////
    try(FileReader fr = new FileReader("Test.txt")){
      int x;
      while((x=fr.read())!=-1){
        System.out.print((char)x);
      }
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}
