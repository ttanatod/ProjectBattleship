package gui;

import Entity.Base.BaseShip;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class FieldCell extends Pane{
	private BaseShip baseShip;
	
	public FieldCell() {
		super();
		
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
	}
	
	private void setBackgroundSeaCell() {
		//TODO set sea picture
	}
	
	private void onClickHandler() {
		/*TODO 2 phase buy_phase attack_phase
		 * buy_phase: same as lab5 
		 * 
		 * attack_phase: click to attack if not alive remove
		 * 
		 * */
	}
	
	public void shipRemove() {
		baseShip = null;
	}
	
	public void isAttacked() {
		baseShip.isAttacked();
	}
}
