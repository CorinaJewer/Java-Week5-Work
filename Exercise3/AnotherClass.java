public class AnotherClass extends Exercise3 {

    private int x = 20;   // Shadows the x field in Superclass. This means that the x field in AnotherClass shadows the x field in Exercise3 class, effectively hiding it within the subclass.

    /*@Override
    public void staticMethod() {
        System.out.println("Attempting to override static method in AnotherClass");
    }*/

    // Error occurs becuase you cannot override a static method with an instance method. Static methods belong to the class itself and instance methods belong to individual instances of a class.

    @Override
    public void instanceMethod() {
        System.out.println("Overriden Instance method in AnotherClass");
    }

    /*@Override
    static void finalStaticMethod() {
        System.out.println("Attempting to override final static method in Subclass");
    }*/

    // Final static methods cannot be overridden or hidden in any subclass. They can be accessed and called using the class or subclass name. AnotherClass.finalStaticmethod();

    public void displayX() {
        System.out.println("x in Subclass: " + x); // Accesses the 'x' field in the subclass
        System.out.println("x in Superclass: " + super.getX()); // Accesses the 'x' field in the superclass
    }
}
