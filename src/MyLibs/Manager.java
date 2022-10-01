package MyLibs;

public class Manager {
    private String name;
    private int empNo;
    private LoginDetails login;
    private Date dob;
    
    public Manager(String name, int empNo, LoginDetails logDet, Date dob) {
        this.name = name;
        this.empNo = empNo;
        this.login = logDet;
        this.dob = dob;
    }
    
    public boolean loginAttempt(String user, String pass) {
        // FIXME: temporary, need to change the two below to use jField thingies
       user = this.login.getUsername();
       pass = this.login.getPassword();
        
       return (login.getUsername().equals(user) && login.getPassword().equals(pass));
    }
    
    public void recordCar(CarRecords cars) {
	//insert code here to show a jFrame form to input these values from the Manager (TODO)
        //cars.addCar(new Car(getTextfield, getTextfield, getTextfield, getTextfield)); 
        throw new UnsupportedOperationException("Work in progress."); // for now
    }
    
    public void processRental(Date d, CarRecords cars, CustRecords custs) { throw new UnsupportedOperationException("Work in progress."); }
    public void showStatusRep(CarRecords cars) { throw new UnsupportedOperationException("Work in progress."); }
    public void showListRep(CarRecords cars) { throw new UnsupportedOperationException("Work in progress."); }
}
