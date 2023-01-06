class Examples {
    public static void main(String[] args) {
        //String hello = "Hello!";
        //int x = 8;
        //double y = 8.0;

        // importance of variables
        System.out.println("My name is Ricky Hain.");
        System.out.print("First name: Ricky");
        System.out.println("Last name: Hain");

        String firstName = "Ricky";
        String lastName = "Hain";
        System.out.println("My name is " + firstName + lastName + ".");
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);

        // operators

        int x = 7;
        int y = 4;
        double z = x + y;
        System.out.println(z);

        int a = 9;
        double b = 20.0;
        double c = b * a;
        a = 7;
        System.out.println(c);

        // division
        int j = 3;
        double k = 2.0;
        System.out.println(j/k);

        // String Operations
        String subj = "CMSC";
        int code = 150;
        String classname = subj + code;
        System.out.println(classname);
        System.out.println(subj + " " + code);
    }
}   