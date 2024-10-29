package Commmm;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        String s2 = s.next();

        char[] s3 = s1.toCharArray();
        char[] s4 = s2.toCharArray();

        if (s3.length != s4.length) {
            System.out.println("Not anagram");
        } else {
            int count = 0;
            int[] a = new int[s3.length];
            for (int i = 0; i < a.length; i++) {
                a[i] = -1;
            }

            for (int i = 0; i < s3.length; i++) {
                for (int j = 0; j < s4.length; j++) {
                    if (s3[i] == s4[j] && a[j] == -1) {
                        count++;
                        a[j] = i;	
                        break;
                     
                    }
                }
            }

            if (count == s3.length) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not anagram");
            }
        }
    }
}
