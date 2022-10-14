package MyLibs;

public class StatusReport implements Report {

    private boolean rentedStatus;

    public String rentedValue(boolean x) {
        return (x == true) ? "Rented" : "Available";
    }

    @Override
    public void displayForm(CarRecords cr) {
        throw new UnsupportedOperationException("Work in progress.");
    }
}
