import java.util.Scanner;

public class Task_2{

    public static void main(String[] args) {

      Scanner sc= new Scanner(System.in);
      while(true){
      
         System.out.println("Enter the Marks Scored");
        System.out.print("SUB-1 :");
        int subject1= sc.nextInt();
        

        System.out.print("SUB-2 :");
        int subject2= sc.nextInt();

        System.out.print("SUB-3 :");
        int subject3= sc.nextInt();

        System.out.print("SUB-4 :");
        int subject4= sc.nextInt();

        System.out.print("SUB-5 :");
        int subject5= sc.nextInt();
        System.out.println("----------------------------------------------------------------");
        sc.close();

        if(subject1>100 || subject2>100 || subject3>100 || subject4>100 || subject5>100){
          System.out.println("Enter Valid Score");
        }
        else{
           Student student = new Student();
        System.out.println("TOTAL MARKS : "+student.totalMarks(subject1, subject2, subject3, subject4, subject5));
        System.out.println("AVERAGE MARKS :"+student.calculateAverageMarks(subject1, subject2, subject3, subject4, subject5));


        float totalPERCANTAGE= (student.totalMarks(subject1, subject2, subject3, subject4, subject5)/500)*100;
        float avgPERCANTAGE= (student.calculateAverageMarks(subject1, subject2, subject3, subject4, subject5)/250)*100;

        System.out.println("TOTAL PERCANTAGE :"+totalPERCANTAGE);
        System.out.println("AVERAGE PERCANTAGE :"+avgPERCANTAGE+"% ");

        if(avgPERCANTAGE>=95){
          System.out.println("GRADE : A+");
        }
        else if(avgPERCANTAGE>=90){
          System.out.println("GRADE : A");
        }
        else if(avgPERCANTAGE>=80){
          System.out.println("GRADE : B");
        }
        else if(avgPERCANTAGE>=70){
          System.out.println("GRADE : B");
        }
        else if(avgPERCANTAGE>=60){
          System.out.println("GRADE : C");
        }
        else if(avgPERCANTAGE>=50){
          System.out.println("GRADE : D");
        }
        else if(avgPERCANTAGE>=40){
          System.out.println("GRADE : E");
        }
        else{
          System.out.println("GRADE : FAIL");
        }

        
        System.exit(0);
        }
      }
    }
  }

  class Student{
    int sub1;
    int sub2;
    int sub3;
    int sub4;
    int sub5;

    float totalMarks(int sub1, int sub2, int sub3, int sub4, int sub5){
      return sub1+sub2+sub3+sub4+sub5;
    }

    float calculateAverageMarks(int sub1, int sub2, int sub3, int sub4, int sub5){
      return (sub1+sub2+sub3+sub4+sub5)/2;
    }



  }