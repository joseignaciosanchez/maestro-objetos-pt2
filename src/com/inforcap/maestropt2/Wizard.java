package com.inforcap.maestropt2;

public class Wizard extends Human{
	
	public void heal(Human humano) {	
		System.out.println("Humano: Salud, "+humano.health +" puntos");
		System.out.println("Mago cura salud a Humano...");
		humano.aumentarSalud(this.intelligence);
		System.out.println("Salud Humano +"+this.intelligence);
		System.out.println("Salud total del Humano: "+humano.health +" puntos.");
	}
	
	public void fireBall(Human humano) {
		 
		System.out.println("Mago lanza bola de fuego a Humano...");
		humano.reducirSalud(this.intelligence*3);
		System.out.println("Salud Humano -"+this.intelligence*3);
		System.out.println("Salud total del Humano: "+humano.health+" puntos.");		 
	}
	
	public Wizard() {
		this.health = 50;
		this.intelligence = 8;	
	}
}
