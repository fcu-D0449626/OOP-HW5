package fcu.iecs.oop.pokemon;

public class GYM {
public static void fight(Pokemon pkm1,Pokemon pkm2){
	float temp;
	temp=(float) (Math.random());
	
	if(temp>0.5){
		System.out.println("Winner is " +pkm1.getname());
		pkm1.setcp(500);
	}
	else if(temp<0.5){
		System.out.println("Winner is " +pkm2.getname());
		pkm2.setcp(500);
	}
}
}
