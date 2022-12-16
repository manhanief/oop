package lab67;

public class Account {
    

    String accountNumber = "0123456789";
    double accountAmount;
    
    Account(Double accNum){
        accountAmount = accNum;
    }

    
    public double checkBalance(double amountWithdraw)
    {
        double currentBalance = accountAmount; 

        if (currentBalance<amountWithdraw){
            System.out.print("Your saving account are not enough for the amount");
            double balance=-1;
            return balance;
        }else{

            double balance = currentBalance - amountWithdraw;
            return balance;
        }
    }
}
