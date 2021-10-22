import java.io.*;
import java.util.Scanner;

class Customer implements Serializable{
  String custID;
  String name;
  String phno;
  static int count = 1;
  Customer(){}
  Customer(String n,String p){
    custID="C"+count;
    count++;
    name = n;
    phno = p;
  }
  public String toString(){
    return "Customer ID: "+custID+"\nName: "+name+"\nPhone No: "+phno+"\n";
  }
}
public class SC2SerializeCustomerTest {
  // public static void main(String[] args) {
  //   Customer list[] = {new Customer("Sai", "9100135071"), new Customer("Rambo", "9151535071"), new Customer("Hari", "8554535071")};
  //   try{
  //     FileOutputStream fos = new FileOutputStream("customer1.txt");
  //     ObjectOutputStream oos = new ObjectOutputStream(fos);
  //     oos.writeInt(list.length);

  //     for(Customer c:list)
  //       oos.writeObject(c);
      
  //     oos.close();
  //     fos.close();
  //   }
  //   catch(Exception e){System.out.println(e);}
  // }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    try{
      FileInputStream fis = new FileInputStream("customer.txt");
      ObjectInputStream ois = new ObjectInputStream(fis);

      int length =ois.readInt();

      Customer list[] = new Customer[length];
      for(int i=0; i<length;i++){
        list[i] = (Customer)ois.readObject();
      }

      System.out.println("Enter Name of Customer");
      String name = in.nextLine();

      for(int i=0;i<length;i++){
        if(name.equalsIgnoreCase(list[i].name)){
          System.out.println(list[i]);
        }
      }
      
      ois.close();
      fis.close();
      in.close();
    }
    catch(Exception e){System.out.println(e);}
  }
}
