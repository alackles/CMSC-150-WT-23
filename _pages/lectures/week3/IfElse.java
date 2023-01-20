import java.util.Scanner;
class IfElse {

    public static boolean and(boolean x, boolean y) {
        if (x) {
            if (y) {
                return true;
            }
        }
        return false;
    }

    public static int name(String s) {
        switch (s) {
            case "Acacia":
                return 2399239;
            case "Liz":
                return 100;
        }
        return -1;
    }

    public static void login(String userName, String password) {
        if (userName == "Acacia" && password == "my_real_password") {
            System.out.println("Access granted.");
        } else if (userName == "Acacia") {
            System.out.println("wrong password");
        } else if (password == "my_real_password") {
            System.out.println("wrong username");
        } else {
            System.out.println("Wrong password and username.");
        }

    }
    public static void main(String[] args) {
        int x = 2000;
        if (x %2== 0) {
            System.out.println("x is even");
        } else if (x == 0) {
            System.out.println("x is 0");
        } else {
            System.out.println("x is odd");
        }

        if (x > 10 && x <= 600) {
            System.out.println("Small number");
        } else if (x > 600) {
            System.out.println("Big number");
        }
        
        Scanner in = new Scanner(System.in);
        String name = "Acacialajdsfd";
        String pwd = "my_real_password";
        login(name, pwd);

        System.out.println("If: ");

        String courseCode = "MATH 230";
        if (courseCode == "MATH 230" || courseCode == "MATH 140") {
            System.out.println("This is a math class.");
        } else if (courseCode == "CMSC 150") {
            System.out.println("This is a CS class.");
        } else {
            System.out.println("This is something else.");
        }

        System.out.println("Switch:");

        switch (courseCode) {
            case "MATH 230":
            case "MATH 140":
                System.out.println("This is a math class.");
                break;
            case "CMSC 150":
                System.out.println("This is a CS class.");
                break;
            default:
                System.out.println("This is something else.");
        }

        System.out.println(name("Liz"));

    }
}