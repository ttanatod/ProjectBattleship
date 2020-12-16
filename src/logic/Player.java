package logic;

import java.util.ArrayList;

import Entity.Base.Skill;
import gui.FieldPane;
import Entity.Base.BaseShip;

public class Player {
	private int cooldown;
	private final int MAX_COOLDOWN = 3;
	//ArrayList<BaseShip> myShip;
	ArrayList<Skill> mySkill;
	FieldPane fieldPaneShip;
	int ship;
	public Player() {
		//myShip = new ArrayList<BaseShip>();
		mySkill = new ArrayList<Skill>();
		cooldown = 3;
		fieldPaneShip = new FieldPane();
		ship = 4;
	}

	public int getCooldown() {
		return cooldown;
	}

	public void setMaxCooldown() {
		this.cooldown = MAX_COOLDOWN;
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
		this.ship -= 1;
	}
}
