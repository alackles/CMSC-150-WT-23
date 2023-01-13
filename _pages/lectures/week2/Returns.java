class Returns {
    public static double distance(double x1, double y1, double x2, double y2) {
        return 0.0;
    }

    public static void helloVoid() {
        System.out.println("Hello! (1)");
    }

    public static String helloReturn() {
        return "Hello! (2)";
    }
    public static void main(String[] args) {
        //double x = distance();
        //System.out.println(x);
        helloVoid();
        String b = helloReturn();
        System.out.println(b);
        System.out.println(helloReturn());

    }
}