public class CountedItem extends PurchaseItem {
    private int quanity;

    public CountedItem(String name, double unitPrice, int quanity){
        super(name, unitPrice);
        this.quanity = quanity;
    }
    @Override
    public double getPrice(){
        return super.getPrice() * quanity;
    }
    @Override
    public String toString(){
        return(super.toString() + " " + quanity + " units" + " " + "$" + String.format("%.2f",getPrice()) + " CAD");
    }
}
