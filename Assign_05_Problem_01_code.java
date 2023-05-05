//Houzaifa Mahmoud
//20216729
class BankAccount {
    private double balance;
    private String username;
    private String bankname;
    private static String country = "Egypt";
    private static int numOfUsers = 0;
    private static int numOfCalls = 0;

    public BankAccount() {
        balance = 0;
        username = "";
        bankname = "";
        numOfUsers++;
        System.out.println("A new bank account has been created!");
    }

    public BankAccount(double initialBalance, String username, String bankname) {
        balance = initialBalance;
        this.username = username;
        this.bankname = bankname;
        numOfUsers++;
        System.out.println("A new bank account has been created for " + username + "!");
    }

    public void deposit(double amount) {
        balance += amount;
        numOfCalls++;
        System.out.println("Successfully deposited " + amount + " EGP into your account.");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            numOfCalls++;
            System.out.println("Successfully withdrew " + amount + " EGP from your account.");
        } else {
            System.out.println("Insufficient funds. Cannot withdraw " + amount + " EGP from your account.");
        }
    }

    public static int getNumOfUsers() {
        return numOfUsers;
    }

    public static int getNumOfCalls() {
        return numOfCalls;
    }

    public double getBalance() {
        return balance;
    }

    public String getUsername() {
        return username;
    }

    public String getBankname() {
        return bankname;
    }

    public static String getCountry() {
        return country;
    }
}
public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        System.out.println("Account 1 balance: " + account1.getBalance());  // 0.0

        BankAccount account2 = new BankAccount(1000, "John", "Bank of Cairo");
        System.out.println("Account 2 balance: " + account2.getBalance());  // 1000.0
        account2.deposit(500);
        System.out.println("Account 2 balance after deposit: " + account2.getBalance());  // 1500.0

        account2.withdraw(200);
        System.out.println("Account 2 balance after withdrawal: " + account2.getBalance());  // 1300.0

        System.out.println("Number of users: " + BankAccount.getNumOfUsers());  // 2
        System.out.println("Number of deposit/withdraw calls: " + BankAccount.getNumOfCalls());  // 2
    }
}
