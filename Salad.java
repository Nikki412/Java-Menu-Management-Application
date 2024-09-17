/**
 * Description: This class represents a sandwich menu item with a side. It includes fields to store the name, price, 
 * side, dressing, and toppings. It inherits from the MenuItems class to use the name, price, and toppings variables, accessor and mutator methods. 
 * It contains constructor, accessor and mutator methods, and a description method, 
 * 
 * @author Nikki Johnson
 * @version 1.1
 */
public class Salad extends MenuItems
{
      // instance variables
      private String side;
      private String dressing;

      /**
       * This is the constructor with no parameters for the Salad class
       */
      public Salad(){
            super();
            this.name ="";
            this.price = 0.0;
            this.topping = new StringBuilder();
            this.side = "";
            this.dressing = "";

      }

      /**
       * This is the constructor with parameters for the Salad class
       *  
       * @param name The name of the salad
       * @param price The price of the salad
       * @param topping The topping of the salad
       * @param side The side of the salad
       * @param dressing The dressing for the salad
       */
      public Salad(String name, double price, String topping, String side, String dressing){
            this.name = name;
            this.price = price;
            this.topping.append(topping);
            this.side = side;
            this.dressing = dressing; 
      }

      /**
       * This method retuns the side for the salad
       * @return the side for the salad
       */
      public String getSide(){ return side; }

      /**
       * This method returns the dressing for the salad
       * @return The dressing for the salad
       */
      public String getDressing(){ return dressing; }

      /**
       * This method sets the side for the salad
       * @param side The side for the salad
       */
      public void setSide(String side){ this.side = side; }

      /**
       * This method sets the dressing for the sald
       * @param dressing The dressing for the salad
       */
      public void setDressing(String dressing){ this.dressing = dressing; }
      
      /**
       * A method that returns a String that describes each of the four fields for the class
       * 
       * @return a String that displays each of the four fields for the class
       */
      public String description(){
            return "Salad       : " + name + " (with " + dressing + ")\n" +  
                   "Price       : $" + price + "\n" +
                   "Side        : " + side + "\n" +
                   "Topping(s)  : " + topping.toString();
      }
}