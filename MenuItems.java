/**
 * This class is an abstract class to represent menu items. It contains common properties and methods for menu items.
 * Subclasses implement the description() method to provide details for specific menu item types.
 * @author Nikki Johnson
 * @version 1.1
 */
public abstract class MenuItems{

    // The instance variables that are used by all subclasses
    protected String name;
    protected double price;
    protected StringBuilder topping; // comma separated list of toppings

    /**
    * This method gets and returns the name of the menu item.
    * 
    * @return the name of the menu item
    */
    public String getName(){ return name; }

    /**
    * This method gets and returns the price of the menu item.
    * 
    * @return the price of the menu item
    */
    public double getPrice(){ return price; }

    /**
    * This method gets and returns the topping(s) of the menu item.
    * 
    * @return the topping(s) of the menu item
    */
    public String getTopping(){ return topping.toString(); }

    // mutator methods

    /**
     * This method sets the name of the menu item
    * @param name is the name of the menu item
    */
    public void setName(String name){ this.name = name; }

    /**
    * This method sets the price of the menu item and changes the price 
    * of the menu item from a string to a double.
    * 
    * @param priceString is the price of the menu item
    * @return an error message if the price is not a valid number, or an empty string.
    */
    public String setPrice(double price){
          if (price < 0.00){
                return "ALERT: Unable to set " + name + "'s price to " + price + " (negative values are not allowed)";
          }
          else if (price > 100.00){
                return "ALERT: Unable to set " + name + "'s price to " + price + " (value is too high ()>= 100.00) )";
          }
          else{
                this.price = price;
                return "";
          }
    }

    /**
    * This method adds a topping to the topping list of the menu item
    * 
    * @param newTopping is the topping to be added to the topping list of the menu item
    */
    public void addTopping(String newTopping){
          if (topping.length() > 0){
                topping.append(", " + newTopping);
                price += 0.49;
          }
          else{
                topping.append(newTopping);
          }
    }

    /**
     * This method is the decription method that is used by all child classes to return a description of the menu item
     * @return a string describing the menu item
     */
    public abstract String description();
}