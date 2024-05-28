package hw5JavaMethods;

public class FullName {
    public String fullName(String fName, String lName) {
        String fullName = fName + " " + lName;
        System.out.println("Family Member: " + fullName);
        return fullName;
    }

    // Step 7: Create a main method after the method, Instantiate the class and call the method by the object
    public static void main(String[] args) {
        FullName member1 = new FullName();
        member1.fullName("John", "Doe");

        FullName member2 = new FullName();
        member2.fullName("Jane", "Doe");

        FullName member3 = new FullName();
        member3.fullName("Jack", "Doe");

        FullName member4 = new FullName();
        member4.fullName("Jill", "Doe");
    }
}
