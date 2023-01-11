package functionality;

public class CustomerAccount {

    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void depositFunds(double depositAmount) {
        accountBalance += depositAmount;
        System.out.println("Deposit of EUR " + depositAmount + " made. New balance is " + accountBalance);
    }

    public void withdrawFunds(double withdrawalAmount) {
        if (accountBalance - withdrawalAmount < 0) {
            System.out.println("Insufficient funds. You only have EUR " + accountBalance + " in your account.");
        } else {
            accountBalance -= withdrawalAmount;
            System.out.println("Withdrawal of EUR " + withdrawalAmount + " processed. Remaining balance equals EUR " + accountBalance + ".");
        }
    }
}