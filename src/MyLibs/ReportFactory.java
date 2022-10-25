package MyLibs;

public class ReportFactory extends Factory {

    Report x;

    @Override
    public void createReport(CarRecords cr, int a) {
//        switch (a) {
//            case 1:
//                x = new StatusReport();
//                x.displayForm(cr);
//            case 2:
//                x = new ListReport();
//                x.displayForm(cr);
//        }
        if (a == 1) {
            x = new StatusReport();
            x.displayForm(cr);
        } else if (a == 2) {
            x = new ListReport();
            x.displayForm(cr);
        }
    }
}
