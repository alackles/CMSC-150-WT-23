class Recurse {

    public static int iFib(int n) {
        // Return the nth number
        if (n == 1 || n == 2) {
            return 1;
        }
        int a = 1;
        int b = 1;
        int sum = 0;
        for (int i = 0; i < n - 2; i++) {
            sum = a + b;
            a = b;
            b = sum;  
        }
        return sum;
    }

    public static int rFib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return rFib(n-2) + rFib(n-1);
    }

    public static void main(String[] args) {
        System.out.println(iFib(10));
        System.out.println(rFib(10));
    }
}