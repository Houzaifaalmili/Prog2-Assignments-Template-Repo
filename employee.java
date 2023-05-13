//Houzaifa Mahmoud
//20216729
public class employee extends human {
    private double salary;
    private String department;

    public employee(String name, int age, String gender, double salary, String department) {
        super(name, age, gender);
        this.salary = salary;
        this.department = department;
    }

    @Override
    protected void PrintData() {
        super.PrintData();
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }
}
