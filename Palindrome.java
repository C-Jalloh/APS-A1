import java.util.Scanner;

public class Palindrome {

    /*
    * A  palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
    * Given a string , print Yes if it is a palindrome, printNo otherwise.
    * */


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Palindrom: ");
        String input = sc.nextLine();
        sc.close();

        if (isPalindrome(input)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    public static boolean isPalindrome(String input){
        int len = input.length();

        if(len == 0){
            System.out.println("Empty String");
            return false;
        }

        for (int i = 0; i < len/2; i++){
            if (input.charAt(i) != input.charAt(len-1-i)){
                return false;
            }
        }
        return true;
    }

}
