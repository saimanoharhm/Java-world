class Account{
    private int accNo;
    private String name;
    private String address;
    private int phoneno;
    private String dob;
    protected long balance;
    public Account(int accNo, String name, String address, int phoneno, String dob, long balance){
        this.accNo = accNo;
        this.name = name;
        this.address = address;
        this.phoneno = phoneno;
        this.dob = dob;
        this.balance = balance;
    }
    public int getAccNo(){return accNo;}
    public String getName(){return name;}
    public String getAddress(){return address;}
    public int getPhone(){return phoneno;}
    public String getDOB(){return dob;}
    public double getBalance(){return balance;}

    public void setAddress(String add){
        address=add;
    }
    public void setPhone(int phno){
        phoneno = phno;
    }
}
// class savingsAccount extends Account{
//     public void deposit(long amt){
//         balance += amt;
//     }
//     public void withdraw(long amt){
//         balance -= amt;
//     }
// } 
// class LoanAccount extends Account
// {
//     public void payEMI(long amt)
//     {
//         balance-=amt;
//     }
//     public void repay(long amt)
//     {
//         if(balance==amt)
//             balance=0;
//     }
// }

public class SC1Account {
    
}
