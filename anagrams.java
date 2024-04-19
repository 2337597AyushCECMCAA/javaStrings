import java.util.*;

public class anagrams {
    // public static void main(String args[]) {
    // Scanner sc = new Scanner(System.in);
    // String s1 = sc.nextLine();
    // String s2 = sc.nextLine();
    // if (s1.length() != s2.length()) {
    // System.out.println(false);
    // } else {
    // char s1char[] = s1.toCharArray();
    // Arrays.sort(s1char);

    // char s2char[] = s2.toCharArray();
    // Arrays.sort(s2char);

    // int flag = 0;
    // for (int i = 0; i < s1.length(); i++) {
    // if (s1char[i] != s2char[i]) {
    // flag++;
    // break;
    // }
    // }

    // if (flag == 0) {
    // System.out.println(true);
    // } else {
    // System.out.println(false);
    // }
    // }
    // }

    // approach-2 It will first check the frequency of characters present in both
    // the Strings and then compare them.
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if (s1.length() != s2.length()) {
            System.out.println(false);// if the length of both the strings aren't same then they are note anagram
        } else {
            int f1[] = new int[128]; // f1 created to check the frequency of characters present in a s1 string ; size
                                     // of character lies between 0-127
            int f2[] = new int[128]; // f2 created to check the freuency of char present in s2 ; here in f1 and f2
                                     // they in working in ASCII value that's why we used integer value

            for (int i = 0; i < s1.length(); i++) {
                f1[s1.charAt(i)]++;// counting the frequency of every character present in a array f1
            }

            for (int i = 0; i < s2.length(); i++) {
                f2[s2.charAt(i)]++;
            }
            int flag = 0;
            for (int i = 0; i < 128; i++) {
                if (f1[i] != f2[i]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }

}