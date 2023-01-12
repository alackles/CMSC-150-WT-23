public class Functions {

    public static void excite(String myString) {
        System.out.println(myString + "!!!!!!!!!");
    }

    public static void dashes(int a, String b) {
        System.out.println(a + "-" + b);
        int x = 20;
        int y = 30;
        System.out.println(x + y);
    }

    public static void adder(double a, double b) {
        System.out.println(a + b);
    }


    
    public static void main(String[] args) {
        //excite("Hello");
        //dashes(1,"two");
        String classname = "CMSC150";
        excite(classname);
        adder(20.3,4003083.2);
        
    }
}