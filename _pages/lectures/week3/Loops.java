 class Loops {

    public static void ifex() {
        int i = 0;
        if (i < 5) {
            System.out.println("hi");
        }
        System.out.println("End of if example");
    }

    public static void collatz(int n) {
        while (n > 1) {
            System.out.print(n + " -> ");
            if (n % 2 == 0 ) {
                n = n / 2;
            } else {
                n = (n*3) + 1;
            }
        }
        System.out.print(1 + "\n");
    }
    public static void main (String[] args) {

        ifex();

        int i = 0;
        if (i < 5) {
            System.out.println("hi");
        }
        
        System.out.println("End of if");
        
        int j = 0;
        while (j < 5) {
            j++; // same as j = j + 1
            System.out.println(j);
            System.out.println("hi");
            //j = j + 3;
        }
        System.out.println("End of while");

        int my_num = 0;
        i = 0;
        while (i < 10) {
            my_num += i;
            i++;
        }
        System.out.println(my_num);


        int a = 0;
        while (a < 9) {
            System.out.println("a is " + a);
            a++;
        }

        for (int b = 0; b < 9; b++) {
            System.out.println("b is " + b);
        }

        int sum = 0;
        int end = 100;
        for (int sunshine = 0; sunshine < end; sunshine++) {
            sum += sunshine;
            if (sunshine == end - 1) {
                System.out.println(sunshine);
            }
            // now go back to the start
        }
        System.out.println(sum);

        //collatz(1293);
    }
 }