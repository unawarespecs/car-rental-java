package MyLibs;

public class StatusReport extends Report implements Display {

    private boolean rentedStatus;

    public String rentedValue(boolean x) {
        return (x == true) ? "Rented" : "Available";
    }

    public void displayForm() {
        throw new UnsupportedOperationException("Work in progress.");
    }
}
