public class TestAnimals {
    public static void main(String[] args) {
        
        System.out.println();

        Animal A1 = new Animal("Bear");
        System.out.println(A1);

        Mammal M1 = new Mammal("Rabbit");
        System.out.println(M1);

        Cat C1 = new Cat("Tabby");
        C1.greets();
        System.out.println(C1);

        Dog D1 = new Dog("Retreiver");
        System.out.println(D1);
        D1.greets();
        Dog D2 = new Dog("Begal");
        System.out.println(D2);
        D1.greets(D2);

        System.out.println();

    }
}
