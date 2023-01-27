class Nest {

    public static void times() {
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                System.out.printf("%4d", x * y);
            }
            System.out.println();
        }
    }
    public static void timesTable() {
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                System.out.printf("(%3dx%3dy)", x, y);
            }
            System.out.println();
        }
    }

    public static void dependentLoop() {
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= x; y++ ) {
                System.out.printf("%4d", x*y);
            }
        System.out.println();
        }
    }

 

    public static void innerLoop(int x) {
        for (int y = 1; y <= x; y ++) {
            System.out.printf("%4d", x*y);
        }
    }

    public static void outerLoop() {
        for (int x = 1; x <= 10; x++) {
            innerLoop(x);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        outerLoop();
    }
}