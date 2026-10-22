package com.pluralsight;

public class Format {
    public static void main(String[] args) {
        String first = "Bob";
        String last = "Smith";
        System.out.println(formatName(last,first));

        String formatted = formatName("Alice", "Johnson");
        System.out.println(formatted);

    }
    public static String formatName(String first, String last){
        return last + ", " + first;
    }
}
