package Class;
public class Customer{
    private String firstname;
    private String lastname;
    private Account account;
    public Customer(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public Account getAccount() {
        return this.account;
    }

    public void setAccount(Account acc){
        this.account = acc;
    }

}
