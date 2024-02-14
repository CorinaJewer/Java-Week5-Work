public class Exercise3 {

    private int x = 10;

    public int getX(){
        return x;
    }

    // Final Static method
    final static void finalStaticMethod() {
        System.out.println("Final static method in Superclass");
    }

    // Static method
    public static void staticMethod() {
        System.out.println("Static method in Superclass");
    }

    // Instance method
    public void instanceMethod() {
        System.out.println("Instance method in Superclass");
    }
}

