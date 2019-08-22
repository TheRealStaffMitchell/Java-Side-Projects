import java.util.Scanner;

public class RaceSelection
{
  public static void main(String[]args)
  {
    //Create variables
    int race;
    int breed;
    int confirm;
    //Create scanner object
    Scanner raceSelect = new Scanner(System.in);
    //Prompt user to select race
    System.out.println("Select your character's race; enter a number.");
    //Display Race Options
    System.out.println("1. Markovian");
    System.out.println("2. Human");
    System.out.println("3. Aulsebra");
    System.out.println("4. Tenebra");
    System.out.println("5. Tsermalda");
    System.out.println("6. Gree");
    //Get user input for race
    race = raceSelect.nextInt();
    //Cofirm user selections
    if (race == 1)
    {
      System.out.println("Choose the subrace of Markovian; enter a number.");
      System.out.println("1. Alumanne Markovian");
      System.out.println("2. Sarthufaye Markovian");
      breed = raceSelect.nextInt();
      if (breed == 1)
      {
        System.out.println("Are you sure of your choice? Enter 1 for yes or 2 for no.");
        confirm = raceSelect.nextInt();
        if (confirm == 1)
        {
          System.out.println("You have chosen an Alumanne Markovian.\nThe Alumanne start with a bonus resistance to fire and increased intelligence.\nThe Alumanne also gets 2 more dexterity points and 1 more intelligence point than that of their Sarthufaye counterparts.\nSarthufaye have a 35% experience penalty for the first 5 levels.");
        }
        if (confirm == 2)
        {
          System.out.println("You have chosen not to play a Markovian.");
        }
        else if (confirm !=1 && confirm !=2)
        {
          System.out.println("That is not a valid option.");
        }
      }
      if (breed == 2)
      {
        System.out.println("Are you sure of your choice? Enter 1 for yes or 2 for no.");
        confirm = raceSelect.nextInt();
        if (confirm == 1)
        {
          System.out.println("You have chosen a Sarthufaye Markovian.\nThe Sarthufaye are renowned for their intellect and wit, starting with a +2 bonus to intelligence and +2 to Charisma.\nTheir lithe bodies also give them +1 to agility.");
        }
        if(confirm == 2)
        {
          System.out.println("You have chosen not to play a Markovian.");
        }
        else if (confirm !=1 && confirm !=2)
        {
          System.out.println("That is not a valid option.");
        }
      }
      if (breed !=1 && breed !=2)
      {
        System.out.println("That is not a valid option.");
      }
    }
    if (race == 2)
    {
      System.out.println("Are you sure of your choice? Enter 1 for yes or 2 for no.");
      confirm = raceSelect.nextInt();
      if (confirm == 1)
      {
        System.out.println("Humans are one of the most diverse races of Aulsana.\nDue to their genetic diversity, they have a wide array of characteristics.\nYou have 5 extra attribute points to assign to whatever you like and you gain an extra two perks at the first level, but you suffer a 10% experience penalty permanently.");
      }
      if(confirm == 2)
      {
        System.out.println("You have chosen not to play a human.");
      }
      else if (confirm !=1 && confirm !=2)
      {
        System.out.println("That is not a valid option.");
      }
    }
    if (race == 3)
    {
      System.out.println("Are you sure of your choice? Enter 1 for yes or 2 for no.");
      confirm = raceSelect.nextInt();
      if (confirm == 1)
      {
        System.out.println("The Aulsebrae are an intelligent bunch but also have considerable strength.\nYou start with a +2 bonus to intelligence and a +2 bonus to strength.\nTheir pursuit of knowledge gives them a bonus to magic, but their skeptical and secularist nature gives them -20 repuation with all relgious orders");
      }
      if(confirm == 2)
      {
        System.out.println("You have chosen not to play an Aulsebra.");
      }
      else if (confirm !=1 && confirm !=2)
      {
        System.out.println("That is not a valid option.");
      }
    }
    if (race == 4)
    {
      System.out.println("Are you sure of your choice? Enter 1 for yes or 2 for no.");
      confirm = raceSelect.nextInt();
      if (confirm == 1)
      {
        System.out.println("The Tenebrae are known for being hardy warriors with heroic physiques.\n Their physical prowess and attractive shapes give them a +2 bonus to strength, +1 bonus to agility, and +1 bonus to charisma.\nLiving in a harsh environemnt has given them acute poison and toxin resistence and increased stamina.");
      }
      if(confirm == 2)
      {
        System.out.println("You have chosen not to play a Tenebra.");
      }
      else if (confirm !=1 && confirm !=2)
      {
        System.out.println("That is not a valid option.");
      }
    }
    if (race == 5)
    {
      System.out.println("Choose the subrace of Tsermalda; enter a number.");
      System.out.println("1. Rutaub Tsermalda\n2. Xaimarin Tsermalda\n3. Drovaskije Tsermalda");
      breed = raceSelect.nextInt();
      if (breed == 1)
      {
        System.out.println("Are you sure of your choice? Enter 1 for yes or 2 for no.");
        confirm = raceSelect.nextInt();
        if (confirm == 1)
        {
          System.out.println("You have chosen the Rutaub Tsermalda.\nMost Tsermaldae of the Rutaub origin are often nomadic. Having to put up with long journeys gives them a +2 to endurance and +2 to agility.\nThe countries most populated with Rutaub are less developed, giving the Rutaub a penalty to magic and alchemy and -1 to intelligence.");
        }
        if (confirm == 2)
        {
          System.out.println("You have chosen not to play a Tsermalda.");
        }
        else if (confirm !=1 && confirm !=2)
        {
          System.out.println("That is not a valid option.");
        }
      }
      if (breed == 2)
      {
        System.out.println("Are you sure of your choice? Enter 1 for yes or 2 for no.");
        confirm = raceSelect.nextInt();
        if (confirm == 1)
        {
          System.out.println("You have chosen the Xaimarin Tsermalda.\nXaimarin Tsermalda are found mostly in the same countries as the Rutaub cousins but often in different roles an in more developed communities.\nTheir seemingly natural inclination toward leadership gives them a +2 bonus to charisma,and their knack for intellecutal pursuits gives them a +3 bonus to intelligence.\nThe Xiamarin are not physically adept however, suffering a -1 penalty to strength and agility.\nTheir haughty nature also rubs people the wrong way, especially the Rutaub.\nThis gives -30 relation with Rutaub and -20 relation with peasants, the criminal underworld, and the religious.");
        }
        if (confirm == 2)
        {
          System.out.println("You have chosen not to play a Tsermalda.");
        }
        else if (confirm !=1 && confirm !=2)
        {
          System.out.println("That is not a valid option.");
        }
      }
      if (breed == 3)
      {
        System.out.println("Are you sure of your choice? Enter 1 for yes or 2 for no.");
        confirm = raceSelect.nextInt();
        if (confirm == 1)
        {
          System.out.println("You have chosen the Drovaskije tsermalda.\nThe Drovaskije are tsermalda who have moved east an began practicing the Estellesian cultures and assimilating into Estellesian ethnic groups.\nDrovaskije retain some characterstics with the Rutaub, having +1 to endurance and +1 to agility.\nIn addition, they have a +2 bonus to strength as a result of their new Estellesian practices.\nMany leaders in Estellesian countries are Drovaskije, giving them a +25 relation with people of Estellesian ethnic origin.");
        }
        if (confirm == 2)
        {
          System.out.println("You have chosen not to play a tsermalda.");
        }
        else if (confirm !=1 && confirm !=2)
        {
          System.out.println("That is not a valid option.");
        }
      }
      else if (breed != 1 && breed !=2 && breed !=3)
      {
        System.out.println("That is not a valid option.");
      }
    }
    if (race == 6)
    {
      System.out.println("Choose the subrace of Gree");
      System.out.println("1. Matauru Gree\n2. Szierca Gree\n3. Alsumaz Gree");
      breed = raceSelect.nextInt();
      if (breed == 1)
      {
        System.out.println("Are you sure of your choice? Enter 1 for yes or 2 for no.");
        confirm = raceSelect.nextInt();
        if (confirm == 1)
        {
          System.out.println("You have chosen the Matauru gree.\nGree of this type are typically found in the frozen north as part of Iylanalt tribes.\nGrowing up in the frigid lands of Yeador and other northern nations, they have an innate 40% resistance to natural cold.\nThis resistance doesn't apply to magic based cold.\nMatauru also are hardy folk with a +2 bonus to strength and endurance.\n They aren't fans of idle chatter, giving them a -5 to all persuasion checks and -1 to charisma.\n They additonally gain a +30 relation with anyone of Iylnaltic ethnic origin");
        }
        if (confirm == 2)
        {
          System.out.println("You have chosen not to play a Gree.");
        }
        else if (confirm !=1 && confirm !=2)
        {
          System.out.println("That is not a valid option.");
        }
      }
      if (breed == 2)
      {
        System.out.println("Are you sure of your choice? Enter 1 for yes or 2 for no.");
        confirm = raceSelect.nextInt();
        if (confirm == 1)
        {
          System.out.println("You have chosen a Szierca gree.\nThese gree are most common in the sourthern part of the continent Vedumai.\nThe countries there in are culturally rich and cosmpolitan, and these gree are just the same, gaining a +2 bonus to charisma and +1 to intelligence.\nBeing gree, they still have some innate qualities of their race, having a +1 to strength and endurance both.\nThe Szierca are typically regarded as being soft people pleasers even if it isn't true. For this, the suffer a -10 penalty to intimidation checks, but they gain a +10 bonush to persuasion and deception.\nGiven their history and culture, they have a +25 relation to people of Raeyan decent, +10 relation with nobility, and -20 relation with people from Imoryean cultures.");
        }
        if (confirm == 2)
        {
          System.out.println("You have chosen not to play a gree.");
        }
        else if (confirm !=1 && confirm !=2)
        {
          System.out.println("That is not a valid option.");
        }
      }
      if (breed == 3)
      {
        System.out.println("Are you sure of your choice? Enter 1 for yes or 2 for no.");
        confirm = raceSelect.nextInt();
        if (confirm == 1)
        {
          System.out.println("You have chosen the Alsumaz gree.\nGree of this breed are the result of interbreeding between Matauru or Szierca gree with the people of Estellesian cultures.\nAs with all gree, they are hardy and strong, gaining a +1 to endurance and +1 to strength. Their estellesian culture gives them another point in strength, but they have a penalty of -1 to agility.\nBeing prominent in the population of the Estellesian countries, people of Estellesian decent are comfortable around them, giving them a +25 relation with all Estellesian peoples.");
        }
        if (confirm == 2)
        {
          System.out.println("You have chosen not to play a gree.");
        }
        else if (confirm !=1 && confirm !=2)
        {
          System.out.println("That is not a valid option.");
        }
      }
      else if (breed != 1 && breed !=2 && breed !=3)
      {
        System.out.println("That is not a valid option.");
      }
    }
    System.out.println("");
    System.out.println("Etumeria is a dangerous place, and the fall of its national government doesn't help matters.\nMany have taken advantage of the country's loose border restrictions in this time of turmoil.\nThe land is rich with opportunity to make a fortune amidst the chaos, but there are just as many ways to die horribly.\nBrigands attack close to roads, monsters roam freely due to the lack of security, and dangerous magical anomalies are left unchecked.\nYou have come across a contract of employment from the Illiyaro d'Movarnise, one of Raeye's most prominent guilds.\nThe lure of wealth, knowledge, and other vices have brought many to Etumeria and you find yourself joining them for reasons only you know.");
  }
}