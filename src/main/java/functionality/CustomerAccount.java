package functionality;

public class CustomerAccount {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public CustomerAccount() {
        this("45678", 100.00, "Default name", "Default address", "Default phone");
        System.out.println("Empty constructor called.");
    }

    public CustomerAccount(String number, double balance, String customerName, String email, String phone) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        customerEmail = email;
        customerPhone = phone;
    }

    public CustomerAccount(String customerName, String customerEmail, String customerPhone) {
        this("99999", 2.5, customerName, customerEmail, customerPhone);
    }

    public void depositFunds(double depositAmount) {
        balance += depositAmount;
        System.out.println("Deposit of EUR " + depositAmount + " made. New balance is EUR " + balance + ".");
    }

    public void withdrawFunds(double withdrawAmount) {
        if (balance - withdrawAmount < 0) {
            System.out.println("Insufficient funds. You only have EUR " + balance + " in your account.");
        } else {
            balance -= withdrawAmount;
            System.out.println("Withdrawal of EUR " + withdrawAmount + " processed. Remaining balance equals EUR "
                    + balance + ".");
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getGetCustomerEmail() {
        return customerEmail;
    }

    public void setGetCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}