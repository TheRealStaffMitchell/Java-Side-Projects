import java.util.Scanner;

/**The following program is a character builder
for an RPG. Program will start the character off
with base attributes of 8 and the user will be
able to allocate 5 points to these attributes
**/

/**Features to add:
-Variations of base stats based on character race.
-Fix the issue of the java.util.InputMismatchException
when users input a double number.
**/

public class StatBuilder
{
  public static void main(String[]args)
  {
    //create variables
  int repeatStats = 1;
  int stat;
  int repeatSelect;
  //create scanner object for user input
  Scanner statSelect = new Scanner(System.in);
  //Initialize base attribute scores
  int strength = 8, dexterity = 8, agility = 8, charisma = 8, endurance = 8, intelligence = 8;
  do
  {
     System.out.println("Allocate your 5 state points by entering the number of the corresponding attribute.\nMore than one point can be allocated to a single attribute.");
     System.out.println("Remember, a jack of all trades is a master of none.");
    for(int statNum = 1;statNum < 6 ;statNum++)
    {
      //Display current attributes
      System.out.println("1. Strength: " + strength);
      System.out.println("2. Dexterity: " + dexterity);
      System.out.println("3. Agility: " + agility);
      System.out.println("4. Charisma: " + charisma);
      System.out.println("5. Endurance: " + endurance);
      System.out.println("6. Intelligence: " + intelligence);
      System.out.println("Points remaining: " + (6 - statNum));
      //Prompt user to select an attribute with the scanner object
      stat = statSelect.nextInt();
      //case for strength stat
      if (stat == 1)
      {
        strength++;
      }
      //case for strength stat
      if (stat == 2)
      {
        dexterity++;
      }
      //case for strength stat
      if (stat == 3)
      {
        agility++;
      }
      //case for strength stat
      if (stat == 4)
      {
        charisma++;
      }
      //case for strength stat
      if (stat == 5)
      {
        endurance++;
      }
      //case for strength stat
      if (stat == 6)
      {
        intelligence++;
      }
      //case for inputting an invalid number
      else if (stat !=1 && stat !=2 && stat !=3 && stat !=4 && stat !=5 && stat !=6)
      {
        //Tell the user that they have entered an invalid number
        System.out.println("You entered:" + stat + "\nYou have chosen an invalid option");
        //decrement statNum by one to keep the restart the loop from the previous point
        statNum--;
      }

    }
    System.out.println("Would you like to reallocate your attributes? \n1. Yes\n2. No");
    repeatSelect = statSelect.nextInt();
    if(repeatSelect == 1)
    {
      repeatStats = 1;
      strength = 8;
      dexterity = 8;
      agility = 8;
      charisma = 8;
      endurance = 8;
      intelligence = 8;
    }
    if(repeatSelect == 2)
    {
      repeatStats = 0;
    }
  }
    while (repeatStats == 1);
  }
}

