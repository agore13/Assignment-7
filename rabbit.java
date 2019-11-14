import java.util.Scanner;
import java.util.Random;

public class rabbit {

   public static void main(String[]args) {
   
      Scanner scan = new Scanner(System.in);
      Random hole = new Random();
      int guess = 10;
      int random = hole.nextInt(10);
   
      int myArray[] = new int [10];
      
      for(int m = 0; m < myArray.length; m++) {
      myArray[m] = 1;
      }
  
      while (guess != random){
         System.out.println("Guess a number 0 - 9 to find the rabbit in one of the 10 holes: ");
         guess = scan.nextInt();
      
         if(guess != random) {
            myArray[guess] = 8;
         }
         else {
            myArray[guess] = 3;
         }
      
         for(int m = 0;m < myArray.length;m++) {
         
            if(myArray[m] == 1) {
               System.out.print(" |");
            }
            else if (myArray[m] == 8) {
               System.out.print("X|");
            }
            else {
               System.out.print("R|");
            }
         
         } 
      
      
      }
      System.out.println("Yayy you found the rabbit hole!");
   } 
}