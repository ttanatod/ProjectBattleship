package Entity.Base;

import java.util.ArrayList;

public abstract class BaseShip {
	private int hp;
	private int size;
	private ArrayList<String> url;
	
	public BaseShip(int size, int hp) {
		this.hp = hp;
		this.size = size;
		url = new ArrayList<String>();
	}
	
	public abstract boolean isAttacked(); 
	
	public void decreaseHp() {
		this.hp -= 1;
		//TODO throws exception hp < 0
	}
	
	public boolean isDead() {
		return this.hp == 0;
	}

	public ArrayList<String> getUrl() {
		return url;
	}

	public void setUrl(ArrayList<String> url) {
		this.url = url;
	}
	
	
}
