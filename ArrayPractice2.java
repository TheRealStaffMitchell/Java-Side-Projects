/**This is another program meant to show competency
with arrays. The user is prompted to select an array
to reveal the contents of. Following this, the user
prompted to press enter to reveal the next index and
its corresponding value. An if statement is used for
selection**/


import java.util.Scanner;

public class ArrayPractice2
{
  public static void main(String[]args)
  {
    //Initialize arrays
    int firstArray[]={1,2,3,4,5};
    int secondArray[]={10,11,12,13,14};
    int thirdArray[]={20,30,40,50,60};

    //Prompt user to choose one of the three arrays
    System.out.println("Choose which array you would like to see the contents of.\n1. Array 1\n2. Array 2\n3. Array 3");
    //Create scanner object to prompt user input
    Scanner input = new Scanner(System.in);
    /**Create object that allows for input of double values.
    This is so there is no error if a user enters a number
    other than an integer**/
    double select;
    select = input.nextDouble();
    //Condition for selection of array 1
    if (select == 1)
    {
      System.out.println("Press enter to reveal the next index and corresponding value of the array.");
      System.out.println("Index: \t Value:");
      for(int counter = 0; counter<firstArray.length; counter++)
      {
        //Prompt user to press enter
        input.nextLine();
        System.out.println(counter + "\t" + firstArray[counter]);
      }
    }
    //Condition for selection of array 2
    if (select == 2)
    {
      System.out.println("Press enter to reveal the next index and corresponding value of the array.");
      System.out.println("Index: \t Value:");
      for(int counter = 0;counter<secondArray.length;counter++)
      {
        //Prompt user to press enter
        input.nextLine();
        System.out.println(counter + "\t" + secondArray[counter]);
      }
    }
    //Condition for selection of array 3
    if (select == 3)
    {
      System.out.println("Press enter to reveal the next index and corresponding value of the array.");
      System.out.println("Index: \t Value:");
      for(int counter = 0;counter<thirdArray.length;counter++)
      {
        //Prompt user to press enter
        input.nextLine();
        System.out.println(counter + "\t" + thirdArray[counter]);
      }
    }
    //Condition for invalid input
    else if (select != 1 && select != 2 && select != 3)
    {
      System.out.println("You have entered an invalid option. The program will now close");
      //Prompt user input
      input.nextLine();
      //Closes the program
      System.exit(0);
    }
  }
}