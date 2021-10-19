import java.io.*;

class InputandOutputClass{
  public void copyFile(){
    try{
      FileInputStream fis = new FileInputStream("source1.txt");
      FileOutputStream fos = new FileOutputStream("source2.txt");
      
      int b;
      while((b=fis.read())!=-1){
        if(b>=65 && b<=90)fos.write(b+32);
        else fos.write(b);
      }

      fis.close();
      fos.close();
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}

public class SC_1CopyAFile {
  public static void main(String[] args) {
    InputandOutputClass ip = new InputandOutputClass();
    ip.copyFile();
  }
}
