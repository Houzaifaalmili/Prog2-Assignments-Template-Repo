//Houzaifa Mahmoud
//20216729
import BankSystem.BankAccount;
public class human {
    protected String Name;
    protected int Age;
    protected String Gender;

    public human(String name, int age, String gender) {
        Name = name;
        Age = age;
        Gender = gender;
    }

    protected void PrintData() {
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Gender: " + Gender);
    }

    public final void Greet() {
        System.out.println("Good Morning");
    }
}


