package Entity;

import Entity.Base.Skill;
import gui.FieldCell;
import gui.FieldPane;
import logic.Player;

public class VerticalDestroy extends Skill{

	public VerticalDestroy() {
		super();
	}
	
	@Override
	public void useSkill(FieldCell fieldCell, Player p1, Player p2) {
		// TODO Auto-generated method stub
		p1.setMaxCooldown();
		p2.getFieldPane().destroy(p2.getFieldPane().getCol(fieldCell)); 
	}
	
}
