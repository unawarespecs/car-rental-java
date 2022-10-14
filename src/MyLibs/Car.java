package MyLibs;

public class Car {

    private int carNum;
    private String brand;
    private String model;
    private double price;
    private boolean rentedStatus;
    private Date endRent;
    private String renterName;

    /**
     * @param carNum car number
     * @param brand car brand
     * @param model car model
     * @param price car price
     */
    public Car(int carNum, String brand, String model, double price) {
        this.rentedStatus = false;
        this.endRent = new Date(1, 1, 1970); // default date
        this.renterName = "";

        this.carNum = carNum;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void setRentedStatus(boolean rentedStatus) {
        this.rentedStatus = rentedStatus;
    }

    public void setEndRent(Date endRent) {
        this.endRent = endRent;
    }

    public void setRenterName(String renterName) {
        this.renterName = renterName;
    }

    public void setCarNum(int carNum) {
        this.carNum = carNum;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCarNum() {
        return carNum;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public boolean isRentedStatus() {
        return rentedStatus;
    }

    public Date getEndRent() {
        return endRent;
    }

    public String getRenterName() {
        return renterName;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
