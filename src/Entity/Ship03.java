package Entity;

import java.util.ArrayList;

import Entity.Base.BaseShip;

public class Ship03 extends BaseShip{

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
	public boolean canPlace() {
		// TODO Auto-generated method stub
		return false;
	}


}

//TODO problem how to know long ship isAlive how to clear all cell