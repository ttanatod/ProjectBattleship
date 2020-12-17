package Entity;

import java.util.ArrayList;

import Entity.Base.BaseShip;
import Entity.Base.Buttonable;
import gui.FieldCell;
//shield
public class Ship02 extends BaseShip implements Buttonable {
	private boolean isShieldAlreadyUsed;
	
	public Ship02() {
		super(1, 1);
		// TODO Auto-generated constructor stub
		setShieldAlreadyUsed(false);
		ArrayList<String> url = new ArrayList<String>();
		url.add("Ship02.png");
		this.setUrl(url);
	}

	@Override
	public boolean isAttacked() {
		// TODO Auto-generated method stub
		if (isShieldAlreadyUsed()) {
			this.decreaseHp();
			return true;
		}
		setShieldAlreadyUsed(true);
		return false;
	}

	public boolean isShieldAlreadyUsed() {
		return isShieldAlreadyUsed;
	}

	public void setShieldAlreadyUsed(boolean isShieldAlreadyUsed) {
		this.isShieldAlreadyUsed = isShieldAlreadyUsed;
	}

	@Override
	public boolean canPlace(FieldCell fieldCell) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getTotalImageUrl() {
		// TODO Auto-generated method stub
		return null;
	}



}
