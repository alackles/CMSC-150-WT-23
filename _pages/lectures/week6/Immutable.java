class Immutable{

    public static int intAdd(int a, int b) {
        Integer x = Integer.valueOf(a);
        Integer y = Integer.valueOf(b);
        Integer z = x + y;
        return z;
    }

    public static void main(String[] args) {
        System.out.println(intAdd(10, 20));
    }
}