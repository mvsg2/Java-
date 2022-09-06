import java.util.Scanner;
public class Collatz_Conjecture {

    public static void printSequence(long n){
        while((n!=1) && (n != 0) && ((n != -1) && (n != -5) && (n != -17))){
            System.out.print(n + " ");
            if(n%2 ==0)
                n = n / 2 ;
            else
                n = 3*n + 1;
        }
        if (n == 1 || n == 0 || n == -1 || n == -5 || n == -17)
            System.out.print(n);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for Collatz Sequence please: ");
        long N = sc.nextLong();
        System.out.println("The Collatz Sequence is: ");
        printSequence(N);
        sc.close();
    }
}
