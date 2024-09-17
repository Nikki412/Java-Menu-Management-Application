/**
 * Description: This class represents a sandwich menu item with a side. It includes fields to store the name, price, 
 * side, bread, and toppings. It inherits from the MenuItems class to use the name, price, and toppings variables, accessor and mutator methods. 
 * It contains constructor, accessor and mutator methods, and a description method, 
 * @author Nikki Johnson
 * @version 1.1
 */


public class Sandwich extends MenuItems
{
      // instance variables
      private String side;
      private String bread;

      /**
       * Constructor with no parameters for the sandwich class
       */
      public Sandwich(){
            super();
            this.name ="";
            this.price = 0.0;
            this.topping = new StringBuilder();
            this.side = "";
            this.bread = "";
      }

      /**
       * Constructor with parameters for the sandwich class
       * @param name The name of the sandwich
       * @param price The price of the sandwich
       * @param topping The toppings for the sandwich
       * @param side The side for the sandwich
       * @param bread The bread for the sandwich
       */
      public Sandwich(String name, double price, String topping, String side, String bread){
            this.name = name;
            this.price = price;
            this.topping.append(topping);
            this.side = side;
            this.bread = bread; 
      }

      /**
       * This method retuns the side for the sandwich
       * @return The side for the sandwich
       */
      public String getSide(){ return side; }

      /**
       * This method returns the bread for the sandwich
       * @return The bread for the sandwich
       */
      public String getBread(){ return bread;}

      /**
       * This method sets the side of the sandwich
       * @param side for the sandwich
       */
      public void setSide(String side){ this.side = side; }

      /**
       * This method sets the bread for the sandwich
       * @param bread the bread for the sandwich
       */
      public void setBread(String bread){ this.bread = bread; }

      /**
       * A method that returns a String that describes each of the four fields for the class
       * 
       * @return a String that displays each of the four fields for the class
       * */
      public String description(){
            return "Sandwich    : " + name + " (on " + bread + ")\n" +  
                   "Price       : $" + price + "\n" +
                   "Side        : " + side + "\n" +
                   "Topping(s)  : " + topping.toString();
      }
}