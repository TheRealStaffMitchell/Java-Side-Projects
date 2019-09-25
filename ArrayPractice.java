/**This program is just a means of showing an
understanding of arrays and how they work with 
regards to their value and index. It also shows
how an array can be used as the condition in a
for loop.**/

import java.util.Scanner;

public class ArrayPractice
{
  public static void main(String[]args)
  {
    //Create array
    int pracArray[]={1,2,3,4,5,};

     //Prompt user to press enter key to control flow of output
    System.out.println("Press enter to reveal next index and value.");

    //Print labels for table
    System.out.println("Array index \t Array Value");

    //Create scanner object to allow for user inputer
    Scanner input = new Scanner(System.in);

    for(int counter = 0; counter<pracArray.length; counter++)
    {
      //Print the array index and its corresponding value
      System.out.print(counter + "\t" + pracArray[counter]);
      //Use scanner object to allow user to control  flow of output
      input.nextLine();
    }
  }
}