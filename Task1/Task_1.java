import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Task_1{
  
    public static void main(String[] args) {
        //prog to generate a random no from a selected range 

        Scanner sc= new Scanner(System.in);
       int result= 0;
       int count =0;
       int closeCount= 0, badCount=0, verybadCount= 0;
      
      System.out.println("************WELCOME TO THE GUESSING GAME************");
       System.out.print("ENTER NO OF CHANCES : ");
       int chances= sc.nextInt();
      
        while(true){
            ThreadLocalRandom random= ThreadLocalRandom.current();
            int rand= random.nextInt(1, 100);

       System.out.print("Guess a Number (1-100) in this range  :");
       int guess= sc.nextInt();
      

       if(guess>100){
        System.out.println("    ");
        System.out.println("***********Invalid Input !!!***********");
        System.out.println("Number b/w (1-100) range can only be used");
        System.out.println("   ");
       }
       else{
        count= count+1;
        System.out.println("   ");
        System.out.println("Random No :"+rand);
        System.out.println("   ");
   
    int temp= guess;
  

    int diff= 0;
   while(temp>rand){
        diff++;
        temp--;
   }

   while(temp<rand){
        diff++;
        temp++;
   }

   if(guess== rand){
    result= result+1;
    System.out.println("Gussed Right");
    System.out.println("  ");
     System.out.println("   ");
   }
   else{
   
    if(diff>=90 || diff>=80){
      System.out.println("YOUR GUESS : VERY BAD GUESS");
     
      System.out.println("________________________________________________________________________________");
      verybadCount++;
    }
    else if(diff>=70 || diff>=60){
      System.out.println("YOUR GUESS : BAD GUES");
      
      System.out.println("________________________________________________________________________________");
      badCount++;
    }
    else if(diff>=50 || diff>=40){
      System.out.println("YOUR GUESS : BAD");
      
      System.out.println("________________________________________________________________________________");
      badCount++;
    }
    else if(diff>=30 || diff>=20){
      System.out.println("YOUR GUESS : LITTLE BAD !!!");
     
      System.out.println("________________________________________________________________________________");
      badCount++;
    }
    else if(diff>=10 || diff>=5){
      System.out.println("YOUR GUESS : YOUR ARE NEAR BY THE SELECTED NUMBER");
      
      System.out.println("________________________________________________________________________________");
      closeCount++;
    }
    else
    {
      System.out.println("YOUR GUESS : GOOD YOU ARE CLOSE");
      
      System.out.println("________________________________________________________________________________");
      closeCount++;
    }
   
   

   
    // System.out.println("Gap btw the Random & Guessed :"+ diff);
    // System.out.println("   ");
       }

   
       while(count==chances){
        System.out.println("***********Game Over************");
        System.out.println("   ");
        System.out.println("CORRECT GUESSES : "+result);
        System.out.println("CLOSE : "+closeCount);
        System.out.println("VERY BAD : "+verybadCount);
        System.out.println("BAD : "+badCount);

        System.exit(0);
       
       }
   
        }
      
    } 
   
     
      
  }
  
}

