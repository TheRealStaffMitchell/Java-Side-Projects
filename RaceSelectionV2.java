/**This program has the same principle behind
it as the RaceSelection program. The difference
is that this program has each race as a method
of the raceSelectsions class.**/

/**Features to add:
-Create methods for each of the subraces.
-Initialize accurate base stats for each race and subrace
-have the methods actually return data so that they
can be used in the main method.
-Implement the StatBuilder Program into this one.
**/

//Import scanner class
import java.util.Scanner;

public class RaceSelectionV2
{
  public static void main(String[]args)
  {
    //Create variables
    double race;
    //Create scanner object for user input
    Scanner raceSelect = new Scanner(System.in);
    //Display Race Options
    System.out.println("1. Markovian");
    System.out.println("2. Human");
    System.out.println("3. Aulsebra");
    System.out.println("4. Tenebra");
    System.out.println("5. Tsermalda");
    System.out.println("6. Gree");
    /**Create scanner object that allows the user
    to input double values**/
    race = raceSelect.nextDouble();
    //Create object from the raceSelections class
    raceSelections chosenRace = new raceSelections();

    //Confirm user selections
    //Case for Markovian race selection
    if (race == 1)
    {
      chosenRace.markRace();
    }
    //Case for Human race selection
    if (race == 2)
    {
      chosenRace.humanRace();
    }
    //Case for Aulsebra race selection
    if (race == 3)
    {
      chosenRace.aulsRace();
    }
    //Case for Tenebra race selection
    if (race == 4)
    {
      chosenRace.tenRace();
    }
    //Case for Tsermalda race selection
    if (race == 5)
    {
      chosenRace.tserRace();
    }
    //Case for Gree race selection
    if (race == 6)
    {
      chosenRace.greeRace();
    }
    //Case for invalid race selection
    else if (race !=1 && race !=2 && race !=3 && race !=4 && race !=5 && race !=6)
    {
      System.out.println("You have chosen an invalid option. The program will now close.");
      System.exit(1);
    }
  }
}
class raceSelections
{
  //Create variables to use for stats
  int strength, dexterity, agility, charisma, endurance, intelligence;
  int stat;
  //method for Markovian race
  public void markRace()
  {
    //Initialize base stats for the selected race
    strength = 6;
    dexterity = 9;
    agility = 8;
    charisma = 9;
    endurance = 7;
    intelligence = 10;
    //Inform the user of base stats and selected race
    System.out.println("You have chosen the Markovian race.\nYour base stats are as follows:");
    System.out.println("Strength:" + strength);
    System.out.println("Dexterity:" + dexterity);
    System.out.println("Agility:" + agility);
    System.out.println("Charisma:" + charisma);
    System.out.println("Endurance:" + endurance);
    System.out.println("Intelligence:" + intelligence);

   }
  //method for Human race
   public void humanRace()
   {
     //Initialize base stats for the selected race
     strength = 8;
     dexterity = 8;
     agility = 8;
     charisma = 8;
     endurance = 8;
     intelligence = 8;
     //Inform the user of base stats and selected race
     System.out.println("You have chosen the Human race.\nYour base stats are as follows:");
     System.out.println("Strength:" + strength);
     System.out.println("Dexterity:" + dexterity);
     System.out.println("Agility:" + agility);
     System.out.println("Charisma:" + charisma);
     System.out.println("Endurance:" + endurance);
     System.out.println("Intelligence:" + intelligence);
     //Prompt user to select three attributes to increase by 1 point
     System.out.println("Allocate these 3 points to attributes of your choice");
     /**Humans have a special trait that allows them
     to allocate 3 points to any attribute of their
     choice**/
     System.out.println("1. Strength\n2. Dexterity\n3. Agility \n4. Charisma \n5. Endurance \n6. Intelligence");
     Scanner statSelect = new Scanner(System.in);
     //Use for loop to allow user to input their 3 extra attribute points
     for(int statNum = 1;statNum < 4 ;statNum++)
     {
       stat = statSelect.nextInt();
       if (stat == 1)
       {
          strength++;
       }
       if (stat == 2)
       {
          dexterity++;
       }
       if (stat == 3)
       {
          agility++;
       }
       if (stat == 4)
       {
         charisma++;
       }
       if (stat == 5)
       {
         endurance++;
       }
       if (stat == 6)
       {
         intelligence++;
       }
       else if (stat !=1 && stat !=2 && stat !=3 && stat !=4 && stat !=5 && stat !=6)
       {
         //Tell the user that they have entered an invalid number
         System.out.println("You have chosen an invalid option");
         //decrement statNum by one to keep the restart the loop from the previous point
         statNum--;
       }

       System.out.println("Strength:" + strength);
       System.out.println("Dexterity:" + dexterity);
       System.out.println("Agility:" + agility);
       System.out.println("Charisma:" + charisma);
       System.out.println("Endurance:" + endurance);
       System.out.println("Intelligence:" + intelligence);
       System.out.println("Points remaining: " + (3 - statNum));
    }
     System.out.println("Your final base stats are:");
     System.out.println("Strength:" + strength);
     System.out.println("Dexterity:" + dexterity);
     System.out.println("Agility:" + agility);
     System.out.println("Charisma:" + charisma);
     System.out.println("Endurance:" + endurance);
     System.out.println("Intelligence:" + intelligence);
   }
   //method for Aulsebra race
   public void aulsRace()
   {
     //Initialize base stats for the selected race
     strength = 8;
     dexterity = 8;
     agility = 8;
     charisma = 7;
     endurance = 9;
     intelligence = 10;
     //Inform the user of base stats and selected race
     System.out.println("You have chosen the Aulsebra race.\nYour base stats are as follows:");
     System.out.println("Strength:" + strength);
     System.out.println("Dexterity:" + dexterity);
     System.out.println("Agility:" + agility);
     System.out.println("Charisma:" + charisma);
     System.out.println("Endurance:" + endurance);
     System.out.println("Intelligence:" + intelligence);
   }
   //method for Tenebra race
   public void tenRace()
   {
     //Initialize base stats for the selected race
     strength = 10;
     dexterity = 8;
     agility = 6;
     charisma = 9;
     endurance = 10;
     intelligence = 8;
     //Inform the user of base stats and selected race
     System.out.println("You have chosen the Tenebra race.\nYour base stats are as follows:");
     System.out.println("Strength:" + strength);
     System.out.println("Dexterity:" + dexterity);
     System.out.println("Agility:" + agility);
     System.out.println("Charisma:" + charisma);
     System.out.println("Endurance:" + endurance);
     System.out.println("Intelligence:" + intelligence);
   }
   //method for Tsermalda race
   public void tserRace()
   {
     //Initialize base stats for the selected race
     strength = 8;
     dexterity = 9;
     agility = 9;
     charisma = 6;
     endurance = 10;
     intelligence = 8;
     //Inform the user of base stats and selected race
     System.out.println("You have chosen the Tsermalda race.\nYour base stats are as follows:");
     System.out.println("Strength:" + strength);
     System.out.println("Dexterity:" + dexterity);
     System.out.println("Agility:" + agility);
     System.out.println("Charisma:" + charisma);
     System.out.println("Endurance:" + endurance);
     System.out.println("Intelligence:" + intelligence);
   }
   //method for Gree race
   public void greeRace()
   {
    //Initialize base stats for the selected race
    strength = 6;
    dexterity = 10;
    agility = 10;
    charisma = 7;
    endurance = 7;
    intelligence = 10;
    //Inform the user of base stats and selected race
    System.out.println("You have chosen the Gree race.\nYour base stats are as follows:");
    System.out.println("Strength:" + strength);
    System.out.println("Dexterity:" + dexterity);
    System.out.println("Agility:" + agility);
    System.out.println("Charisma:" + charisma);
    System.out.println("Endurance:" + endurance);
    System.out.println("Intelligence:" + intelligence);
   }
}
