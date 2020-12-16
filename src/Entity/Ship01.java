package Entity;

import Entity.Base.BaseShip;

import java.util.ArrayList;
import java.util.Random;
//evasion
public class Ship01 extends BaseShip {

	public Ship01() {
		super(1, 1); //size = 1 hp = 1
		// TODO Auto-generated constructor stub
		ArrayList<String> url = new ArrayList<String>();
		url.add("Ship01.png");
		this.setUrl(url);
	}

	@Override
	public boolean isAttacked() {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int rng = rand.nextInt(2);
		if (rng == 0) {
			this.decreaseHp();
			return true;
		} return false;
		//return this ship is attacked or not
	}

	@Override
	public boolean canPlace() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
