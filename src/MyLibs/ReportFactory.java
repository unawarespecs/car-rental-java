package MyLibs;

public class ReportFactory extends Factory {
    public Report showReport(int choice) {
        switch (choice) {
            case 0:
                return null;
            case 1:
                return new StatusReport();
            case 2:
                return new ListReport();
            default:
                return null;
        }
    }
    
    @Override
    public void createReport(CarRecords cr, int a) { }
}
