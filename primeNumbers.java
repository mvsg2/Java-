import java.util.*;  // We didn't have to import all of the methods in the util library...just the Scanner would have been enough.
public class primeNumbers{
    public static void getPrimes(int lower, int upper){
        // Vector <Integer>primes = new Vector<Integer>(); 
        System.out.println("The prime numbers in between the given range are: ");
        for (int num = lower; num < upper; num++){
            if (num == 0 || num == 1)
                continue;
            boolean flag = true;
            for (int i = 2; i < num; i++){
                if (num%i == 0){
                    flag = false;
                    break;
                }
            }
            if (flag == true)
                System.out.print(num + " ");
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the lower limit: ");
        int lower_limit = scan.nextInt();
        System.out.print("Enter the upper limit: ");
        int upper_limit = scan.nextInt();
        getPrimes(lower_limit, upper_limit);
        scan.close();
    }
}