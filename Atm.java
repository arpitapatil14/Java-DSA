import java.util.Scanner;
public class Atm{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your balance");
        float Balance = sc.nextFloat();
        
        while(true){
            System.out.println("ATM Machine");
            System.out.println("");
            System.out.println("OPERATIONS ");
            System.out.println("1.Balance");
            System.out.println("2.Withdraw");
            System.out.println("3.Deposit");
            System.out.println("4.Exit");
            
            System.out.println("Enter your choice number:");
            
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Your Balance is: " + Balance);
                    break;
                case 2:
                    System.out.println("Enter the amount you want to withdraw:");
                    float Withdraw = sc.nextFloat();
                    if(Balance>=Withdraw){
                         float New_Balance = Balance - Withdraw;
                        System.out.println("Withdraw Successfully Completed");
                        System.out.println("Balance after Withdraw process :" + New_Balance);
                        System.out.println("Collect your money");
                        
                    }
                    else{
                        System.out.println("Withdraw Successfully not completed please check your balance");
                    }
                    break;
                case 3:
                    System.out.println("Enter the amount you want to deposit");
                    
                    float Deposit = sc.nextFloat();
                    float New_balance = Balance + Deposit;
                    System.out.println("Current Balance :" + Balance);
                    System.out.println("Deposit Succesfully Deposited");
                    System.out.println("  Your New Balance is :" + New_balance);
                    break;
                case 4:
                    System.out.println("Exiting the ATM ");
                    System.out.println("Thank you hope you have a good day");
                    System.exit(0);
                    break;
                default:
                System.out.println("ERROR : Please enter the valid operation number you want to perform");
                    
            }
        }
    }
}

        