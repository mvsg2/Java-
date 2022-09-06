import java.util.Scanner;

public class Test_file{
    public static void main(String[] args){
        char chrs[] = {'c', 'o', 'd', 'e'};
        String s = new String(chrs);
        System.out.print(s);
        System.out.print("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.nextLine();
        if (myString.equals(s))
            System.out.println("Hey! The strings match!");
        else System.out.println("The strings don't match... It's okay!");
        scanner.close();
    }
}