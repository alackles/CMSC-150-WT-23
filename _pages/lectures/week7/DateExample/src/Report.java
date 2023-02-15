public class Report {

    public static void display(Date d, String weather) {
        System.out.print("Today's date is ");
        System.out.println(d);
        System.out.print("Today's weather is ");
        System.out.println(weather);
    }
    public static void main(String[] args) {
        String weather = "rainy";
        Date today = new Date(2, 15, 2023);
        today.setFormat("European");
        display(today, weather);
        Date defaultDate = new Date();
        Date unixZero = new Date(1, 20, 1970);
        System.out.println(defaultDate);
        System.out.println(unixZero);
        System.out.println(defaultDate == unixZero);
        System.out.println(defaultDate.equals(unixZero));
        System.out.println(defaultDate.sameYear(unixZero));
    } 
}
