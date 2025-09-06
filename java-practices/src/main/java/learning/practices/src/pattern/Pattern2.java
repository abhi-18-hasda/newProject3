package learning.practices.src.pattern;

public class Pattern2 {

    public static void main(String args[]) {
        String name = "aaaaaaaa";
        String pattern = "aaa";
        boolean isPresent = false;
        int firstIndex = name.indexOf(pattern);
        while(firstIndex >= 0) {
            System.out.print(firstIndex+" ");
            firstIndex=name.indexOf(pattern, firstIndex+1);
            isPresent = true;
        }
        if(!isPresent) {
            System.out.println("Not Present");
        }
    }
}
