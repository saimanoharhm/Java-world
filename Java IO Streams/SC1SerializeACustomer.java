import java.io.*;

public class SC1SerializeACustomer {
  public static void main(String[] args) {
    float list[] = {1.2f, 3.45f, 6.78f,9.01f, 2.34f};
    try{
      FileOutputStream fos = new FileOutputStream("customer.txt");
      DataOutputStream dos= new DataOutputStream(fos);

      dos.writeInt(list.length);
      for(float f:list)
      {
        dos.writeFloat(f);
      }

      fos.close();
      dos.close();

      FileInputStream fis = new FileInputStream("customer.txt");
      DataInputStream dis= new DataInputStream(fis);

      int length = dis.readInt();
      float data;

      for(int i=0;i<length;i++){
        data = dis.readFloat();
        System.out.println(data);
      }

      dis.close();
      fis.close();
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}
