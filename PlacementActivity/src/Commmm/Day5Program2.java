package Commmm;

import java.util.Scanner;

public class Day5Program2 {
    public static boolean isPalin(String s) {
        String s1 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            s1 = s1 + s.charAt(i);
        }
        return s1.equals(s);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        int a = 0;
        String s3 = "";
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i + 1; j <= s1.length(); j++) {
                String s2 = s1.substring(i, j);
                if (isPalin(s2)) {
                    if (s2.length() > a) {
                        a = s2.length();
                        s3 = s2;
                    }
                }
            }
        }
        System.out.println("[ " + s3 + " ]");
        System.out.println("{ " + a + " }");
    }
}
