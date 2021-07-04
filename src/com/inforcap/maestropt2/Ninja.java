package com.inforcap.maestropt2;

public class Ninja extends Human{
	
	public void steal(Human humano) {
		System.out.println("Ninja: Salud, "+health +" puntos");	
		System.out.println("Ninja roba salud a Humano...");
		humano.reducirSalud(this.stealth);
		System.out.println("Salud Humano -"+this.stealth);
		System.out.println("Salud Ninja +"+this.stealth);
		System.out.println("Salud total Humano: "+humano.health +" puntos");		
		this.health += stealth;
		System.out.println("Salud total del Ninja: "+health +" puntos.");				
	}
	
	public void runAway() {
		System.out.println("Ninja huye...");
		System.out.println("Salud Ninja -"+this.stealth);
		this.health -= stealth;
		System.out.println("Salud total del Ninja: "+health +" puntos.");	
	}

	public Ninja() {
		this.stealth = 10;
	}	
}
