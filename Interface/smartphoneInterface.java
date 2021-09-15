class Phone{
  public void call(){System.out.println("Phone call");}
  public void sms(){System.out.println("Phone sending SMS");}
}
interface ICamera{
  void click();
  void record();
}
interface IMusicPlayer{
  void play();
  void stop();
}
class SmartPhone extends Phone implements ICamera,IMusicPlayer{
  public void videoCall(){System.out.println("Smart Phone video calling");}
  public void click(){System.out.println("Smart Phone Clicking Photo");}
  public void record(){System.out.println("Smart Phone recording video");}
  public void play(){System.out.println("Smart Phone playing music");}
  public void stop(){System.out.println("Smart Phone stopping music");}
}

public class smartphoneInterface {
  public static void main(String[] args) {
    SmartPhone s = new SmartPhone();
    s.call();
    s.sms();
    s.click();
    s.videoCall();
    s.play();
    s.stop();
    Phone p = s;
    ICamera c = s;
    IMusicPlayer m = s;
  }
}
