class Product{
    private int itemno;
    private String name;
    private double price;
    private int quantity;

    public Product(int i, String n, double p, int q){
        setItemNo(i);
        setName(n);
        setPrice(p);
        setQuantity(q);
    }
    public void setItemNo(int i){
        if(i >= 0)
            itemno = i;
        else 
            itemno = 0;
    }
    public void setName(String n){
        name = n;
    }
    public void setPrice(double p){
        price = p;
    }
    public void setQuantity(int q){
        quantity = q;
    }
    public int getItemno(){
        return itemno;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }

}