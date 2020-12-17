package gui;

import java.util.ArrayList;

import Entity.HorizontalDestroy;
import Entity.VerticalDestroy;
import Entity.Base.Skill;
import javafx.geometry.Pos;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import logic.GameController;

public class SkillPane extends VBox{
	private ArrayList<GameButton> skillButtonList = new ArrayList<GameButton>();
	
	public SkillPane() {
		super(15);
		this.setAlignment(Pos.CENTER);
		this.setPrefWidth(50);
		this.setFillWidth(true);
		
		this.setBorder(new Border(new BorderStroke(Color.LIGHTGRAY, BorderStrokeStyle.SOLID, 
				CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		
		HorizontalDestroy HDestroy = new HorizontalDestroy();
		VerticalDestroy Vdestroy = new VerticalDestroy();
		
		GameButton button1 = new GameButton(HDestroy);
		GameButton button2 = new GameButton(Vdestroy);
		
		skillButtonList.add(button1);
		skillButtonList.add(button2);
		
		for(GameButton i : skillButtonList) { 
            i.setOnAction(e -> {
                if (!GameController.getAtkPlayer().alreadyUseSkill((Skill) i.getButtonContent()))
                    setSelectedButton(i);
            });
        }
		
		this.getChildren().addAll(button1, button2);

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

		skillButtonList.get(0).unhighlight();
		skillButtonList.get(1).unhighlight();
	}
}
