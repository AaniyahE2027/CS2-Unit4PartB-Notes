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

      // list.get( int index ) return the item
      // at that specified idex
      String firstItem = toDo.get(0);
      //return type matches what the ArrayList holds
      System.out.println("Do this first: " + firstItem);

      //list.set( int index, obj newItem )
      // replaces item at that index with a new one!
      String replacedItem = toDo.set(0,"Get my free crumbl cookie");
      System.out.println(toDo);
      System.out.println("We replaced: " + replacedItem);

      // list.remove( int index ) deletes the item at that index
      // shiifting everything else back one number
      //also returns the removed  item! (called E on the quick ref.)
      String removedItem = toDo.remove(2);
      System.out.println( toDo );
      System.out.println("We removed the item: " + removedItem);

      // 4.9 ARRAYLIST TRAVERSAL
      ArrayList<Integer> scores = new ArrayList<Integer>();
      scores.add(100);
      scores.add(99);
      scores.add(98);
      System.out.println(scores);

      // ENHANCED FOR-EACH LOOP
      // to "visit" every item in order
      // does not keep track of current index/position
      for ( Integer currentScore : scores ) {
         System.out.println("Test Score: " + currentScore);
      }
      // typical example: count up all items
      double sum = 0;
      for ( Integer score : scores ) {
         sum = sum = score; // Or sum += score;
      }
      double avg = sum / scores.size();
      System.out.println("Test Average " + avg);

      //STANDARD FOR LOOPS: when you need to keep
      //track of the current INDEX(position) 
      //like if you want to use a method (set,get,etc.)
      for (int i = 0; i < scores.size (); i++) {
         // get item at current index
         int currentItem = scores.get(i);
         int curvedScore = currentItem + 100;
         scores.set(i, curvedScore); // replace item
      }
      System.out.println(scores);
      
      //WHILE LOOP (iterate until condition is false)
      ArrayList<String> groceries = new ArrayList<String>();
      groceries.add("strawberries");
      groceries.add("bagel");
      groceries.add("butter");
      groceries.add("bagel");
      groceries.add("ice cream");
      boolean found = false;
      int index = 0;
      //!found is the same as found == false
      while ( index < groceries.size() && !found){
         if ( "bagel".equals(groceries.get(index)) ){
            // if current item in list "bagel"
            groceries.remove(index); 
            found = true;
         }
         else {
            index++; //continue through list
         }
      }
      System.out.println(groceries);



   }//END OF MAIN METHOD
}//END OF CLASS
