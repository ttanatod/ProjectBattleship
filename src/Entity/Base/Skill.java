package Entity.Base;

import gui.FieldCell;
import logic.Player;

public abstract class Skill {
	private boolean isAlreadyUse;
	
	public Skill() {
		isAlreadyUse =  false;
	}

	public boolean isAlreadyUse() {
		return isAlreadyUse;
	}

	public void setAlreadyUse(boolean isAlreadyUse) {
		this.isAlreadyUse = isAlreadyUse;
	}
	


	public abstract void useSkill(FieldCell fieldCell, Player p1, Player p2);
}
