package learning.practices.src.backtracking;

public class findSubset {
    public static void printAllSubset(String str, String ans, int i) {

        if (i == str.length()) {
            System.out.println(ans);
            return;
        }
        printAllSubset(str, ans + str.charAt(i), i+1);
        printAllSubset(str, ans, i+1);

    }

    public static void main(String args[]) {
        String str = "abc";
        String ans = "";
        printAllSubset(str, ans, 0);
    }
}
