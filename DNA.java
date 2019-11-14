import java.util.Scanner;
import java.util.Random;

public class DNA {

   public static void main(String[]args) {
   
      Random rand = new Random();
      Scanner scan = new Scanner(System.in);
   
   //char length = 255;
   
   //char[]myArray;
   
      char[]myArray = new char [255];
      int random;
   //char i = 0;
   
   
      System.out.println("G,C,A,T");
   
      for (int i = 0; i < myArray.length; i++) {
         random = rand.nextInt(4)+1;
      
         if (random == 1)
         {
            myArray[i] = 'G';
         }
         if (random == 2)
         {
            myArray[i] = 'C';
         }
         if (random == 3)
         {
            myArray[i] = 'A';
         }
         if (random == 4)
         {
            myArray[i] = 'T';
         }
      
      }
   
      int counter = 0;
   
      for (int j = 0; j < myArray.length; j++) {
         System.out.print(myArray[j]);
         counter++;
      
         if (counter >= 100) {
            System.out.println();
            counter = 0;
         }
      }
         
      System.out.println();
         
         for (int k = 0; k < myArray.length; k++) {
         
            if (myArray[k] == 'T') {
               myArray[k] = 'U';
            }
         }
         for (int l = 0; l < myArray.length; l++) {
            System.out.print(myArray[l]);
            counter++;
         
            if(counter >= 100) {
               System.out.println();
               counter = 0;
            }
         }
   }
}         
       
      
   


  

 
   
   
   
   
   
   
   
   
