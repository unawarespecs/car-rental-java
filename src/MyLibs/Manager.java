package MyLibs;

public class Manager {

    private String name;
    private int empNo;
    private LoginDetails login;
    private Date dob;

    /**
     * @param name manager's name
     * @param empNo manager's employee number
     * @param logDet manager's username and password
     * @param dob manager's date of birth
     */
    public Manager(String name, int empNo, LoginDetails logDet, Date dob) {
        this.name = name;
        this.empNo = empNo;
        this.login = logDet;
        this.dob = dob;
    }

    public boolean loginAttempt(String user, String pass) {
        return (login.getUsername().equals(user) && login.getPassword().equals(pass));
    }

    public void recordCar(CarRecords cars) {
        //insert code here to show a jFrame form to input these values from the Manager (TODO)
        //cars.addCar(new Car(getTextfield, getTextfield, getTextfield, getTextfield)); 
        throw new UnsupportedOperationException("Work in progress."); // for now
    }

    public void processRental(Date d, CarRecords cars, CustRecords custs) {
        throw new UnsupportedOperationException("Work in progress.");
    }

    public void showReport(CarRecords cars) {
        throw new UnsupportedOperationException("Work in progress.");
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dob;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public void setDateOfBirth(Date d) {
        this.dob = d;
    }

    public LoginDetails getLogin() {
        return login;
    }
}
