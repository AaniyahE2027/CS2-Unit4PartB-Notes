import java.util.ArrayList;

public class Main {

   public static void main(String []args) {
      //4.7 WRAPPER CLASSES wrap primitives into object
      // why? some methods NEED objects!
      Integer fancyInt = new Integer(23);
      Double fancyDoub = new Double(3.14);
      // calling the constructor is no longer necessary!
      // can just declare them like you would primitives:
      Integer fancierInt = 23; 
      System.out.println(fancierInt);
      //AUTOBOXING: Java converts int to Integer
      //(we passed 23, a primitive value, then Java promoted it to an Integer)
      int regularInt = fancierInt; //UNBOXING

      // Another benefit of Wrappers: you can use some methods
      System.out.println(Integer.MIN_VALUE);
      System.out.println(Integer.MAX_VALUE);
      String stringyNums = "13.0";
      double parsedD = Double.parseDouble(stringyNums);
      System.out.println(parsedD);
      String stringyNums2 = "13";
      int parsedI = Integer.parseInt(stringyNums2);
      System.out.println(parsedI);
      
      //4.8 ARRAYLIST
      /* ArrayList is a RE-SIZABLE collection
      You can ADD or REMOVE item from list!
      ArrayList is MUTABLE (can change during run)
      */

      //ArrayList<Type> name = new ArrayList<Type>();
      ArrayList<String> toDo = new ArrayList<String>();

      // For numbers, must use WRAPPER classes (not primitives!)
      ArrayList<Integer> intList = new ArrayList<Integer>();
      ArrayList<Double> doubleList = new ArrayList<Double>();

      // ARRAYLIST METHODS (assume "list" is an ArrayList)

      //list.size() return an int
      //counts the number off items in the list
      int numTasks = toDo.size();
      System.out.println("Number of items on our to do this: " + numTasks); 
      //list.add( obj ) appends the obj to end of list
      //returns a boolean, but that's not important
      toDo.add("Buy Starwberries");
      toDo.add("Go to Sephora");
      toDo.add("Study for SAT");
      // check size after adding stuff
      System.out.println("Number of items after adding: " + toDo.size());
      System.out.println(toDo); //ArrayList has a nice toString method!!!

      //list.add (index, obj) inserts the obj
      //AT a specific INDEX! (position)
      toDo.add(1,"Do Homework"); 
      System.out.println(toDo); 
      // REMEMBER that indexes at 0
      //so 1 means we added to the SECOND spot


   }
}
