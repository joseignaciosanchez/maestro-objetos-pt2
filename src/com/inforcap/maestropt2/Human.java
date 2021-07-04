package com.inforcap.maestropt2;

public class Human {

	protected Integer strength = 3;
	protected Integer stealth = 3;
	protected Integer intelligence = 3;
	protected Integer health = 100;
	
	public void reducirSalud(int daño) {
		this.health -= daño;
	}
	
	public void aumentarSalud(int cura) {
		this.health += cura;
	}

	public Integer getStrength() {
		return strength;
	}

	public void setStrength(Integer strength) {
		this.strength = strength;
	}

	public Integer getStealth() {
		return stealth;
	}

	public void setStealth(Integer stealth) {
		this.stealth = stealth;
	}

	public Integer getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(Integer intelligence) {
		this.intelligence = intelligence;
	}

	public Integer getHealth() {
		return health;
	}

	public void setHealth(Integer health) {
		this.health = health;
	}
	
	
}
