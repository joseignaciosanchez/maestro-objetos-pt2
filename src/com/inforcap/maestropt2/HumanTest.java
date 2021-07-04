package com.inforcap.maestropt2;

public class HumanTest {

	public static void main(String[] args) {		
		
		Human humano = new Human();
		
		Wizard mago = new Wizard();
		mago.heal(humano);
		mago.fireBall(humano);
		
		Ninja ninj = new Ninja();		
		ninj.steal(humano);
		ninj.runAway();
		
		Samurai samur = new Samurai();
		//Samurai samur2 = new Samurai();
		samur.deathBlow(humano);
		samur.meditate();
		samur.howMany();
		
		
	}

}
