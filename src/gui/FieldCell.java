package gui;

import Entity.Base.BaseShip;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import logic.GameController;
import logic.Player;

public class FieldCell extends Pane{
	private BaseShip baseShip;
	
	public FieldCell() {
		super();
		
		baseShip = null;
		
		this.setPrefHeight(30);
		this.setPrefWidth(30);
		this.setMinHeight(30);
		this.setMinWidth(30);
		this.setPadding(new Insets(5));
		
		this.setBackgroundMistCell();
		
		this.addEventHandler(MouseEvent.MOUSE_CLICKED, 
				new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent  e) {
						// TODO fill in this method	
							onClickHandler();
						}
			});
	}
	
	private void setBackgroundMistCell() {
		//TODO set mist picture
		this.setBackground(new Background(new BackgroundFill(Color.GREY, CornerRadii.EMPTY, Insets.EMPTY)));		
	}
	
	private void setBackgroundSeaCell() {
		//TODO set sea picture
	}
	
	private void setBackgroundShip(Image image) { 
		
	}
	
	private void setBackgroundShipIsAttacked() { //TODO set cross picture
		
	}
	
	private void onClickHandler() {
		/*TODO 2 phase buy_phase attack_phase
		 * buy_phase: same as lab5 
		 * 
		 * attack_phase: click to attack
		 * 
		 * */
		if (GameController.getGamePhase() == "Preparation") { //prepare phase
			BaseShip ship = GameController.getSelectedShip();
			
			if(this.baseShip == null && ship.canPlace(this)) {
				this.baseShip = ship;
				Image image = new Image(ship.getUrl().get(0));
				setBackgroundShip(image);
				GameController.getAtkPlayer().decreaseInStock(ship);			
			}
		} else { //play phase
			this.isAttacked();
			this.setDisable(false);
		}
	}
	
	public void isAttacked() {
		if(baseShip == null) {
			this.setBackgroundSeaCell();
		} else {
			if(baseShip.isAttacked()) {
				setBackgroundShipIsAttacked();
			} else {
				Image image = new Image(baseShip.getUrl().get(0));
				setBackgroundShip(image);	
			}
		}
	}

	public BaseShip getBaseShip() {
		return baseShip;
	}
	
	
}

//TODO feedback ship is destroy or ship use skill