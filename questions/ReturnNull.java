public class ReturnNull {

    public static Integer example(int x) {
        if (x == 7) {
            return x;
        }
        return null;
    }
    public static void main(String[] args) {
        System.out.println(example(4));
    }
}
