import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        boolean isPrimeNumber = true;
        Scanner scanner = new Scanner(System.in);
        int numberStart = scanner.nextInt();
        int numberEnd = scanner.nextInt();

        for(int k = numberStart; k <= numberEnd; k++){
            isPrimeNumber = false;
            if(k<2) {
            }else {
                for (int i = 2; i*i <= k; i=i+1) {
                    if (k % i == 0) {
                        isPrimeNumber = false;
                        break;
                    }
                }
                if(isPrimeNumber) System.out.print(k + " ");
            }
        }
    }
}
