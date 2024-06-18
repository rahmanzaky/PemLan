package interfacing;

public class Employee implements Payment {
    private String registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee(String registrationNumber, String name, int salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    @Override
    public double getPayableAmount() {
        double totalInvoiceAmount = 0;
        for (Invoice invoice : invoices) {
            totalInvoiceAmount += invoice.getPayableAmount();
        }
        return salaryPerMonth - totalInvoiceAmount;
    }

    @Override
    public String toString() {
        StringBuilder invoiceDetails = new StringBuilder();
        double totalInvoiceAmount = 0.0;
        for (Invoice invoice : invoices) {
            invoiceDetails.append(invoice.toString()).append("\n");
            totalInvoiceAmount += invoice.getPayableAmount();
        }
        
        return String.format(
            "Employee Information\n" +
            "-----------------------------\n" +
            "Name                : %s\n" +
            "Registration Number : %s\n" +
            "Salary Per Month    : Rp%,d\n\n" +
            "Invoices\n" +
            "-----------------------------\n" +
            "%s" +
            "-----------------------------\n" +
            "Total Invoice Amount: Rp%,.2f\n" +
            "Salary After Deductions: Rp%,.2f\n",
            name, registrationNumber, salaryPerMonth, invoiceDetails.toString(), totalInvoiceAmount, getPayableAmount()
        );
    }
}
