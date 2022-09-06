import java.util.Scanner;

public class E_Banking_Application {
    protected static String name;
    protected static int age;
    public static float balance = 5000;
    public static void userInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your details, please...");
        System.out.print("What's your name? - ");
        name = sc.nextLine();
        System.out.print("How old are you? - ");
        age = sc.nextInt();
        System.out.println("Hello " + name + "! What would you like to do?");
        System.out.println("1. Check your balance");
        System.out.println("2. Make a deposit");
        System.out.println("3. Make a withdrawal");
        // System.out.println("4. Transfer money.");
        System.out.print("Option: ");
        int user_answer = sc.nextInt();
        while (user_answer <= 0 || user_answer > 3){
            System.out.println("Invalid option! Please select again.");
            user_answer = sc.nextInt();
        }
        if (user_answer == 1) System.out.println("Your balance is: $"+balance);
        else if (user_answer == 2){ 
            System.out.print( "How much do you want to deposit? - ");
            float deposit_amount = sc.nextFloat();
            System.out.println("You deposited $" + deposit_amount);
            balance += deposit_amount; 
            System.out.println("Your balance now is: $"+balance);
        }
        else if(user_answer == 3){
            System.out.print("How much do you want to withdraw? - $");
            float withdrawal_amount = sc.nextFloat();
            System.out.println("You withdrew $" + withdrawal_amount);
            if (withdrawal_amount > balance) System.out.println("NOT ENOUGH MONEY!"); 
            else balance -= withdrawal_amount;
            System.out.println("Your balance now is: $"+balance);    
        }
        sc.close();
    }
    public static void main(String[] args){
        userInfo();
        System.out.println("\n====================== WELCOME! ===========================");
        System.out.println("\t\t  Name\t    : " + name);
        System.out.println("\t\t  Age\t    : " + age);
        System.out.println("\t\t  Balance   : $"+balance);
        System.out.println("===========================================================");    
        System.out.println("\n\t\tTHANK YOU FOR BANKING!");
    }    
}
