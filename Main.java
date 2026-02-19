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
      int parsedI = Integer.parseInt(stringyNums);
      System.out.println(parsedI);
   }
}
