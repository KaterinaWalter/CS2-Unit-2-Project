import java.util.Scanner;

public class Main 
{

   public static void main(String []args) 
   {
      System.out.println("Starting a new adventure...\n");
      String command = ""; // stores the user's choices

      // STEP #1: Describe the scenario scene
      System.out.println("You are at a crossroads.");
      // STEP #2: Get user command (prompt & take input)
      command = getCommand("Do you take the path on the LEFT (l) or RIGHT (r)?");
      // STEP #3: Process user command (choose a path)
      if (command.equals("l")) 
      {
         System.out.println("You turned left.");
      }
      else if (command.equals("r")) 
      {
         System.out.println("You turned right.");
      }
      else 
      {
         System.out.println("Bad input. Press RUN to restart!");
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
      scan.close();
      return command;
   } // END OF METHOD


} // END OF CLASS
