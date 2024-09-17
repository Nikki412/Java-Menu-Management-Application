/**
 * Decription: This class implements the Salad, Sandwhich, and FrozenYogurt classes. 
 * It creates a new salad, sandwhich, or frozenyogurt depending on the user input
 * It also displays one or all of the items and allows you to add a topping to an item. 
 * 
 * @author Nikki Johnosn
 * @version 1.5
 */
import java.util.*;
public class Menu
{
      //Create a scanner object that can be used in the methods below
      private static Scanner input = new Scanner(System.in);

      /**
       * This method checks to see if the choice int is a valid choice from the array choices
       * @param choice an int that is the chioce from the user
       * @param choices an array with the valid choice options
       * @return
       */
      public static boolean isValidChoice(int choice, int[] choices){
            for(int validChoice : choices) {
                  if(choice == validChoice) {
                    return true;
                  }
            }
            return false;
      }

      /**
       * This method displays the Menu for the user
       */
      public static void displayMenu(){
            System.out.println("Actions:\n" +
                   "1) Add a salad\n" +
                   "2) Add a sandwich\n" +
                   "3) Add a frozen yogurt\n" +
                   "4) Display an item\n" +
                   "5) Display all items\n" +
                   "6) Add a topping to an item\n" +
                   "9) Quit\n");
      }

      /**
       * This method adds a salad item to an ArrayList of MenuItems
       * @param ArrayList<MenuItems> object
       */
      public static void addSalad(ArrayList<MenuItems> items){
            // Create a new salad object
            Salad salad = new Salad();

            System.out.println("Please enter the name of the salad: ");
            String name = input.nextLine();
            salad.setName(name);
            System.out.println("You entered: " + name);

            System.out.println("Please enter the price for the " + name +  ": ");
            double price = input.nextDouble();
            input.nextLine();
            salad.setPrice(price);
            System.out.println("You entered: " + price);

            System.out.println("Please enter the name of the side: ");
            String side = input.nextLine();
            salad.setSide(side);
            System.out.println("You entered: " + side);

            System.out.println("Please enter the dressing for the " + name +  ": ");
            String dressing = input.nextLine();
            salad.setDressing(dressing);
            System.out.println("You entered: " + dressing);

            items.add(salad);
      }

      /**
       * This method adds a sandwich item to an ArrayList of MenuItems
       * @param ArrayList<MenuItems> object
       */
      public static void addSandwich(ArrayList<MenuItems> items){
            Sandwich s = new Sandwich();

            System.out.println("Please enter the name of the sandwich: ");
            String name = input.nextLine();
            s.setName(name);
            System.out.println("You entered: " + name);

            System.out.println("Please enter the price for the " + name + ": ");
            double price = input.nextDouble();
            input.nextLine();
            s.setPrice(price);
            System.out.println("You entered: " + price);

            System.out.println("Please enter the name of the side: ");
            String side = input.nextLine();
            s.setSide(side);
            System.out.println("You entered: " + side);

            System.out.println("Please enter the type of bread for the " + name + ": ");
            String bread = input.nextLine();
            s.setBread(bread);
            System.out.println("You entered: " + bread);

            items.add(s);
      }

      /**
       * This method adds a frozen yogurt item to an ArrayList of MenuItems
       * @param ArrayList<MenuItems> object
       */
      public static void addFrozenYogurt(ArrayList<MenuItems> items){
            FrozenYogurt froyo = new FrozenYogurt();

            System.out.println("Please enter the name of the frozen yogurt: ");
            String name = input.nextLine();
            froyo.setName(name);
            System.out.println("You entered: " + name);
 
            System.out.println("Please enter the price for the " + name + ": ");
            double price = input.nextDouble();
            input.nextLine();
            froyo.setPrice(price);
            System.out.println("You entered: " + price);

                  
            // prompt user to enter their selection for the base yogurt flavor
            // repeatedly prompt the user until the setYogurtFlavor method returns an empty string
            boolean alert2 = true;
            do {
                  System.out.println("Please enter the base yogurt flavor for the " + name + ": ");
                  String flavor1 = input.nextLine();
                  String flavorError = froyo.setYogurtFlavor(flavor1);

                  System.out.println("You entered: " + flavor1);
                  if (flavorError.isEmpty()){
                        alert2 = false;
                  } else {
                        System.out.println(flavorError);
                  }
            } while (alert2);
 
            // prompt the user for the initial topping of the frozen yogurt
            System.out.println("Please enter the initial topping to add to the " + name + ": ");
            String topping1 = input.nextLine();
            froyo.addTopping(topping1);
            System.out.println("You entered: " + topping1);
 
            // Repeatedly ask the user if they would like to add another topping
            // validate input (only accepts yes or no)
            String loophelper = "";
            do {
                  System.out.println("Would you like to add another topping or another mix-in? (yes or no) ");
                  String toppingAnswer = input.nextLine();
                  System.out.println("You entered " + toppingAnswer + ".");
 
                  if ( toppingAnswer.equalsIgnoreCase("yes") ) {
                        // ask the user to enter another topping
                        // use nextLine() to read the next line of input
                        System.out.println("Please enter the name of the additional topping of the " + name + ": ");
                        String newTopping = input.nextLine();
                        froyo.addTopping(newTopping);
                        System.out.println("You entered: " + newTopping);
                  }
                  else if (toppingAnswer.equalsIgnoreCase("no") ) {
                        loophelper = "exit";
                  }
                  else {
                        System.out.println("Sorry, \"" + toppingAnswer + "\" is neither yes nor no");
                  }
            } while (loophelper.isEmpty());

            items.add(froyo);
      }

