import java.util.Scanner;

public class PalindromeChecker{

      public static void main (String[] args){
            //Initialize strings
            String userNum;
            String userNumReversed;
            
            //Get user input to declare the number and its reversed form
            Scanner in = new Scanner(System.in);
            System.out.println ("Please enter a number: ");
            userNum = in.nextLine();
            
            //Get the reversed string
            userNumReversed = new StringBuilder(userNum).reverse().toString();
            
            
            //Determine if the string is a palindrome
            if (userNum.equals(userNumReversed)){
                  System.out.println (userNum + " is a palindrome.");
            }
            else {
                  System.out.println (userNum + " is not a palindrome.");
            }
      }
}                       
