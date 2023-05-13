//Houzaifa Mahmoud
//20216729
import BankSystem.*;
public class Main {
    public static void main(String[] args) {
        // Create employee object
        employee emp = new employee("John Doe", 30, "Male", 5000, "Finance");
        emp.PrintData();
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("Department: " + emp.getDepartment());
        emp.Greet();
        System.out.println();

        // Create customer object
        customer cust = new customer("Jane Smith", 25, "Female", "123456789", "123 Main St");
        cust.PrintData();
        System.out.println("SSN: " + cust.SSN);
        System.out.println("Address: " + cust.Address);
        cust.Greet();
        System.out.println();

        // Create BankAccount object for customer
        BankAccount bankAccount = cust.getBankAccount();
        bankAccount.setBalance(1000);
        System.out.println("Balance: " + bankAccount.getBalance());

        // Demonstrate second setter of BankAccount
        bankAccount.setBalance(1000, 10);
        System.out.println("Balance after tax: " + bankAccount.getBalance());
    }
}
