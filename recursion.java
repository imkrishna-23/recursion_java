import java.util.Scanner;

public class recursion {
    

    // public static void printNumber(int n) {
    //     if (n == 0) {
    //         return ;
    //     }
    //     System.out.println(n);
    //     printNumber(n - 1);

    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = 5;
    //     printNumber(n);
    // }
    // Tower Of Hanoi
    //
    // public static void towerOfHanoi(int n, String src, String helper, String
    // dest) {
    // if (n == 1) {
    // System.out.println("transfer disk " + n + "from" + src + " to " + dest);
    // return;
    // }
    // towerOfHanoi(n - 1, src, dest, helper);
    // System.out.println("transfer disk " + n + "from" + src + " to " + dest);
    // towerOfHanoi(n - 1, helper, src, dest);
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n = 2 ;
    // towerOfHanoi(n, "S", "H", "D");

    // }

    //
    // Reverse of String
    //
    // public static void printRev(String str, int idx) {
    // if (idx == 0) {
    // System.out.println(str.charAt(idx));
    // return;
    // }
    // System.out.print(str.charAt(idx));
    // printRev(str, idx - 1);
    // }

    // public static void main(String[] args) {
    // String str = "krishna";
    // printRev(str, str.length() - 1);
    // }

    // Remove Duplicates

    // public static boolean[] map = new boolean[26];
    // public static void removeDuplicates(String str, int idx, String newString) {
    // if (idx == str.length()) {
    // System.out.println(newString);
    // return;
    // }
    // char currChar = str.charAt(idx);
    // if (map[currChar - 'a']) {
    // removeDuplicates(str, idx+1, newString);
    // } else {
    // newString += currChar;
    // map[currChar - 'a'] = true;
    // removeDuplicates(str, idx + 1, newString);
    // }

    // }

    // public static void main(String[] args) {
    // String str = "axbcxxd";
    // removeDuplicates(str, 0, "");
    // }

    // subString

    // public static void subSequences(String str, int idx, String newString) {
    // if (idx == str.length()) {
    // System.out.println(newString);
    // return;
    // }
    // char currChar = str.charAt(idx);

    // subSequences(str, idx + 1, newString+currChar);

    // subSequences(str, idx+1, newString);
    // }

    // public static void main(String[] args) {
    // String str = "abc";
    // subSequences(str, 0, "");
    // }

    // permutation

    // public static void printPrem(String str, String permutation) {
    // if (str.length() == 0) {
    // System.out.println(permutation);
    // return;
    // }

    // for (int i = 0; i < str.length(); i++) {
    // char currChar = str.charAt(i);
    // String newStr = str.substring(0, i) + str.substring(i + 1);
    // printPrem(newStr, permutation + currChar);
    // }
    // }

    // public static void main(String[] args) {
    // String str = "abc";
    // printPrem(str, "");
    // }

    // countPath

    public static int countPaths(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        int downPaths = countPaths(i + 1, j, n, m);

        int rightPaths = countPaths(i, j + 1, n, m);

        return downPaths + rightPaths;
    }

    public static void main(String[] args) {
        int n = 4, m = 4;
        int totalPaths = countPaths(0, 0, n, m);
        System.out.println(totalPaths);
    }
}
