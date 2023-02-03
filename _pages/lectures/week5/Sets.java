import java.util.*;

class Sets{

    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 800, 4, 2, 1, 4, 5};

        int[] newArr = new int[7];
        Set<Integer> arrSet = new HashSet<Integer>();
        arrSet.add(0);
        SortedSet<Integer> sortSet = new TreeSet<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if(!arrSet.add(arr[i])) {
                System.out.println("Duplicate Found: " + arr[i]);
            }
            if(!sortSet.add(arr[i])) {
                System.out.println("Duplicate Found: " + arr[i]);
            }
        }
        System.out.println(arrSet.toString());
        System.out.println(sortSet.toString());

        
        for (int elem : arr ) {
            System.out.println(elem);
        }

        for (int elem : sortSet) {
            System.out.println("Element: " + elem);
        }
    }
}