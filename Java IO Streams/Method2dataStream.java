import java.io.*;

class Student1{
  int rollno;
  String name;
  float avg;
  String dept;
}

public class Method2dataStream {
  public static void main(String[] args) {
    // try{
    //   FileOutputStream fos = new FileOutputStream("student2.txt");
    //   DataOutputStream dos = new DataOutputStream(fos);
    //   Student1 s = new Student1();
    //   s.rollno = 10; 
    //   s.name = "Rambo";
    //   s.avg = 80.5f; 
    //   s.dept = "ECE";

    //   dos.writeInt(s.rollno);
    //   dos.writeUTF(s.name);
    //   dos.writeFloat(s.avg);
    //   dos.writeUTF(s.dept);

    //   dos.close();
    //   fos.close();
    // }
    try{
      FileInputStream fis = new FileInputStream("student2.txt");
      DataInputStream dis = new DataInputStream(fis);
      Student1 s = new Student1();
      s.rollno = dis.readInt(); 
      s.name = dis.readUTF();
      s.avg = dis.readFloat(); 
      s.dept = dis.readUTF();

      System.out.println("Roll No: "+s.rollno);
      System.out.println("Name: "+s.name);
      System.out.println("Average: "+s.avg);
      System.out.println("Dept: "+s.dept);

      dis.close();
      fis.close();
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}
