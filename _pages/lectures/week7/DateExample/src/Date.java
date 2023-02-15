public class Date {
    
    private int month;
    private int day;
    private int year; 
    private String format;
    public final String AUTHOR = "Acacia";

    public Date() {
        this.month = 1;
        this.day = 1;
        this.year = 1970;
        this.format = "American";
    }

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
        this.format = "American";
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }


    public static String getDefaultFormat() {
        return "American";
    }

    public String getFormat() {
        return this.format;
    }
    
    public void setFormat(String format) {
        this.format = format;
    }

    public String toString() {
        if (this.format.equals("American")) {
            return this.month + "/" + this.day + "/" + this.year;
        } else {
            return this.day + "/" + this.month + "/" + this.year;
        }
    }

    public boolean equals(Date other) {
        return this.month == other.month &&
        this.day == other.day &&
        this.year == other.year;
    }

    public boolean sameYear(Date other) {
        return this.year == other.year;
    }

}

