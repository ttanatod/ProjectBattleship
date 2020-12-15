package Entity;

import java.util.ArrayList;

import Entity.Base.BaseShip;
import Entity.Base.hasConditionToPlacementable;

public class Ship03 extends BaseShip implements hasConditionToPlacementable{

	public Ship03() {
		super(2, 2);
		// TODO Auto-generated constructor stub
		ArrayList<String> url = new ArrayList<String>();
		url.add("Ship03_1.png");
		url.add("Ship03_2.png");
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
		//TODO parameter cell  return boolean that cell can place the ship or not
	}


}
