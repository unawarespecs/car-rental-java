package MyLibs;

import MyApp.CheckAvailForm;
import javax.swing.table.DefaultTableModel;
import MyApp.CarRecordsForm;

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

    public void processRental(Date d, CarRecords cars, CustRecords custs) {
        CheckAvailForm availForm = new CheckAvailForm();
        //int chosenCar = cars.checkAvail(cars, d);

        CheckAvailForm.tempDate = d;
        CheckAvailForm.tempCarRec = cars;
        CheckAvailForm.tempCustRec = custs;
        DefaultTableModel model = (DefaultTableModel) availForm.getAvailFormTable().getModel();
        model.setRowCount(0);

        for (Car c : cars.allCars) {
            int carNum;
            String carBrand;
            String carModel;
            double carPrice;

            if (c.getEndRent().getYear() <= d.getYear()
                    && c.getEndRent().getMonth() <= d.getMonth()
                    && c.getEndRent().getDay() < d.getDay()) {

                carNum = c.getCarNum();
                carBrand = c.getBrand();
                carModel = c.getModel();
                carPrice = c.getPrice();

                model = (DefaultTableModel) availForm.getAvailFormTable().getModel();
                model.insertRow(model.getRowCount(),
                        new Object[]{carNum, carBrand, carModel, carPrice}
                );
            }

        }
        availForm.setVisible(true);
        
        
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
