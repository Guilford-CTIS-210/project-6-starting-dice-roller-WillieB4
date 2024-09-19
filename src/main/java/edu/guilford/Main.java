package edu.guilford;
import java.util.Random;
import java.util.Scanner;


// Will Brown 9/19/24
public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
      //  int randomNun = rand.nextInt( 6)+1; // This allowed me to create a random statment for the diceroll
      Scanner scan = new Scanner(System.in);
      System.out.println(scan);
      int sum =0;
      System.out.println("How many sides does the dice have");// We initiated the sum and sides then we printed it into the program allowing us to use those integers.
        int sides =scan.nextInt();
        System.out.println(sides);
         // default for loop, prints loop variable as it counts up
         System.out.println("How many dice do you want to roll");
         int Number =10;
        for (int i= 0;  i< Number; i++) {
            int diceroll; // I imported this as an integer and java complains about it just like directions say. I then imported the randomint below making it's highest number 6. 
            diceroll = rand.nextInt(sides)+1; // This import my random dicerolls in the program the +1 made it to where it'll show numbers up to 6 with out it it stopped at 5. 
            sum += diceroll;
            System.out.println("\"sum of \" + i + \"d\" + sides + \" = \" + sum"+ diceroll);// We added the statement Diceroll in parenthesis to tell the program what we wanted printed in the terminal. 
           
            // We then got rid of the Diceroll printed statement and replaced it with whats above. 
            //That new printed statement allowed the program to add the i and sides. 
            
             // I created sides as an integer in the program up top. Then officially plugged it in by printing it out.
        }
        System.out.println(Number + "d" + sides + "=" + sum);
  //  for (int i = 0; i < 10; i++) {
    
  //  }
    }
}