class PrintTime {
    
    public static void printTime(int hour, int minute) {
        int exampleInt = 0;
        System.out.print(hour - 2);
        System.out.print(":");
        System.out.println(minute);
        System.out.println("printTime i: " + exampleInt);
    }

    public static void main(String[] args) {
        int exampleInt = 20;
        int hour = 11;
        int minute = 59;
        printTime(hour + 1, minute);
        System.out.println(hour);
        System.out.println("main i: " + exampleInt);
    }
}
