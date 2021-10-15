class ATM{
  synchronized public void checkBalance(String name){
    System.out.print(name+" is checking");
    try{Thread.sleep(1000);}
    catch(Exception e){}
    System.out.println(" BALANCE");
  }

  synchronized public void withdraw(String name, int amount){
    System.out.print(name+" withdrawing ");
    try{Thread.sleep(1000);}catch(Exception e){}
    System.out.println(amount);
  }
}

class Customer extends Thread{
  String name;
  int amount;
  ATM atm;

  Customer(String n, ATM a, int amt){
    name = n;
    atm = a;
    amount = amt;
  }
  public void useATM(){
    atm.checkBalance(name);
    atm.withdraw(name, amount);
  }
  public void run(){
    useATM();
  }
}

public class SC_1AtmMachine {
  public static void main(String[] args) {
    ATM atm = new ATM();
    Customer c1 = new Customer("SAI",atm,1000);
    Customer c2 = new Customer("RAMBO",atm,5000);
    c1.start();
    c2.start();
  }
}
