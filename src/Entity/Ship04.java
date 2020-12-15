package Entity;

import java.util.ArrayList;

import Entity.Base.BaseShip;
import Entity.Base.hasConditionToPlacementable;

public class Ship04 extends BaseShip implements hasConditionToPlacementable{

	public Ship04() {
		super(3, 3);
		// TODO Auto-generated constructor stub
		ArrayList<String> url = new ArrayList<String>();
		url.add("Ship04_1.png");
		url.add("Ship04_2.png");
		url.add("Ship04_3.png");
		this.setUrl(url);
	}

	@Override
	public boolean isAttacked() {
		// TODO Auto-generated method stub
		this.decreaseHp();
		return true;
	}

	@Override
	public boolean conditionToPlacementable() {
		// TODO Auto-generated method stub
		return false;
	}

	
}
