public class TestPurchaseItem {
    
    public static void main(String[] args) {

        System.out.println();
            
        PurchaseItem P1 = new PurchaseItem("Apples", 4.99);
        System.out.println(P1);

        WeighedItem W1 = new WeighedItem("Bananas",3.49, 1.37);
        System.out.println(W1);

        CountedItem C1 = new CountedItem("Oranges", 3.99, 10);
        System.out.println(C1);

        System.out.println();

    }
}
