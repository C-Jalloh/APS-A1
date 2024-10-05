public class Loops {
    // create two classes called evenNumbers and squareNumbers
    //  evenNumbers should compute the sum of all the even numbers between 2 and 100 (inclusive)
    //squareNumbers should compute the sum of all the square numbers between 1 and 100 (inclusive)

    public static void main(String[] args) {
        int[] numbers = new int[100];
        for (int i = 0; i <= 99; i++) {
            numbers[i] = i + 1;

        }
        System.out.println("Sum of Even Numbers: " + evenNumbers());
        System.out.println("Sum of Square Numbers: " + squareNumbers());
    }
    public static int evenNumbers(){
        int sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            sum += i;
        }
        return sum;

    }

    public static int squareNumbers(){

        int sum = 0;
        for (int i = 1; i <= 10; i++) { // Since 10*10 is 100
            sum += i * i;
        }
        return sum;
    }
}
