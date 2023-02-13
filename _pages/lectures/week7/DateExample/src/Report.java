public class Report {
    public static void main(String[] args) {
        String weather = "cold";
        System.out.print("Today's date is ");
        Date today = new Date(2, 13, 2023);
        today.printDate();
        System.out.println(today.getMonth());
        today.setMonth(7);
        System.out.println(today.getMonth());
        System.out.println("The weather is " + weather);
    } 
}
