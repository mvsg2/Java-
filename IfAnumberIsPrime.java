import java.util.Scanner;
public class IfAnumberIsPrime {
    public static void primeNumbers(int n){
        int count = 0;
        for (int i=2; i < n; i++){
            if (n%i == 0)
                count++;
        }
        if (count == 0)
            System.out.println("The number is a prime number!");
        else
            System.out.println("The number is not a prime number.");
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = scan.nextInt();
        primeNumbers(N);
        scan.close();
    }
}