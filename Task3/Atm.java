 public class Atm extends User{

void withdrawal(int amount){
        if(amount>getBalance()){
            System.out.println("Insufficent Balance");
        }
        else
        {
            withdrawalBalance(amount);
            System.out.println("Withdrawal Succesful");
            System.out.println("Collect :"+amount);
            System.out.println("Balance after Withraw :"+getBalance());
        }
    }
   

    void deposit(int amount){
        depositBalance(amount);
        System.out.println("Deposit Succesful");
         System.out.println("Balance after Deposit :"+getBalance());
    }
   
//End Atm Class
}
