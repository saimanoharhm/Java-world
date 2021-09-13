class TV{
  public void switchON(){System.out.println("TV is Switched ON");}
  public void changeChannel(){System.out.println("TV channel is Changed");}
}
class SmartTV extends TV{
  public void switchON(){System.out.println("Smart TV is Switched ON");}
  public void changeChannel(){System.out.println("Smart TV channel is Changed");}
  public void browse(){System.out.println("Smart Tv Browsing");}
}
public class methodOverridingExample1 {
  public static void main(String[] args) {
    TV t = new TV();
    t.switchON();
    t.changeChannel();

    SmartTV st = new SmartTV();
    st.switchON();
    st.changeChannel();
    st.browse();

    TV tst = new SmartTV();
    tst.switchON();
    tst.changeChannel();
  }
}
