import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

    Atm user= new Atm();
       

      while(true){
        System.out.println("----------------------------------------------------------------------------------");
          System.out.println("------------ATM------------");
        System.out.println("1.Withdrawal");
        System.out.println("2.Deposit");
        System.out.println("3.Checkbalance");
        System.out.println("4.Exit");
        System.out.print("Select the requiured operation you need to perfrom :");
        System.out.println(" ");
        int choose= sc.nextInt();
        
        if(choose==1){
            System.out.print("Enter amount to be withdrawn :");
            System.out.println(" ");
            int amountWith= sc.nextInt();
            user.withdrawal(amountWith);
        }
        else if(choose== 2){
            System.out.print("Enter amount to deposit :");
            System.out.println(" ");
            int amountDepo= sc.nextInt();
            user.deposit(amountDepo);

        }
         else if(choose== 3){
            System.out.print("BALANCE :"+user.getBalance());
            System.out.println(" ");
        }
        else if(choose== 4){
           System.exit(choose);
        }
        else{
            System.out.println("Wrong Input !!!!");
        }

        
      }
      

    }
}


    