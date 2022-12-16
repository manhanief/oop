package lab67;
import java.util.Scanner;


class Banking {
    
    public static void main(String[] args)
    {
        double money=0.00,balance=0.00;
        String accNumber,name;
        int again=0;
        double currentBalance=1000;

        do{
            
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Enter amount to withdraw: RM");
            //get withdraw amount user
            money = scanner.nextDouble();
            
            Account account = new Account(currentBalance);
            //create account class
            //get properties from class account
            accNumber = account.accountNumber;
            //use method checbalance in class Account
            currentBalance = account.checkBalance(money);
            if(currentBalance==-1){
                System.exit(0);
            }

            Customer customer = new Customer();
            name = customer.name;

            displaySummary(account, customer, currentBalance);
            
            


        
            System.out.print("Withdraw again? 1-yes, 2-no>>>>>");
            again = scanner.nextInt();

        }while(again == 1); 
    }
    
    public static void displaySummary(Account details, Customer info, Double sendWithdraw)
    {
        
        System.out.print("Account holder: "+info.name+"\n");
        System.out.print("Account number: "+details.accountNumber+"\n");
        System.out.print("Balance amount: RM"+sendWithdraw+"\n");
    }
}
