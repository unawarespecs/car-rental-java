package MyLibs;

public class ReportFactory {
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
}