      /**
       * This method displays one item of the user's choise from an ArrayList of MenuItems
       * @param ArrayList<MenuItems> object
       */
      public static void displayOneItem(ArrayList<MenuItems> items){
            System.out.println("Please enter the name of the item to display: ");
            String name = input.nextLine();
            System.out.println("You entered: " + name);

            boolean itemFound = false;

            for ( int i = 0; i < items.size(); i++ ){
                  MenuItems item = items.get(i);
                  if ( item.getName().equals(name) ){
                        System.out.println(item.description());
                        itemFound = true;
                  }
            }
            if ( itemFound == false ){
                  System.out.println("Sorry, could not find " + name + " in the list");
            }
      }

      /**
       * This method displays all the items in an ArrayList of MenuItems
       * @param ArrayList<MenuItems> object
       */
      public static void displayAllItems(ArrayList<MenuItems> items){
            System.out.println("Displaying " + items.size() + " items");
            System.out.println("");
            for ( MenuItems item : items ){
                  System.out.println(item.description());
                  System.out.println("");
            }
      }

      /**
       * This method adds a topping to an item of the user's choice from an ArrayList of MenuItems
       * @param ArrayList<MenuItems> object
       */
      public static void addItemTopping(ArrayList<MenuItems> items){
            System.out.println("Please enter the name of the item ( to add a topping to): ");
            String name = input.nextLine();
            
            boolean itemFound = false;

            for ( int i = 0; i < items.size(); i++ ){
                  MenuItems item = items.get(i);
                  if ( item.getName().equals(name) ){
                        System.out.println("Please enter the topping to add to " + name + ": ");
                        String topping = input.nextLine();
                        System.out.println("You entered: " + topping);
                        item.addTopping(topping);
                        itemFound = true;
                  }
            }
            if ( itemFound == false ){
                  System.out.println("Sorry, could not find " + name + " in the list");
            }
      }


      public static void main(String[] args){
            // Welcome user
            System.out.println("Welcome to the Menu");

            // create int variable to keep track of user's choice
            int action;

            // Declare ArrayList to hold menu items
            ArrayList<MenuItems> items = new ArrayList<MenuItems>();

            do {
                  // print newline character 
                  System.out.println("");

                  // display menu 
                  displayMenu();

                  // Prompt user for choice and display the choice
                  System.out.println("Please choose from the above actions: ");
                  action = input.nextInt();
                  input.nextLine(); // consume newline character
                  System.out.println("You entered: " + action);

                  // display error message if user enters an invalid number choice
                  int[] actionChoices = {1, 2, 3, 4, 5, 6, 9};
                  if (!isValidChoice(action, actionChoices)){
                        System.out.println("Sorry, " + action + " is not a valid option");
                        continue;
                  }

                  // perform action based on user choice
                  switch (action) {
                        case 1: addSalad(items); break;
                        case 2: addSandwich(items); break;
                        case 3: addFrozenYogurt(items); break;
                        case 4: displayOneItem(items); break;
                        case 5: displayAllItems(items); break;
                        case 6: addItemTopping(items); break;
                  }

            } while (action != 9);

            // Display exit message when user enters 9
            System.out.println("Thank you!");
      }
}



