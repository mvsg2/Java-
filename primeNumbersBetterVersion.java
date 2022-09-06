import java.util.*;
public class primeNumbersBetterVersion {
    public static boolean isPrime(int num){
        if (num == 0 || num == 1) return false;
        if (num == 2) return true;
        for (int i = 2; i*i <= num; ++i){
            if (num%i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the lower limit: ");
        int lower_limit = scan.nextInt();
        System.out.print("Enter the upper limit: ");
        int upper_limit = scan.nextInt();
        System.out.println("Prime numbers in between the given range are: ");
        for (int i=lower_limit; i < upper_limit; i++){
            if (isPrime(i))
                System.out.print(i + " ");
        }
        scan.close();
    }
}
