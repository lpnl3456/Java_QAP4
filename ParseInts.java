// ****************************************************************

// ParseInts.java

//

// Reads a line of text and prints the integers in the line.

//

// ****************************************************************

import java.util.Scanner;

public class ParseInts

{

public static void main(String[] args)

{

int val, sum=0;

Scanner scan = new Scanner(System.in);

String line;

//Have the user enter a line of text
System.out.println("Enter a line of text");

Scanner scanLine = new Scanner(scan.nextLine());

//Add all the integers together
while (scanLine.hasNext())
    
    {
        
    try{
    val = Integer.parseInt(scanLine.next());
    
    sum += val;
    }
    //If the characters is not a number catch the error and skip it
    catch(NumberFormatException e){
    
    }
        
    
    
    }
    
    //Print the sum of the integers
    System.out.println("The sum of the integers on this line is " + sum);

}
    

}