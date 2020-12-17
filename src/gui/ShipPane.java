package gui;

import java.util.ArrayList;

import Entity.HorizontalDestroy;
import Entity.Ship01;
import Entity.Ship02;
import Entity.Ship03;
import Entity.Ship04;
import Entity.VerticalDestroy;
import Entity.Base.BaseShip;
import Entity.Base.Skill;
import javafx.geometry.Pos;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import logic.GameController;

//TODO same as lab5
//TODO in method setOnAction: add stock in player to keep number of ship that need to place on the grid
//TODO setPadding width etc
public class ShipPane extends VBox {
	private ArrayList<GameButton> shipButtonList = new ArrayList<GameButton>();
	
	public ShipPane() {
		super(15);
		this.setAlignment(Pos.CENTER);
		this.setPrefWidth(50);
		this.setFillWidth(true);
		
		this.setBorder(new Border(new BorderStroke(Color.LIGHTGRAY, BorderStrokeStyle.SOLID, 
				CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		
		Ship01 ship1 = new Ship01();
		Ship02 ship2 = new Ship02();
		Ship03 ship3 = new Ship03();
		Ship04 ship4 = new Ship04();
		
		GameButton button1 = new GameButton(ship1);
		GameButton button2 = new GameButton(ship2);
		GameButton button3 = new GameButton(ship3);
		GameButton button4 = new GameButton(ship4);
		
		shipButtonList.add(button1);
		shipButtonList.add(button2);
		shipButtonList.add(button3);
		shipButtonList.add(button3);
		
		for(GameButton i : shipButtonList) { 
            i.setOnAction(e -> {
                if (GameController.getAtkPlayer().getInStock((BaseShip) i.getButtonContent()) > 0)
                    setSelectedButton(i);
            });
        }
		
		this.getChildren().addAll(button1, button2, button3, button4);
	}
	
	public void setSelectedButton (GameButton selectedGameButton ) {
		// TODO set selectedItemButton of SimulationManager to given ItemButton
		// resetButtonsBackgroundColor and the highlight the selecteditemButton
		GameController.setSelectedGameButton(selectedGameButton);
		resetButtonsBackGroundColor();
		selectedGameButton.highlight();
	}

	public void resetButtonsBackGroundColor() {
		// TODO unhighlight each button in itemButtonList

		for (GameButton i : shipButtonList) {
			i.unhighlight();
		}
	}
}
