class Student{
    public String rollNo;
    public String name;
    public String course;
    public int m1,m2,m3;
    public int total(){
        return m1+m2+m3;
    }
    public int Average(){
        return total()/3;
    }
    public char grade(){
        if(Average() > 70)
            return 'A';
        else if(Average() > 60 && Average() < 69)
            return 'B';
        else if(Average() > 50 && Average() < 59)
            return 'C';
        else if(Average() > 40 && Average() < 49)
            return 'D';
        else 
            return 'E';
    }
    public String details(){
        return "Roll No: "+rollNo+"\n"+"Name: "+name+"\n"+"Course: "+course+"\n";
    }
    public String toString(){ // If we write the function name like this then we can print the data inside this function by just calling the object name. 
        return "Roll No2: "+rollNo+"\n"+"Name2: "+name+"\n"+"Course2: "+course+"\n";
    }
}
public class SCStudent {
    public static void main(String[] args) {
        Student s = new Student();
        s.rollNo = "19S115020";
        s.name = "Annam Sai Manohar";
        s.course = "B.E CSE";
        s.m1 = 52;
        s.m2 = 72;
        s.m3 = 89;

        System.out.println("Total: "+s.total());
        System.out.println("Average: "+s.Average());
        System.out.println("Details of the Student1: \n"+s.details());
        System.out.println("Details of the Student2: \n"+s);
    }
}
