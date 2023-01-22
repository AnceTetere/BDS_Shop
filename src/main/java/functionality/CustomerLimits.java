package functionality;

public class CustomerLimits {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public CustomerLimits() {
        this("Nobody", "nobody@nowhere.com");
    }

    public CustomerLimits(String name, String email) {
        this(name, 1000, email);
    }

    public CustomerLimits(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
