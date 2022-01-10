
// Major Project by Eric Germond
// *NOTE* Some parts of the program are not completely indented, as it would take up far too many lines, so it is only done for 
//The first few lines so the mechanics are easy to understand there.
//IF THIS ENDS UP BEING TOO LONG, TO RUN TRIM.
import java.math.*;
import java.util.Scanner;
public class MajorChoices {
	Player current = new Player(1);
	
	double ehp;
	double health;
	double stamina;
	double attack;
	double magic;
	
	public double PlayerAttack(double ehp, double stamina, double ohp, double atcktemp, double magictemp){
		
	     if (current.getWeapon() == 1)
	   {
	   
	   
	   if (current.getStamina() >= 2)
	   {
	   ehp = ehp - (Math.round(current.getMagic() / 2));
	   System.out.println("You brought the enemy down to " + ehp + " hp!");

	   current.setStamina(current.getStamina() - 2);
	   System.out.println("You did a basic attack, leaving you with " + current.getStamina() + "/" + stamina + " stamina.");
	   
	   }
	   
	   else if (current.getStamina() < 2)
	   {
	     System.out.println("You're out of stamina, you can't attack!");
	     }
	   
	     }
	   
	else if (current.getWeapon() == 2)
	{
	  
	  if (current.getStamina() >= 2)
	  {
	   ehp = ehp - (Math.round((ehp * 0.10) + current.getMagic()));
	   System.out.println("You brought the enemy down to " + ehp + " hp!");
	   
	
	  System.out.println(" ");
	   current.setStamina(current.getStamina() - 2);
	   System.out.println("You did a basic attack, leaving you with " + current.getStamina() + "/" + stamina + " stamina.");
	  }
	  
	  else if (current.getStamina() < 2)
	  {
	     System.out.println("You're out of stamina, you can't attack!");
	    
	  }
	}


	else if (current.getWeapon() == 3)
	{
	 
	  if (current.getStamina() >= 2)
	  {
	   int crit = (int) ((Math.random() * current.getCritChance()) + 1);
	   
	   if (crit == 1 || crit == current.getCritChance())
	   {
	   ehp = ehp - (current.getAttack()*2);
	   
	   System.out.println("Headshot! You brought the enemy down to " + ehp + " hp!");
	  
	   
	   current.setStamina(current.getStamina() - 2);
	   System.out.println("You did a basic attack, leaving you with " + current.getStamina() + "/" + stamina + " stamina.");
	   
	   }
	   
	   else
	   {
		  ehp = ehp - current.getAttack();
		  System.out.println("You brought the enemy down to " + ehp + " hp!");
	      
	     
	      current.setStamina(current.getStamina() - 2);
	      System.out.println("You did a basic attack, leaving you with " + current.getStamina() + "/" + stamina + " stamina.");
	   
	   }
	   
	  }
	  
	  else if (current.getStamina() < 2)
	  {
	     System.out.println("You're out of stamina, you can't attack!");
	    
	  }
	 
	}


	else if (current.getWeapon() == 4)
	 {
	  
	  if (current.getStamina() >= 2)
	  {
	  current.setAttack(current.getAttack() + 10);
	  System.out.println("Your attack increased, and went up to " + current.getAttack() + "/" + atcktemp + " attack");
	  current.setMagic(current.getMagic() + 10);
	  System.out.print("Your magic attack increased, and went up to " + current.getMagic() + "/" + magictemp + " magic.");
	  current.setHealth(current.getHealth() + 10);
	  System.out.println("Your hp has increased, and went up to " + current.getHealth() + "/" + ohp + " hp.");
	  ehp = ehp - (current.getAttack() + current.getMagic());
	  
	  
	  System.out.println("Bring the heat! You flame-punched the enemy down to " + ehp + " hp.");
	  
	   current.setStamina(current.getStamina() - 2);
	   System.out.println("You did a basic attack, leaving you with " + current.getStamina() + "/" + stamina + " stamina.");
	  }
	  
	  else if (current.getStamina() < 2)
	  {
	    System.out.println("You're out of stamina, you can't attack!");
	     
	  }
	  
	 }
	     return ehp;
	     
	  
	}
	
	
	public double Ultimate(double hp, double ehp, double stamina, double enemydamage){
		  if (current.getWeapon() == 1)
		   {
		   
		         if (current.getStamina() >= stamina)
		  {
		   current.setPetHealth(10);
		   System.out.println(" ");
		   
		   System.out.println("It's not over yet! You gave your pet encouragement, healing it up to " + current.getPetHealth() + "/" + 10 + " hp.");
		   System.out.println(" ");
		   
		   System.out.println("Wow, look at that damage! Just kidding, you did 0 damage to the enemy. Instead, you gave encouragement to your pet, healing it back to full hp.");
		   
		   System.out.println(" ");
		   
		   System.out.println("You may be disappointed, but you shouldnt be, because if your pet gives up, all of your stats ar heavily decreased. Make sure to use this every few turns!");
		   
		   System.out.println(" ");
		   
		   current.setStamina(0);
		   
		   System.out.println("You did a ultimate attack, leaving you with " + current.getStamina() + "/" + stamina + " stamina.");
		   
		                         }
		         
		         else if (current.getStamina() < stamina)
		         {
		        System.out.println(" ");  
		    System.out.println("You're out of stamina, you can't attack!");
		  
		     }
		         
		       
		       
		     }
		     
		else if (current.getWeapon() == 2)
		{
		  
		  if (current.getStamina() >= stamina)
		  {
		   current.setMagic(current.getMagic() + enemydamage);
		  
		   System.out.println(" ");
		   System.out.println("You used, Predators Carnival! You stole the enemies attack, and added it to yours for the rest of the fight. Your magic attack is now: " + current.getMagic() + "/" + magic);
		   current.setStamina(0);
		   System.out.println("You did an ultimate attack, leaving you with " + current.getStamina() + "/" + stamina + " stamina.");
		   
		 
		  }
		  
		  else if (current.getStamina() < stamina)
		         {
		    System.out.println(" ");
		    System.out.println("You're out of stamina, you can't attack!");
		    
		     
		     }
		  
		}

		else if (current.getWeapon() == 3)
		{
		  
		  if (current.getStamina() >= stamina)
		  {
		  current.setUltActivated(true);
		  System.out.println(" ");
		  System.out.println("You used, enhanced aim! Now you'll have a 50% chance to hit a critical hit for 4 turns!");
		  current.setCritChance(4);
		  current.setStamina(0);
		  
		}
		  
		  else if (current.getStamina() < stamina)
		         {
		           
		    System.out.println("You're out of stamina, you can't attack!");
		    
		     }
		  
		}
		  

		else if (current.getWeapon() == 4)
		{ 
		  current.setUltActivated(true);
		  System.out.println(" ");
		  if (current.getStamina() >= stamina)
		  {
		  current.setAttack(current.getAttack() + (current.getCountUp() * 10));
		  current.setMagic(current.getMagic() + (current.getCountUp() * 10));
		  
		  System.out.println("Going all out, you use, 'The One Above All'! All of the turns you stalled up are added to your attack and magic!");
		 
		  current.setStamina(0);
		  System.out.println(" ");
		  System.out.println("Your attack has went up to... " + current.getAttack() + "??!!");
		  System.out.println(" ");
		  System.out.println("Your magic attack has went up to... " + current.getMagic() + "??!!");
		  System.out.println(" ");
		  System.out.println("You did a ultimate attack, leaving you with " + current.getStamina() + "/" + stamina + " stamina.");
		  System.out.println(" ");
		  
		  
		  }
		  
		else if (current.getStamina() < stamina)
		         {
		           
		    System.out.println("You're out of stamina, you can't attack!");
		   
		     }
		   
		   }
		  
		  
		  return ehp;
		}
	
	
	public void UseItem(String itemName, double ohp,int slot){
		
		if (itemName == "Hppotion"){

			System.out.println(itemName); 

		    double checkOflow = current.getHealth() + 50;

		    if(checkOflow > ohp) {
		    	current.setHealth(current.getHealth() - (current.getHealth() - ohp));
		    }

		    else {
		    	current.setHealth(checkOflow);
		    }
		    
		    current.eraseInventoryItem(slot); //Makes sure that the used inventory slot string is deleted so they can not use the same item again.
		    System.out.println(" ");
		    System.out.println("You healed up to " + current.getHealth() + "/" + ohp + " hp! You will almost never go over your max hp, however there are some cases where it may.");
		}
		
		}
	
	

	

