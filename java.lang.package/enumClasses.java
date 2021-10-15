// enum Dept{
//   CS,IT,CIVIL,ECE;

//   private Dept(){
//     System.out.println(this.name());
//   }
//   public void display(){
//     System.out.println(this.name()+" "+this.ordinal());
//   }
// }

// public class enumClasses {
//   public static void main(String[] args) {
//     Dept d = Dept.CS;
//     d.display();
//     // System.out.println(d.ordinal());

//     // Dept list [] = Dept.values();

//     // for(Dept x:list)
//     //   System.out.println(x);

//     switch(d)
//     {
//       case CS: System.out.println("Head: John \nBlock: A");
//       break;
//     }

//   }
// }

enum Dept
{
  CS("John","Block A"),IT("Smith","Block B"),CIVIL("Srinivas","Block C"),ECE("Dave","Block D");
  String head;
  String location;
  private Dept(String head,String loc)
  {
    this.head=head;
    this.location=loc;
  }
  public String getHeadName()
  {
    return head;
  }
  public String getLocation()
  {
      return location;
  }
}

public class enumClasses 
{
    public static void main(String[] args) 
    {
      Dept d=Dept.CS;
      System.out.println(d.getHeadName());
      System.out.println(d.getLocation());
  }   
}