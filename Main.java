public class Main {
    public static void main(String[] args) {
               
        byte myByte = 100;                   
        short myShort = 5000;                
        int myInt = 100000;                  
        long myLong = 15000000000L;         
        
        float myFloat = 5.99f;               
        double myDouble = 19.99;             
        
        char myChar = 'A';                   
        boolean myBool = true;               
        
        String myString = "Java Basics";     

        int a = 20;
        int b = 10;
        int sum = a + b;
        int diff = a - b;
        int prod = a * b;
        int quot = a / b;
        int mod = a % 3;                     

        boolean isEqual = (a == b);          
        boolean isGreater = (a > b);        

        boolean andOp = (a > 0 && b > 0);    
        boolean orOp = (a > 0 || b < 0);  
        boolean notOp = !myBool;           
    
        int counter = 1;
        counter++;                           
        a += 5;

        System.out.println("Long type: " + myLong);
        System.out.println("Float type: " + myFloat);
        System.out.println("String type: " + myString);
                          

        System.out.println("Sum: " + sum + ", Remainder: " + mod);
        System.out.println("Difference: " + diff + ", Product: " + prod);
        System.out.println("Quotient " + quot + ", : " + mod);
        System.out.println("Incremented Counter: " + counter);
      
        System.out.println("Is 20 == 10? " + isEqual);
        System.out.println("Logical AND Result: " + andOp);
        System.out.println("Logical NOT Result: " + notOp);

    }
}