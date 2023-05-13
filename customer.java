//Houzaifa Mahmoud
//20216729
import BankSystem.BankAccount;
public class customer extends human {
    public String SSN;
    public String Address;
    private BankAccount bankAccount;

    public customer(String name, int age, String gender, String ssn, String address) {
        super(name, age, gender);
        SSN = ssn;
        Address = address;
        bankAccount = new BankAccount();
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }
}
