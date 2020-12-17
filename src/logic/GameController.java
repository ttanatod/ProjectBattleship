package logic;

import Entity.Base.BaseShip;
import gui.FieldCell;
import gui.FieldPane;
import logic.Player;

public class GameController {
	//TODO useSkill(FieldCell, player1, player2) player1 skill is use player2.getFieldPane().getRow(FieldCell).
	//TODO if ship == 0 set win
	//TODO for all in fieldPane call isAlive if not call p1.decreaseShip fieldcell.shipremove()
	//TODO shipButton -> already place  disable button 
	private static String winner;
	private static String gamePhase;
	private static Player player1;
	private static Player player2;
	
	private static Player atkPlayer;
	private static Player defPlayer;
	
	
	private static BaseShip selectedShip;
	
	public GameController() {
		winner = null;
		player1 = new Player();
		player2 = new Player();
		gamePhase = "Preparation";
		atkPlayer = player1;
		defPlayer = player2;
	}
	
	public void gameUpdate() {
		
	}
	
	public void clearFieldPane(Player player) {
		player.getFieldPane();
	}
	
	public static String getGamePhase() {
		return gamePhase;
	}
	
	public static BaseShip getSelectedShip() {
		return selectedShip;
	}
	
	public static FieldPane getFieldPane(FieldCell fieldCell) {
		if (player1.getFieldPane().isFieldPaneHasThis(fieldCell)) return player1.getFieldPane();
		return player2.getFieldPane();
	}
	
	public static void nextPhase() {
		gamePhase = "Play";
	}
	
	public static void nextTurn() {
		if (atkPlayer == player1) {
			atkPlayer = player2;
			defPlayer = player1;
		} else {
			atkPlayer = player1;
			defPlayer = player2;
		}
	}
}
