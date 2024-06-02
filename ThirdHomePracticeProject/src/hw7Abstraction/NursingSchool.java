package hw7Abstraction;

public abstract class NursingSchool {
    // Abstract method
    public abstract void hygiene();

    // Non-abstract method
    public void caring() {
        System.out.println("This is the Caring Lab.");
    }

    // Default Constructor
    public NursingSchool() {
        System.out.println("Nursing School Constructor");
    }
}
