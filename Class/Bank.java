package Class;
import java.util.LinkedList;
public class Bank {
    private LinkedList<Customer> customer;
    int numberOfCustomers = 0;
    private String bankName;
    public Bank(String bName){
        this.customer = new LinkedList<Customer>();
        this.bankName = bName;
    }

    public void addCustomer(String f, String l){
        numberOfCustomers += 1;
        System.out.println(getNumOfCustomers());
        Customer customer = new Customer(f,l);
        this.customer.add(customer);
    }

    public int getNumOfCustomers(){
        return numberOfCustomers;
    }

    public Customer getCustomerInteger(int index){
        return this.customer.get(index);
    }
}

