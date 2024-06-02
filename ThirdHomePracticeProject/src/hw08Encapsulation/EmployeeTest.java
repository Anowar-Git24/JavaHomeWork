package hw08Encapsulation;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("John Doe");
        emp.setAge(30);
        emp.setSex('M');
        emp.setCitizen("USA");

        System.out.println("Employee Info:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
        System.out.println("Sex: " + emp.getSex());
        System.out.println("Citizen: " + emp.getCitizen());
    }
}
