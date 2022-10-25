package MyLibs;

import java.util.ArrayList;

public class CarRecords {

    public ArrayList<Car> allCars = new ArrayList<Car>();

    public int checkAvail(CarRecords cr, Date d) {
        for (Car freeCar : cr.getAllCars()) {
            if (freeCar.getEndRent().getYear() <= d.getYear()
                    && freeCar.getEndRent().getMonth() <= d.getMonth()
                    && freeCar.getEndRent().getDay() < d.getDay()) {
                //tableModel.insertRow(tableModel.getRowCount(), new Object[]{
                //freeCar.getCarNum(), 
                //freeCar.getModel(), 
                //freeCar.getPrice(), 
                //freeCar.isRentedStatus()
                //}
                throw new UnsupportedOperationException("Work in progress.");
            }
        }

        // In the same jPanelForm, have a button underneath and a textbox for 
        // the manager to input the car they wanna rent
        int chosenCar = 0; //temp, remove if below is implemented
        //int chosenCar = jFrame.getTextfield(); //causes errors because jFrame not imported yet

        //Get input of the Manager as to which Car the  user would like to rent
        return chosenCar;
    }

    public void addCar(Car c) {
        allCars.add(c);
    }

    public ArrayList<Car> getAllCars() {
        return allCars;
    }

    public void setAllCars(ArrayList<Car> allCars) {
        this.allCars = allCars;
    }

    public void returnCar(int c) {
        throw new UnsupportedOperationException("Work in progress.");
    }
}
