import java.io.*;
public class fileClassTest {
  public static void main(String[] args) {
    try{
      // File f = new File("E:\\Java Programs\\Java-world\\Java IO Streams\\data.txt");
      // System.out.println(f.isDirectory());
      // String list [] = f.list();

      // for(String x:list){
      //   System.out.println(x);
      // }

      ////File Array/////
      // File list [] = f.listFiles();

      // for(File x:list){
      //   System.out.print(x.getName()+" ");
      //   System.out.println(x.getPath());
      //   System.out.println(x.getParent());
      // }
      // f.setWritable(true);
      // f.setLastModified();
      FileOutputStream fos = new FileOutputStream("E:\\Java Programs\\Java-world\\Java IO Streams\\data.txt");
      
      
      fos.close();
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}
