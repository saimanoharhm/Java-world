class Cylinder1{
    private int radius;
    private int height;
    public Cylinder1(){
        radius = 1;
        height = 1;
    }
    public Cylinder1(int r, int h){
        setRadius(r);
        setHeight(h);
    }
    public void setRadius(int r){
        if(r >= 0)
            radius = r;
        else
            radius = 0;
    }
    public void setHeight(int h){
        if(h >= 0)
            height = h;
        else
            height = 0;
    }
    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }
    public void setDimensions(int h, int r){
        height = h;
        radius = r;
    }
    public double lidArea(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double drumArea(){
        return 2*lidArea()+perimeter()*height; 
    }
    public double volume(){
        return lidArea()*height;
    }
}


public class SC1Cylinder {
    public static void main(String[] args) {
        Cylinder1 c = new Cylinder1();
        c.setRadius(7);
        c.setHeight(10);
        c.setDimensions(10, 7);

        System.out.println("lidArea: "+c.lidArea());
        System.out.println("Circumference: "+c.perimeter());
        System.out.println("totalSurfaceArea: "+c.drumArea());
        System.out.println("Volume: "+c.volume());
        System.out.println("Height: "+c.getHeight());
        System.out.println("Radius: "+c.getRadius());
    }
}
