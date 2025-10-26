package learning.practices.src.pattern;

public class Pattern10 {
//     1
//    2 3
//   4 5 6
    public static void main(String args[]) {
        int n=5, counter = 1;
        for(int i=1;i<=n;i++) {
            for(int j = 1; j<=n-i; j++) {
                System.out.print("\t");
            }
            for(int j = 1; j<=i; j++) {
                System.out.print(counter+"\t\t");
                counter++;
            }
            
//                                 1
//                         2               2
//                 3               3               3
//         4               4               4               4
// 5               5               5               5               5
            // for(int j = 1; j<=i; j++) {
            //     System.out.print(i+"\t\t");
            //     counter++;
            // }
//     *
//    ***
//   *****
//  *******
// ********* for odd the logic is 2*i-1 and for event 2*i
            // for(int j = 1; j<=2*i-1; j++) {
            //     System.out.print("*");
            //     counter++;
            // }
            System.out.println();
        }
    }
}
