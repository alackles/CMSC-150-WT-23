import java.util.Scanner;

class Strings {

    public static String reverse(String s) {
        String r = "";
        for (int i = s.length() - 1; i >=0 ; i--) {
            r += s.charAt(i);
        }
        return r;
    }
    public static void main(String[] args) {
        char myChar = 'a';
        char myNewChar = '\t';

        for (char c = 'a'; c <= 'z'; c++ ) {
            System.out.print(c);
        }
        System.out.println();

        String myName = "Acacia";
        char newCharacter = myName.charAt(1);
        System.out.println(newCharacter);
        int index = myName.indexOf("a",myName.indexOf("a"));
        System.out.println(index);

        String sentence = "How are you doing?";
        String word = sentence.substring(7, 10);
        System.out.println(word);
        int substr_i = myName.indexOf("cacia");
        System.out.println(substr_i);

        String hello = "Hello, world!";
        int len = hello.length();
        System.out.println(len);

        for (int i = 0; i < hello.length(); i++ ) {
            char letter = hello.charAt(i);
            System.out.println(i + " : " + letter);
        }
        System.out.println(reverse(hello));

        String str1 = "hello";
        String str2 = "Hello";
        boolean equal = str1.equals(str2);
        System.out.println(equal);

        String a = "apples";
        String b= "car";
        int diff = b.compareTo(a);
        System.out.println(diff);

        Scanner in = new Scanner(System.in);
        System.out.println("Say hello!");
        String userGreeting = in.nextLine();
        String userGreetingLower = userGreeting.toLowerCase();
        System.out.println(userGreetingLower);
        String myGreeting = "hello";
        if (myGreeting.equals(userGreetingLower)) {
            System.out.println("Thanks!");
         } else {
            System.out.println("Okay");
         }

    }
}