import java.io.*;
import java.security.spec.ECParameterSpec;

class Student2 implements Serializable
{
  private int rollno;
  private String name;
  private float avg;
  private String dept;
  public static int data = 10;
  public transient int t;

  public Student2(){}
  public Student2(int r, String n,float a, String d){
    rollno = r;
    name = n;
    avg = a;
    dept = d;
    data = 500;
    t = 500;
  }
  public String toString()
  {
    return "\nStudent Details\n"+"\nRoll "+rollno+"\nName "+name+"\nAverage "+avg+"\nDept "+dept+"\nData "+data+"\nTransient "+t+"\n";
  }
}

public class Method3objectStreamsSerialisation {
  // public static void main(String[] args) {
  //   try{
  //     FileOutputStream fos = new FileOutputStream("student3.txt");
  //     ObjectOutputStream oos = new ObjectOutputStream(fos);

  //     Student2 s = new Student2(10,"Hari",89.58f,"EEE");
  //     oos.writeObject(s);

  //     fos.close();
  //     oos.close();
  //   }
  //   catch(Exception e){
  //     System.out.println(e);
  //   }
  // }
  public static void main(String[] args) {
    try{
      FileInputStream fis = new FileInputStream("student3.txt");
      ObjectInputStream ois = new ObjectInputStream(fis);

      Student2 s = (Student2)ois.readObject();
      
      System.out.println(s);

      fis.close();
      ois.close();
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}
