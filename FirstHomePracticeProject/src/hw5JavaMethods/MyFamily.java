package hw5JavaMethods;

public class MyFamily {
    public int child1Age = 37;
    public int child2Age = 30;
    public int child3Age = 9;
    public int child4Age = 5;

    // Step 3: Implement a return type method which is int type which name could be same as class name
    public int myFamily() {
        int sum = child1Age + child2Age + child3Age + child4Age;
        System.out.println("The sum of my children's age is: " + sum);
        return sum;
    }

    // Step 4: Create a main method after the method, Instantiate the class and call the method by the object
    public static void main(String[] args) {
        MyFamily family = new MyFamily();
        family.myFamily();
    }
}
