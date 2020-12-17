package logic;

import java.util.ArrayList;

import Entity.Base.Skill;
import gui.FieldPane;
import Entity.HorizontalDestroy;
import Entity.VerticalDestroy;
import Entity.Base.BaseShip;

public class Player {
	private int cooldown;
	private final int MAX_COOLDOWN = 3;
	//ArrayList<BaseShip> myShip;
	ArrayList<Skill> mySkill;
	FieldPane fieldPaneShip;
	int numberOfShip;
	public Player() {
		//myShip = new ArrayList<BaseShip>();
		mySkill = new ArrayList<Skill>();
		Skill HDestroy = new HorizontalDestroy();
		Skill Vdestroy = new VerticalDestroy();
		mySkill.add(HDestroy);
		mySkill.add(Vdestroy);
		
		cooldown = 3;
		fieldPaneShip = new FieldPane();
		numberOfShip = 8;
	}

	public boolean alreadyUseSkill(Skill skill) {
		if (skill instanceof HorizontalDestroy) {
			return mySkill.get(0).isAlreadyUse();
		} else if (skill instanceof VerticalDestroy) {
			return mySkill.get(1).isAlreadyUse();
		} return true;
	}
	
	public int getCooldown() {
		return cooldown;
	}

	public void setMaxCooldown() {
		this.cooldown = MAX_COOLDOWN;
	}
	
	public void decreaseCooldown() {
		this.cooldown -= 1;
	}
/*	public ArrayList<BaseShip> getMyShip() {
		return myShip;
	}

	public void setMyShip(ArrayList<BaseShip> myShip) {
		this.myShip = myShip;
	}
*/
	public ArrayList<Skill> getMySkill() {
		return mySkill;
	}

	public void setMySkill(ArrayList<Skill> mySkill) {
		this.mySkill = mySkill;
	}

	public FieldPane getFieldPane() {
		return fieldPaneShip;
	}
	
	public void decreaseShip() {
		this.numberOfShip -= 1;
	}
	
	public int getInStock(BaseShip ship) {
		return ship.getInStock();
	}
	
	public void decreaseInStock(BaseShip ship) {
		ship.decreaseInStock();
	}
}
