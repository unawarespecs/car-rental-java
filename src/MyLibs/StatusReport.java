package MyLibs;

import MyLibs.*;
import MyApp.*;
import javax.swing.table.DefaultTableModel;

public class StatusReport implements Report {

    @Override
    public void displayForm(CarRecords cr) {
        StatusReportForm statForm = new StatusReportForm();

        DefaultTableModel model = (DefaultTableModel) statForm.getStatusTable().getModel();
        model.setRowCount(0);

        for (Car c : cr.allCars) {
            int carNum;
            boolean carStatus;

            carNum = c.getCarNum();
            carStatus = c.isRentedStatus();
            model = (DefaultTableModel) statForm.getStatusTable().getModel();
            model.insertRow(model.getRowCount(),
                    new Object[]{carNum, carStatus}
            );
        }
        statForm.setVisible(true);
    }

}
