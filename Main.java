 import java.util.Scanner;
 public class Main 
 {
   public static void main(String []args) 
   {
      System.out.println("Starting a new adventure...\n");
      String command = ""; // stores the user's choices
      
      // STEP #1: Describe the current scenario
      System.out.println("You are at the Columbus Circle entrance to Central Park.");
      // STEP #2: Get user command
      command = getCommand("Walk north or east through the park? (n/e)");
      // STEP #3: Select a path based on the user's command
      if ( command.equals("n") ) {

         // NEXT BRANCH... Repeat steps 1-3 in here using NESTED if statements
         System.out.println("Tavern on the Green has a wedding going on... looks fancy!");
         command = getCommand("Wanna crash the wedding? (y/n)");
         if ( command.equals("y") ) {
            System.out.println("OMG it's Lebron's wedding!!! You take a pic 📸 then get thrown out by security. Worth it though!");
         }
         else if ( command.equals("n") ) {
            System.out.println("You keep walking until you reach the Natural History Museum 🏛️");
         }

      }
      else if ( command.equals("e") ) {
         System.out.println("You made it to the Carousel 🎠");
      }
      else {
         System.out.println("GAME OVER! Press RUN to replay.");
      }




   } // END OF MAIN METHOD
    
   /** Method to prompt & process input for the next command
     * @param prompt to display to user, asks for specific input
     * @return user's input command as a lowercase String
   */
   public static String getCommand(String prompt) 
   {
      System.out.println("\n▶︎▶︎▶︎ " + prompt);
      Scanner scan = new Scanner(System.in);
      String command = scan.nextLine().toLowerCase();
      return command;
   } // END OF METHOD
} // END OF CLASS
