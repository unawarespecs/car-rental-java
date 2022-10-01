package MyLibs;

public class Customer {
    private int custNum;
    private String fName;
    private String lName;
    private String payMode;
    private int rentedCar;
    
    public Customer(int custNum, String firstName, String lastName, String payMode, int rentedCar) {
        this.custNum = custNum;
        this.fName = firstName;
        this.lName = lastName;
        this.payMode = payMode;
        this.rentedCar = rentedCar;
    }

    public int getCustNum() {
        return custNum;
    }

    public void setCustNum(int custNum) {
        this.custNum = custNum;
    }

    public String getFirstName() {
        return fName;
    }

    public void setFirstName(String fName) {
        this.fName = fName;
    }

    public String getLastName() {
        return lName;
    }

    public void setLastName(String lName) {
        this.lName = lName;
    }

    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode;
    }

    public int getRentedCar() {
        return rentedCar;
    }

    public void setRentedCar(int rentedCar) {
        this.rentedCar = rentedCar;
    }
}
