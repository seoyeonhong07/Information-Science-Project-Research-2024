import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
       // int count = 0;
        boolean isPrimeNumber = true;  // 4byte -> 1byte

        if(number<2) {
            // count = 999;
            isPrimeNumber = false;
        }else {
            for (int i = 2; i*i <= number; i=i+1) {
                if (number % i == 0) {
                    //count = count + 1;
                    isPrimeNumber = false; // remove add operation
                    break;
                }
            }
        }
        //if(count == 0)
        if (isPrimeNumber)  // remove == operation
            System.out.println(number + " is a prime number~");
        else
            System.out.println(number + " is NOT prime number!");
    }
}
