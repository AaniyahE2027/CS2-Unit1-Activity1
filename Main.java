// 1. IMPORT Scanner CLASS
import java.util.Scanner; 

public class Main {

   public static void main(String []args) {
      System.out.println("Let's play MadLibs!");

      // 2. Set up a Scanner OBJECT
      Scanner input = new Scanner(System.in);
      //System.in refers to the physical keyboard!

      //3. Use the scanner to take input
      System.out.println("Type your name then press enter: ");
      String player = input.nextLine();
      System.out.println("Welcome, " + player);

      // Create variables for each placeholder word
      String adj1 = "warm";
      String adj2 = "long";
      String food = "pizza";
      String adj3 = "yummy";
      String emotion = "happy";
      String name = "Emma";
      String emotionEndingIng = "upseting";
      String personailtyTrait = "a brat";
      String location = "home";
      String activity = "slept";

      //Print your story line by line
      System.out.println("It was a " + adj1 + " September.");
      System.out.println("We had to go to school and why knew it was going to be a" + adj2 + " day.");
      System.out.println("It was lunch time and I had a " + food + " which was " + adj3 + ".");
      System.out.println("This made me feel " + emotion + ".");
      System.out.println("While I was running up the stairs. I ran into " + name + ".");
      System.out.println("This was " + emotionEndingIng + " because " + name + " was" + personailtyTrait + ".");
      System.out.println("Finally, the day was over and I went " + location + " and " + activity);


   }
}
