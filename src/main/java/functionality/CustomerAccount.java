package functionality;

public class CustomerAccount {
    private String number;
    private double balance;
    private String customerName;
    private String getCustomerEmail;
    private String customerPhone;

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
        return getCustomerEmail;
    }

    public void setGetCustomerEmail(String getCustomerEmail) {
        this.getCustomerEmail = getCustomerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
