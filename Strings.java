import java.util.*;

public class Strings {
    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length(); i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // public static void main(String args[]) {
    // String str = "racecar";
    // System.out.println(isPalindrome(str));
    // // String firstName = "Ayush";
    // // String middleName = "Singh";
    // // String lastName = "Dogra";

    // // String fullName = firstName + " " + middleName + " " + lastName;
    // // printLetters(fullName);
    // }

    // get shortest path
    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            // South
            if (dir == 'S') {
                y--;
            }
            // North
            else if (dir == 'N') {
                y++;
            }
            // West
            else if (dir == 'W') {
                x--;
            }
            // East
            else {
                x++;
            }
        }

        int X2 = x * x;
        int Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);
    }

    // public static void main(String args[]) {
    // String path = "WNEENESENNN";
    // System.out.println(getShortestPath(path));

    // lexicographic
    // String fruits[] = { "apple", "banana", "mango", "lithi" };
    // String largest = fruits[0];
    // for (int i = 1; i < fruits.length; i++) {
    // if (largest.compareTo(fruits[i]) < 0) {
    // largest = fruits[i];
    // }
    // }
    // System.out.println(largest);

    // StringBuilder sb = new StringBuilder(" ");
    // for (char ch = 'a'; ch <= 'z'; ch++) {
    // sb.append(ch);
    // }
    // System.out.println(sb);
    // }

    // converting first letter of each word to uppercase
    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder(" ");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    // string compression if same letters repeat again and again
    public static String compress(String str) {
        String newStr = " ";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if (count > 1) {
                newStr += count.toString();
            }
        }
        return newStr;
    }

    public static void main(String args[]) {
        // String str = "hi, i am ayush";
        // System.out.println(toUpperCase(str));
        String str = "aaabbbcccdddefg";
        System.out.println(compress(str));
    }
}