    public static void main(String args[]) {
    	MajorChoices startGame = new MajorChoices();
    	startGame.Game();
    }
    
    
    public void Game() {
    	 

double lvl = 1;

Scanner MyInput = new Scanner(System.in);
String praise, choice;
System.out.println("Welcome. This game will make no sense according to logic, and it is called 'Choices'.");
System.out.println(" ");
System.out.println("Just a note, Class 1's pets health decreases by 2 each turn, not 33%.");
System.out.println(" ");
System.out.print("You will start off with a class, and use that class while progressing it in order to defeat a certain amount of enemies.");
System.out.println(" ");
System.out.println(" Now, what is your name?");
String Name = MyInput.nextLine();
System.out.println(" ");
System.out.println("Welcome, " + Name + ". Now, you can't fight without weapons, right? That's why you get to take a chance, and get any of 3 classes." );

int multihits = 0; //These must be declared before the for statement so that the computer can process them.
//These will be explained in the code.

int conhits1 = 1;
int conhits = 0;
int conman = 0;
int gkarma = 0;
int bkarma = 0;
int mathinput = 0;
int mathme1 = 0;
int mathme2 = 0;
int polarshield = 0;
int healthup = 0;
int staminaup = 0;
int lvlup;
int bleed = 0;
int choiceaztec = 0;
int items;
int choicenum = 0;
int win = 0;
int xp = 0;
double ehptemp = 1;
double stamina = 4;
double edeftemp = 0;
double edamagetemp = 0;
double edamage = 0;
double ohp = current.getHealth();

double ehp = 1;
double edef = 1;

double money = 0;
double counta = 0;

double countUp = current.getCountUp();
double pettemp = current.getPetHealth();
double atcktemp = current.getAttack();
double deftemp = 0;
double staminatemp = current.getStamina();
double magictemp = current.getMagic();
double critChance = current.getCritChance();

current.setInventoryItem("Hppotion");

int index = 0;

while (index != 20)
{
  System.out.println(current.getItem(index));
  index += 1;
}


 //weapon = (int) (Math.random() * 4) + 1;
System.out.println(" ");

System.out.println("Hp: " + current.getHealth());
System.out.println("These are your health points, and they determine how many hits you can take from the enemy until you lose, so it is quite vital.");
System.out.println(" ");


System.out.println("Attack: " + current.getAttack());
 System.out.println("This is your attack, and it determines how much physical damage you will do to the enemy, which is one way to get out of a fight.");

System.out.println(" ");

 
 System.out.println("Magic: " + current.getMagic());
 System.out.println("This is your magic attack value, and it determines how much magical damage you will do to the enemy.");
 System.out.println(" ");
 

  stamina = 4;
 System.out.println("Stamina: " + current.getStamina());
  System.out.println("This is your Stamina value, and this is what you need to attack. Each attack consumes a certain amount. It regenerates each turn, and the regeneration can be modified by items.");
  System.out.println(" ");
  
if (current.getWeapon() == 1)
{
    
    
    System.out.println("Pet hp:" + current.getPetHealth());
    
    System.out.println("This is the hp of your unique pet, and healing it is your ability.");
    System.out.println("You got the class, Don't Die. This class is quite different than others as your statistics may be extremely high, however if you let your pet die...");
    System.out.println("then your stats are lowered drastically! To keep it alive, you must take the time to heal him before his hp goes to zero. Each turn, his hp will drop by 20%.");
  
  System.out.println(" ");
 System.out.println("This class attacks by (Magic /2). So keep that in mind as you upgrade things!");
 System.out.println(" ");
}


else if (current.getWeapon() == 2)
{
 
  System.out.println("Congratulations, you got the Shaman's Voodoo Doll! This minus' the enemies current hp by 10%, and plus your magic stat. This also gives you health back.");
  System.out.println("You use Magic to attack, so remember that when upgrading your statistics!");
}


else if (current.getWeapon() == 3)
{
   
  System.out.println("Congratulations, you got the class, Deadeye! This weapon allows you to have a 1/3 chance to hit a critical hit, otherwise you will do normal damage.");
  System.out.println("You also use Attack only and not magic, so keep that in mind!");
  System.out.println(" ");
}


else if (current.getWeapon() == 4)
{
  // Atck, hp, magic are increased every turn by a count.
  System.out.println("Congratulations, you got Weak To On Fleak! While the stats may seem low at first, as the battle goes on all of them will increase!");
  System.out.println("You use Magic + Attack to damage the enemy, keep that in mind when upgrading your statistics!");
  
  
}         

System.out.println("So, you like your class? Of course you do, so lets get you acquainted with it on this testing dummy.");

int turns = 0; //Amount of turns elapsed, used to determine when certain dialogues are shown.

int petlow = 0;
Enemy tutorial = new Enemy(150,20,1);

while (current.getHealth() > 0 && tutorial.getHealth() > 0) //The While statement runs while the users health as well as the enemies health are both above 0. 
{
   
  if (turns == 0) //This happens right away.
  {
    
  
  ohp = current.getHealth();
  ehp = tutorial.getHealth();
  pettemp = current.getPetHealth();
  ohp = current.getHealth();
  staminatemp = current.getStamina();
  atcktemp = current.getAttack();
  magictemp = current.getMagic();
  petlow = 0;
  
  System.out.println("Your enemy has " + ehp + " health, and " + tutorial.getAttack() + " attack. This means that you will have to do 150 damage to win, and take 20 damage per turn.");
  System.out.println(" ");
  System.out.println("There are four things you can do in a battle. First and foremost you can attack using your weapon, and lower the enemies hp. This however will lower your stamina value.");

  System.out.println(" ");
  System.out.println("On a similar note to attacking, you can use your ability which takes up more stamina than normal attacks, but can be much more useful.");
  System.out.println(" ");
  System.out.println("Thirdly, you can choose to stall and block the hit, taking half damage.");
  System.out.println(" ");
  System.out.println("Lastly, you can choose to use usable items from your inventory like potions for example.");
  System.out.println(" ");
  System.out.println("Now, lets try hitting the enemy. Try typing in 'a' to attack.");
 
  choice = MyInput.nextLine();
  
  
  if (choice.charAt(0) == 'a' || choice.charAt(0) == 'A')
  {
	  
	  tutorial.setHealth(PlayerAttack(tutorial.getHealth(), staminatemp,ohp,atcktemp,magictemp)); //Attack method, attack pattern determined by the users "weapon".
    
   if (current.getWeapon() == 1) //Class 1 needs to have it's pet's health decreased every turn.
   {
     
     if (current.getPetHealth() <= 0) //This checks whether or not Class 1's pettemp variable is less than or equal to 0.
     {
       if (petlow == 0) //This makes sure that the statistic changes can only happen once, by adding 1 to petlow.
       {
       current.setMagic(current.getMagic() - (Math.round(magictemp * 0.5)));
       current.setHealth(current.getHealth() - (Math.round(current.getHealth() * 0.3)));
       petlow ++;
       
     }
       System.out.println("Oh no! Your pet lost its encouragement, and so your powers have been greatly weakened.");
                                System.out.println(" ");
                                System.out.println("Your hp is now " + current.getHealth() + "/" + ohp + " and your magic is now " + current.getMagic() + ".");
   }
     
                                
     else {
   current.setPetHealth(current.getPetHealth() - 2); //Decreases by 2 each turn.
   System.out.println("Pet hp: " + current.getPetHealth()  + "/" + pettemp + ". This is the current hp of your pet, which drops by 20% each turn.");
     }
     
   System.out.println(" ");
   }
   
 
  if (tutorial.getHealth() > 0) //Enemy hits the player on turn 0 if they have more than 0 health.
  {
  current.setHealth(current.getHealth() - tutorial.getAttack());
  
  System.out.println("The enemy has just hit you, and brought you down to " + current.getHealth() + "/" + ohp + " hp.");
  System.out.println(" ");
  }
  turns ++;
  
  if(current.getWeapon() == 4) {
	  current.setCountUp(current.getCountUp() + 1);
  }
  
  }
  
  else if (choice.charAt(0) != 'a' && choice.charAt(0) != 'a') //Failsafe to make sure the user can not skip parts of the tutorial.
  {
    System.out.println("That is not valid.");
    
  }
 
  }
  
else if (turns == 1)
{
  System.out.println(" ");
  System.out.println("Ok, so you get how to attack now. Well lets do the opposite now. Try typing in 'b' or 'B' to defend.");
  choice = MyInput.nextLine();
  
   if (choice.charAt(0) == 'b' || choice.charAt(0) == 'B' )
  { //Class 1 and 4's mechanics still take place here.
	   
	   if (current.getWeapon() == 1)
	   {
	     
	     if (current.getPetHealth() <= 0) //This checks whether or not Class 1's pettemp variable is less than or equal to 0.
	     {
	       if (petlow == 0) //This makes sure that the statistic changes can only happen once, by adding 1 to petlow.
	       	{
	       current.setMagic(current.getMagic() - (Math.round(magictemp * 0.5)));
	       current.setHealth(current.getHealth() - (Math.round(current.getHealth() * 0.3)));
	       petlow ++;
	       
	       	}
	       System.out.println("Oh no! Your pet lost its encouragement, and so your powers have been greatly weakened.");
	       System.out.println(" ");
	       System.out.println("Your hp is now " + current.getHealth() + "/" + ohp + " and your magic is now " + current.getMagic() + ".");
	     }
	     
	                                
	     else {
	   current.setPetHealth(current.getPetHealth() - 2); //Decreases by 2 each turn.
	   System.out.println("Pet hp: " + current.getPetHealth()  + "/" + pettemp + ". This is the current hp of your pet, which drops by 20% each turn.");
	     	}
	     
	   System.out.println(" ");
	   
	   }
	   
     
    current.setHealth(current.getHealth() - (tutorial.getAttack() / 2));
    
    //The user takes half of the enemies current damage instead of full.
 
    //The user heals up 5% of their current health.
    System.out.println("You choose to tank the hit taking half damage, leaving you with " + current.getHealth() + "/" + ohp + " hp.");
    
    System.out.println(" ");
     current.setHealth(current.getHealth() + current.getHealth() * 0.05);
     
     
    System.out.println("However, you healed by 5% of your current hp, giving you " + current.getHealth() + "/" + ohp + " hp.");
    turns += 1;
    if(current.getWeapon() == 4) {
  	  current.setCountUp(current.getCountUp() + 1);
    }
}
   
   else if (choice.charAt(0) != 'b' && choice.charAt(0) != 'B')
  {
    System.out.println("That is not valid.");
    
  }
   
}
   else if (turns == 2) //turns starts at 0 and goes up by 1, so this is technically the third action.
   {
     System.out.println(" ");
     
    System.out.println("Well, so you know how to block. Cool. Now lets do the strongest attack, your ultimate ability! Type i 'u' or 'U' to activate this.");
    choice = MyInput.nextLine();
    
   if (choice.charAt(0) == 'u' || choice.charAt(0) == 'U')
   {
	   
	   
	   if (current.getWeapon() == 1)
	   {
	     
	     if (current.getPetHealth() <= 0) //This checks whether or not Class 1's pettemp variable is less than or equal to 0.
	     {
	       if (petlow == 0) //This makes sure that the statistic changes can only happen once, by adding 1 to petlow.
	       	{
	       current.setMagic(current.getMagic() - (Math.round(magictemp * 0.5)));
	       current.setHealth(current.getHealth() - (Math.round(current.getHealth() * 0.3)));
	       petlow ++;
	       
	       	}
	       System.out.println("Oh no! Your pet lost its encouragement, and so your powers have been greatly weakened.");
	       System.out.println(" ");
	       System.out.println("Your hp is now " + current.getHealth() + "/" + ohp + " and your magic is now " + current.getMagic() + ".");
	     }
	     
	                                
	     else {
	   current.setPetHealth(current.getPetHealth() - 2); //Decreases by 2 each turn.
	   System.out.println("Pet hp: " + current.getPetHealth()  + "/" + pettemp + ". This is the current hp of your pet, which drops by 20% each turn.");
	     	}
	     
	   System.out.println(" ");
	   
	   }
	   
	   if(current.getWeapon() == 2 || current.getWeapon() == 4) {
		   
	   }
	   
	tutorial.setHealth(Ultimate(ohp, tutorial.getHealth(), staminatemp, tutorial.getAttack()));
     
     
     
   current.setHealth(current.getHealth() - tutorial.getAttack());
   
   System.out.println("The enemy has just hit you, and brought you down to " + current.getHealth() + "/" + ohp + " hp.");
    
   turns += 1;
   if(current.getWeapon() == 4) {
		  current.setCountUp(current.getCountUp() + 1);
	  }
   
   }
   
   else if (choice.charAt(0) != 'u' && choice.charAt(0) != 'U') //Another example of the tutorial failsafe.
  {
     System.out.println(" ");
    System.out.println("That is not valid.");
    
  }
   
   }
   
   ////////BLOCKING
else if (turns == 3)
{ 
  
	if (current.getWeapon() == 1)
	   {
	     
	     if (current.getPetHealth() <= 0) //This checks whether or not Class 1's pettemp variable is less than or equal to 0.
	     {
	       if (petlow == 0) //This makes sure that the statistic changes can only happen once, by adding 1 to petlow.
	       	{
	       current.setMagic(current.getMagic() - (Math.round(magictemp * 0.5)));
	       current.setHealth(current.getHealth() - (Math.round(current.getHealth() * 0.3)));
	       petlow ++;
	       
	       	}
	       System.out.println("Oh no! Your pet lost its encouragement, and so your powers have been greatly weakened.");
	       System.out.println(" ");
	       System.out.println("Your hp is now " + current.getHealth() + "/" + ohp + " and your magic is now " + current.getMagic() + ".");
	     }
	    
	     
	   System.out.println(" ");
	   
	   }
  
  System.out.println(" ");
  System.out.println("Alright, now you know the basics of fighting. Well, you know what they say, always bring a gun to a knife fight.");
  
  System.out.println("By that I mean using items of course. These can be anything from battle items like potions and other buffs, or out of fight items like keys.");
  
  System.out.println(" ");
  System.out.println("So, lets try using your inventory. Each slot of your inventory contains a certain item, which is an array for all of you tech lovers.");
  
  System.out.println(" ");
  System.out.println("Try typing in 'i' or 'I' to open up and display your inventory.");
  
  choice = MyInput.nextLine();
  
  if (choice.charAt(0) == 'i' || choice.charAt(0) == 'I') // *NOTE* This version of the inventory system is not correct and only works for the tutorial, look to the actual game to see a well made version.
  {
	  
   for(int indexTut = 0; indexTut < 20; indexTut ++) {
	   System.out.println(current.getItem(indexTut));
   }

   
    System.out.println(" ");
    System.out.println("Wow, you have so many items. Ha, just kidding, but I hope you enjoy the potion though."); //Slot 0 displays "Hpotion", given at start of game.
    System.out.println("Try using it now, by entering the array slot the item you have is on, which is zero."); //Enter in 0 in order to access slot 0 of the array.
    
    choicenum = MyInput.nextInt(); //Similar to the choice string, but used for numbers instead.
   
    String item = current.getItem(choicenum);
    if(item != "That is not a valid slot in your inventory.") {
    UseItem(current.getItem(choicenum),ohp,choicenum);
    }
   
    turns += 1;
    
    if(current.getWeapon() == 4) {
  	  current.setCountUp(current.getCountUp() + 1);
    }
    
    if(current.getWeapon() == 3 || current.getWeapon() == 4) {
    	current.setUltCount(current.getUltCount() + 1);
    }
    
    /////////////////////////////////////////////////////////////////////////////// INVENTORY
   }
  
  else if (choice.charAt(0) != 'i' && choice.charAt(0) != 'I')
  {
    System.out.println("That is not valid.");
    
  }
  
  }


else if (turns > 3) //Now, the user finishes the battle on their own.
{
	
	if (current.getWeapon() == 1)
	   {
	     
	     if (current.getPetHealth() <= 0) //This checks whether or not Class 1's pettemp variable is less than or equal to 0.
	     {
	       if (petlow == 0) //This makes sure that the statistic changes can only happen once, by adding 1 to petlow.
	       	{
	       current.setMagic(current.getMagic() - (Math.round(magictemp * 0.5)));
	       current.setHealth(current.getHealth() - (Math.round(current.getHealth() * 0.3)));
	       petlow ++;
	       
	       	}
	       System.out.println("Oh no! Your pet lost its encouragement, and so your powers have been greatly weakened.");
	       System.out.println(" ");
	       System.out.println("Your hp is now " + current.getHealth() + "/" + ohp + " and your magic is now " + current.getMagic() + ".");
	     }
	     
	                                
	     else {
	   current.setPetHealth(current.getPetHealth() - 2); //Decreases by 2 each turn.
	   System.out.println("Pet hp: " + current.getPetHealth()  + "/" + pettemp + ". This is the current hp of your pet, which drops by 20% each turn.");
	     	}
	     
	   System.out.println(" ");
	   
	   }
	
	if(current.getWeapon() == 3 && current.getUltActivated() == true) {
		  if(current.getUltCount() == 4) {
			  System.out.println("Ultimate has ended.");
			  current.setUltActivated(false);
			  current.setUltCount(0);
			  current.setCritChance(6);
		  }
		  
		  else {
			  current.setUltCount(current.getUltCount() + 1);
			}
	  }
	
	
	if(current.getWeapon() == 4 && current.getUltActivated() == true) {
		if(current.getUltCount() == 3) {
			System.out.println("Your powers have been reset to their original weak levels.");
			current.setUltActivated(false);
			current.setUltCount(0);
			current.setAttack(atcktemp);
			current.setMagic(magictemp);
			current.setHealth(ohp);
		}
		
		else {
		  current.setUltCount(current.getUltCount() + 1);
		}
	}
	
 
  System.out.println(" ");
  System.out.println("Well, that's about it for the basics of the game. Now, using all you have learned, finish off the enemy!");
  System.out.println(" ");
  System.out.println(" ");
  System.out.println("Would you like to 'a'ttack, 'b'lock, use an 'u'ltimate ability, or use an item from your 'i'nventory?");
    System.out.println(" ");
    System.out.println(Name + ": Hp - " + current.getHealth() + "/" + ohp + " Stamina - " + current.getStamina() + "/" + staminatemp + " Attack - " + current.getAttack() + "Magic Attack - " + current.getMagic());
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("Enemy: Hp - " + tutorial.getHealth() + "/" + ehp + " Attack - " + tutorial.getAttack());
    
    
    choice = MyInput.nextLine();
  
    System.out.println(" ");
  
    choice = MyInput.nextLine();
   
  
  
  if (choice.charAt(0) == 'a' || choice.charAt(0) == 'A')
  {

  tutorial.setHealth(PlayerAttack(tutorial.getHealth(),staminatemp,ohp,atcktemp,magictemp));
  if(tutorial.getHealth() <= 0) {
 	 win = 1;
 	 break;
  }
  
  current.setHealth(current.getHealth() - tutorial.getAttack());
  System.out.println("The enemy brought you down to " + current.getHealth() + " hp!");
  
  }
  
  
   else if (choice.charAt(0) == 'b' || choice.charAt(0) == 'B' )
  {
     
	   current.setHealth(current.getHealth() - (tutorial.getAttack() / 2));
	   
	    System.out.println("You choose to tank the hit taking half damage, leaving you with " + current.getHealth() + "/" + ohp + " hp.");
	    
	    System.out.println(" ");
	     current.setHealth(current.getHealth() + current.getHealth() * 0.05);
	     
	     
	    System.out.println("However, you healed by 5% of your current hp, giving you " + current.getHealth() + "/" + ohp + " hp.");
    
}
   
 else if (choice.charAt(0) == 'u' || choice.charAt(0) == 'U')
   
   {
     tutorial.setHealth(Ultimate(ohp, tutorial.getHealth(), staminatemp, tutorial.getAttack()));
     if(tutorial.getHealth() <= 0) {
    	 win = 1;
    	 break;
     }
     
     current.setHealth(current.getHealth() - tutorial.getAttack());
     System.out.println("The enemy brought you down to " + current.getHealth() + " hp!");
   
   }
 
 else 
 {
   
   System.out.println("Your inventory has no items, or the letter you typed in is invalid. Please try again.");
   if(current.getWeapon() == 1 && current.getPetHealth() != pettemp) {
   current.setPetHealth(current.getPetHealth() + 2);
}
   
   else if(current.getWeapon() == 4) {
	   current.setCountUp(current.getCountUp() - 1);
   }
   
   current.setStamina(current.getStamina() - 1);
 
}
  
  if(current.getWeapon() == 4) {
	   current.setCountUp(current.getCountUp() + 1);
   }
   
  
   
  }
  
  if (current.getStamina() != stamina) //Increases stamina once a turn.
  {
  current.setStamina(current.getStamina() + 1);
  }
  
  
}


 if(current.getHealth() > 0) {
	 win = 1;
 }

if (win == 1)
 {
   System.out.println(" ");
   System.out.println("You win! I hope you feel good after that first fight, since there is going to be many more of course.");
   current.setAttack(atcktemp);
   current.setMagic(magictemp);
   current.setStamina(staminatemp);
   current.setHealth(ohp);
   
   if(current.getWeapon() == 1) {
	   current.setPetHealth(pettemp);
   }
   
   if(current.getWeapon() == 4) {
	   current.setCountUp(0);
   }
   
   current.setUltCount(0);
   current.setUltActivated(false);
   
 }
 
 else if (win != 1)
 {
   System.out.println(" ");
   System.out.println("Really... You died on the tutorial?");
   
 }

 
 System.out.println(" ");
 System.out.println(" ");
  System.out.println(" ");
  System.out.println(" ");
  System.out.println(" ");
  System.out.println(" ");
  
  System.out.println("Well, I think it's about time you actually go out. You're probably wondering, what's the point of this random adventure?");
  System.out.println("You'll find out eventually, and you'll determine it as well. For now, just do what you please, and don't die. So, have fun, " + Name + " !");
  
  
  if (win == 1) //The user must win the tutorial for win to equal 1.
  {
  for (int gametime = 0; gametime < 10; gametime ++) // This is what starts the entire game, and it is on a loop to make it simpler in some aspects
  {
  
    
    if (gametime == 0) // This event will happen if the player has not done any levels yet, other than the tutorial
    {
      current.setGameLevel(0);
  System.out.println("Level 1: The Jungle");
 System.out.println(" ");
 System.out.println(Name + " is kicked out of the training room, and it turns out that they were in a plane the entire time, and so they are now falling from thousands of feet in the air.");
 
 if (current.getWeapon() == 1) //There a four different dialogue options here, which each of them differ depending on what the users class is.
 {
   System.out.println("Having the composure that " + Name + " grew up with, this does not faze them and they casually fall with their arms crossed, holding their pet as they wait to hit the ground as they know they will be unharmed.");
 }
 
 else if (current.getWeapon() == 2)
 {
   System.out.println(Name + " is panicked at first, but they end up remaining semi-coolheaded and start to fall stomach first to slow their speed.");
 }
 
 else if (current.getWeapon() == 3)
 {
   System.out.println(Name + " smirks to themselves as their face is scrunched up due to the high pressure.");
 }
 
 else if (current.getWeapon() == 4)
 {
   System.out.println(Name + " starts screaming immediatly, tears flying out of their eyes as they yell incoherent nonsense.");
 } 
 
 System.out.println(" ");
 System.out.println("Finally, " + Name + " lands on the ground safely after passing through some tree leaves.");
 System.out.println(Name + " looks around, and they come to the conclusion that they are in a jungle.");
 
 
 ehptemp = ehp;
 Enemy Lion = new Enemy(250,30,0);
 ehptemp = Lion.getHealth();
 edamage = 30;
 ohp = current.getHealth();
 turns = 0;
 
  
  pettemp = current.getPetHealth();
  staminatemp = current.getStamina();
  atcktemp = current.getAttack();
  magictemp = current.getMagic();
 
  
 
    
    if (turns == 0)
    {
      
      if (current.getWeapon() == 2 || current.getWeapon() == 4)
      {
        System.out.println(Name + " is still complaining to themselves, but suddenly they stop when they hear something with the sensitive ears.");
        System.out.println(Name + "'s hunch was right, as suddenly a lion comes out of nowhere and jumps at them. Having time to react, they jump back and avoid the hit.");
        
  
 
}
      
       else if (current.getWeapon() == 1 || current.getWeapon() == 3)
      {
        System.out.println(Name + " is still complaining to themselves, when suddenly out of nowhere a lion jumps out of the brush, ambushing and hitting them.");
      
  
  
  current.setHealth(current.getHealth() - 10);
  System.out.println(Name + " is damaged, and so their health went down to " + current.getHealth() + "/" + ohp + ".");
  
      }
       
    } 
      
      
    System.out.println(" ");
    System.out.println("Battle Begin!");
    
     
  
  while (current.getHealth() > 0 && Lion.getHealth() > 0)
  {
	  
	  if (current.getWeapon() == 1)
	   {
	     
	     if (current.getPetHealth() <= 0) //This checks whether or not Class 1's pettemp variable is less than or equal to 0.
	     {
	       if (petlow == 0) //This makes sure that the statistic changes can only happen once, by adding 1 to petlow.
	       	{
	       current.setMagic(current.getMagic() - (Math.round(magictemp * 0.5)));
	       current.setHealth(current.getHealth() - (Math.round(current.getHealth() * 0.3)));
	       petlow ++;
	       
	       	}
	       System.out.println("Oh no! Your pet lost its encouragement, and so your powers have been greatly weakened.");
	       System.out.println(" ");
	       System.out.println("Your hp is now " + current.getHealth() + "/" + ohp + " and your magic is now " + current.getMagic() + ".");
	     }
	     
	                                
	     else {
	   current.setPetHealth(current.getPetHealth() - 2); //Decreases by 2 each turn.
	   System.out.println("Pet hp: " + current.getPetHealth()  + "/" + pettemp + ". This is the current hp of your pet, which drops by 20% each turn.");
	     	}
	     
	   System.out.println(" ");
	   
	   }
	
	if(current.getWeapon() == 3 && current.getUltActivated() == true) {
		  if(current.getUltCount() == 4) {
			  System.out.println("Ultimate has ended.");
			  current.setUltActivated(false);
			  current.setUltCount(0);
			  current.setCritChance(6);
		  }
		  
		  else {
			  current.setUltCount(current.getUltCount() + 1);
			}
	  }
	
	
	if(current.getWeapon() == 4 && current.getUltActivated() == true) {
		if(current.getUltCount() == 3) {
			System.out.println("Your powers have been reset to their original weak levels.");
			current.setUltActivated(false);
			current.setUltCount(0);
			current.setAttack(atcktemp);
			current.setMagic(magictemp);
			current.setHealth(ohp);
		}
		
		else {
		  current.setUltCount(current.getUltCount() + 1);
		}
	}
	
    
    
    System.out.println("Would you like to 'a'ttack, 'b'lock, use an 'u'ltimate ability, or use an item from your 'i'nventory?");
    System.out.println(" ");
    System.out.println(Name + ": Hp - " + current.getHealth() + "/" + ohp + " Stamina - " + current.getStamina() + "/" + staminatemp + " Attack - " + current.getAttack() + "Magic Attack - " + current.getMagic());
    System.out.println(" ");
    
    if(current.getWeapon() == 1) {
    	System.out.println("Pet hp: " + current.getPetHealth() + "/" + pettemp);
    }
    
    System.out.println(" ");
    System.out.println("Lion: Hp - " + Lion.getHealth() + "/" + ehptemp + " Attack - " + Lion.getAttack());
    
    
    choice = MyInput.nextLine();
  
    System.out.println(" ");
  
    choice = MyInput.nextLine();
   
  
  
  if (choice.charAt(0) == 'a' || choice.charAt(0) == 'A')
  {

  Lion.setHealth(PlayerAttack(Lion.getHealth(),staminatemp,ohp,atcktemp,magictemp));
  if(Lion.getHealth() <= 0) {
 	 win = 1;
 	 break;
  }
  
  current.setHealth(current.getHealth() - Lion.getAttack());
  System.out.println("The Lion hit you and brought you down to " + current.getHealth() + " hp!");
  
  }
  
  
   else if (choice.charAt(0) == 'b' || choice.charAt(0) == 'B' )
  {
     
	   current.setHealth(current.getHealth() - (Lion.getAttack() / 2));
	   
	    System.out.println("You choose to tank the hit taking half damage, leaving you with " + current.getHealth() + "/" + ohp + " hp.");
	    
	    System.out.println(" ");
	     current.setHealth(current.getHealth() + current.getHealth() * 0.05);
	     
	     
	    System.out.println("However, you healed by 5% of your current hp, giving you " + current.getHealth() + "/" + ohp + " hp.");
    
}
   
 else if (choice.charAt(0) == 'u' || choice.charAt(0) == 'U')
   
   {
     Lion.setHealth(Ultimate(ohp, Lion.getHealth(), staminatemp, Lion.getAttack()));
     if(Lion.getHealth() <= 0) {
    	 win = 1;
    	 break;
     }
     
     current.setHealth(current.getHealth() - Lion.getAttack());
     System.out.println("The Lion hit you and brought you down to " + current.getHealth() + " hp!");
   
   }
 
 else 
 {
   
   System.out.println("Your inventory has no items, or the letter you typed in is invalid. Please try again.");
   
   if(current.getWeapon() == 1 && current.getPetHealth() != pettemp) {
   current.setPetHealth(current.getPetHealth() + 2);
}
   
   else if(current.getWeapon() == 4) {
	   current.setCountUp(current.getCountUp() - 1);
   }
   
   current.setStamina(current.getStamina() - 1);
 
}
  
  if(current.getWeapon() == 4) {
	   current.setCountUp(current.getCountUp() + 1);
   }
   
  
   
  
  
  if (current.getStamina() != stamina) //Increases stamina once a turn.
  {
  current.setStamina(current.getStamina() + 1);
  }
  
  }
  
  
  
   if (current.getHealth() > 0 && Lion.getHealth() <= 0) //This is the option for if the user wins the fight.
 {
   System.out.println(" ");
   System.out.println("You win! I hope you feel good after that first fight, since there is going to be many more of course.");
  System.out.println("The enemy lays on ground, too weak to stand up. It could always come back to attack you later, so do you choose to kill it, or let it escape?");
  System.out.println("Type in 's' to spare the lion, or 'k' to finish it off.");
  choice = MyInput.nextLine();
  
  current.setAttack(atcktemp);
  current.setHealth(ohp);
  current.setMagic(magictemp);
  current.setStamina(staminatemp);
  if(current.getWeapon() == 1) {
	  current.setPetHealth(10);
  }
  
  if (choice.charAt(0) == 's' || choice.charAt(0) == 'S') //The user can choose to kill the enemy, or spare them.
  {
    current.setKarma(current.getKarma() + 1);
    System.out.println("You choose to let the lion live and walk away.");
    System.out.println(" ");
  }
  
  
  else if(choice.charAt(0) == 'k' || choice.charAt(0) == 'K') {
	  current.setKarma(current.getKarma() - 1);
	  System.out.println("You choose to kill the lion, and move on.");
	  System.out.println(" ");
  }
    
    System.out.println("After you beat every mission, you will receive experience, which allows you to level up, and by leveling up you can increase your statistics.");
    System.out.println("You gained 10 experience points!");
    current.setExp(10);
  
     //The user gains 10 experience, and levels up because it is equal to 10.
   
    
  }
  

   
   
 else if (Lion.getHealth() > 0 && current.getHealth() <= 0) //This is what ends the game.
 {
   System.out.println(" ");
   System.out.println("Really... You died.");
   break;
 }
   
    }
    
    
  
    else if (gametime == 1)
    {
      System.out.println(" ");
      System.out.println(" ");
      System.out.println(" ");
      System.out.println(" ");
      System.out.println(" ");
      System.out.println("Level 2: Tick Tock");
      System.out.println(" ");
      System.out.println(Name + " follows a path in the jungle after defeating the lion, and they stop when they notice a peculiar rock on the ground.");
      System.out.println(Name + " decides to walk up to it, only for it to suddenly open an eye that stares directly at them.");
      turns = 0;
      Enemy Rock = new Enemy(200,15,2);
     
      if (turns == 0)
      {
      
      
      ehp = Rock.getHealth();
      
     
      
      ohp = current.getHealth();
      pettemp = current.getPetHealth();
      staminatemp = current.getStamina();
      atcktemp = current.getAttack();
      magictemp = current.getMagic();
  
      if (current.getWeapon() == 1)
      {
        System.out.println("Without hesitation, on reflex " + Name + " kicks the rock away.");
        Rock.setHealth(Rock.getHealth() - 20);
        System.out.println("This brings the strange rock down to " + Rock.getHealth() + "/" + ehp + " hp.");
        System.out.println("'Ow! How dare you hit me!' The rock says, which only makes " + Name + "s head tilt in confusion.");
      }
      
      else if (current.getWeapon() == 2 || current.getWeapon() == 3 || current.getWeapon() == 4)
      {
        System.out.println(Name + " quickly backs up in panic.");
        System.out.println(" 'Ha! You didnt expect me to be here did you!' The rock says.");
      }
     
      System.out.println("Well, 'he' gave me orders to defeat you, so that's what I'm gonna do! Since I'm so strong, I'll give you a little helping hand. If you let 3 turns pass by... Who knows what'll happen!");
      System.out.println(" ");
      System.out.println("Battle begin!");
      }
      
      
      while (current.getHealth() > 0 && Rock.getHealth() > 0)
      {
    	  
    	  
    	  if (current.getWeapon() == 1)
   	   {
   	     
   	     if (current.getPetHealth() <= 0) //This checks whether or not Class 1's pettemp variable is less than or equal to 0.
   	     {
   	       if (petlow == 0) //This makes sure that the statistic changes can only happen once, by adding 1 to petlow.
   	       	{
   	       current.setMagic(current.getMagic() - (Math.round(magictemp * 0.5)));
   	       current.setHealth(current.getHealth() - (Math.round(current.getHealth() * 0.3)));
   	       petlow ++;
   	       
   	       	}
   	       System.out.println("Oh no! Your pet lost its encouragement, and so your powers have been greatly weakened.");
   	       System.out.println(" ");
   	       System.out.println("Your hp is now " + current.getHealth() + "/" + ohp + " and your magic is now " + current.getMagic() + ".");
   	     }
   	     
   	                                
   	     else {
   	   current.setPetHealth(current.getPetHealth() - 2); //Decreases by 2 each turn.
   	   System.out.println("Pet hp: " + current.getPetHealth()  + "/" + pettemp + ". This is the current hp of your pet, which drops by 20% each turn.");
   	     	}
   	     
   	   System.out.println(" ");
   	   
   	   }
   	
   	if(current.getWeapon() == 3 && current.getUltActivated() == true) {
   		  if(current.getUltCount() == 4) {
   			  System.out.println("Ultimate has ended.");
   			  current.setUltActivated(false);
   			  current.setUltCount(0);
   			  current.setCritChance(6);
   		  }
   		  
   		  else {
   			  current.setUltCount(current.getUltCount() + 1);
   			}
   	  }
   	
   	
   	if(current.getWeapon() == 4 && current.getUltActivated() == true) {
   		if(current.getUltCount() == 3) {
   			System.out.println("Your powers have been reset to their original weak levels.");
   			current.setUltActivated(false);
   			current.setUltCount(0);
   			current.setAttack(atcktemp);
   			current.setMagic(magictemp);
   			current.setHealth(ohp);
   		}
   		
   		else {
   		  current.setUltCount(current.getUltCount() + 1);
   		}
   	}
   	
   	
        System.out.println("Tick Tock Tick Tock! It's turn " + turns+ "!");
    System.out.println(" ");
     System.out.println("Would you like to 'a'ttack, 'b'lock, use an 'u'ltimate ability, or use an item from your 'i'nventory?");
    System.out.println(" ");
    System.out.println(Name + ": Hp - " + current.getHealth() + "/" + ohp + " Stamina - " + current.getStamina() + "/" + staminatemp + " Attack - " + current.getAttack() + "Magic Attack - " + current.getMagic());
    System.out.println(" ");
    if(current.getWeapon() == 1) {
    	System.out.println("Pet hp: " + current.getPetHealth() + "/" + pettemp);
    }
    System.out.println(" ");
    System.out.println("Rock: Hp - " + Rock.getHealth() + "/" + ehp + " Attack - " + edamage);
   
    choice = MyInput.nextLine();
  
 
   
   
    
    
    
  
    System.out.println(" ");
  
    choice = MyInput.nextLine();
   
  
  
  if (choice.charAt(0) == 'a' || choice.charAt(0) == 'A')
  {

  Rock.setHealth(PlayerAttack(Rock.getHealth(),staminatemp,ohp,atcktemp,magictemp));
  if(Rock.getHealth() <= 0) {
 	 win = 1;
 	 break;
  }
  
  if(turns != 3) {
  current.setHealth(current.getHealth() - Rock.getAttack());
  }
  else {
	current.setHealth(-999);
	System.out.println("KABOOM!");
  }
  System.out.println("The Rock hit you and brought you down to " + current.getHealth() + " hp!");
  
  }
  
  
   else if (choice.charAt(0) == 'b' || choice.charAt(0) == 'B' )
  {
       if(turns != 3) {
	   current.setHealth(current.getHealth() - (Rock.getAttack() / 2));
        }
       
       else {
    	current.setHealth(-500);
    	System.out.println("KABOOM!");
       }
       
	    System.out.println("You choose to tank the hit taking half damage, leaving you with " + current.getHealth() + "/" + ohp + " hp.");
	    
	    System.out.println(" ");
	     current.setHealth(current.getHealth() + current.getHealth() * 0.05);
	     
	     
	    System.out.println("However, you healed by 5% of your current hp, giving you " + current.getHealth() + "/" + ohp + " hp.");
    
}
   
 else if (choice.charAt(0) == 'u' || choice.charAt(0) == 'U')
   
   {
     Rock.setHealth(Ultimate(ohp,Rock.getHealth(), staminatemp, Rock.getAttack()));
     if(Rock.getHealth() <= 0) {
    	 win = 1;
    	 break;
     }
     
     if(turns != 3) {
     current.setHealth(current.getHealth() - Rock.getAttack());
     }
     
     else {
     current.setHealth(-999);
     System.out.println("KABOOM!");
     }
     System.out.println("The Rock hit you and brought you down to " + current.getHealth() + " hp!");
   
   }
 
 else 
 {
   
   System.out.println("Your inventory has no items, or the letter you typed in is invalid. Please try again.");
   
   if(current.getWeapon() == 1 && current.getPetHealth() != pettemp) {
   current.setPetHealth(current.getPetHealth() + 2);
}
   
   else if(current.getWeapon() == 4) {
	   current.setCountUp(current.getCountUp() - 1);
   }
   
   current.setStamina(current.getStamina() - 1);
 
}
  
  if(current.getWeapon() == 4) {
	   current.setCountUp(current.getCountUp() + 1);
   }
   
  
   
  
  
  if (current.getStamina() != stamina) //Increases stamina once a turn.
  {
  current.setStamina(current.getStamina() + 1);
  }
  
   turns ++;
  }
      
      
      
   if (current.getHealth() > 0 && Rock.getHealth() <= 0)
 {
   System.out.println(" ");
   System.out.println("You win!");
   System.out.println(" 'Tsk... I guess giving you that hint wasn't an explosive idea after all... Well what are you waiting for?' The Rock says.");
  System.out.println("The rock lays on ground, too weak to stand up. It could always come back to attack you later, so do you choose to kill it, or let it escape?");
  System.out.println("Type in 's' to spare it, or 'k' to finish it off.");
  choice = MyInput.nextLine();
  
  current.setAttack(atcktemp);
  current.setHealth(ohp);
  current.setMagic(magictemp);
  current.setStamina(staminatemp);
  
  if (choice.charAt(0) == 's' || choice.charAt(0) == 'S') //The user can choose to kill the enemy, or spare them.
  {
    current.setKarma(current.getKarma() + 1);
    System.out.println(" 'What?! Haha! HAHAHA! You're letting me live?!' He laughs.");
    System.out.println("You choose to let The Rock live and walk away.");
    
    System.out.println(" ");
  }
  
  
  else if(choice.charAt(0) == 'k' || choice.charAt(0) == 'K') {
	  current.setKarma(current.getKarma() - 1);
	  System.out.println("You choose to kill The Rock, and move on.");
	  System.out.println(" ");
  }
    
  
    System.out.println("You gained 10 experience points!");
    current.setExp(10);
 }
   
 else if (Rock.getHealth() > 0 && current.getHealth() <= 0)
 {
   System.out.println(" ");
   System.out.println("Really... You died.");
    win = 0;
 }
 
    }
    /*
    
   else if (gametime == 2)
   {
     System.out.println(" "); 
     System.out.println(" ");
     System.out.println(" ");
     System.out.println(" ");
     System.out.println(" ");
     System.out.println(" ");
     System.out.println("Well, I guess it's time you learned about the final aspect of this game. That is of course, buying items.");
     
     System.out.println("Last fight, you got 100 gold. So, lets spend it!");
     
     System.out.println(" "); //The user will choose a number cooresponding to the item they would like to buy.
     
     System.out.println("Item 1: Hpotion: Heals your Health by 50 points, 150 Gold");
     
     System.out.println("Item 2: AttackUp: Boosts your attack for a fight by 20 points, 150 Gold");
     
     System.out.println("Item 3: StaminaUp: Recovers your stamina by 4 points, 150 Gold");
     
     System.out.println("Item 4: MagicUp: Boosts your magic attack by 20, 150 Gold");
     System.out.println("Wow, look at all those items! Now, I'll be nice and chip in 50 Gold for you, so think carefully and choose one of these items!");
     money = money + 50;
     
     if (money >= 150) //Makes it so that the user can only purchase an item if they have enough funds.
     {
      choicenum = MyInput.nextInt();
      cnn = 0;
      
     if (choicenum == 1) //choicenum determines what item the user has chosen to buy.
     {
       
       while (cnn != 20) //This while statement finds the first slot that is empty,and it fills that spot with the designated item.
       { 
         if (inventory[cnn] == "")
         {
           if (cnn != 19) //Makes it so that only one slot is filled and not the last as well.
           {
             
           inventory[cnn] = "Hpotion"; //Fills the slot with the choosen option.
           System.out.println("Inventory slot " + cnn + ": " + inventory[cnn]);
           cnn = 19; //This will make it so that this stops the if statement.
           System.out.println("Well, I hope you enjoy your brand new item! The shop will open every few levels, and each time there may be more powerful goods for you to buy.");
           }
         
           
}
   cnn ++; //This is what cycles through the slots.
}
     }
     else if (choicenum == 2)
     {
       while (cnn != 20)
       {
         if (inventory[cnn] == "")
         {
           if (cnn != 19)
           {
             
           inventory[cnn] = "AttackUp";
           System.out.println("Inventory slot " + cnn + ": " + inventory[cnn]);
         System.out.println("Well, I hope you enjoy your brand new item! The shop will open every few levels, and each time there may be more powerful goods for you to buy.");
             
           cnn = 19;
           }
                           
}
cnn ++; 
       
}
     }
      if (choicenum == 3)
     {
       while (cnn != 20)
       {
         
         if (inventory[cnn] == "")
         {
           if (cnn != 19)
           {
             
           inventory[cnn] = "StaminaUp";
           System.out.println("Inventory slot " + cnn + ": " + inventory[cnn]);
           System.out.println("Well, I hope you enjoy your brand new item! The shop will open every few levels, and each time there may be more powerful goods for you to buy.");
           
           cnn = 19;
           }
         
                               
}
cnn ++;
       
}
      }
      else if (choicenum == 4)
      {
        while (cnn != 20)
       {
         if (inventory[cnn] == "")
         {
           if (cnn != 19)
           {
             
           inventory[cnn] = "MagicUp";
           System.out.println("Inventory slot " + cnn + ": " + inventory[cnn]);
         System.out.println("Well, I hope you enjoy your brand new item! The shop will open every few levels, and each time there may be more powerful goods for you to buy.");
             
           cnn = 19;
           }
                           
}
cnn ++; 
      }
      }
      
      win = 1;
      money = money - 150;
     }
   }
    
   else if (gametime == 3)
   {
     System.out.println(" ");
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");
System.out.println("Level 3: The Temple");
System.out.println(" ");
System.out.println("After defeating the strange rock, " + Name + " continues on the path they found, and end up at a strange temple.");
if (weapon == 4 || weapon == 3)
{
  System.out.println(Name + " walks into the Temple, and ever since that last fight they have not been in the greatest mood, and so they walk onto one path, not noticing the other one beside it.");
  choiceaztec = 1;
  System.out.println(choicenum);
    }
else if (weapon == 1 || weapon == 2)//The users class determines what action the character takes based on their personality.
{
  System.out.println(Name + " walks into the temple, and upon entering they notice 2 paths in front of them.");
  System.out.println(Name + " notices that one of the paths looks calmer, with a simple smooth rock design.");
  System.out.println(Name + " also notices that the path next to it has a much rougher pattern, and looks much more intimidating.");
  System.out.println(Name + " thinks to themselves, 'Hm... In video games, don't the harder things give you better loot?' ");
  System.out.println("Type in '1' to go on the easier path, or '2' for the harder path.");
  choiceaztec = MyInput.nextInt();
  if (choiceaztec == 1)
  {
    System.out.println(Name + " decides to take the easier path, better safe than sorry.");
}
  else if (choiceaztec == 2)
  {
    System.out.println(Name + " decides to take the harder path, what is this Weenie Hut Junior?");
}
      }
if (choiceaztec == 1) //Depending on the difficulty the user faces, the enemies statistics will differ.
    {
      ehp = 210;
   ehptemp = ehp;
  
   edamage = 30; //Easy
   bleed = 10; //The damage the user will take every other turn.
    }
    else if (choiceaztec == 2) 
    {
      ehp = 220;
   ehptemp = ehp;
  
   edamage = 30; //Hard
   bleed = 20;
    }
  hp = ohp;
  pettemp = pet;
  
  staminatemp = stamina;
  atcktemp = atck;
  magictemp = magic;
  petlow = 0;
 while (hp > 0 && ehptemp > 0)
{
   
  if (countme == 0)
  {
    if (choiceaztec == 1)
    {
      ehp = 190;
   ehptemp = ehp;
  
   edamage = 20;
   bleed = 10;
    }
    else if (choiceaztec == 2)
    {
      ehp = 200;
   ehptemp = ehp;
  
   edamage = 20;
   bleed = 20;
    }
  hp = ohp;
  pettemp = pet;
  
  staminatemp = stamina;
  atcktemp = atck;
  magictemp = magic;
  petlow = 0;
  if (choiceaztec == 1)
  {
  System.out.println(Name + " reaches the end of the tunnel, and at the end of it a stands a small man in aztec attire.");
  System.out.println("Suddenly, from behind them, an axe falls down which starts to make " + Name + " bleed.");
  System.out.println(" 'How did you like that? It may not be as strong as my brothers, but I'm sure that should be enough.' He says.");
  System.out.println("Name is relativly unphased by the pain, and so they immediatly get ready to fight.");
  
  
  }
  else if (choiceaztec == 2)
  {
 System.out.println(Name + " reaches the end of the tunnel, and at the end of it a stands a tall man in aztec attire.");
  System.out.println("Suddenly, from behind them, an axe falls down which starts to make " + Name + " bleed intensly.");
  System.out.println(" 'How did you like that? It's even stronger than my brothers, no one has walked away from that much blood loss.' He says.");
  System.out.println(Name + " is in great pain, but they get ready to fight anyways.");
  }
  System.out.println(" 'Hmph. Every other turn you'll bleed and lose even more health. Let's see how you handle that!' ");
  System.out.println(" ");
  System.out.println("Battle Begin!");
  }
  else if (countme > 0)
  {
    bleed = bleed;
    edamage = edamage;
    ehptemp = ehptemp;
    hp = hp;
    atcktemp = atcktemp;
    staminatemp = staminatemp;
    magictemp = magictemp;
    pettemp = pettemp;
  }
  System.out.println(" ");
  System.out.println("Would you like to 'a'ttack, 'b'lock, use an 'u'ltimate ability, or use an item from your 'i'nventory?");
    System.out.println(" ");
    System.out.println(Name + ": Hp - " + hp + "/" + ohp + " Stamina - " + staminatemp + "/" + stamina + " Attack - " + atcktemp + "Magic Attack - " + magictemp);
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("Aztec: Hp - " + ehptemp + "/" + ehp + " Attack - " + edamage);
 choice = MyInput.nextLine();
  System.out.println(choice);
  choice = MyInput.nextLine();
  
 
 
  if (choice.charAt(0) == 'a' || choice.charAt(0) == 'A')
  {
   if (weapon == 1)
   {
    // pettemp = pettemp - 3;
     if (pettemp <= 0)
     {
       if (petlow == 0)
       {
       magictemp = magictemp - (Math.round(magictemp * 0.5));
       hp = hp - (Math.round(hp * 0.3));
       petlow ++;
     System.out.println("Oh no! Your pet lost its encouragement, and so your powers have been greatly weakened.");
                                System.out.println(" ");
                                System.out.println("Your hp is now " + hp + "/" + ohp + " and your magic is now " + magictemp + "/" + magic + ".");
                                }
}
   if (staminatemp >= 2)
   {
     
   ehptemp = ehptemp - Math.round(magictemp / 2);
   System.out.println("You brought the enemy down to" + ehptemp + "/" + ehp+ " hp.");
   if (ehptemp > 0) ///////////////////////////////////////////////////////////////////
   {
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   if (countme % 2 == 0) //This makes it so that every even number turn does additional bleed damage to the user.
   {
     hp = hp - bleed;
     System.out.println("You take damage from the bleeding, leaving you with " + hp + "/" + ohp + " hp.");
   }
   }
   pettemp = pettemp - 2;
   System.out.println("Pet hp: " + pettemp  + "/" + pet + ". This is the current hp of your pet, which drops by 33% each turn.");
   staminatemp = staminatemp - 2;
   System.out.println("You did a basic attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
   }
   else if (staminatemp < 2)
   {
     System.out.println("You're out of stamina, you can't attack!");
     hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   if (countme % 2 == 0)
   {
     hp = hp - bleed;
     System.out.println("You take damage from the bleeding, leaving you with " + hp + "/" + ohp + " hp.");
   }
   pettemp = pettemp - 2;
   System.out.println("Pet hp: " + pettemp  + "/" + pet + ". This is the current hp of your pet, which drops by 33% each turn.");
  
      }
   }
   
else if (weapon == 2)
{
  if (staminatemp >= 2)
  {
    
   ehptemp = ehptemp - Math.round((ehp * 0.10) + magictemp);
  System.out.println("You brought the enemy down to" + ehptemp + "/" + ehp + " hp.");
 
  
  if (ehptemp > 0)
   {
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   if (countme % 2 == 0)
   {
     hp = hp - bleed;
     System.out.println("You take damage from the bleeding, leaving you with " + hp + "/" + ohp + " hp.");
   }
   hp = hp + Math.round(ehptemp * 0.10);
    System.out.println("Your hp is now " + hp + "/" + ohp + "." + "This is due to your lifesteal, which gives you 10% of the opponents hp each turn and takes it from them.");
   }
  
  // //
   
   staminatemp = staminatemp - 2;
   System.out.println("You did a basic attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
  }
  else if (staminatemp < 2)
  {
     System.out.println("You're out of stamina, you can't attack!");
     hp = hp - (edamage);
     System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
     if (countme % 2 == 0)
   {
     hp = hp - bleed;
     System.out.println("You take damage from the bleeding, leaving you with " + hp + "/" + ohp + " hp.");
   }
  }
}
else if (weapon == 3)
{
  if (staminatemp >= 2)
  {
   crit = (int) ((Math.random() * 6) + 1);
   if (crit == 1 || crit == 6)
   {
   ehptemp = ehptemp - (atcktemp * 2);
   System.out.println("Headshot! You brought the enemy down to " + ehptemp + "/" + ehp + " hp.");
   if (ehptemp > 0)
   {
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   if (countme % 2 == 0)
   {
     hp = hp - bleed;
     System.out.println("You take damage from the bleeding, leaving you with " + hp + "/" + ohp + " hp.");
   }
   }
   staminatemp = staminatemp - 2;
   System.out.println("You did a basic attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
   
   }
   else
   {
      ehptemp = ehptemp - (atcktemp);
      System.out.println("Not a headshot, but you still brought the enemy down to " + ehptemp + "/" + ehp + " hp.");
     if (ehptemp > 0)
   {
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   if (countme % 2 == 0)
   {
     hp = hp - bleed;
     System.out.println("You take damage from the bleeding, leaving you with " + hp + "/" + ohp + " hp.");
   }
   }
      staminatemp = staminatemp - 2;
   System.out.println("You did a basic attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
   
   }
  }
  else if (staminatemp < 2)
  {
     System.out.println("You're out of stamina, you can't attack!");
     hp = hp - (edamage);
     System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
     if (countme % 2 == 0)
   {
     hp = hp - bleed;
     System.out.println("You take damage from the bleeding, leaving you with " + hp + "/" + ohp + " hp.");
   }
  }
  //////////////////////////////////////////////////////////////////////// else
}
else if (weapon == 4)
{
  if (staminatemp >= 2)
  {
  atcktemp = atcktemp + 10;
  System.out.println("Your attack increased, and went up to " + atcktemp + " " + atck);
  magictemp = magictemp + 10;
  System.out.print("Your magic attack increased, and went up to " + magictemp + " " + magic);
  hp = hp + 10;
  System.out.println("Your hp has increased, and went up to " + hp + "/" + ohp + " hp.");
  
  ehptemp = ehptemp - (atcktemp + magictemp);
  System.out.println("Bring the heat! You flame-punched the enemy down to " + ehptemp + "/" + ehp + " hp.");
   if (ehptemp > 0)
   {
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   if (countme % 2 == 0)
   {
     hp = hp - bleed;
     System.out.println("You take damage from the bleeding, leaving you with " + hp + "/" + ohp + " hp.");
   }
   }
   staminatemp = staminatemp - 2;
   System.out.println("You did a basic attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
  }
  else if (staminatemp < 2)
  {
    System.out.println("You're out of stamina, you can't attack!");
     hp = hp - (edamage);
     System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
     if (countme % 2 == 0)
   {
     hp = hp - bleed;
     System.out.println("You take damage from the bleeding, leaving you with " + hp + "/" + ohp + " hp.");
   }
  }
  
  }
  //countme ++;
  }
   else if (choice.charAt(0) == 'b' || choice.charAt(0) == 'B' )
  {
     if (weapon == 1)
     {
       pettemp = pettemp - 2;
       if (pettemp <= 0)
     {
       if (petlow == 0)
       {
       magictemp = magictemp - (Math.round(magictemp * 0.5));
       hp = hp - (Math.round(hp * 0.3));
       petlow ++;
     System.out.println("Oh no! Your pet lost its encouragement, and so your powers have been greatly weakened.");
                                System.out.println(" ");
                                System.out.println("Your hp is now " + hp + "/" + ohp + " and your magic is now " + magictemp + "/" + magic + ".");
                                }
}
}
     if (weapon == 4)
     {
       
       atcktemp = atcktemp + 10;
  System.out.println("Your attack increased, and went up to " + atcktemp + " " + atck);
  magictemp = magictemp + 10;
  System.out.print("Your magic attack increased, and went up to " + magictemp + " " + magic);
  hp = hp + 10;
  System.out.println("Your hp has increased, and went up to " + hp + "/" + ohp + " hp.");
       
     }
    hp = hp - Math.round(edamage / 2);
    hp = hp + Math.round(hp * 0.1);
    System.out.println("You choose to tank the hit taking half damage, leaving you with " + hp + "/" + ohp + " hp.");
    if (countme % 2 == 0)
   {
     hp = hp - bleed;
     System.out.println("You take damage from the bleeding, leaving you with " + hp + "/" + ohp + " hp.");
   }
    System.out.println(" ");
    System.out.println("However, you healed by 10% of your current hp, giving you " + hp + "/" + ohp + " hp.");
    
}
 else if (choice.charAt(0) == 'u' || choice.charAt(0) == 'U')
   
   {
     if (weapon == 1)
   {
      // pettemp = pettemp - 3;
       if (pettemp <= 0)
     {
       if (petlow == 0)
       {
       magictemp = magictemp - (Math.round(magictemp * 0.5));
       hp = hp - (Math.round(hp * 0.3));
       petlow ++;
     System.out.println("Oh no! Your pet lost its encouragement, and so your powers have been greatly weakened.");
                                System.out.println(" ");
                                System.out.println("Your hp is now " + hp + "/" + ohp + " and your magic is now " + magictemp + "/" + magic + ".");
                                }
}
       else
       {
         if (staminatemp >= stamina)
  {
   pettemp = pet;
   System.out.println("It's not over yet! You gave your pet encouragement, healing it up to " + pettemp + "/" + pet + " hp.");
   System.out.println("Wow, look at that damage! Just kidding, you did 0 damage to the enemy. Instead, you gave encouragement to your pet, healing it back to full hp.");
   System.out.println("You may be disappointed, but you shouldnt be, because if your pet gives up, all of your stats ar heavily decreased. Make sure to use this every few turns!");
   staminatemp = 0;
   System.out.println("You did a ultimate attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   if (countme % 2 == 0)
   {
     hp = hp - bleed;
     System.out.println("You take damage from the bleeding, leaving you with " + hp + "/" + ohp + " hp.");
   }
  
                         }
         else if (staminatemp < stamina)
         {
           
    System.out.println("You're out of stamina, you can't attack!");
     hp = hp - (edamage);
     System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
     if (countme % 2 == 0)
   {
     hp = hp - bleed;
     System.out.println("You take damage from the bleeding, leaving you with " + hp + "/" + ohp + " hp.");
   }
     }
       }
     }
else if (weapon == 2)
{
  if (staminatemp >= stamina)
  {
   magictemp = magictemp + (edamage);
   System.out.println(" ");
   System.out.println("You used, Predators Carnival! You stole the enemies attack, and added it to yours for the rest of the fight. Your magic attack is now: " + magictemp + "/" + magic);
   staminatemp = 0;
   System.out.println("You did an ultimate attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
 
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   if (countme % 2 == 0)
   {
     hp = hp - bleed;
     System.out.println("You take damage from the bleeding, leaving you with " + hp + "/" + ohp + " hp.");
   }
  }
  else if (staminatemp < stamina)
         {
           
    System.out.println("You're out of stamina, you can't attack!");
     hp = hp - (edamage);
     System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
     if (countme % 2 == 0)
   {
     hp = hp - bleed;
     System.out.println("You take damage from the bleeding, leaving you with " + hp + "/" + ohp + " hp.");
   }
     }
}
else if (weapon == 3)
{
  if (staminatemp >= stamina)
  {
  System.out.println(" ");
  System.out.println("You used, Trrrriple Kill! You get to attack three times in arow, each hit giving you a chance to get a critical hit!");
  for (int gunhits = 0; gunhits != 3; gunhits++)
  {
   crit = (int) ((Math.random() * 6) + 1);
   if (crit == 1 || crit == 6)
   {
     System.out.println(" ");
   ehptemp = ehptemp - (atcktemp * 2);
   System.out.println("Headshot! You brought the enemy down to " + ehptemp + "/" + ehp + " hp.");
   
   staminatemp =  0;
   System.out.println("You did a basic attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
   }
   else
   { 
     System.out.println(" ");
      ehptemp = ehptemp - (atcktemp);
      System.out.println("Not a headshot, but you still brought the enemy down to " + ehptemp + "/" + ehp + " hp.");
     
      staminatemp = 0;
   System.out.println("You did a basic attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
   }
   
   
  }
  
  System.out.println(" ");
  System.out.println("Now that's a lot of damage! With three hits You brought the enemy down to " + ehptemp + "/" + ehp + " hp!");
  
  System.out.println("You did an ultimate attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
  if (ehptemp > 0)
   {
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   if (countme % 2 == 0)
   {
     hp = hp - bleed;
     System.out.println("You take damage from the bleeding, leaving you with " + hp + "/" + ohp + " hp.");
   }
   }
  //////////////////////////////////////////////////////////////////////// else
}
  
  else if (staminatemp < stamina)
         {
           
    System.out.println("You're out of stamina, you can't attack!");
     hp = hp - (edamage);
     System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
     if (countme % 2 == 0)
   {
     hp = hp - bleed;
     System.out.println("You take damage from the bleeding, leaving you with " + hp + "/" + ohp + " hp.");
   }
     }
}
  
else if (weapon == 4)
{ 
  if (staminatemp >= stamina)
  {
  atcktemp = atcktemp + (countme * 10);
  magictemp = magictemp + (countme * 10);
  System.out.println("Going all out, you use, 'The One Above All'! All of the turns you stalled up are added to your attack and magic!");
  staminatemp = 0;
  System.out.println("Your attack has went up to... " + atcktemp + "/" + atck + "??!!");
  System.out.println("Your magic attack has went up to... " + magictemp + "/" + magic + "??!!");
  System.out.println("You did a ultimate attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
  hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   if (countme % 2 == 0)
   {
     hp = hp - bleed;
     System.out.println("You take damage from the bleeding, leaving you with " + hp + "/" + ohp + " hp.");
   }
  }
else if (staminatemp < stamina)
         {
           
    System.out.println("You're out of stamina, you can't attack!");
     hp = hp - (edamage);
     System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
     if (countme % 2 == 0)
   {
     hp = hp - bleed;
     System.out.println("You take damage from the bleeding, leaving you with " + hp + "/" + ohp + " hp.");
   }
     }
   
   }
   //countme ++;
   }
 else if (choice.charAt(0) == 'i' || choice.charAt(0) == 'I')
 {
   if (weapon == 1)
   {
     
     //pettemp = pettemp - 3;
     if (pettemp <= 0)
     {
       if (petlow == 0)
       {
       magictemp = magictemp - (Math.round(magictemp * 0.5));
       hp = hp - (Math.round(hp * 0.3));
       petlow ++;
       System.out.println("Oh no! Your pet lost its encouragement, and so your powers have been greatly weakened.");
                                System.out.println(" ");
                                System.out.println("Your hp is now " + hp + "/" + ohp + " and your magic is now " + magictemp + "/" + magic + ".");
     }
     
   }
     pettemp = pettemp - 2;
     System.out.println("Your pets hp has dropped too " + pettemp + "/10");
   }
   while (cnn != 20)
   {
     System.out.println("Inventory slot " + cnn + ":" + inventory[cnn]);
     cnn ++;
   }
   System.out.println("Type in the inventory slot of the item you would like to use.");
   choicenum = MyInput.nextInt();
   
   if (inventory[choicenum] == "Hpotion")
   {
     healthup = 0;
    while (healthup != 50 && hp < ohp)
    {
      if (Math.round(hp) != ohp)
      {
    hp = hp + 1;
    
    healthup ++;
      }
    }
    inventory[choicenum] = "";
    System.out.println(" ");
    System.out.println("You healed up to " + hp + "/" + ohp + " hp! You will almost never go over your max hp, however there are some cases where it may."); // ??
  }
   else if (inventory[choicenum] == "AttackUp")
   {
     atcktemp = atcktemp + 20;
     inventory[choicenum] = "";
     System.out.println(" ");
     System.out.println("Your attack was raised up to " + atcktemp + " from " + atck + " for the rest of the fight!");
   }
   else if (inventory[choicenum] == "StaminaUp")
   {
    staminaup = 0;
    while (staminaup != 4 && staminatemp < stamina)
    {
      if (Math.round(staminatemp) != stamina)
      {
    staminatemp = staminatemp + 1;
    
     staminaup ++;
 }
    }
    System.out.println("You recovered 4 stamina, leaving you with " + staminatemp + "/" + stamina + " stamina.");
   }
    else if (inventory[choicenum] == "MagicUp")
   {
     magictemp = magictemp + 20;
     inventory[choicenum] = "";
     System.out.println(" ");
     System.out.println("Your magic attack was raised up to " + magictemp + " from " + magic + " for the rest of the fight!");
   }
   
   hp = hp - edamage;
   System.out.println("The enemy has brought you down to " + hp + "/" + ohp + " hp.");
   if (countme % 2 == 0)
   {
     hp = hp - bleed;
     System.out.println("Oh no! your wound continues to bleed, leaving you with " + hp + "/" + ohp + " hp.");
   }
   cnn = 0;
 }
   
   if (choice.charAt(0) == 'a' || choice.charAt(0) == 'b' || choice.charAt(0) == 'u' || choice.charAt(0) == 'i')
   {
   countme ++;
   if (staminatemp != stamina)
   {
   staminatemp ++;
   }
   
 }
   
  }
if (hp > 0 && ehptemp <= 0)
 {
   System.out.println(" ");
   System.out.println("You win!");
   System.out.println(" 'I guess... I could not make you bleed enough. I'm sorry, brother.' The Aztec man says.");
  System.out.println("He lays on ground, too weak to stand up. He could always come back to attack you later, so do you choose to kill him, or let him escape?");
  System.out.println("Type in 's' to spare him, or 'k' to finish it off.");
  choice = MyInput.nextLine();
     if (choice.charAt(0) == 's' || choice.charAt(0) == 'S')
  {
       gkarma ++;
       System.out.println(" 'Thank you... I will make good use of my life.' He says.");
    System.out.println("You choose to let the aztec man live and walk away.");
    System.out.println(" ");
   //////
    if (choiceaztec == 1)
    {
    xp = xp + 5;
    System.out.println("You gained " + xp + "/10 experience!");
    money = money + 100;
    System.out.println("You gained 100 dollars, leaving you with " + money + " dollars!");
    }
    else if (choiceaztec == 2)
    {
      xp = xp + 10;
      System.out.println("Your xp went up to " + xp + "/10 experience!");
      money = money + 150;
    System.out.println("You gained 100 dollars, leaving you with " + money + " dollars!");
    }
    if (xp >= 10)
    {
      xp = xp - 10;
      lvl ++;
     System.out.println("You leveled up to level " + lvl + "!");
     while (lvlup != 2)
     {
     System.out.println("Which of these statistics would you like to power up?");
     System.out.println("Attack: " + atck);
     System.out.println("Magic: " + magic);
     System.out.println("Health: " + ohp);
     System.out.println("Stamina: " + stamina);
     System.out.println(" ");
     System.out.println("Type in 'a' or attack, 'm' for magic, 'h' for health, or 's' for stamina.");
     choice = MyInput.nextLine();
     if (choice.charAt(0) == 'a')
     {
       atck = atck + 10;
       System.out.println("You're attack was raised by 10, giving you an attack stat of " + atck);
     }
     else if (choice.charAt(0) == 'm')
     {
       magic = magic + 10;
       System.out.println("You're magic attack was raised by 10, giving you an magic attack stat of " + magic);
     }
else if (choice.charAt(0) == 'h')
     {
       ohp = ohp + 10;
       System.out.println("You're health was raised by 10, giving you an hp stat of " + ohp);
     }
else if (choice.charAt(0) == 's')
     {
       stamina = stamina + 1;
       System.out.println("You're stamina was raised by 1, giving you an stamina stat of " + stamina);
     }
    win = 1;
    lvlup ++;
 }
    }
  }
  else if (choice.charAt(0) == 'k' || choice.charAt(0) == 'K')
  {
    System.out.println("You choose to kill Aztec, and move on.");
    System.out.println(" ");
    bkarma ++;
    xp = xp + 5;
    System.out.println("You gained " + xp + "/10 experience!");
    if (xp >= 10)
    {
      xp = xp - 10;
      lvl ++;
     System.out.println("You leveled up to level " + lvl + "!");
     while (lvlup != 2)
     {
     System.out.println("Which of these statistics would you like to power up?");
     System.out.println("Attack: " + atck);
     System.out.println("Magic: " + magic);
     System.out.println("Health: " + ohp);
     System.out.println("Stamina: " + stamina);
     System.out.println(" ");
     System.out.println("Type in 'a' or attack, 'm' for magic, 'h' for health, or 's' for stamina.");
     choice = MyInput.nextLine();
     if (choice.charAt(0) == 'a')
     {
       atck = atck + 10;
       System.out.println("You're attack was raised by 10, giving you an attack stat of " + atck);
     }
     else if (choice.charAt(0) == 'm')
     {
       magic = magic + 10;
       System.out.println("You're magic attack was raised by 10, giving you an magic attack stat of " + magic);
     }
else if (choice.charAt(0) == 'h')
     {
       ohp = ohp + 10;
       System.out.println("You're health was raised by 10, giving you an hp stat of " + ohp);
     }
else if (choice.charAt(0) == 's')
     {
       stamina = stamina + 1;
       System.out.println("You're stamina was raised by 1, giving you an stamina stat of " + stamina);
     }
    win = 1;
    lvlup ++;
 }
    }
  }
   }
 else if (ehptemp > 0 && hp <= 0)
 {
   System.out.println(" ");
   System.out.println("Really... You died.");
    win = 0;
 }

  }
  else if (gametime == 4)
  {
    if (countme == 0)
      {
      polarshield = 500; 
    ehp = 190 + polarshield; 
      ehptemp = ehp;
  edamage = 40;
  hp = ohp;
  pettemp = pet;
  staminatemp = stamina;
  atcktemp = atck;
  magictemp = magic;
  
   System.out.println(" ");
   System.out.println(" ");
   System.out.println(" ");
   System.out.println(" "); 
   System.out.println(" ");
   System.out.println(" ");
   System.out.println("Level 4: Leaving The Jungle");
    System.out.println(" ");
    System.out.println(Name + " reaches the end of the path, with nothing at the end.");
    System.out.println("Then suddenly, in a flash of light they are teleported into a freezing area completly covered in snow.");
    if (weapon == 1 || weapon == 3)
    {
      System.out.println(Name + " has been in this type of situation before, and so without complaining they immediatly start to try and build a shelter out of snow.");
    }
    else if (weapon == 2 || weapon == 4)
    {
      System.out.println(Name + " is not used to this kind of situation, and so they do not know what to do other than to walk around looking for shelter.");
  }
    System.out.println("Suddenly, out of nowhere in the snowy area a polar bear starts charging at " + Name);
    System.out.println("For this fight, for 4 turns the enemy will have a huge amount of defence making them practically invincible.");
    System.out.println("Battle Begin!");
    ////
 }
    else if (countme > 0)
    {
      edamage = edamage;
    ehptemp = ehptemp;
    hp = hp;
    atcktemp = atcktemp;
    staminatemp = staminatemp;
    magictemp = magictemp;
   pettemp = pettemp;
    }
   
    while (hp > 0 && ehptemp > 0)
    {
      if (countme == 6)
    {
      ehptemp = ehptemp - 500; //Polar Shield turning to 0 will not work since it is already added to the enemies health at the start, and so it must be simply subtracted by 500.
      System.out.println("The enemies shield has worn off, leaving them with " + ehptemp + "/" + ehp + " health points!");
    }
    System.out.println("Would you like to 'a'ttack, 'b'lock, use an 'u'ltimate ability, or use an item from your 'i'nventory?");
    System.out.println(" ");
    System.out.println(Name + ": Hp - " + hp + "/" + ohp + " Stamina - " + staminatemp + "/" + stamina + " Attack - " + atcktemp + "Magic Attack - " + magictemp);
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("Polar Bear: Hp - " + ehptemp + "/" + ehp + " Attack - " + edamage);
    choice = MyInput.nextLine();
    System.out.println(" ");
    choice = MyInput.nextLine();
 
  if (choice.charAt(0) == 'a' || choice.charAt(0) == 'A')
  {
   if (weapon == 1)
   {
    // pettemp = pettemp - 3;
     if (pettemp <= 0)
     {
       if (petlow == 0)
       {
       magictemp = magictemp - (Math.round(magictemp * 0.5));
       hp = hp - (Math.round(hp * 0.3));
       petlow ++;
     System.out.println("Oh no! Your pet lost its encouragement, and so your powers have been greatly weakened.");
                                System.out.println(" ");
                                System.out.println("Your hp is now " + hp + "/" + ohp + " and your magic is now " + magictemp + "/" + magic + ".");
                                }
}
   if (staminatemp >= 2)
   {
     
   ehptemp = ehptemp - Math.round(magictemp / 2);
   System.out.println("You brought the enemy down to" + ehptemp + "/" + ehp+ " hp.");
   if (ehptemp > 0) ///////////////////////////////////////////////////////////////////
   {
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   
   }
   pettemp = pettemp - 2;
   System.out.println("Pet hp: " + pettemp  + "/" + pet + ". This is the current hp of your pet, which drops by 33% each turn.");
   staminatemp = staminatemp - 2;
   System.out.println("You did a basic attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
   }
   else if (staminatemp < 2)
   {
     System.out.println("You're out of stamina, you can't attack!");
     hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   
   pettemp = pettemp - 2;
   System.out.println("Pet hp: " + pettemp  + "/" + pet + ". This is the current hp of your pet, which drops by 33% each turn.");
  
      }
   }
   
else if (weapon == 2)
{
  if (staminatemp >= 2)
  {
    
   ehptemp = ehptemp - Math.round((ehp * 0.10) + magictemp);
  System.out.println("You brought the enemy down to" + ehptemp + "/" + ehp + " hp.");
 
  
  if (ehptemp > 0)
   {
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   
   hp = hp + Math.round(ehptemp * 0.10);
    System.out.println("Your hp is now " + hp + "/" + ohp + "." + "This is due to your lifesteal, which gives you 10% of the opponents hp each turn and takes it from them.");
   }
  
  // //
   
   staminatemp = staminatemp - 2;
   System.out.println("You did a basic attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
  }
  else if (staminatemp < 2)
  {
     System.out.println("You're out of stamina, you can't attack!");
     hp = hp - (edamage);
     System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
     
  }
}
else if (weapon == 3)
{
  if (staminatemp >= 2)
  {
   crit = (int) ((Math.random() * 6) + 1);
   if (crit == 1 || crit == 6)
   {
   ehptemp = ehptemp - (atcktemp * 2);
   System.out.println("Headshot! You brought the enemy down to " + ehptemp + "/" + ehp + " hp.");
   if (ehptemp > 0)
   {
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   
   }
   staminatemp = staminatemp - 2;
   System.out.println("You did a basic attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
   
   }
   else
   {
      ehptemp = ehptemp - (atcktemp);
      System.out.println("Not a headshot, but you still brought the enemy down to " + ehptemp + "/" + ehp + " hp.");
     if (ehptemp > 0)
   {
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   
   }
      staminatemp = staminatemp - 2;
   System.out.println("You did a basic attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
   
   }
  }
  else if (staminatemp < 2)
  {
     System.out.println("You're out of stamina, you can't attack!");
     hp = hp - (edamage);
     System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
     
  }
  //////////////////////////////////////////////////////////////////////// else
}
else if (weapon == 4)
{
  if (staminatemp >= 2)
  {
  atcktemp = atcktemp + 10;
  System.out.println("Your attack increased, and went up to " + atcktemp + " " + atck);
  magictemp = magictemp + 10;
  System.out.print("Your magic attack increased, and went up to " + magictemp + " " + magic);
  hp = hp + 10;
  System.out.println("Your hp has increased, and went up to " + hp + "/" + ohp + " hp.");
  
  ehptemp = ehptemp - (atcktemp + magictemp);
  System.out.println("Bring the heat! You flame-punched the enemy down to " + ehptemp + "/" + ehp + " hp.");
   if (ehptemp > 0)
   {
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   
   }
   staminatemp = staminatemp - 2;
   System.out.println("You did a basic attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
  }
  else if (staminatemp < 2)
  {
    System.out.println("You're out of stamina, you can't attack!");
     hp = hp - (edamage);
     System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
    
  }
  
  }
  
  }
   else if (choice.charAt(0) == 'b' || choice.charAt(0) == 'B' )
  {
     if (weapon == 1)
     {
       pettemp = pettemp - 2;
       if (pettemp <= 0)
     {
       if (petlow == 0)
       {
       magictemp = magictemp - (Math.round(magictemp * 0.5));
       hp = hp - (Math.round(hp * 0.3));
       petlow ++;
     System.out.println("Oh no! Your pet lost its encouragement, and so your powers have been greatly weakened.");
                                System.out.println(" ");
                                System.out.println("Your hp is now " + hp + "/" + ohp + " and your magic is now " + magictemp + "/" + magic + ".");
                                }
}
}
     if (weapon == 4)
     {
       
       atcktemp = atcktemp + 10;
  System.out.println("Your attack increased, and went up to " + atcktemp + " " + atck);
  magictemp = magictemp + 10;
  System.out.print("Your magic attack increased, and went up to " + magictemp + " " + magic);
  hp = hp + 10;
  System.out.println("Your hp has increased, and went up to " + hp + "/" + ohp + " hp.");
       
     }
    hp = hp - Math.round(edamage / 2);
    hp = hp + Math.round(hp * 0.1);
    System.out.println("You choose to tank the hit taking half damage, leaving you with " + hp + "/" + ohp + " hp.");
    
    System.out.println(" ");
    System.out.println("However, you healed by 10% of your current hp, giving you " + hp + "/" + ohp + " hp.");
    
}
 else if (choice.charAt(0) == 'u' || choice.charAt(0) == 'U')
   
   {
     if (weapon == 1)
   {
      // pettemp = pettemp - 3;
       if (pettemp <= 0)
     {
       if (petlow == 0)
       {
       magictemp = magictemp - (Math.round(magictemp * 0.5));
       hp = hp - (Math.round(hp * 0.3));
       petlow ++;
     System.out.println("Oh no! Your pet lost its encouragement, and so your powers have been greatly weakened.");
                                System.out.println(" ");
                                System.out.println("Your hp is now " + hp + "/" + ohp + " and your magic is now " + magictemp + "/" + magic + ".");
                                }
}
       else
       {
         if (staminatemp >= stamina)
  {
   pettemp = pet;
   System.out.println("It's not over yet! You gave your pet encouragement, healing it up to " + pettemp + "/" + pet + " hp.");
   System.out.println("Wow, look at that damage! Just kidding, you did 0 damage to the enemy. Instead, you gave encouragement to your pet, healing it back to full hp.");
   System.out.println("You may be disappointed, but you shouldnt be, because if your pet gives up, all of your stats ar heavily decreased. Make sure to use this every few turns!");
   staminatemp = 0;
   System.out.println("You did a ultimate attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   
  
                         }
         else if (staminatemp < stamina)
         {
           
    System.out.println("You're out of stamina, you can't attack!");
     hp = hp - (edamage);
     System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
     
     }
       }
     }
else if (weapon == 2)
{
  if (staminatemp >= stamina)
  {
   magictemp = magictemp + (edamage);
   System.out.println(" ");
   System.out.println("You used, Predators Carnival! You stole the enemies attack, and added it to yours for the rest of the fight. Your magic attack is now: " + magictemp + "/" + magic);
   staminatemp = 0;
   System.out.println("You did an ultimate attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
   
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   
  }
  else if (staminatemp < stamina)
         {
           
    System.out.println("You're out of stamina, you can't attack!");
     hp = hp - (edamage);
     System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
    
     }
}
else if (weapon == 3)
{
  if (staminatemp >= stamina)
  {
  System.out.println(" ");
  System.out.println("You used, Trrrriple Kill! You get to attack three times in arow, each hit giving you a chance to get a critical hit!");
  for (int gunhits = 0; gunhits != 3; gunhits++)
  {
   crit = (int) ((Math.random() * 6) + 1);
   if (crit == 1 || crit == 6)
   {
     System.out.println(" ");
   ehptemp = ehptemp - (atcktemp * 2);
   System.out.println("Headshot! You brought the enemy down to " + ehptemp + "/" + ehp + " hp.");
   
   staminatemp =  0;
   System.out.println("You did a basic attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
   }
   else
   { 
     System.out.println(" ");
      ehptemp = ehptemp - (atcktemp);
      System.out.println("Not a headshot, but you still brought the enemy down to " + ehptemp + "/" + ehp + " hp.");
     
      staminatemp = 0;
   System.out.println("You did a basic attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
   }
   
   
  }
  
  System.out.println(" ");
  System.out.println("Now that's a lot of damage! With three hits You brought the enemy down to " + ehptemp + "/" + ehp + " hp!");
  
  System.out.println("You did an ultimate attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
  if (ehptemp > 0)
   {
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
  
   }
  //////////////////////////////////////////////////////////////////////// else
}
  
  else if (staminatemp < stamina)
         {
           
    System.out.println("You're out of stamina, you can't attack!");
     hp = hp - (edamage);
     System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
    
     }
}
  
else if (weapon == 4)
{ 
  if (staminatemp >= stamina)
  {
  atcktemp = atcktemp + (countme * 10);
  magictemp = magictemp + (countme * 10);
  System.out.println("Going all out, you use, 'The One Above All'! All of the turns you stalled up are added to your attack and magic!");
  staminatemp = 0;
  System.out.println("Your attack has went up to... " + atcktemp + "/" + atck + "??!!");
  System.out.println("Your magic attack has went up to... " + magictemp + "/" + magic + "??!!");
  System.out.println("You did a ultimate attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
  hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   
  }
else if (staminatemp < stamina)
         {
           
    System.out.println("You're out of stamina, you can't attack!");
     hp = hp - (edamage);
     System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
    
     }
   
   }
   //countme ++;
   }
 else if (choice.charAt(0) == 'i' || choice.charAt(0) == 'I')
 {
   if (weapon == 1)
   {
    
     //pettemp = pettemp - 3;
     if (pettemp <= 0)
     {
       if (petlow == 0)
       {
       magictemp = magictemp - (Math.round(magictemp * 0.5));
       hp = hp - (Math.round(hp * 0.3));
       petlow ++;
       System.out.println("Oh no! Your pet lost its encouragement, and so your powers have been greatly weakened.");
                                System.out.println(" ");
                                System.out.println("Your hp is now " + hp + "/" + ohp + " and your magic is now " + magictemp + "/" + magic + ".");
     }
     
   }
     pettemp = pettemp - 2;
     System.out.println("Your pets hp has dropped too " + pettemp + "/10");
   }
   while (cnn != 20)
   {
     System.out.println("Inventory slot " + cnn + ":" + inventory[cnn]);
     cnn ++;
   }
   System.out.println("Type in the inventory slot of the item you would like to use.");
   choicenum = MyInput.nextInt();
   
   if (inventory[choicenum] == "Hpotion")
   {
     healthup = 0;
    while (healthup != 50 && hp < ohp)
    {
      if (Math.round(hp) != ohp)
      {
    hp = hp + 1;
    
    healthup ++;
      }
    }
    inventory[choicenum] = "";
    System.out.println(" ");
    System.out.println("You healed up to " + hp + "/" + ohp + " hp! You will almost never go over your max hp, however there are some cases where it may."); // ??
  }
   else if (inventory[choicenum] == "AttackUp")
   {
     atcktemp = atcktemp + 20;
     inventory[choicenum] = "";
     System.out.println(" ");
     System.out.println("Your attack was raised up to " + atcktemp + " from " + atck + " for the rest of the fight!");
   }
   else if (inventory[choicenum] == "StaminaUp")
   {
    staminaup = 0;
    while (staminaup != 4 && staminatemp < stamina)
    {
      if (Math.round(hp) != ohp)
      {
    staminatemp = staminatemp + 1;
    
     staminaup ++;
 }
    }
   }
   else if (inventory[choicenum] == "MagicUp")
   {
     magictemp = magictemp + 20;
     inventory[choicenum] = "";
     System.out.println(" ");
     System.out.println("Your magic attack was raised up to " + magictemp + " from " + magic + " for the rest of the fight!");
   }
   hp = hp - edamage;
   System.out.println("The enemy has brought you down to " + hp + "/" + ohp + " hp.");
   
   cnn = 0;
 }
   
   if (choice.charAt(0) == 'a' || choice.charAt(0) == 'b' || choice.charAt(0) == 'u' || choice.charAt(0) == 'i')
   {
   countme ++;
   if (staminatemp != stamina)
   {
   staminatemp ++;
   }
     }
  }
  if (hp > 0 && ehptemp <= 0)
 {
   System.out.println(" ");
   System.out.println("You win!");
   System.out.println("The polar bear lays on the ground.");
  System.out.println("It is too weak to stand back up. It could always come back to attack you later, so do you choose to kill it, or let it escape?");
  System.out.println("Type in 's' to spare it, or 'k' to finish it off.");
  choice = MyInput.nextLine();
     if (choice.charAt(0) == 's' || choice.charAt(0) == 'S')
  {
       gkarma ++;
    System.out.println("You choose to let the Polar Bear live and walk away.");
    System.out.println(" ");
   
    xp = xp + 7;
    System.out.println("You gained " + xp + "/10 experience!");
    if (xp >= 10)
    {
      xp = xp - 10;
      lvl ++;
     System.out.println("You leveled up to level " + lvl + "!");
     while (lvlup != 2)
     {
     System.out.println("Which of these statistics would you like to power up?");
     System.out.println("Attack: " + atck);
     System.out.println("Magic: " + magic);
     System.out.println("Health: " + ohp);
     System.out.println("Stamina: " + stamina);
     System.out.println(" ");
     System.out.println("Type in 'a' or attack, 'm' for magic, 'h' for health, or 's' for stamina.");
     
     choice = MyInput.nextLine();
     
     if (choice.charAt(0) == 'a')
     {
       atck = atck + 10;
       System.out.println("You're attack was raised by 10, giving you an attack stat of " + atck);
     }
     else if (choice.charAt(0) == 'm')
     {
       magic = magic + 10;
       System.out.println("You're magic attack was raised by 10, giving you an magic attack stat of " + magic);
     }
else if (choice.charAt(0) == 'h')
     {
       ohp = ohp + 10;
       System.out.println("You're health was raised by 10, giving you an hp stat of " + ohp);
     }
else if (choice.charAt(0) == 's')
     {
       stamina = stamina + 1;
       System.out.println("You're stamina was raised by 1, giving you an stamina stat of " + stamina);
     }
    win = 1;
    lvlup ++;
 }
    }
  }
  else if (choice.charAt(0) == 'k' || choice.charAt(0) == 'K')
  {
    System.out.println("You choose to kill the Polar Bear, and move on.");
    System.out.println(" ");
    bkarma ++;
    xp = xp + 7;
    System.out.println("You gained " + xp + "/10 experience!");
    if (xp >= 10)
    {
      xp = xp - 10;
      lvl ++;
     System.out.println("You leveled up to level " + lvl + "!");
     while (lvlup != 2)
     {
     System.out.println("Which of these statistics would you like to power up?");
     System.out.println("Attack: " + atck);
     System.out.println("Magic: " + magic);
     System.out.println("Health: " + ohp);
     System.out.println("Stamina: " + stamina);
     System.out.println(" ");
     System.out.println("Type in 'a' or attack, 'm' for magic, 'h' for health, or 's' for stamina.");
     choice = MyInput.nextLine();
     if (choice.charAt(0) == 'a')
     {
       atck = atck + 10;
       System.out.println("You're attack was raised by 10, giving you an attack stat of " + atck);
     }
     else if (choice.charAt(0) == 'm')
     {
       magic = magic + 10;
       System.out.println("You're magic attack was raised by 10, giving you an magic attack stat of " + magic);
     }
else if (choice.charAt(0) == 'h')
     {
       ohp = ohp + 10;
       System.out.println("You're health was raised by 10, giving you an hp stat of " + ohp);
     }
else if (choice.charAt(0) == 's')
     {
       stamina = stamina + 1;
       System.out.println("You're stamina was raised by 1, giving you an stamina stat of " + stamina);
     }
    win = 1;
    lvlup ++;
 }
    }
  }
  money = money + 100;
  System.out.println(" ");
    System.out.println("You got 100 gold from this fight. This is what you use to buy items which can help you in battle. Your balance is now " + money);
   }
 else if (ehptemp > 0 && hp <= 0)
 {
   System.out.println(" ");
   System.out.println("Really... You died.");
    win = 0;
 }
 
    }
  
  else if (gametime == 5)
  {
    
    if (countme == 0)
      {
      ehp = 230;
      ehptemp = ehp;
  edamage = 35;
  hp = ohp;
  pettemp = pet;
  staminatemp = stamina;
  atcktemp = atck;
  magictemp = magic;
  
   System.out.println(" ");
   System.out.println(" ");
   System.out.println(" ");
   System.out.println(" "); 
   System.out.println(" ");
   System.out.println(" ");
   System.out.println("Level 5: Do The Math");
    System.out.println(" ");
   if (weapon == 3 || weapon == 1)
   {
     System.out.println(Name + " decides that staying in the shelter is not the best idea, and so they set out to find a safer place too stay.");
     System.out.println(" ");
   }
   else if (weapon == 2 || weapon == 4)
   {
     System.out.println(Name + " keeps on moving to hopefully find a safe place to keep warm, as they have been in the cold this entire time.");
     System.out.println(" ");
   }
   System.out.println("As they are walking endlessly through the cold, " + Name + " sees a light in the far distance. Walking towards it, they see that it seems like some sort of lodge.");
   System.out.println("As soon as they walk in, they see a bearded man sitting at a small table, with no one else in the room except for him.");
   System.out.println(" 'Oh, it's been so long since I've gotten a visitor!' The man says as he motions you to sit at the table.");
   if (weapon == 1 || weapon == 2)
   {
     System.out.println(" ");
     System.out.println("Being the skeptical person " + Name + " has always been, they hesitate.");
     System.out.println(" 'Oh come on, consider this a payment for me letting you stay here!' The man says.");
     System.out.println(Name + " finally decides to sit down, but with caution.");
     System.out.println(" ");
   }
   else if (weapon == 3 || weapon == 4) 
   {
     System.out.println(" ");
     System.out.println("Being the kind and talkative person " + Name + " always is, they sit down immediately");
     System.out.println(" 'So, you couldnt handle the storm huh? I can't blame you.' The man says.");
     System.out.println(" ");
   }
   System.out.println(" 'But... Sorry to break it to you, but I work for 'him' as well, meaning that I'm gonna have to fight you.' ");
   System.out.println(Name + " looks back, but the exit towards the door has already been sealed shut.");
   System.out.println(" 'The way this battle will work is different than your others, though. You can only damage me after answering my math question correctly. What can I say, I always like a few numbers. No calculators either. I will know.' The man says. "); 
   System.out.println("Battle Begin!");
    }
   else if (countme > 0) 
   {
      edamage = edamage;
    ehptemp = ehptemp;
    hp = hp;
    atcktemp = atcktemp;
    staminatemp = staminatemp;
    magictemp = magictemp;
   pettemp = pettemp;
   }
   while (hp > 0 && ehptemp > 0)
   {
    System.out.println("Would you like to 'a'ttack, 'b'lock, use an 'u'ltimate ability, or use an item from your 'i'nventory?");
    System.out.println(" ");
    System.out.println(Name + ": Hp - " + hp + "/" + ohp + " Stamina - " + staminatemp + "/" + stamina + " Attack - " + atcktemp + "Magic Attack - " + magictemp);
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("Bearded Man: Hp - " + ehptemp + "/" + ehp + " Attack - " + edamage);
    choice = MyInput.nextLine();
    System.out.println(" ");
    choice = MyInput.nextLine();
 
  if (choice.charAt(0) == 'a' || choice.charAt(0) == 'A')
  {
   if (weapon == 1)
   {
    
     if (pettemp <= 0)
     {
       if (petlow == 0)
       {
       magictemp = magictemp - (Math.round(magictemp * 0.5));
       hp = hp - (Math.round(hp * 0.3));
       petlow ++;
     System.out.println("Oh no! Your pet lost its encouragement, and so your powers have been greatly weakened.");
                                System.out.println(" ");
                                System.out.println("Your hp is now " + hp + "/" + ohp + " and your magic is now " + magictemp + "/" + magic + ".");
                                }
}
   if (staminatemp >= 2)
   {
   mathme1 = (int) ((Math.random() * 12) + 1); //Two random numbers must be genarated each time so the numbers are not always the same.
   mathme2 = (int) ((Math.random() * 12) + 1);
   System.out.println("Now tell me, what is " + mathme1 + " times " + mathme2 + "?");
   mathinput = MyInput.nextInt(); //choicenum was not used here because if it was it would interfere with the inventory choices with the slots.
   if (mathinput == mathme1 * mathme2) //The user may only attack or use an ultimate ability if they enter in the number that is equal to the two random numbers multiplied together.
   {
     System.out.println("Ah, you got me!");
   ehptemp = ehptemp - Math.round(magictemp / 2);
   System.out.println("You brought the enemy down to" + ehptemp + "/" + ehp+ " hp.");
   }
   else if (mathinput != mathme1 * mathme2)
   {
     System.out.println("Haha, nope!");
     System.out.println(" ");
     staminatemp = staminatemp + 2;
   }
   if (ehptemp > 0) ///////////////////////////////////////////////////////////////////
   {
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   System.out.println(" ");
   }
   pettemp = pettemp - 2;
   System.out.println("Pet hp: " + pettemp  + "/" + pet + ". This is the current hp of your pet, which drops by 33% each turn.");
   staminatemp = staminatemp - 2;
   System.out.println("You did a basic attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
   }
   else if (staminatemp < 2)
   {
     System.out.println("You're out of stamina, you can't attack!");
     hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   
   pettemp = pettemp - 2;
   System.out.println("Pet hp: " + pettemp  + "/" + pet + ". This is the current hp of your pet, which drops by 33% each turn.");
  
      }
   }
   
else if (weapon == 2)
{
  if (staminatemp >= 2)
  {
    mathme1 = (int) ((Math.random() * 12) + 1);
   mathme2 = (int) ((Math.random() * 12) + 1);
   System.out.println("Now tell me, what is " + mathme1 + " times " + mathme2 + "?");
   mathinput = MyInput.nextInt();
   if (mathinput == mathme1 * mathme2)
   {
     System.out.println("Ah, you got me!");
   ehptemp = ehptemp - Math.round((ehp * 0.10) + magictemp);
  System.out.println("You brought the enemy down to" + ehptemp + "/" + ehp + " hp.");
   }
   else if (mathinput != mathme1 * mathme2)
   {
    System.out.println("Haha, nope!");
    staminatemp = staminatemp + 2;
   }
  
  if (ehptemp > 0)
   {
    
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   
   hp = hp + Math.round(ehptemp * 0.10);
    System.out.println("Your hp is now " + hp + "/" + ohp + "." + "This is due to your lifesteal, which gives you 10% of the opponents hp each turn and takes it from them.");
   }
  
  // //
   
   staminatemp = staminatemp - 2;
   System.out.println("You did a basic attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
  }
  else if (staminatemp < 2)
  {
     System.out.println("You're out of stamina, you can't attack!");
     hp = hp - (edamage);
     System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
     
  }
}
else if (weapon == 3)
{
  if (staminatemp >= 2)
  {
    mathme1 = (int) ((Math.random() * 12) + 1);
   mathme2 = (int) ((Math.random() * 12) + 1);
   System.out.println("Now tell me, what is " + mathme1 + " times " + mathme2 + "?");
   mathinput = MyInput.nextInt();
   if (mathinput == mathme1 * mathme2)
   {
     System.out.println("Ah, you got me!");
   crit = (int) ((Math.random() * 6) + 1);
   if (crit == 1 || crit == 6)
   {
   ehptemp = ehptemp - (atcktemp * 2);
   System.out.println("Headshot! You brought the enemy down to " + ehptemp + "/" + ehp + " hp.");
   if (ehptemp > 0)
   {
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   
   }
   staminatemp = staminatemp - 2;
   System.out.println("You did a basic attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
   
   }
   else
   {
      ehptemp = ehptemp - (atcktemp);
      System.out.println("Not a headshot, but you still brought the enemy down to " + ehptemp + "/" + ehp + " hp.");
     if (ehptemp > 0)
   {
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   
   }
   
      staminatemp = staminatemp - 2;
   System.out.println("You did a basic attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
   
   }
   }
   else if (mathinput != mathme1 * mathme2)
   {
     System.out.println("Haha, nope!");
    hp = hp - edamage;
    System.out.println("The enemy hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   }
  }
  else if (staminatemp < 2)
  {
     System.out.println("You're out of stamina, you can't attack!");
     hp = hp - (edamage);
     System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
     
  }
  //////////////////////////////////////////////////////////////////////// else
}
else if (weapon == 4)
{
  if (staminatemp >= 2)
  {
  atcktemp = atcktemp + 10;
  System.out.println("Your attack increased, and went up to " + atcktemp + " " + atck);
  magictemp = magictemp + 10;
  System.out.print("Your magic attack increased, and went up to " + magictemp + " " + magic);
  hp = hp + 10;
  System.out.println("Your hp has increased, and went up to " + hp + "/" + ohp + " hp.");
  
   mathme1 = (int) ((Math.random() * 12) + 1);
   mathme2 = (int) ((Math.random() * 12) + 1);
   System.out.println("Now tell me, what is " + mathme1 + " times " + mathme2 + "?");
   mathinput = MyInput.nextInt();
   if (mathinput == mathme1 * mathme2)
   {
     System.out.println("Ah, you got me!");
  ehptemp = ehptemp - (atcktemp + magictemp);
  System.out.println("Bring the heat! You flame-punched the enemy down to " + ehptemp + "/" + ehp + " hp.");
   }
   else if (mathinput != mathme1 * mathme2)
   {
    System.out.println("Haha, nope!");
    System.out.println(" ");
   }
   if (ehptemp > 0)
   {
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   
   }
   staminatemp = staminatemp - 2;
   System.out.println("You did a basic attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
  }
  else if (staminatemp < 2)
  {
    System.out.println("You're out of stamina, you can't attack!");
     hp = hp - (edamage);
     System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
    
  }
  
  }
  //countme ++;
  }
   else if (choice.charAt(0) == 'b' || choice.charAt(0) == 'B' )
  {
     if (weapon == 1)
     {
       pettemp = pettemp - 2;
       if (pettemp <= 0)
     {
       if (petlow == 0)
       {
       magictemp = magictemp - (Math.round(magictemp * 0.5));
       hp = hp - (Math.round(hp * 0.3));
       petlow ++;
     System.out.println("Oh no! Your pet lost its encouragement, and so your powers have been greatly weakened.");
                                System.out.println(" ");
                                System.out.println("Your hp is now " + hp + "/" + ohp + " and your magic is now " + magictemp + "/" + magic + ".");
                                }
}
}
     if (weapon == 4)
     {
       
       atcktemp = atcktemp + 10;
  System.out.println("Your attack increased, and went up to " + atcktemp + " " + atck);
  magictemp = magictemp + 10;
  System.out.print("Your magic attack increased, and went up to " + magictemp + " " + magic);
  hp = hp + 10;
  System.out.println("Your hp has increased, and went up to " + hp + "/" + ohp + " hp.");
       
     }
    hp = hp - Math.round(edamage / 2);
    hp = hp + Math.round(hp * 0.1);
    System.out.println("You choose to tank the hit taking half damage, leaving you with " + hp + "/" + ohp + " hp.");
    
    System.out.println(" ");
    System.out.println("However, you healed by 10% of your current hp, giving you " + hp + "/" + ohp + " hp.");
    
}
 else if (choice.charAt(0) == 'u' || choice.charAt(0) == 'U')
   
   {
     if (weapon == 1)
   {
      // pettemp = pettemp - 3;
       if (pettemp <= 0)
     {
       if (petlow == 0)
       {
       magictemp = magictemp - (Math.round(magictemp * 0.5));
       hp = hp - (Math.round(hp * 0.3));
       petlow ++;
     System.out.println("Oh no! Your pet lost its encouragement, and so your powers have been greatly weakened.");
                                System.out.println(" ");
                                System.out.println("Your hp is now " + hp + "/" + ohp + " and your magic is now " + magictemp + "/" + magic + ".");
                                }
}
       else
       {
         if (staminatemp >= stamina)
  {
   mathme1 = (int) ((Math.random() * 12) + 1);
   mathme2 = (int) ((Math.random() * 12) + 1);
   System.out.println("Now tell me, what is " + mathme1 + " times " + mathme2 + "?");
   mathinput = MyInput.nextInt();
   if (mathinput == mathme1 * mathme2)
   {
     System.out.println("Ah, you got me!");
     System.out.println(" ");
   pettemp = pet;
   System.out.println("It's not over yet! You gave your pet encouragement, healing it up to " + pettemp + "/" + pet + " hp.");
   System.out.println("Wow, look at that damage! Just kidding, you did 0 damage to the enemy. Instead, you gave encouragement to your pet, healing it back to full hp.");
   System.out.println("You may be disappointed, but you shouldnt be, because if your pet gives up, all of your stats ar heavily decreased. Make sure to use this every few turns!");
   staminatemp = 0;
   System.out.println("You did a ultimate attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
   }
   else if (mathinput != mathme1 * mathme2)
   {
     System.out.println("Haha, nope!");
   }
   
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   
  
                         }
         else if (staminatemp < stamina)
         {
           
    System.out.println("You're out of stamina, you can't attack!");
     hp = hp - (edamage);
     System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
     
     }
       }
     }
else if (weapon == 2)
{
  if (staminatemp >= stamina)
  {
    mathme1 = (int) ((Math.random() * 12) + 1);
   mathme2 = (int) ((Math.random() * 12) + 1);
   System.out.println("Now tell me, what is " + mathme1 + " times " + mathme2 + "?");
   mathinput = MyInput.nextInt();
   if (mathinput == mathme1 * mathme2)
   {
     System.out.println("Ah, you got me!");
   magictemp = magictemp + (edamage);
   System.out.println(" ");
   System.out.println("You used, Predators Carnival! You stole the enemies attack, and added it to yours for the rest of the fight. Your magic attack is now: " + magictemp + "/" + magic);
   staminatemp = 0;
   System.out.println("You did an ultimate attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
   }
   else if (mathinput != mathme1 * mathme2)
   {
     System.out.println("Haha, nope!");
     System.out.println(" ");
   }
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   
  }
  else if (staminatemp < stamina)
         {
           
    System.out.println("You're out of stamina, you can't attack!");
     hp = hp - (edamage);
     System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
    
     }
}
else if (weapon == 3)
{
  if (staminatemp >= stamina)
  {
   mathme1 = (int) ((Math.random() * 12) + 1);
   mathme2 = (int) ((Math.random() * 12) + 1);
   System.out.println("Now tell me, what is " + mathme1 + " times " + mathme2 + "?");
   mathinput = MyInput.nextInt();
   if (mathinput == mathme1 * mathme2)
   {
     System.out.println("Ah, you got me!");
  System.out.println(" ");
  System.out.println("You used, Trrrriple Kill! You get to attack three times in arow, each hit giving you a chance to get a critical hit!");
  for (int gunhits = 0; gunhits != 3; gunhits++)
  {
   crit = (int) ((Math.random() * 6) + 1);
   if (crit == 1 || crit == 6)
   {
     System.out.println(" ");
   ehptemp = ehptemp - (atcktemp * 2);
   System.out.println("Headshot! You brought the enemy down to " + ehptemp + "/" + ehp + " hp.");
   
   staminatemp =  0;
   System.out.println("You did a basic attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
   }
   else
   { 
     System.out.println(" ");
      ehptemp = ehptemp - (atcktemp);
      System.out.println("Not a headshot, but you still brought the enemy down to " + ehptemp + "/" + ehp + " hp.");
     
      staminatemp = 0;
   System.out.println("You did a basic attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
   }
   
   
  }
  
  System.out.println(" ");
  System.out.println("Now that's a lot of damage! With three hits You brought the enemy down to " + ehptemp + "/" + ehp + " hp!");
  
  System.out.println("You did an ultimate attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
   }
   else if (mathinput != mathme1 * mathme2)
   {
     System.out.println("Haha, nope!");
     System.out.println(" ");
   }
  if (ehptemp > 0)
   {
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
  
   }
  //////////////////////////////////////////////////////////////////////// else
}
  
  else if (staminatemp < stamina)
         {
           
    System.out.println("You're out of stamina, you can't attack!");
     hp = hp - (edamage);
     System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
    
     }
}
  
else if (weapon == 4)
{ 
  if (staminatemp >= stamina)
  {
    mathme1 = (int) ((Math.random() * 12) + 1);
   mathme2 = (int) ((Math.random() * 12) + 1);
   System.out.println("Now tell me, what is " + mathme1 + " times " + mathme2 + "?");
   mathinput = MyInput.nextInt();
   if (mathinput == mathme1 * mathme2)
   {
     System.out.println("Ah, you got me!");
  atcktemp = atcktemp + (countme * 10);
  magictemp = magictemp + (countme * 10);
  System.out.println("Going all out, you use, 'The One Above All'! All of the turns you stalled up are added to your attack and magic!");
  staminatemp = 0;
  System.out.println("Your attack has went up to... " + atcktemp + "/" + atck + "??!!");
  System.out.println("Your magic attack has went up to... " + magictemp + "/" + magic + "??!!");
  System.out.println("You did a ultimate attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
   }
   else if (mathinput != mathme1 * mathme2)
   {
     System.out.println("Haha, nope!");
     System.out.println(" ");
   }
  hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   
  }
else if (staminatemp < stamina)
         {
           
    System.out.println("You're out of stamina, you can't attack!");
     hp = hp - (edamage);
     System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
    
     }
   
   }
   //countme ++;
   }
 else if (choice.charAt(0) == 'i' || choice.charAt(0) == 'I')
 {
   if (weapon == 1)
   {
     
     
     if (pettemp <= 0)
     {
       
       if (petlow == 0)
       {
       magictemp = magictemp - (Math.round(magictemp * 0.5));
       hp = hp - (Math.round(hp * 0.3));
       petlow ++;
       System.out.println("Oh no! Your pet lost its encouragement, and so your powers have been greatly weakened.");
                                System.out.println(" ");
                                System.out.println("Your hp is now " + hp + "/" + ohp + " and your magic is now " + magictemp + "/" + magic + ".");
     }
     
   }
     pettemp = pettemp - 2;
     System.out.println("Your pets hp has dropped too " + pettemp + "/10");
   }
   while (cnn != 20)
   {
     System.out.println("Inventory slot " + cnn + ":" + inventory[cnn]);
     cnn ++;
   }
   System.out.println("Type in the inventory slot of the item you would like to use.");
   choicenum = MyInput.nextInt();
   
   if (inventory[choicenum] == "Hpotion")
   {
     healthup = 0;
    while (healthup != 50 && hp < ohp)
    {
      if (Math.round(hp) != ohp)
      {
    hp = hp + 1;
    
    healthup ++;
      }
    }
    inventory[choicenum] = "";
    System.out.println(" ");
    System.out.println("You healed up to " + hp + "/" + ohp + " hp! You will almost never go over your max hp, however there are some cases where it may."); // ??
  }
   else if (inventory[choicenum] == "AttackUp")
   {
     atcktemp = atcktemp + 20;
     inventory[choicenum] = "";
     System.out.println(" ");
     System.out.println("Your attack was raised up to " + atcktemp + " from " + atck + " for the rest of the fight!");
   }
   else if (inventory[choicenum] == "StaminaUp")
   {
    staminaup = 0;
    while (staminaup != 4 && staminatemp < stamina)
    {
      if (Math.round(staminatemp) != stamina)
      {
    staminatemp = staminatemp + 1;
    
     staminaup ++;
 }
    }
   }
   else if (inventory[choicenum] == "MagicUp")
   {
     magictemp = magictemp + 20;
     inventory[choicenum] = "";
     System.out.println(" ");
     System.out.println("Your magic attack was raised up to " + magictemp + " from " + magic + " for the rest of the fight!");
   }
   hp = hp - edamage;
   System.out.println("The enemy has brought you down to " + hp + "/" + ohp + " hp.");
   
   cnn = 0;
 }
   
   if (choice.charAt(0) == 'a' || choice.charAt(0) == 'b' || choice.charAt(0) == 'u' || choice.charAt(0) == 'i')
   {
   countme ++;
   if (staminatemp != stamina)
   {
   staminatemp ++;
   }
     }
  }
  if (hp > 0 && ehptemp <= 0)
 {
   System.out.println(" ");
   System.out.println("You win!");
   System.out.println("The bearded man is laying on the floor, and he looks up at you with a face of surrender.");
  System.out.println("It is too weak to stand back up. It could always come back to attack you later, so do you choose to kill it, or let it escape?");
  System.out.println("Type in 's' to spare him, or 'k' to finish him off.");
  choice = MyInput.nextLine();
  choice = MyInput.nextLine();
     if (choice.charAt(0) == 's' || choice.charAt(0) == 'S')
  {
       gkarma ++;
       System.out.println(" 'Oh, you're letting me live? But... I tried to kill you...' The man says in confusion.");
    System.out.println("You choose to let the bearded man live and walk away.");
    System.out.println(" ");
   
    xp = xp + 10;
    System.out.println("You gained " + xp + "/10 experience!");
    if (xp >= 10)
    {
      xp = xp - 10;
      lvl ++;
     System.out.println("You leveled up to level " + lvl + "!");
     while (lvlup != 2)
     {
     System.out.println("Which of these statistics would you like to power up?");
     System.out.println("Attack: " + atck);
     System.out.println("Magic: " + magic);
     System.out.println("Health: " + ohp);
     System.out.println("Stamina: " + stamina);
     System.out.println(" ");
     System.out.println("Type in 'a' or attack, 'm' for magic, 'h' for health, or 's' for stamina.");
     choice = MyInput.nextLine();
     if (choice.charAt(0) == 'a')
     {
       atck = atck + 10;
       System.out.println("You're attack was raised by 10, giving you an attack stat of " + atck);
     }
     else if (choice.charAt(0) == 'm')
     {
       magic = magic + 10;
       System.out.println("You're magic attack was raised by 10, giving you an magic attack stat of " + magic);
     }
else if (choice.charAt(0) == 'h')
     {
       ohp = ohp + 10;
       System.out.println("You're health was raised by 10, giving you an hp stat of " + ohp);
     }
else if (choice.charAt(0) == 's')
     {
       stamina = stamina + 1;
       System.out.println("You're stamina was raised by 1, giving you an stamina stat of " + stamina);
     }
    win = 1;
    lvlup ++;
 }
    }
  }
  else if (choice.charAt(0) == 'k' || choice.charAt(0) == 'K')
  {
    System.out.println("You choose to kill the bearded man, and move on.");
    System.out.println(" ");
   bkarma ++;
    xp = xp + 10;
    System.out.println("You gained " + xp + "/10 experience!");
    if (xp >= 10)
    {
      xp = xp - 10;
      lvl ++;
     System.out.println("You leveled up to level " + lvl + "!");
     while (lvlup != 2)
     {
     System.out.println("Which of these statistics would you like to power up?");
     System.out.println("Attack: " + atck);
     System.out.println("Magic: " + magic);
     System.out.println("Health: " + ohp);
     System.out.println("Stamina: " + stamina);
     System.out.println(" ");
     System.out.println("Type in 'a' or attack, 'm' for magic, 'h' for health, or 's' for stamina.");
     choice = MyInput.nextLine();
     if (choice.charAt(0) == 'a')
     {
       atck = atck + 10;
       System.out.println("You're attack was raised by 10, giving you an attack stat of " + atck);
     }
     else if (choice.charAt(0) == 'm')
     {
       magic = magic + 10;
       System.out.println("You're magic attack was raised by 10, giving you an magic attack stat of " + magic);
     }
else if (choice.charAt(0) == 'h')
     {
       ohp = ohp + 10;
       System.out.println("You're health was raised by 10, giving you an hp stat of " + ohp);
     }
else if (choice.charAt(0) == 's')
     {
       stamina = stamina + 1;
       System.out.println("You're stamina was raised by 1, giving you an stamina stat of " + stamina);
     }
    win = 1;
    lvlup ++;
 }
    }
  }
  money = money + 100;
  System.out.println(" ");
    System.out.println("You got 100 gold from this fight. This is what you use to buy items which can help you in battle. Your balance is now " + money);
   }
 else if (ehptemp > 0 && hp <= 0)
 {
   System.out.println(" ");
   System.out.println("Really... You died.");
    win = 0;
 }
  
   
   
  }
  else if (gametime == 6)
  {
   System.out.println("Welcome to the market, feel free to buy any of these items.");
   System.out.println(" ");
   System.out.println("Please enter the number of the item you would want to buy, and press zero to stop buying items.");
   System.out.println("Item 1: Hpotion, Heals your hp by 50 points, 150 gold.");
   System.out.println("Item 2: AttackUp, Boosts your attack by 20 for the fight, 150 gold.");
   System.out.println("Item 3: StaminaUp, Heals your stamina by 4 points, 150 gold.");
   System.out.println("Item 4: MagicUp, Boosts your magic by 20 for the fight, 150 gold.");
   System.out.println("Item 5: BigHpotion, Heals your hp by 100, 250 gold.");
   System.out.println("Item 6: BigAttackUp, Boosts your attack by 40 for the fight, 250 gold.");
   System.out.println("Item 7: BigStaminaUp, Heals your stamina to full, 250 gold.");
   System.out.println("Item 8: BigMagicUp, Boosts your magic by 40 for the fight, 250 gold.");
   
   
   choicenum = MyInput.nextInt();
      cnn = 0;
      if (money >= 150)
      {
     if (choicenum == 1)
     {
       
       while (cnn != 20)
       {
         if (inventory[cnn] == "")
         {
           if (cnn != 19)
           {
             
           inventory[cnn] = "Hpotion";
           System.out.println("Inventory slot " + cnn + ": " + inventory[cnn]);
           cnn = 19;
           System.out.println("Well, I hope you enjoy your brand new item! The shop will open every few levels, and each time there may be more powerful goods for you to buy.");
           }
         
           
}
   cnn ++;
}
     }
     else if (choicenum == 2)
     {
       while (cnn != 20)
       {
         if (inventory[cnn] == "")
         {
           if (cnn != 19)
           {
             
           inventory[cnn] = "AttackUp";
           System.out.println("Inventory slot " + cnn + ": " + inventory[cnn]);
         System.out.println("Well, I hope you enjoy your brand new item! The shop will open every few levels, and each time there may be more powerful goods for you to buy.");
             
           cnn = 19;
           }
                           
}
cnn ++; 
       
}
     }
      if (choicenum == 3)
     {
       while (cnn != 20)
       {
         
         if (inventory[cnn] == "")
         {
           if (cnn != 19)
           {
             
           inventory[cnn] = "StaminaUp";
           System.out.println("Inventory slot " + cnn + ": " + inventory[cnn]);
           System.out.println("Well, I hope you enjoy your brand new item! The shop will open every few levels, and each time there may be more powerful goods for you to buy.");
           
           cnn = 19;
           }
         
                               
}
cnn ++;
       
}
      }
      else if (choicenum == 4)
      {
        while (cnn != 20)
       {
         if (inventory[cnn] == "")
         {
           if (cnn != 19)
           {
             
           inventory[cnn] = "MagicUp";
           System.out.println("Inventory slot " + cnn + ": " + inventory[cnn]);
         System.out.println("Well, I hope you enjoy your brand new item! The shop will open every few levels, and each time there may be more powerful goods for you to buy.");
             
           cnn = 19;
           }
                           
}
cnn ++; 
      }
      }
      money = money - 150;
      System.out.println("Your new balance is " + money);
      }
      if (money >= 250)
      {
      if (choicenum == 5)
     {
       
       while (cnn != 20)
       {
         if (inventory[cnn] == "")
         {
           if (cnn != 19)
           {
             
           inventory[cnn] = "BigHpotion";
           System.out.println("Inventory slot " + cnn + ": " + inventory[cnn]);
           cnn = 19;
           System.out.println("Well, I hope you enjoy your brand new item! The shop will open every few levels, and each time there may be more powerful goods for you to buy.");
           }
         
           
}
   cnn ++;
}
     }
     
     else if (choicenum == 6)
     {
       while (cnn != 20)
       {
         if (inventory[cnn] == "")
         {
           if (cnn != 19)
           {
             
           inventory[cnn] = "BigAttackUp";
           System.out.println("Inventory slot " + cnn + ": " + inventory[cnn]);
         System.out.println("Well, I hope you enjoy your brand new item! The shop will open every few levels, and each time there may be more powerful goods for you to buy.");
             
           cnn = 19;
           }
                           
}
cnn ++; 
       
}
      
  }
     else if (choicenum == 7)
     {
       while (cnn != 20)
       {
         if (inventory[cnn] == "")
         {
           if (cnn != 19)
           {
             
           inventory[cnn] = "BigStaminaUp";
           System.out.println("Inventory slot " + cnn + ": " + inventory[cnn]);
         System.out.println("Well, I hope you enjoy your brand new item! The shop will open every few levels, and each time there may be more powerful goods for you to buy.");
             
           cnn = 19;
           }
                           
}
cnn ++; 
       
}
     }
     else if (choicenum == 8)
     {
       while (cnn != 20)
       {
         if (inventory[cnn] == "")
         {
           if (cnn != 19)
           {
             
           inventory[cnn] = "BigMagicUp";
           System.out.println("Inventory slot " + cnn + ": " + inventory[cnn]);
         System.out.println("Well, I hope you enjoy your brand new item! The shop will open every few levels, and each time there may be more powerful goods for you to buy.");
            
           cnn = 19;
           }
                           
}
cnn ++; 
       
}
  }
     money = money - 250;
     System.out.println("Your new balance is " + money);
      }
  }
  else if (gametime == 7)
  {
    if (countme == 0)
      {
      ehp = 270;
      ehptemp = ehp;
  edamage = 40;
  hp = ohp;
  pettemp = pet;
  staminatemp = stamina;
  atcktemp = atck;
  magictemp = magic;
   System.out.println(" ");
   System.out.println(" ");
    System.out.println(" ");
   System.out.println(" ");
    System.out.println(" ");
   System.out.println(" ");
   System.out.println("Level 6: You're Too Slow.");
   System.out.println(" ");
   System.out.println("Beating the bearded man, " + Name + " leaves the lodge to show respect and continues trekking  along the winter climate.");
   System.out.println("That is until, they stumble across a lake that is completely frozen over.");
    System.out.println("Suddenly, " + Name + " is teleported into the center of the lake, where a ice skater awaits them.");
    System.out.println("Without a word, the ice skater immediatly starts to skate towards " + Name + " at an incredible pace.");
    System.out.println(" ");
    System.out.println(" 'I will give you notice now. My attacks will hit before yours.' The skater says in a robotic tone.");
    System.out.println("Battle Begin!");
    
    }
    else if (countme > 0) //Once again this makes sure that the users statistics only set to the max on the first turn.
    {
      edamage = edamage;
    ehptemp = ehptemp;
    hp = hp;
    atcktemp = atcktemp;
    staminatemp = staminatemp;
    magictemp = magictemp;
   pettemp = pettemp;
    }
    
    while (hp > 0 && ehptemp > 0)
    {
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("Would you like to 'a'ttack, 'b'lock, use an 'u'ltimate ability, or use an item from your 'i'nventory?");
    System.out.println(" ");
    System.out.println(Name + ": Hp - " + hp + "/" + ohp + " Stamina - " + staminatemp + "/" + stamina + " Attack - " + atcktemp + "Magic Attack - " + magictemp);
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("Skater: Hp - " + ehptemp + "/" + ehp + " Attack - " + edamage);
    choice = MyInput.nextLine();
    System.out.println(" ");
    choice = MyInput.nextLine();
 
  if (choice.charAt(0) == 'a' || choice.charAt(0) == 'A')
  {
   if (weapon == 1)
   {
    // pettemp = pettemp - 3;
     if (pettemp <= 0)
     {
       if (petlow == 0)
       {
       magictemp = magictemp - (Math.round(magictemp * 0.5));
       hp = hp - (Math.round(hp * 0.3));
       petlow ++;
     System.out.println("Oh no! Your pet lost its encouragement, and so your powers have been greatly weakened.");
                                System.out.println(" ");
                                System.out.println("Your hp is now " + hp + "/" + ohp + " and your magic is now " + magictemp + "/" + magic + ".");
                                }
}
     
   if (staminatemp >= 2)
   {
     
  
   if (ehptemp > 0) //This battle flips around the mechanics, and makes it so that the enemy hits before the user by simply putting it on top of the users own attack pattern.
   {
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   
   }
   if (hp > 0)
   {
   ehptemp = ehptemp - Math.round(magictemp / 2);
   System.out.println("You brought the enemy down to" + ehptemp + "/" + ehp+ " hp.");
   
   pettemp = pettemp - 2;
   
   System.out.println("Pet hp: " + pettemp  + "/" + pet + ". This is the current hp of your pet, which drops by 33% each turn.");
   
   staminatemp = staminatemp - 2;
   
   System.out.println("You did a basic attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
   }
   
   }
   else if (staminatemp < 2)
   {
     System.out.println("You're out of stamina, you can't attack!");
     
     hp = hp - (edamage);
     
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   
   pettemp = pettemp - 2;
   System.out.println("Pet hp: " + pettemp  + "/" + pet + ". This is the current hp of your pet, which drops by 33% each turn.");
  
      }
   }
   
else if (weapon == 2)
{
  if (staminatemp >= 2)
  {
    if (ehptemp > 0)
   {
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   
   hp = hp + Math.round(ehptemp * 0.10);
    System.out.println("Your hp is now " + hp + "/" + ohp + "." + "This is due to your lifesteal, which gives you 10% of the opponents hp each turn and takes it from them.");
   }
     if (hp > 0)
   {
   ehptemp = ehptemp - Math.round((ehp * 0.10) + magictemp);
  System.out.println("You brought the enemy down to" + ehptemp + "/" + ehp + " hp.");
    
   staminatemp = staminatemp - 2;
   System.out.println("You did a basic attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
     }
  }
  else if (staminatemp < 2)
  {
     System.out.println("You're out of stamina, you can't attack!");
     hp = hp - (edamage);
     System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
     
  }
}
else if (weapon == 3)
{
  if (staminatemp >= 2)
  {
   crit = (int) ((Math.random() * 6) + 1);
   if (crit == 1 || crit == 6)
   {
   if (ehptemp > 0)
   {
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   
   }
    if (hp > 0)
   {
     ehptemp = ehptemp - (atcktemp * 2);
   System.out.println("Headshot! You brought the enemy down to " + ehptemp + "/" + ehp + " hp.");
    
   staminatemp = staminatemp - 2;
   System.out.println("You did a basic attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
    }
   }
   else
   {
     if (ehptemp > 0)
   {
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   
   }
      if (hp > 0)
   {
      ehptemp = ehptemp - (atcktemp);
      System.out.println("Not a headshot, but you still brought the enemy down to " + ehptemp + "/" + ehp + " hp.");
      
      staminatemp = staminatemp - 2;
   System.out.println("You did a basic attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
      }
   }
  }
  else if (staminatemp < 2)
  {
     System.out.println("You're out of stamina, you can't attack!");
     hp = hp - (edamage);
     System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
     
  }
  //////////////////////////////////////////////////////////////////////// else
}
else if (weapon == 4)
{
  if (staminatemp >= 2)
  {
  atcktemp = atcktemp + 10;
  System.out.println("Your attack increased, and went up to " + atcktemp + " " + atck);
  magictemp = magictemp + 10;
  System.out.print("Your magic attack increased, and went up to " + magictemp + " " + magic);
  hp = hp + 10;
  System.out.println("Your hp has increased, and went up to " + hp + "/" + ohp + " hp.");
  if (ehptemp > 0)
   {
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   
   }
   if (hp > 0)
   {
  ehptemp = ehptemp - (atcktemp + magictemp);
  System.out.println("Bring the heat! You flame-punched the enemy down to " + ehptemp + "/" + ehp + " hp.");
   
   staminatemp = staminatemp - 2;
   System.out.println("You did a basic attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
   }
  }
  else if (staminatemp < 2)
  {
    System.out.println("You're out of stamina, you can't attack!");
     hp = hp - (edamage);
     System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
    
  }
  
  }
  //countme ++;
  }
   else if (choice.charAt(0) == 'b' || choice.charAt(0) == 'B' )
  {
     if (weapon == 1)
     {
       pettemp = pettemp - 2;
       if (pettemp <= 0)
     {
       if (petlow == 0)
       {
       magictemp = magictemp - (Math.round(magictemp * 0.5));
       hp = hp - (Math.round(hp * 0.3));
       petlow ++;
     System.out.println("Oh no! Your pet lost its encouragement, and so your powers have been greatly weakened.");
                                System.out.println(" ");
                                System.out.println("Your hp is now " + hp + "/" + ohp + " and your magic is now " + magictemp + "/" + magic + ".");
                                }
}
}
     if (weapon == 4)
     {
       
       atcktemp = atcktemp + 10;
  System.out.println("Your attack increased, and went up to " + atcktemp + " " + atck);
  magictemp = magictemp + 10;
  System.out.print("Your magic attack increased, and went up to " + magictemp + " " + magic);
  hp = hp + 10;
  System.out.println("Your hp has increased, and went up to " + hp + "/" + ohp + " hp.");
       
     }
    hp = hp - Math.round(edamage / 2);
    hp = hp + Math.round(hp * 0.1);
    System.out.println("You choose to tank the hit taking half damage, leaving you with " + hp + "/" + ohp + " hp.");
    
    System.out.println(" ");
    System.out.println("However, you healed by 10% of your current hp, giving you " + hp + "/" + ohp + " hp.");
    
}
 else if (choice.charAt(0) == 'u' || choice.charAt(0) == 'U')
   
   {
     if (weapon == 1)
   {
      // pettemp = pettemp - 3;
       if (pettemp <= 0)
     {
       if (petlow == 0)
       {
       magictemp = magictemp - (Math.round(magictemp * 0.5));
       hp = hp - (Math.round(hp * 0.3));
       petlow ++;
     System.out.println("Oh no! Your pet lost its encouragement, and so your powers have been greatly weakened.");
                                System.out.println(" ");
                                System.out.println("Your hp is now " + hp + "/" + ohp + " and your magic is now " + magictemp + "/" + magic + ".");
                                }
}
       else
       {
         if (staminatemp >= stamina)
  {
           hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
    if (hp > 0)
   {
   pettemp = pet;
   System.out.println("It's not over yet! You gave your pet encouragement, healing it up to " + pettemp + "/" + pet + " hp.");
   System.out.println("Wow, look at that damage! Just kidding, you did 0 damage to the enemy. Instead, you gave encouragement to your pet, healing it back to full hp.");
   System.out.println("You may be disappointed, but you shouldnt be, because if your pet gives up, all of your stats ar heavily decreased. Make sure to use this every few turns!");
   staminatemp = 0;
   System.out.println("You did a ultimate attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
    }
   
  
                         }
         else if (staminatemp < stamina)
         {
           
    System.out.println("You're out of stamina, you can't attack!");
     hp = hp - (edamage);
     System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
     
     }
       }
     }
else if (weapon == 2)
{
  if (staminatemp >= stamina)
  {
    hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
    if (hp > 0)
   {
   magictemp = magictemp + (edamage);
   System.out.println(" ");
   System.out.println("You used, Predators Carnival! You stole the enemies attack, and added it to yours for the rest of the fight. Your magic attack is now: " + magictemp + "/" + magic);
   staminatemp = 0;
   System.out.println("You did an ultimate attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
    }
   
  }
  else if (staminatemp < stamina)
         {
           
    System.out.println("You're out of stamina, you can't attack!");
     hp = hp - (edamage);
     System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
    
     }
}
else if (weapon == 3)
{
  if (staminatemp >= stamina)
  {
    if (ehptemp > 0)
   {
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
  
   }
     if (hp > 0)
   {
  System.out.println(" ");
  System.out.println("You used, Trrrriple Kill! You get to attack three times in arow, each hit giving you a chance to get a critical hit!");
  for (int gunhits = 0; gunhits != 3; gunhits++)
  {
   crit = (int) ((Math.random() * 6) + 1);
   if (crit == 1 || crit == 6)
   {
     System.out.println(" ");
   ehptemp = ehptemp - (atcktemp * 2);
   System.out.println("Headshot! You brought the enemy down to " + ehptemp + "/" + ehp + " hp.");
   
   staminatemp =  0;
   System.out.println("You did a basic attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
   }
   else
   { 
     System.out.println(" ");
      ehptemp = ehptemp - (atcktemp);
      System.out.println("Not a headshot, but you still brought the enemy down to " + ehptemp + "/" + ehp + " hp.");
     
      staminatemp = 0;
   System.out.println("You did a basic attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
   }
   
   
  }
     }
  System.out.println(" ");
  System.out.println("Now that's a lot of damage! With three hits You brought the enemy down to " + ehptemp + "/" + ehp + " hp!");
  
  System.out.println("You did an ultimate attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
  
  //////////////////////////////////////////////////////////////////////// else
}
  
  else if (staminatemp < stamina)
         {
           
    System.out.println("You're out of stamina, you can't attack!");
     hp = hp - (edamage);
     System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
    
     }
}
  
else if (weapon == 4)
{ 
  if (staminatemp >= stamina)
  {
     hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
    if (hp > 0)
   {
  atcktemp = atcktemp + (countme * 10);
  magictemp = magictemp + (countme * 10);
  System.out.println("Going all out, you use, 'The One Above All'! All of the turns you stalled up are added to your attack and magic!");
  staminatemp = 0;
  System.out.println("Your attack has went up to... " + atcktemp + "/" + atck + "??!!");
  System.out.println("Your magic attack has went up to... " + magictemp + "/" + magic + "??!!");
  System.out.println("You did a ultimate attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
    }
   
  }
else if (staminatemp < stamina)
         {
           
    System.out.println("You're out of stamina, you can't attack!");
     hp = hp - (edamage);
     System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
    
     }
   
   }
   //countme ++;
   }
 else if (choice.charAt(0) == 'i' || choice.charAt(0) == 'I')
 {
   hp = hp - edamage; //Even when the user uses an item the enemy attacks first.
   
   System.out.println("The enemy has brought you down to " + hp + "/" + ohp + " hp.");
   
   if (weapon == 1) //Only class 1's ability is still active in the inventory.
   {
    
     
     if (pettemp <= 0)
     {
       if (petlow == 0)
       {
       magictemp = magictemp - (Math.round(magictemp * 0.5));
       hp = hp - (Math.round(hp * 0.3));
       petlow ++;
       System.out.println("Oh no! Your pet lost its encouragement, and so your powers have been greatly weakened.");
                                System.out.println(" ");
                                System.out.println("Your hp is now " + hp + "/" + ohp + " and your magic is now " + magictemp + "/" + magic + ".");
     }
     
   }
     pettemp = pettemp - 2;
     System.out.println("Your pets hp has dropped too " + pettemp + "/10");
   }
   
   
   while (cnn != 20)
   {
     System.out.println("Inventory slot " + cnn + ":" + inventory[cnn]);
     cnn ++;
   }
   System.out.println("Type in the inventory slot of the item you would like to use.");
   choicenum = MyInput.nextInt();
   
   if (inventory[choicenum] == "Hpotion")
   {
     healthup = 0;
    while (healthup != 50 && hp < ohp)
    {
      if (Math.round(hp) != ohp)
      {
    hp = hp + 1;
    
    healthup ++;
      }
    }
    inventory[choicenum] = "";
    System.out.println(" ");
    System.out.println("You healed up to " + hp + "/" + ohp + " hp! You will almost never go over your max hp, however there are some cases where it may."); // ??
  }
   
   
   else if (inventory[choicenum] == "AttackUp")
   {
     atcktemp = atcktemp + 20;
     inventory[choicenum] = "";
     System.out.println(" ");
     System.out.println("Your attack was raised up to " + atcktemp + " from " + atck + " for the rest of the fight!");
   }
   
   
   else if (inventory[choicenum] == "StaminaUp")
   {
    staminaup = 0;
    while (staminaup != 4 && staminatemp < stamina)
    {
      if (Math.round(staminatemp) != stamina)
      {
    staminatemp = staminatemp + 1;
    
     staminaup ++;
 }
    }
   }
   
   
    else if (inventory[choicenum] == "MagicUp")
   {
     magictemp = magictemp + 20;
     inventory[choicenum] = "";
     System.out.println(" ");
     System.out.println("Your magic attack was raised up to " + atcktemp + " from " + atck + " for the rest of the fight!");
   }
    
    
  else if (inventory[choicenum] == "BigHpotion")
   {
     healthup = 0;
    while (healthup != 100 && hp < ohp)
    {
      if (Math.round(hp) != ohp)
      {
    hp = hp + 1;
    
    healthup ++;
      }
    }
    inventory[choicenum] = "";
    System.out.println(" ");
    System.out.println("You healed up to " + hp + "/" + ohp + " hp! You will almost never go over your max hp, however there are some cases where it may."); // ??
  }
  
  
  else if (inventory[choicenum] == "BigAttackUp")
   {
     atcktemp = atcktemp + 40;
     inventory[choicenum] = "";
     System.out.println(" ");
     System.out.println("Your attack was raised up to " + atcktemp + " from " + atck + " for the rest of the fight!");
   }
  else if (inventory[choicenum] == "BigStaminaUp")
   {
    staminaup = 0;
    while (staminatemp < stamina)
    {
      if (Math.round(staminatemp) != stamina)
      {
    staminatemp = staminatemp + 1;
    
     staminaup ++;
 }
    }
   }
  else if (inventory[choicenum] == "BigMagicUp")
   {
     magictemp = magictemp + 40;
     inventory[choicenum] = "";
     System.out.println(" ");
     System.out.println("Your magic attack was raised up to " + atcktemp + " from " + atck + " for the rest of the fight!");
   }
  
   cnn = 0;
 }
   
   if (choice.charAt(0) == 'a' || choice.charAt(0) == 'b' || choice.charAt(0) == 'u' || choice.charAt(0) == 'i')
   {
   countme ++;
   if (staminatemp != stamina)
   {
   staminatemp ++;
   }
   
     }
  }
  if (hp > 0 && ehptemp <= 0)
 {
   System.out.println(" ");
   System.out.println("You win!");
   System.out.println("The skater lays on the ice.");
  System.out.println("It is too weak to stand back up. It could always come back to attack you later, so do you choose to kill it, or let it escape?");
  System.out.println("Type in 's' to spare it, or 'k' to finish it off.");
  choice = MyInput.nextLine();
     if (choice.charAt(0) == 's' || choice.charAt(0) == 'S')
  {
       gkarma ++;
    System.out.println("You choose to let the skater live and walk away.");
    System.out.println(" ");
   
    xp = xp + 8;
    System.out.println("You gained " + xp + "/10 experience!");
    if (xp >= 10)
    {
      xp = xp - 10;
      lvl ++;
     System.out.println("You leveled up to level " + lvl + "!");
     while (lvlup != 2)
     {
     System.out.println("Which of these statistics would you like to power up?");
     System.out.println("Attack: " + atck);
     System.out.println("Magic: " + magic);
     System.out.println("Health: " + ohp);
     System.out.println("Stamina: " + stamina);
     System.out.println(" ");
     System.out.println("Type in 'a' or attack, 'm' for magic, 'h' for health, or 's' for stamina.");
     choice = MyInput.nextLine();
     if (choice.charAt(0) == 'a')
     {
       atck = atck + 10;
       System.out.println("You're attack was raised by 10, giving you an attack stat of " + atck);
     }
     else if (choice.charAt(0) == 'm')
     {
       magic = magic + 10;
       System.out.println("You're magic attack was raised by 10, giving you an magic attack stat of " + magic);
     }
else if (choice.charAt(0) == 'h')
     {
       ohp = ohp + 10;
       System.out.println("You're health was raised by 10, giving you an hp stat of " + ohp);
     }
else if (choice.charAt(0) == 's')
     {
       stamina = stamina + 1;
       System.out.println("You're stamina was raised by 1, giving you an stamina stat of " + stamina);
     }
    win = 1;
    lvlup ++;
 }
    }
  }
  else if (choice.charAt(0) == 'k' || choice.charAt(0) == 'K')
  {
    System.out.println("You choose to kill the skater, and move on.");
    System.out.println(" ");
    bkarma ++;
    xp = xp + 8;
    System.out.println("You gained " + xp + "/10 experience!");
    if (xp >= 10)
    {
      xp = xp - 10;
      lvl ++;
     System.out.println("You leveled up to level " + lvl + "!");
     while (lvlup != 2)
     {
     System.out.println("Which of these statistics would you like to power up?");
     System.out.println("Attack: " + atck);
     System.out.println("Magic: " + magic);
     System.out.println("Health: " + ohp);
     System.out.println("Stamina: " + stamina);
     System.out.println(" ");
     System.out.println("Type in 'a' or attack, 'm' for magic, 'h' for health, or 's' for stamina.");
     choice = MyInput.nextLine();
     if (choice.charAt(0) == 'a')
     {
       atck = atck + 10;
       System.out.println("You're attack was raised by 10, giving you an attack stat of " + atck);
     }
     else if (choice.charAt(0) == 'm')
     {
       magic = magic + 10;
       System.out.println("You're magic attack was raised by 10, giving you an magic attack stat of " + magic);
     }
else if (choice.charAt(0) == 'h')
     {
       ohp = ohp + 10;
       System.out.println("You're health was raised by 10, giving you an hp stat of " + ohp);
     }
else if (choice.charAt(0) == 's')
     {
       stamina = stamina + 1;
       System.out.println("You're stamina was raised by 1, giving you an stamina stat of " + stamina);
     }
    win = 1;
    lvlup ++;
 }
    }
  }
  money = money + 100;
  System.out.println(" ");
    System.out.println("You got 100 gold from this fight. This is what you use to buy items which can help you in battle. Your balance is now " + money);
  
   }
 else if (ehptemp > 0 && hp <= 0)
 {
   System.out.println(" ");
   System.out.println("Really... You died.");
    win = 0;
 }
  
  }
  else if (gametime == 8)
  {
    if (countme == 0)
      {
      if (gkarma > bkarma)
      {
      ehp = 270;
      ehptemp = ehp;
  edamage = 35;
    }
      else if (gkarma < bkarma)
      {
        ehp = 340;
      ehptemp = ehp;
  edamage = 40;
      }
  hp = ohp;
  pettemp = pet;
  staminatemp = stamina;
  atcktemp = atck;
  magictemp = magic;
  multihits = 0;
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("Level 7: The End.");
    System.out.println(" ");
    System.out.println(Name + " is walking in the endless snow, when suddenly a light starts flashing underneath them.");
    System.out.println("A second after, " + Name + " is teleported inside of an alleyway. A man in a trench coat sits on a chair a few meters away.");
    System.out.println(" 'Hey, what's with that face of yours? You seem nervous. So tell me, what are you planning on doing to me right now?' The strange man says.");
    System.out.println(" ");
    System.out.println("Type in the number corresponding to the way you would like to respond."); 
    System.out.println("1: 'I'll fight you, but I won't kill you.' ");
    System.out.println("2: 'We should negotiate and find a way around this.' ");
    System.out.println("3: 'I'll kill you to move on.' ");
    System.out.println("4: '...' ");
    conman = MyInput.nextInt(); //The user here chooses a number of one of the four options, making each one get a different response.
    
    if (conman == 1)
    {
      System.out.println(" ");
      System.out.println("Hmph, I suppose you're not a complete monster after all.");
      if (gkarma > bkarma)
      {
        System.out.println(" ");
        System.out.println("I suppose it makes sense, since you have spared more lives than you have taken.");
      } //The users karma is in use here.
      else if (gkarma < bkarma)
      {
        System.out.println(" ");
         System.out.println("It is strange though, since I've heard rumors that " + Name + " has taken more lives than they have spared.");
      }
    }
    else if (conman == 2)
    {
      System.out.println(" ");
      System.out.println(" 'I'm glad that you're a reasonable person after all.' The strange man says.");
      System.out.println(" 'But, however, I apologize, but we still must fight.' ");
      System.out.println(" ");
      System.out.println(" 'I will reward you though. In case you manage to beat me, take this. You will be able to use it in the future.' The strange man says as he throws a object towards you.");
      
        while (cnn != 20)
       {
         if (inventory[cnn] == "")
         {
           if (cnn != 19)
           {
           inventory[cnn] = "ConKey";
           System.out.println("Inventory slot " + cnn + ": " + inventory[cnn]);
           cnn = 19;
          //The user gets a gift from the enemy. However, it is useless. It is called the "conkey" after all.
           }
         
           
}
   cnn ++;
}
      System.out.println("The item that the man has given you is the 'conkey', and it will allow you to open something in the future.");
    }
    
    else if (conman == 3)
    {
      System.out.println(" ");
      if (gkarma > bkarma)
      {
      System.out.println(" 'Oh, really now?' ");
      System.out.println(" 'I thought the famous " + Name + " was supposed to be someone who didn't like to kill.' The man says.");
      }
      else if (gkarma < bkarma)
      {
        System.out.println(" 'Why am I not suprised? The rumors say that " + Name + " is a mindless monster who has killed people after all.' ");
      }
      
      hp = hp - 40;
      System.out.println("Out of nowhere, a high pressure impact hits " + Name + " and they are damaged, bringing them down to " + hp + "/" + ohp + " hp.");
    }
    else if (conman == 4)
    {
      System.out.println("'Ignoring people who are talking to you is rude, you know.' The man says.");
      hp = hp - 40;
      System.out.println("Out of nowhere, a high pressure impact hits " + Name + " and they are damaged, bringing them down to " + hp + "/" + ohp + " hp.");
    }
    System.out.println(" ");
    System.out.println("In this fight, your enemy will be able to hit multiple times in one turn based on random chance!");
    if (gkarma < bkarma)
    {
      System.out.println("Because you have killed more than you have spared... this battle will be practically impossible. Good Luck!");
    }
    System.out.println("Battle Begin!");
  }
    
    else if (countme > 0)
    {
     edamage = edamage;
    ehptemp = ehptemp;
    hp = hp;
    atcktemp = atcktemp;
    staminatemp = staminatemp;
    magictemp = magictemp;
   pettemp = pettemp;
    }
    
    while (hp > 0 && ehptemp > 0)
    {
      multihits = 0; //This must always be set to 0 at the start of the turn to reset the enemies attack pattern.
    System.out.println(" ");
    System.out.println("Would you like to 'a'ttack, 'b'lock, use an 'u'ltimate ability, or use an item from your 'i'nventory?");
    System.out.println(" ");
    System.out.println(Name + ": Hp - " + hp + "/" + ohp + " Stamina - " + staminatemp + "/" + stamina + " Attack - " + atcktemp + "Magic Attack - " + magictemp);
    System.out.println(" ");
    System.out.println("Strange Man: Hp - " + ehptemp + "/" + ehp + " Attack - " + edamage);
    choice = MyInput.nextLine(); //Needs 2 because normally it causes an error.
    System.out.println(" ");
    choice = MyInput.nextLine();
 
  if (choice.charAt(0) == 'a' || choice.charAt(0) == 'A')
  {
   if (weapon == 1)
   {
    
     if (pettemp <= 0)
     {
       if (petlow == 0)
       {
       magictemp = magictemp - (Math.round(magictemp * 0.5));
       hp = hp - (Math.round(hp * 0.3));
       petlow ++;
     System.out.println("Oh no! Your pet lost its encouragement, and so your powers have been greatly weakened.");
                                System.out.println(" ");
                                System.out.println("Your hp is now " + hp + "/" + ohp + " and your magic is now " + magictemp + "/" + magic + ".");
                                }
}
   if (staminatemp >= 2)
   {
   ehptemp = ehptemp - Math.round(magictemp / 2);
   System.out.println("You brought the enemy down to" + ehptemp + "/" + ehp+ " hp.");
   if (ehptemp > 0) 
   {
     while (multihits != 1) //This means that the enemy can attack more than once!
     {
   conhits = (int) ((Math.random() * conhits1) + 1); //Each turn, the chance of conhits equaling 1 decreases. The first hit is guarenteed as it is a random number from 1-1.
   if (conhits == 1)
   {
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   conhits1 ++; //This is because each time conhits does equal one, conhits1 is increased, making more possible numbers that could be chosen.
   }
   else if (conhits != 1)
   {
     System.out.println("The strange man hit you " + conhits1 + " times!");
     conhits1 = 1; //Once conhits does not end up equaling one, conhits1 is resest for the next time the enemy attacks.
     multihits = 1; //multihits is set to 1 to end the while statement. At the start of every turn multihits is set back to 0.
   }
   }
   }
   pettemp = pettemp - 2;
   System.out.println("Pet hp: " + pettemp  + "/" + pet + ". This is the current hp of your pet, which drops by 33% each turn.");
   staminatemp = staminatemp - 2;
   System.out.println("You did a basic attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
   }
   else if (staminatemp < 2)
   {
     System.out.println("You're out of stamina, you can't attack!");
     while (multihits != 1)
     {
   conhits = (int) ((Math.random() * conhits1) + 1);
   if (conhits == 1)
   {
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   conhits1 ++;
   }
   else if (conhits != 1)
   {
     System.out.println("The strange man hit you " + conhits1 + " times!");
     conhits1 = 1;
     multihits = 1;
   }
   }
   pettemp = pettemp - 2;
   System.out.println("Pet hp: " + pettemp  + "/" + pet + ". This is the current hp of your pet, which drops by 33% each turn.");
  
      }
   }
   
else if (weapon == 2)
{
  if (staminatemp >= 2)
  {
    
   ehptemp = ehptemp - Math.round((ehp * 0.10) + magictemp);
  System.out.println("You brought the enemy down to" + ehptemp + "/" + ehp + " hp.");
 
  
  if (ehptemp > 0)
   {
   while (multihits != 1)
     {
   conhits = (int) ((Math.random() * conhits1) + 1);
   if (conhits == 1)
   {
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   conhits1 ++;
   }
   else if (conhits != 1)
   {
     System.out.println("The strange man hit you " + conhits1 + " times!");
     conhits1 = 1;
     multihits = 1;
   }
   }
   
   hp = hp + Math.round(ehptemp * 0.10);
    System.out.println("Your hp is now " + hp + "/" + ohp + "." + "This is due to your lifesteal, which gives you 10% of the opponents hp each turn and takes it from them.");
   }
  
  // //
   
   staminatemp = staminatemp - 2;
   System.out.println("You did a basic attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
  }
  else if (staminatemp < 2)
  {
     System.out.println("You're out of stamina, you can't attack!");
     while (multihits != 1)
     {
   conhits = (int) ((Math.random() * conhits1) + 1);
   if (conhits == 1)
   {
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   conhits1 ++;
   }
   else if (conhits != 1)
   {
     System.out.println("The strange man hit you " + conhits1 + " times!");
     conhits1 = 1;
     multihits = 1;
   }
   }
     
  }
}
else if (weapon == 3)
{
  if (staminatemp >= 2)
  {
   crit = (int) ((Math.random() * 6) + 1);
   if (crit == 1 || crit == 6)
   {
   ehptemp = ehptemp - (atcktemp * 2);
   System.out.println("Headshot! You brought the enemy down to " + ehptemp + "/" + ehp + " hp.");
   if (ehptemp > 0)
   {
   while (multihits != 1)
     {
   conhits = (int) ((Math.random() * conhits1) + 1);
   if (conhits == 1)
   {
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   conhits1 ++;
   }
   else if (conhits != 1)
   {
     System.out.println("The strange man hit you " + conhits1 + " times!");
     conhits1 = 1;
     multihits = 1;
   }
   }
   
   }
   staminatemp = staminatemp - 2;
   System.out.println("You did a basic attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
   
   }
   else
   {
      ehptemp = ehptemp - (atcktemp);
      System.out.println("Not a headshot, but you still brought the enemy down to " + ehptemp + "/" + ehp + " hp.");
     if (ehptemp > 0)
   {
   while (multihits != 1)
     {
   conhits = (int) ((Math.random() * conhits1) + 1);
   if (conhits == 1)
   {
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   conhits1 ++;
   }
   else if (conhits != 1)
   {
     System.out.println("The strange man hit you " + conhits1 + " times!");
     conhits1 = 1;
     multihits = 1;
   }
   }
   
   }
      staminatemp = staminatemp - 2;
   System.out.println("You did a basic attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
   
   }
  }
  else if (staminatemp < 2)
  {
     System.out.println("You're out of stamina, you can't attack!");
     while (multihits != 1)
     {
   conhits = (int) ((Math.random() * conhits1) + 1);
   if (conhits == 1)
   {
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   conhits1 ++;
   }
   else if (conhits != 1)
   {
     System.out.println("The strange man hit you " + conhits1 + " times!");
     conhits1 = 1;
     multihits = 1;
   }
   }
  }
  //////////////////////////////////////////////////////////////////////// else
}
else if (weapon == 4)
{
  if (staminatemp >= 2)
  {
  atcktemp = atcktemp + 10;
  System.out.println("Your attack increased, and went up to " + atcktemp + " " + atck);
  magictemp = magictemp + 10;
  System.out.print("Your magic attack increased, and went up to " + magictemp + " " + magic);
  hp = hp + 10;
  System.out.println("Your hp has increased, and went up to " + hp + "/" + ohp + " hp.");
  
  ehptemp = ehptemp - (atcktemp + magictemp);
  System.out.println("Bring the heat! You flame-punched the enemy down to " + ehptemp + "/" + ehp + " hp.");
   if (ehptemp > 0)
   {
   while (multihits != 1)
     {
   conhits = (int) ((Math.random() * conhits1) + 1);
   if (conhits == 1)
   {
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   conhits1 ++;
   }
   else if (conhits != 1)
   {
     System.out.println("The strange man hit you " + conhits1 + " times!");
     conhits1 = 1;
     multihits = 1;
   }
   }
   
   }
   staminatemp = staminatemp - 2;
   System.out.println("You did a basic attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
  }
  else if (staminatemp < 2)
  {
    System.out.println("You're out of stamina, you can't attack!");
     while (multihits != 1)
     {
   conhits = (int) ((Math.random() * conhits1) + 1);
   if (conhits == 1)
   {
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   conhits1 ++;
   }
   else if (conhits != 1)
   {
     System.out.println("The strange man hit you " + conhits1 + " times!");
     conhits1 = 1;
     multihits = 1;
   }
   }
    
  }
  
  }
  //countme ++;
  }
   else if (choice.charAt(0) == 'b' || choice.charAt(0) == 'B' )
  {
     if (weapon == 1)
     {
       pettemp = pettemp - 2;
       if (pettemp <= 0)
     {
       if (petlow == 0)
       {
       magictemp = magictemp - (Math.round(magictemp * 0.5));
       hp = hp - (Math.round(hp * 0.3));
       petlow ++;
     System.out.println("Oh no! Your pet lost its encouragement, and so your powers have been greatly weakened.");
                                System.out.println(" ");
                                System.out.println("Your hp is now " + hp + "/" + ohp + " and your magic is now " + magictemp + "/" + magic + ".");
                                }
}
}
     if (weapon == 4)
     {
       atcktemp = atcktemp + 10;
  System.out.println("Your attack increased, and went up to " + atcktemp + " " + atck);
  magictemp = magictemp + 10;
  System.out.print("Your magic attack increased, and went up to " + magictemp + " " + magic);
  hp = hp + 10;
  System.out.println("Your hp has increased, and went up to " + hp + "/" + ohp + " hp.");
       
     }
    while (multihits != 1)
     {
   conhits = (int) ((Math.random() * conhits1) + 1);
   if (conhits == 1)
   {
   hp = hp - (edamage / 2);
   System.out.println("The enemy has just hit you for half damage, and brought you down to " + hp + "/" + ohp + " hp.");
   conhits1 ++;
   }
   else if (conhits != 1)
   {
     System.out.println("The strange man hit you " + conhits1 + " times!");
     conhits1 = 1;
     multihits = 1;
   }
   }
    
    System.out.println("You choose to tank the hits taking half damage, leaving you with " + hp + "/" + ohp + " hp.");
    hp = hp + Math.round(hp * 0.1);
    System.out.println(" ");
    System.out.println("However, you healed by 10% of your current hp, giving you " + hp + "/" + ohp + " hp.");
    
}
 else if (choice.charAt(0) == 'u' || choice.charAt(0) == 'U')
   
   {
     if (weapon == 1)
   {
      // pettemp = pettemp - 3;
       if (pettemp <= 0)
     {
       if (petlow == 0)
       {
       magictemp = magictemp - (Math.round(magictemp * 0.5));
       hp = hp - (Math.round(hp * 0.3));
       petlow ++;
     System.out.println("Oh no! Your pet lost its encouragement, and so your powers have been greatly weakened.");
                                System.out.println(" ");
                                System.out.println("Your hp is now " + hp + "/" + ohp + " and your magic is now " + magictemp + "/" + magic + ".");
                                }
}
       else
       {
         if (staminatemp >= stamina)
  {
   pettemp = pet;
   System.out.println("It's not over yet! You gave your pet encouragement, healing it up to " + pettemp + "/" + pet + " hp.");
   System.out.println("Wow, look at that damage! Just kidding, you did 0 damage to the enemy. Instead, you gave encouragement to your pet, healing it back to full hp.");
   System.out.println("You may be disappointed, but you shouldnt be, because if your pet gives up, all of your stats ar heavily decreased. Make sure to use this every few turns!");
   staminatemp = 0;
   System.out.println("You did a ultimate attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
  
   while (multihits != 1)
     {
   conhits = (int) ((Math.random() * conhits1) + 1);
   if (conhits == 1)
   {
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   conhits1 ++;
   }
   else if (conhits != 1)
   {
     System.out.println("The strange man hit you " + conhits1 + " times!");
     conhits1 = 1;
     multihits = 1;
   }
   }
   
  
                         }
         else if (staminatemp < stamina)
         {
           
    System.out.println("You're out of stamina, you can't attack!");
     while (multihits != 1)
     {
   conhits = (int) ((Math.random() * conhits1) + 1);
   if (conhits == 1)
   {
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   conhits1 ++;
   }
   else if (conhits != 1)
   {
     System.out.println("The strange man hit you " + conhits1 + " times!");
     conhits1 = 1;
     multihits = 1;
   }
   }
     
     }
       }
     }
else if (weapon == 2)
{
  if (staminatemp >= stamina)
  {
   magictemp = magictemp + (edamage);
   System.out.println(" ");
   System.out.println("You used, Predators Carnival! You stole the enemies attack, and added it to yours for the rest of the fight. Your magic attack is now: " + magictemp + "/" + magic);
   staminatemp = 0;
   System.out.println("You did an ultimate attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
   
   while (multihits != 1)
     {
   conhits = (int) ((Math.random() * conhits1) + 1);
   if (conhits == 1)
   {
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   conhits1 ++;
   }
   else if (conhits != 1)
   {
     System.out.println("The strange man hit you " + conhits1 + " times!");
     conhits1 = 1;
     multihits = 1;
   }
   }
   
  }
  else if (staminatemp < stamina)
         {
           
    System.out.println("You're out of stamina, you can't attack!");
     while (multihits != 1)
     {
   conhits = (int) ((Math.random() * conhits1) + 1);
   if (conhits == 1)
   {
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   conhits1 ++;
   }
   else if (conhits != 1)
   {
     System.out.println("The strange man hit you " + conhits1 + " times!");
     conhits1 = 1;
     multihits = 1;
   }
   }
     }
}
else if (weapon == 3)
{
  if (staminatemp >= stamina)
  {
  System.out.println(" ");
  System.out.println("You used, Trrrriple Kill! You get to attack three times in arow, each hit giving you a chance to get a critical hit!");
  for (int gunhits = 0; gunhits != 3; gunhits++)
  {
   crit = (int) ((Math.random() * 6) + 1);
   if (crit == 1 || crit == 6)
   {
     System.out.println(" ");
   ehptemp = ehptemp - (atcktemp * 2);
   System.out.println("Headshot! You brought the enemy down to " + ehptemp + "/" + ehp + " hp.");
   
   staminatemp =  0;
   System.out.println("You did a basic attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
   }
   else
   { 
     System.out.println(" ");
      ehptemp = ehptemp - (atcktemp);
      System.out.println("Not a headshot, but you still brought the enemy down to " + ehptemp + "/" + ehp + " hp.");
     
      staminatemp = 0;
   System.out.println("You did a basic attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
   }
   
   
  }
  
  System.out.println(" ");
  System.out.println("Now that's a lot of damage! With three hits You brought the enemy down to " + ehptemp + "/" + ehp + " hp!");
  
  System.out.println("You did an ultimate attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
  if (ehptemp > 0)
   {
   while (multihits != 1)
     {
   conhits = (int) ((Math.random() * conhits1) + 1);
   if (conhits == 1)
   {
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   conhits1 ++;
   }
   else if (conhits != 1)
   {
     System.out.println("The strange man hit you " + conhits1 + " times!");
     conhits1 = 1;
     multihits = 1;
   }
   }
  
   }
  //////////////////////////////////////////////////////////////////////// else
}
  
  else if (staminatemp < stamina)
         {
           
    System.out.println("You're out of stamina, you can't attack!");
     while (multihits != 1)
     {
   conhits = (int) ((Math.random() * conhits1) + 1);
   if (conhits == 1)
   {
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   conhits1 ++;
   }
   else if (conhits != 1)
   {
     System.out.println("The strange man hit you " + conhits1 + " times!");
     conhits1 = 1;
     multihits = 1;
   }
   }
    
     }
}
  
else if (weapon == 4)
{ 
  if (staminatemp >= stamina)
  {
  atcktemp = atcktemp + (countme * 10);
  magictemp = magictemp + (countme * 10);
  System.out.println("Going all out, you use, 'The One Above All'! All of the turns you stalled up are added to your attack and magic!");
  staminatemp = 0;
  System.out.println("Your attack has went up to... " + atcktemp + "/" + atck + "??!!");
  System.out.println("Your magic attack has went up to... " + magictemp + "/" + magic + "??!!");
  System.out.println("You did a ultimate attack, leaving you with " + staminatemp + "/" + stamina + " stamina.");
  while (multihits != 1)
     {
   conhits = (int) ((Math.random() * conhits1) + 1);
   if (conhits == 1)
   {
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   conhits1 ++;
   }
   else if (conhits != 1)
   {
     System.out.println("The strange man hit you " + conhits1 + " times!");
     conhits1 = 1;
     multihits = 1;
   }
   }
  }
else if (staminatemp < stamina)
         {
           
    System.out.println("You're out of stamina, you can't attack!");
     while (multihits != 1)
     {
   conhits = (int) ((Math.random() * conhits1) + 1);
   if (conhits == 1)
   {
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   conhits1 ++;
   }
   else if (conhits != 1)
   {
     System.out.println("The strange man hit you " + conhits1 + " times!");
     conhits1 = 1;
     multihits = 1;
   }
   }
    
     }
   
   }
   //countme ++;
   }
 else if (choice.charAt(0) == 'i' || choice.charAt(0) == 'I')
 {
   if (weapon == 1)
   {
    
     //pettemp = pettemp - 3;
     if (pettemp <= 0)
     {
       if (petlow == 0)
       {
       magictemp = magictemp - (Math.round(magictemp * 0.5));
       hp = hp - (Math.round(hp * 0.3));
       petlow ++;
       System.out.println("Oh no! Your pet lost its encouragement, and so your powers have been greatly weakened.");
                                System.out.println(" ");
                                System.out.println("Your hp is now " + hp + "/" + ohp + " and your magic is now " + magictemp + "/" + magic + ".");
     }
     
   }
     pettemp = pettemp - 2;
     System.out.println("Your pets hp has dropped too " + pettemp + "/10");
   }
   cnn = 0;
   while (cnn != 20)
   {
     System.out.println("Inventory slot " + cnn + ":" + inventory[cnn]);
     cnn ++;
   }
   System.out.println("Type in the inventory slot of the item you would like to use.");
   choicenum = MyInput.nextInt();
   
   if (inventory[choicenum] == "Hpotion")
   {
     healthup = 0;
    while (healthup != 50 && hp < ohp)
    {
      if (Math.round(hp) != ohp)
      {
    hp = hp + 1;
    
    healthup ++;
      }
    }
    inventory[choicenum] = "";
    System.out.println(" ");
    System.out.println("You healed up to " + hp + "/" + ohp + " hp! You will almost never go over your max hp, however there are some cases where it may."); // ??
  }
   else if (inventory[choicenum] == "AttackUp")
   {
     atcktemp = atcktemp + 20;
     inventory[choicenum] = "";
     System.out.println(" ");
     System.out.println("Your attack was raised up to " + atcktemp + " from " + atck + " for the rest of the fight!");
   }
   else if (inventory[choicenum] == "StaminaUp")
   {
    staminaup = 0;
    while (staminaup != 4 && staminatemp < stamina)
    {
      if (Math.round(hp) != ohp)
      {
    staminatemp = staminatemp + 1;
    
     staminaup ++;
 }
    }
   }
   else if (inventory[choicenum] == "MagicUp")
   {
     magictemp = magictemp + 20;
     inventory[choicenum] = "";
     System.out.println(" ");
     System.out.println("Your magic attack was raised up to " + atcktemp + " from " + atck + " for the rest of the fight!");
   }
  else if (inventory[choicenum] == "BigHpotion")
   {
     healthup = 0;
    while (healthup != 100 && hp < ohp)
    {
      if (Math.round(hp) != ohp)
      {
    hp = hp + 1;
    
    healthup ++;
      }
    }
    inventory[choicenum] = "";
    System.out.println(" ");
    System.out.println("You healed up to " + hp + "/" + ohp + " hp! You will almost never go over your max hp, however there are some cases where it may."); // ??
  }
  else if (inventory[choicenum] == "BigAttackUp")
   {
     atcktemp = atcktemp + 40;
     inventory[choicenum] = "";
     System.out.println(" ");
     System.out.println("Your attack was raised up to " + atcktemp + " from " + atck + " for the rest of the fight!");
   }
  else if (inventory[choicenum] == "BigStaminaUp")
   {
    staminaup = 0;
    while (staminatemp < stamina)
    {
      if (Math.round(staminatemp) != stamina)
      {
    staminatemp = staminatemp + 1;
    
     staminaup ++;
 }
    }
   }
  else if (inventory[choicenum] == "BigMagicUp")
   {
     magictemp = magictemp + 40;
     inventory[choicenum] = "";
     System.out.println(" ");
     System.out.println("Your magic attack was raised up to " + atcktemp + " from " + atck + " for the rest of the fight!");
   }
   while (multihits != 1)
     {
   conhits = (int) ((Math.random() * conhits1) + 1);
   if (conhits == 1)
   {
   hp = hp - (edamage);
   System.out.println("The enemy has just hit you, and brought you down to " + hp + "/" + ohp + " hp.");
   conhits1 ++;
   }
   else if (conhits != 1)
   {
     System.out.println("The strange man hit you " + conhits1 + " times!");
     conhits1 = 1;
     multihits = 1;
   }
   }
   
   cnn = 0;
 }
   
   if (choice.charAt(0) == 'a' || choice.charAt(0) == 'b' || choice.charAt(0) == 'u' || choice.charAt(0) == 'i')
   {
   countme ++;
   if (staminatemp != stamina)
   {
   staminatemp ++;
   }
     }
  }
  if (hp > 0 && ehptemp <= 0)
 {
   System.out.println(" ");
   System.out.println("You win!");
   if (conman == 1)
   {
     System.out.println(" 'Well? You said you would spare me, right?' The man says.");
   }
   else if (conman == 2)
   {
     System.out.println(" 'Do what you please with me, I'm fine with being killed by a reasonable person like you.' The man says.");
   }
   else if (conman == 3)
   {
     System.out.println(" 'Well? What are you waiting for, finish me off like the brute you are.' The man says.");
   }
   else if (conman == 4)
   {
     System.out.println(" '...' The man says nothing, almost like he's mocking " + Name + ".");
   }
  System.out.println("The strange man is too weak to stand back up. He could always come back to attack you later, so do you choose to kill him, or let him escape?");
  System.out.println("Type in 's' to spare him, or 'k' to finish him off.");
  choice = MyInput.nextLine();
     if (choice.charAt(0) == 's' || choice.charAt(0) == 'S')
  {
       gkarma ++;
      if (conman == 1)
      {
        System.out.println(" 'I guess you keep your promises after all.' ");
      }
       else if (conman == 2)
   {
     System.out.println(" 'You... Thank you, I won't forget this.' The man says.");
   }
   else if (conman == 3)
   {
     System.out.println(" 'What? Is my life more important than the others you took?' The man asks with a confused look.");
   }
   else if (conman == 4)
   {
     System.out.println(" '...' The man continues to say nothing, almost like he's mocking " + Name + ".");
   }
   System.out.println(" ");
    System.out.println("You choose to let the Strange Man live and walk away.");
    System.out.println(" ");
   
    xp = xp + 10;
    System.out.println("You gained " + xp + "/10 experience!");
    if (xp >= 10)
    {
      xp = xp - 10;
      lvl ++;
     System.out.println("You leveled up to level " + lvl + "!");
     while (lvlup != 2)
     {
     System.out.println("Which of these statistics would you like to power up?");
     System.out.println("Attack: " + atck);
     System.out.println("Magic: " + magic);
     System.out.println("Health: " + ohp);
     System.out.println("Stamina: " + stamina);
     System.out.println(" ");
     System.out.println("Type in 'a' or attack, 'm' for magic, 'h' for health, or 's' for stamina.");
     choice = MyInput.nextLine();
     if (choice.charAt(0) == 'a')
     {
       atck = atck + 10;
       System.out.println("You're attack was raised by 10, giving you an attack stat of " + atck);
     }
     else if (choice.charAt(0) == 'm')
     {
       magic = magic + 10;
       System.out.println("You're magic attack was raised by 10, giving you an magic attack stat of " + magic);
     }
else if (choice.charAt(0) == 'h')
     {
       ohp = ohp + 10;
       System.out.println("You're health was raised by 10, giving you an hp stat of " + ohp);
     }
else if (choice.charAt(0) == 's')
     {
       stamina = stamina + 1;
       System.out.println("You're stamina was raised by 1, giving you an stamina stat of " + stamina);
     }
    win = 1;
    lvlup ++;
 }
    }
  }
  else if (choice.charAt(0) == 'k' || choice.charAt(0) == 'K')
  {
    if (conman == 1)
      {
        System.out.println(" 'You liar!' The strange man says with his dying breath.");
      }
       else if (conman == 2)
   {
     System.out.println(" 'Hmph.' The man says, not seeming angry.");
   }
   else if (conman == 3)
   {
     System.out.println(" 'Hmph, just like an animal.' The man says with his dying breath.");
   }
   else if (conman == 4)
   {
     System.out.println(" '...' The man continues to say nothing, almost like he's mocking " + Name + ".");
   }
    System.out.println("You choose to kill the Strange Man, and move on.");
    System.out.println(" ");
    bkarma ++;
    xp = xp + 10;
    System.out.println("You gained " + xp + "/10 experience!");
    if (xp >= 10)
    {
      xp = xp - 10;
      lvl ++;
     System.out.println("You leveled up to level " + lvl + "!");
     while (lvlup != 2)
     {
     System.out.println("Which of these statistics would you like to power up?");
     System.out.println("Attack: " + atck);
     System.out.println("Magic: " + magic);
     System.out.println("Health: " + ohp);
     System.out.println("Stamina: " + stamina);
     System.out.println(" ");
     System.out.println("Type in 'a' or attack, 'm' for magic, 'h' for health, or 's' for stamina.");
     choice = MyInput.nextLine();
     if (choice.charAt(0) == 'a')
     {
       atck = atck + 10;
       System.out.println("You're attack was raised by 10, giving you an attack stat of " + atck);
     }
     else if (choice.charAt(0) == 'm')
     {
       magic = magic + 10;
       System.out.println("You're magic attack was raised by 10, giving you an magic attack stat of " + magic);
     }
else if (choice.charAt(0) == 'h')
     {
       ohp = ohp + 10;
       System.out.println("You're health was raised by 10, giving you an hp stat of " + ohp);
     }
else if (choice.charAt(0) == 's')
     {
       stamina = stamina + 1;
       System.out.println("You're stamina was raised by 1, giving you an stamina stat of " + stamina);
     }
    win = 1;
    lvlup ++;
 }
    }
  }
  money = money + 200;
  System.out.println(" ");
    System.out.println("You got 100 gold from this fight. This is what you use to buy items which can help you in battle. Your balance is now " + money);
   }
 else if (ehptemp > 0 && hp <= 0)
 {
   System.out.println(" ");
   System.out.println("Really... You died.");
    win = 0;
 }
    
  }
  else if (gametime == 9)
  {
    if (countme == 0)
      {
      if (gkarma > bkarma)
      {
        ehp = 450;
        ehptemp = ehp;
        edamage = 5000;
      }
      else if (gkarma > bkarma)
      {
      ehp = 1500;
      ehptemp = ehp;
  edamage = 8000;
      }
  hp = ohp;
  pettemp = pet;
  staminatemp = stamina;
  atcktemp = atck;
  magictemp = magic;
    System.out.println(" ");
    System.out.println(" "); 
    System.out.println(" ");
    System.out.println(" "); 
    System.out.println(" ");
    System.out.println(" "); 
    System.out.println("Yo! It's me again, you've come a long way havent you? That was the most of your journey back there.");
    System.out.println("So tell me, " + Name + ". did you kill a lot of those people you have faced? By the way, I forced them to work for me, so they had no choice.");
    System.out.println("Type in 'y' for yes, and 'n' for no.");
    System.out.println(" ");
    choice = MyInput.nextLine();
    if (choice.charAt(0) == 'y')
    {
     if (gkarma > bkarma)
     {
       System.out.println("Hm? Why are you lying to me? Do you want to be seen as some sort of monster? Well anyways, you killed " + bkarma + " compared to sparing " + gkarma + ".");
       System.out.println("So, that means you'll get the good ending of this game.");
     }
     else if (gkarma < bkarma)
     {
       System.out.println("Yeah, that's right. In the end, you ended up killing " + bkarma + " compared to " + gkarma + ".");
       System.out.println("So, that means that you get the bad ending.");
     }
  }
    else if (choice.charAt(0) == 'n')
    {
      if (gkarma > bkarma)
            {
        System.out.println("That's right, you ended up killing " + bkarma + " compared to sparing " + gkarma + " enemies.");
        System.out.println("So, that means you'll get the good ending of this game.");
      }
      else if (gkarma < bkarma)
      {
        System.out.println("Hm? Do you feel bad now or something? After all, you killed " + bkarma + " compared to sparing " + gkarma + " enemies, you liar.");
        System.out.println("So, that means that you get the bad ending.");
      }
    }
    System.out.println(" ");
    System.out.println("I guess I'll call this final level... Level 9: Judgement.");
    
    
                         }
    
    if (bkarma > gkarma)
    {
      hp = hp - edamage;
      System.out.println("I have brought your hp down to " + hp + "/" + ohp + " hp. You are dead.");
      System.out.println("You got the bad end.");
      win = 1;
    }
    else if (bkarma < gkarma)
    {
      System.out.println("You got the good ending, you get to live.");
      win = 1;
    }
    else if (gkarma == bkarma)
    {
      System.out.println("Well... This is awkward. You good the middle ending I suppose.");
      System.out.println(" ");
      System.out.println("I know what to do. You will become an enemy that the next one of your kin have to fight!");
      System.out.println(" ");
      System.out.println("You got: The middle end.");
      win = 1;
    }
    System.out.println("You ended the game at level " + lvl);
    
  
  
  
  }
  
    
}
*/
}
  }
}
}