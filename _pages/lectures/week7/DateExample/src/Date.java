public class Date {
    
    private int month;
    private int day;
    private int year; 

    public Date() {
        this.month = 1;
        this.day = 1;
        this.year = 1970;
    }

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }


    public void printDate() {
        System.out.println(this.month + "/" + this.day + "/" + (this.year % 2000));
    }
    public static void main(String[] args) {
        Date today = new Date();
        today.day = 13;
        today.month = 2;
        today.year = 2023;
        Date tomorrow = new Date(today.month, today.day + 1, today.year);
        Date randomDay = new Date(7, 30, 1996);
        System.out.println(today.year);
        System.out.println("Date class");
    }
}

