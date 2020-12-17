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

public class SkillPane extends VBox{
	private ArrayList<Skill> skills = new ArrayList<Skill>();
	
	public SkillPane() {
		super(15);
		this.setAlignment(Pos.CENTER);
		this.setPrefWidth(50);
		this.setFillWidth(true);
		
		this.setBorder(new Border(new BorderStroke(Color.LIGHTGRAY, BorderStrokeStyle.SOLID, 
				CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		
		HorizontalDestroy HDestroy = new HorizontalDestroy();
		VerticalDestroy Vdestroy = new VerticalDestroy();
	}
}
