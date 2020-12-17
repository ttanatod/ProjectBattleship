package Entity.Base;

import java.util.ArrayList;

import gui.FieldCell;

public abstract class BaseShip {
	private int hp;
	private int size;
	private boolean isAlive;
	private ArrayList<String> url;
	private String TotalImageUrl;
	
	public BaseShip(int size, int hp) {
		this.hp = hp;
		this.size = size;
		url = new ArrayList<String>();
		isAlive = true;
	}
	
	public abstract boolean isAttacked(); 
	
	public void decreaseHp() {
		this.hp -= 1;
		if (hp == 0) isAlive = false;
		//TODO throws exception hp < 0
	}
	
	public boolean isAlive() {
		return isAlive;
	}

	public ArrayList<String> getUrl() {
		return url;
	}

	public void setUrl(ArrayList<String> url) {
		this.url = url;
	}
	
	public abstract boolean canPlace(FieldCell fieldCell) ;
	
}
