package com.inforcap.maestropt2;

public class Samurai extends Human{
	
	private static int numSamurCreado = 0;
	
	public void deathBlow(Human humano) {
		System.out.println("Samurai: Salud, "+health +" puntos");	
		System.out.println("Samurai asesina a Humano...");
		humano.reducirSalud(humano.health);	
		System.out.println("Salud Humano se reduce a "+humano.health+"...");
		this.health -= health/2;
		System.out.println("Salud Samurai -"+this.health);
		System.out.println("Salud total Samurai: "+health +" puntos.");	
	}
	
	public void meditate() {
		System.out.println("Samurai medita...");	
		System.out.println("Salud Samurai +"+this.health/2+" puntos");
		this.health += health/2;
		System.out.println("Salud total Samurai: "+health +" puntos.");	
	}
	
	public void howMany() {		
		System.out.println("La cantidad de Samurai que hay son: "+numSamurCreado);
	}

	public Samurai() {
		this.health = 200;
		numSamurCreado++;
	}
}
