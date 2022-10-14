package MyLibs;

import java.util.ArrayList;

public class CustRecords extends Records {

    private ArrayList<Customer> allCustomers;

    public CustRecords() {
        this.allCustomers = new ArrayList<Customer>();
    }

    @Override
    public int totalRecords(int totalR) {
        throw new UnsupportedOperationException("Work in progress.");
    }

    public void addCustomer(Customer cust) {
        allCustomers.add(cust);
    }

    public ArrayList<Customer> getAllCustomers() {
        return allCustomers;
    }

    public void setAllCustomers(ArrayList<Customer> allCustomers) {
        this.allCustomers = allCustomers;
    }
}
