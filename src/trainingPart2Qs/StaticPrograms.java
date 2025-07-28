package trainingPart2Qs;

public class StaticPrograms {
    // Static variable
    static int staticVariable = 10;
    int instanceVariable = 20;

    // Static block - executes when the class is loaded
    static {
        System.out.println("This is a static block.");
        System.out.println("Static variable: " + staticVariable);
        // Can't access instance variables directly in a static context
        // System.out.println("Instance variable: " + instanceVariable); // This line would cause an error
    }

    // Static method
    public static void staticMethod() {
        System.out.println("This is a static method.");
        // Can't access instance variables directly in a static method
        // System.out.println("Instance variable in static method: " + instanceVariable); // This line would cause an error
    }

    // Instance method
    public void instanceMethod() {
        System.out.println("This is an instance method.");
        System.out.println("Instance variable: " + instanceVariable);
        System.out.println("Static variable in instance method: " + staticVariable);
    }

    public static void main(String[] args) {
        // Accessing static variable
        System.out.println("Accessing static variable: " + staticVariable);

        // Accessing static method
        staticMethod();

        // Creating an object to access instance methods
        StaticPrograms obj = new StaticPrograms();
        obj.instanceMethod();
    }
}
