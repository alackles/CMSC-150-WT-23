public class Arrays {
   public static void main(String[] args) {
        // all in one line
        int[] myInts = {3, 4, 5, 2};
        int[] j = new int[20];

        // multiple lines; initialization must be oneliner
        String[] words = {"Hello", "Goodbye"};
        String[] courses;
        courses = new String[20];

        String[] depts = {"MATH", "STAT", "CMSC"};
        for (int i = 0; i < depts.length; i++) {
            System.out.println(depts[i].length());
        }

        // strings vs arrays
        System.out.println("Hello".length());
        System.out.println(j.length);

        int[] a = {2, 4, 7};
        int num = a[1] + 1;
        System.out.println(num);
        a[1] = 7;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }


   } 
}
