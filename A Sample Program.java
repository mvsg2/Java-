import java.util.*;

public class something{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your nationality");
        String n = sc.nextLine();
        
        System.out.println("Enter your weight");
        int w = sc.nextInt();
        
        int w2 = (w+20);
        int w3 = (w-20);
        System.out.println("Nationality is:"+n);
        System.out.println("Weight 20 kg lighter is:"+w3);
        System.out.println("Weight 20kg heavier is:"+w2);
    }
}
