/** 
 * Description: This class represents a frozen yogurt dessert. It includes fields to store the name, price, yogurt flavor, and toppings. 
 * It inherits from the MenuItems class to use the name, price, and toppings variables, accessor and mutator methods. 
 * It contains constructor, accessor and mutator methods, a description method, and a custom method to calculate the total price of 2 frozen yogurt objects. 
 * @author Nikki Johnson
 * @date 09/14/23
 * @version 2.1
 */
public class FrozenYogurt extends MenuItems
{
    //instance variables
    private String flavor;
    
    /**
     * This is a contructor with no parameters for the FrozenYogurt class.
     */
    public FrozenYogurt()
    {
        super();
        this.name = "";
        this.price = 0.00;
        this.flavor = "";
        this.topping = new StringBuilder();
    }

    /**
     * This is a constructor that initilizes the frozen yogurt variables with provided parameters.
     * 
     * @param name The name of the frozen yogurt
     * @param price The price of the frozen yogurt
     * @param flavor The frozen yogurt flavor
     * @param topping The topping(s) of the frozen yogurt
     */
    public FrozenYogurt(String name, double price, String flavor, String topping){
        this.name = name;
        this.price = price;
        this.flavor = flavor; 
        this.topping.append(topping);
    }

     // accessor method

    /**
     * This method gets and returns the flavor of the frozen yogurt.
     * 
     * @return the flavor of the frozen yogurt
     */
    public String getYogurtFlavor(){
        return flavor;
    }

    /**
     * This method sets the flavor of the frozen yogurt
     * 
     * @param flavor is the flavor of the frozen yogurt
     * @return an error message if the flavor is not one of the valid yogurt flavors (chocolate or vanilla)
     */
    public String setYogurtFlavor(String flavor){
        if (flavor.equalsIgnoreCase("chocolate") || flavor.equalsIgnoreCase("vanilla")){
            this.flavor = flavor;
            return "";
        }
        else{
            return "ALERT: \"" + flavor + "\" is not one of the valid yogurt flavors (chocolate or vanilla)!";
        }
    }

    /**
     * A method that returns a String that describes each of the four fields for the class
     * 
     * @return a String that displays each of the four fields for the class
     */
    public String description(){

        return "Frozen Yogurt : " + name + "\n" +  
               "Price         : $" + price + "\n" +
               "Base Yogurt   : " + flavor + "\n" +
               "Topping(s)    : " + topping.toString(); 
    }

    /**
     * This method returns the total of 2 frozen yogurts
     * 
     * @param f1 is the first frozen yogurt
     * @param f2 is the second frozen yogurt
     * @return the total of the two frozen yogurts
    */
    public String total(FrozenYogurt f1, FrozenYogurt f2){
        double total = f1.getPrice() + f2.getPrice();
        return "The total price for the two frozen yogurts is: $" + total;
    }
}