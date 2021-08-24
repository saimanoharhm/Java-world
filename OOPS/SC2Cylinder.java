class Cylinder {
    public double radius;
    public double height;
    public double lidArea(){
        return Math.PI * radius * radius;
    }
    public double circumferenece(){
        return 2*Math.PI * radius;
    }
    public double totalSurfaceArea(){
        return 2*lidArea()+circumferenece()*height;
    }
    public double volume(){
        return lidArea()*height;
    }
}

public class SC2Cylinder {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.radius = 7;
        c.height = 10;

        System.out.println("Lid Area: "+ c.lidArea());
        System.out.println("Total Surface Area: "+ c.totalSurfaceArea());
        System.out.println("Volume: "+ c.volume());
    }
}
