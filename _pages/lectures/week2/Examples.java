class Examples {
    public static void main(String[] args) {
        System.out.println(System.out);
        int x = 6;
        double y = 2.3;
        String z = "hello";
        x = (int)y;
        y = (double)x;
        System.out.println(x);
        System.out.println(y);

        int adr = 123;
        // two equivalent operations:
        String address = Integer.toString(adr); // adr to string
        String newstring = "" + adr; // adr to string

        System.out.println(address.getClass()); 
        System.out.println(newstring.getClass());

        int newadr = Integer.parseInt(address);
        System.out.println(newadr);
    }
}
