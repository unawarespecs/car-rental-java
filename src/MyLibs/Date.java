package MyLibs;

public class Date {
    private int day;
    private int month;
    private int year;
    
    public Date(int d, int m, int y) {
        this.day = d;
        this.month = m;
        this.year = y;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public String stringDate() {
        return month + "/" + day + "/" + year;
    }
}
