public class User {
    
        private int balance= 0;
     
        int getBalance(){
         return balance;
        }
        
      public  void depositBalance(int amount){
         this.balance= balance+ amount;
        }
     
       public void withdrawalBalance(int amount){
         this.balance= balance - amount;
        }
         
        // end User class
        }

