import java.util.Arrays;
class Immutable{

    public static int intAdd() {
        Integer x = Integer.valueOf(20);
        Integer y = Integer.valueOf(40);
        Integer z = x + y;
        return z;
    }

    public static void wrapper() {
        double num = 2.4;
        Double x = Double.valueOf(num);
        System.out.println(x);

        //String myNum = num.toString();
        String myDoubleNum = x.toString();
        String myDoubleNumAgain = Double.toString(x);
        System.out.println(myDoubleNum);

        Boolean myBool = Boolean.valueOf(true);
    }

    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int elem : arr) {
            if (elem > max) {
                max = elem;
            }
        }
        return max; // placeholder
    }

    public static int[] parseArray(String[] arr) {
        int intArgs[] = new int[arr.length];
        // Enhanced for loop:
        //int i = 0;
        //for (String arg : args) {
         //   int value = Integer.parseInt(arg);
         //   intArgs[i] = value;
        //    i++;
       //}
        for (int i = 0; i < arr.length; i++) {
            intArgs[i] = Integer.parseInt(arr[i]);
        }
        return intArgs;
    }

    public static void main(String[] args) {
        System.out.println(intAdd());
        wrapper();
        //System.out.println(Arrays.toString(intArgs));
        int[] intArgs = parseArray(args);
        int maxVal = findMax(intArgs);
        System.out.println(maxVal);
        //System.out.println(Arrays.toString(args));
        //System.out.println("First arg is: " + args[0]);
    }
}