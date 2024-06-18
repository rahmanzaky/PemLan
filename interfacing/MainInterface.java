package interfacing;

public class MainInterface {
    public static void main(String[] args) {
        Invoice[] employeeInvoices = {
            new Invoice("Smartphone", 1, 1500000),
            new Invoice("Notebook", 3, 5000),
            new Invoice("Coffee", 5, 25000),
            new Invoice("Headphones", 1, 350000)
        };

        Employee employee = new Employee("7582946", "Budi Santoso", 6000000, employeeInvoices);
        System.out.println(employee.toString());
    }
}
