import java.util.*;

class Student{
  private String rollno;
  private static int count = 1;
  private String generateRollNo(){
    Date d = new Date();
    String rn = "SIST-"+(d.getYear()+1900)+"-"+count;
    count++;
    return rn;
  }
  Student(){
    rollno = generateRollNo();
  }
  public String getRollNo(){
    return rollno;
  }
}

public class SC1StudentRollNumaber {
  public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student();
    Student s3 = new Student();

    System.out.println(s1.getRollNo());
    System.out.println(s2.getRollNo());
    System.out.println(s3.getRollNo());
  }
}
