public class Test3 {
    public static void main(String[] args) {

        System.err.println();

        Exercise3.staticMethod(); // Calls the static method in Exercise3 class
        AnotherClass.staticMethod(); // Calls the static method in AntoherClass 

        // Static methods can be accessed using either a class name or and instance of a class name.

        Exercise3 myObject = new Exercise3();
        myObject.instanceMethod(); // Calls the instance method in Exercise3 class

        AnotherClass anotherObject = new AnotherClass();
        anotherObject.instanceMethod(); // Calls the instance method in AnotherClass

        anotherObject.displayX();  // calls the displayX method

        System.out.println();        
    }
}

