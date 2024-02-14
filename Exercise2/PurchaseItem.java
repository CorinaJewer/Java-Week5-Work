public class PurchaseItem {
    
    private String name;
    private double unitPrice;

    public PurchaseItem(String name, double unitPrice){
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public PurchaseItem(){
        this("no item", 0);
    }

    public double getPrice(){
        return unitPrice;
    }

    public void setPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        return (this.name + " @ " + this.unitPrice);
    }
}
