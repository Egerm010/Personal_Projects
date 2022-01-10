
public class Enemy {
double health;
double attack;
double level;

public Enemy(double health,double attack,double level) {
	this.health = health;
	this.attack = attack;
	this.level = level;
}

public double getHealth() {
	return health;
}

public double getAttack() {
	return attack;
}

public double getLevel() {
	return level;
}

public void setHealth(double health) {
	this.health = health;
}

public void setAttack(double attack) {
	this.attack= attack;
}

public void setLevel(double level) {
	this.level = level;
}

}
