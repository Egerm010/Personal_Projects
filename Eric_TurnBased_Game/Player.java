import java.util.Scanner;
public class Player {
	double weapon;
	double attack;
	double health;
	double magic;
	double stamina;
	double pet;
	double countUp;
	double critChance;
	double ultCount;
	boolean ultActivated;
	double money;
	int karma;
	int playerLevel;
	int exp;
	int gameLevel;
	Scanner BoostInput = new Scanner(System.in);
	
	String[] inventory = new String[20];
	
	

	public Player(int weapon) {
		this.weapon = weapon;
		
		
		if(weapon == 1) {
			  health = 180;
			  
			  
			  attack = 80;
			  
			  
			   magic = 150;
			  
			  
			   stamina = 4;
			  
			    
			   pet = 10;
			   
			   ultCount = 0;
			   
			   
			  
		}
		
		else if(weapon == 2) {
			health = 90;
			  
			  attack = 0;
			 
			   magic = 60;
			  
			   stamina = 4;
			   
			  ultCount = 0;
			   
			  
			  
		}
		
		else if (weapon == 3)
		{
		  health = 100;
		
		  
		  attack = 35;
		 

		  magic = 0;
		 
		  
		  stamina = 4;
		  
		  critChance = 6;
		  
		  ultCount = 0;
		  
		  ultActivated = false;
		  
		}


		else if (weapon == 4)
		{
		  health = 80;
		  

		   attack = 15;
		
		  
		  
		  magic = 15;
		  
		  
		   stamina = 4;
		   
		   
		   countUp = 0;
		   
		   ultCount = 0;
		   
		   ultActivated = false;
		  
		  
		   // Atck, hp, magic are increased every turn by a count.
		  
		  
		  
		}
		
		karma = 0;
		money = 0;
		playerLevel = 0;
		exp = 0;
		gameLevel = 0;
		inventory[0] = "Hppotion";
	}
	
	public double getAttack(){
		return attack;
	}
	
	public double getHealth() {
		return health;
	}
	
	public double getPetHealth() {
		if(this.weapon == 1) {
		return pet;
		}
		else {
			return -1.0;
		}
	}
	
	
	public double getMagic() {
		return magic;
	}
	
	public double getStamina() {
		return stamina;
}
	
	public double getCountUp() {
		if(this.weapon == 4) {
		return countUp;
		}
		else {
			return -1;
		}
}
	
	public double getWeapon() {
		return weapon;
	}
	
	public String getItem(int slot) {
		if(slot < inventory.length) {
		return inventory[slot];
		}
		else {
			return("That is not a valid slot in your inventory.");
		}
	}
	
	
	public double getCritChance() {
		return critChance;
	}
	
	public double getUltCount() {
		return ultCount;
	}
	
	public boolean getUltActivated() {
		return ultActivated;
	}
	
	public int getKarma() {
		return karma;
	}
	
	public double getMoney() {
		return money;
	}
	
	public int getPlayerLevel() {
		return playerLevel;
	}
	
	public int getExp() {
		return exp;
	}
	
	public int getGameLevel() {
		return gameLevel;
	}
	
	
	//Setters are below.
	
	public void setAttack(double attack) {
		this.attack = attack;
		
	}
	
	public void setHealth(double health) {
		this.health = health;
	}
	
	public void setMagic(double magic) {
		this.magic = magic;
	}
	
	public void setStamina(double stamina) {
		this.stamina = stamina;
	}
	
	public void setPetHealth(double pet) {
		this.pet = pet;
	}
	
	public void setCountUp(double countUp) {
		this.countUp = countUp;
	}
	
	public void setCritChance(double critChance) {
		this.critChance = critChance;
	}
	
	public void setUltCount(double ultCount) {
		this.ultCount = ultCount;
	}
	
	public void setUltActivated(boolean ultActivated) {
		this.ultActivated = ultActivated;
	}
	
	public void setKarma(int karma) {
		this.karma = karma;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void setPlayerLevel(int level) {
		this.playerLevel = level;
	}
	
	public void setExp(int exp) {
		this.exp = exp;
		if(this.exp >= 10) {
			while(this.exp >= 10) {
		    playerLevel = playerLevel + 1;
		    System.out.println("");
		    System.out.println("Congratulations, you're now level " + playerLevel + "!");
			boostStats();
			}
		}
	}
	
	public void setGameLevel(int gameLevel) {
		this.gameLevel = gameLevel;
	}
	
	
	public void setInventoryItem(String item) {
		boolean openSlot = false;
		for(int index = 0; index < inventory.length; index ++) {
			if(getItem(index) != null || getItem(index).length() == 0) {
				inventory[index] = item;
				openSlot = true;
				break;
			}
			
		}
		if(openSlot == false) {
			System.out.println("No more inventory room.");
		}
		
	}
	
	
	
	public void eraseInventoryItem(int slot) {
		inventory[slot] = "";
	}
	
	
	public void boostStats() {
		int lvlup = 0;
		String inputs;
		 while (lvlup != 2)
	     {
	     System.out.println("Which of these statistics would you like to power up?");
	     System.out.println("Attack: " + attack);
	     System.out.println("Magic: " + magic);
	     System.out.println("Health: " + health);
	     System.out.println("Stamina: " + stamina);
	     System.out.println(" ");
	     System.out.println("Type in 'a' or attack, 'm' for magic, 'h' for health, or 's' for stamina.");
	     
	     inputs = BoostInput.nextLine(); //The user chooses the letter of the statistic they would like to improve two times once again using the string choice.
	    
	     if (inputs.charAt(0) == 'a')
	     {
	       attack = attack + 10;
	       System.out.println("Your attack was raised by 10, giving you an attack stat of " + attack);
	     }
	     else if (inputs.charAt(0) == 'm')
	     {
	       magic = magic + 10;
	       System.out.println("Your magic attack was raised by 10, giving you an magic attack stat of " + magic);
	     }
	else if (inputs.charAt(0) == 'h')
	     {
	       health = health + 10;
	       System.out.println("Your health was raised by 10, giving you an hp stat of " + health);
	     }
	else if (inputs.charAt(0) == 's')
	     {
	       stamina = stamina + 1;
	       System.out.println("Your stamina was raised by 1, giving you an stamina stat of " + stamina);
	     }
	else {
		System.out.println("Please enter a valid letter.");
		lvlup --;
	}
	    
	    lvlup ++; //Increases by 1 each time.
	 }
		 this.exp = this.exp - 10;
		 
	}
	
	

}
	
