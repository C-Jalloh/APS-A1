import java.util.Scanner;

public class Solution

{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = in.nextLine() ;
        System.out.println("Enter the begin index:");
        int begin = in.nextInt();
        System.out.println("Enter the end index:");
        int end = in.nextInt();
        in.close();

        System.out.println(s.substring(begin,end +1));
    }
}
