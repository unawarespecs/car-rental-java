package MyLibs;

import MyApp.*;
import javax.swing.table.DefaultTableModel;

public class ListReport implements Report {

    @Override
    public void displayForm(CarRecords cr) {
        ListReportForm listForm = new ListReportForm();

        DefaultTableModel model = (DefaultTableModel) listForm.getAvailFormTable().getModel();
        model.setRowCount(0);

        for (Car c : cr.allCars) {
            int carNum;
            String carBrand;
            String carModel;
            double carPrice;

            carNum = c.getCarNum();
            carBrand = c.getBrand();
            carModel = c.getModel();
            carPrice = c.getPrice();

            model = (DefaultTableModel) listForm.getAvailFormTable().getModel();
            model.insertRow(model.getRowCount(),
                    new Object[]{carNum, carBrand, carModel, carPrice}
            );
        }
        listForm.setVisible(true);
    }
}
