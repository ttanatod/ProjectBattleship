package gui;

import Entity.HorizontalDestroy;
import Entity.Ship01;
import Entity.Ship02;
import Entity.Ship03;
import Entity.Ship04;
import Entity.VerticalDestroy;
import Entity.Base.BaseShip;
import Entity.Base.Buttonable;
import Entity.Base.Skill;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class GameButton extends Button {

	private Buttonable buttonContent;

	GameButton(Ship01 ship){
		// TODO complete the constructor
		
		super();
		this.setPadding(new Insets(5));
		this.buttonContent = new Ship01();
		
		this.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		this.setBorder(new Border(new BorderStroke(Color.GRAY, BorderStrokeStyle.SOLID, 
				CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		
		Image image = new Image(buttonContent.getTotalImageUrl());
		ImageView imageView = new ImageView(image);
		imageView.setFitHeight(48);
		imageView.setFitWidth(48);
		this.setGraphic(imageView);
	}
	
	GameButton(Ship02 ship){
		// TODO complete the constructor
		
		super();
		this.setPadding(new Insets(5));
		this.buttonContent = new Ship02();
		
		this.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		this.setBorder(new Border(new BorderStroke(Color.GRAY, BorderStrokeStyle.SOLID, 
				CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		
		Image image = new Image(buttonContent.getTotalImageUrl());
		ImageView imageView = new ImageView(image);
		imageView.setFitHeight(48);
		imageView.setFitWidth(48);
		this.setGraphic(imageView);
	}
	
	GameButton(Ship03 ship){
		// TODO complete the constructor
		
		super();
		this.setPadding(new Insets(5));
		this.buttonContent = new Ship03();
		
		this.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		this.setBorder(new Border(new BorderStroke(Color.GRAY, BorderStrokeStyle.SOLID, 
				CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		
		Image image = new Image(buttonContent.getTotalImageUrl());
		ImageView imageView = new ImageView(image);
		imageView.setFitHeight(48);
		imageView.setFitWidth(48);
		this.setGraphic(imageView);
	}
	
	GameButton(Ship04 ship){
		// TODO complete the constructor
		
		super();
		this.setPadding(new Insets(5));
		this.buttonContent = new Ship04();
		
		this.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		this.setBorder(new Border(new BorderStroke(Color.GRAY, BorderStrokeStyle.SOLID, 
				CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		
		Image image = new Image(buttonContent.getTotalImageUrl());
		ImageView imageView = new ImageView(image);
		imageView.setFitHeight(48);
		imageView.setFitWidth(48);
		this.setGraphic(imageView);
	}

	GameButton(HorizontalDestroy skill){
		// TODO complete the constructor
		
		super();
		this.setPadding(new Insets(5));
		this.buttonContent = new HorizontalDestroy();
		this.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		this.setBorder(new Border(new BorderStroke(Color.GRAY, BorderStrokeStyle.SOLID, 
				CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		
		Image image = new Image(buttonContent.getTotalImageUrl());
		ImageView imageView = new ImageView(image);
		imageView.setFitHeight(48);
		imageView.setFitWidth(48);
		this.setGraphic(imageView);
		
	
	}
	
	GameButton(VerticalDestroy skill){
		// TODO complete the constructor
		
		super();
		this.setPadding(new Insets(5));
		this.buttonContent = new VerticalDestroy();
		this.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		this.setBorder(new Border(new BorderStroke(Color.GRAY, BorderStrokeStyle.SOLID, 
				CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		
		Image image = new Image(buttonContent.getTotalImageUrl());
		ImageView imageView = new ImageView(image);
		imageView.setFitHeight(48);
		imageView.setFitWidth(48);
		this.setGraphic(imageView);
		
	
	}
	
	
	public void highlight() {
		// TODO 
		this.setBackground(new Background(new BackgroundFill(Color.LIMEGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	
	public void unhighlight() {
		// TODO
		this.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	
	// TODO GETTER
	
	

	public Buttonable getButtonContent() {
		return buttonContent;
	}
}
//TODO cancel skill button after selected