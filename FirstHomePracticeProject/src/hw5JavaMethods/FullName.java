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
        member1.fullName("Md", "Hossain");

        FullName member2 = new FullName();
        member2.fullName("Amina", "Siema");

        FullName member3 = new FullName();
        member3.fullName("Ayan", "Ishayu");

        FullName member4 = new FullName();
        member4.fullName("Ahnaf", "Ishrat");
    }
}
