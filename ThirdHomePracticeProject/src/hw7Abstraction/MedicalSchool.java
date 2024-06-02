package hw7Abstraction;

public abstract class MedicalSchool {
    // Abstract method
    public abstract void anatomyLab();

    // Non-abstract method
    public void biochemistryLab() {
        System.out.println("This is the Biochemistry Lab.");
    }

    // Default Constructor
    public MedicalSchool() {
        System.out.println("Medical School Constructor");
    }
}
