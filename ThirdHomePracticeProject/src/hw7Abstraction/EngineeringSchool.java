package hw7Abstraction;

public abstract class EngineeringSchool {
    // Abstract method
    public abstract void mechanicalLab();

    // Non-abstract method
    public void computerLab() {
        System.out.println("This is the Computer Lab.");
    }

    // Default Constructor
    public EngineeringSchool() {
        System.out.println("Engineering School Constructor");
    }
}
