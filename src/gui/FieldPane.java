package gui;

import java.util.ArrayList;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class FieldPane extends GridPane{
	ArrayList<FieldCell> fieldCells;
	
	public FieldPane() {
		super();
		
		this.setPrefWidth(500);
		this.setAlignment(Pos.CENTER);
		this.setVgap(8);
		this.setHgap(8);
		//TODO adapt size and color
		this.setBorder(new Border(new BorderStroke(Color.LIGHTGRAY, BorderStrokeStyle.SOLID, 
				CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		
		for(int i = 0 ; i < 64; i++) {
			fieldCells.add(new FieldCell());			
		}
		
		this.setBackground(new Background(new BackgroundFill(Color.LIMEGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
		for (int i = 0;i < 8;i++) {
			for (int j = 0;j < 8;j++) {
				this.add(fieldCells.get(8*i+j), j, i);
			}
		}
		
		
	}
	
	public FieldCell getNextCell(FieldCell fieldcell) {
		FieldCell nextFieldCell = null;
		for (int i = 0;i < fieldCells.size();i++) {
			if(fieldCells.get(i) == fieldcell && i != 63) {
				nextFieldCell = fieldCells.get(i+1);
				break;
			}	
		}
		return nextFieldCell;
	}
	
	public void destroy(ArrayList<Integer> row) {
		for (int i = 0;i < row.size();i++) {
			fieldCells.get(row.get(i)).isAttacked();
		}
	}
	
	public ArrayList<Integer> getCol(FieldCell fieldCell) {
		ArrayList<Integer> col = new ArrayList<Integer>();
		int a = fieldCells.indexOf(fieldCell);
		for (int i = a;i < fieldCells.size();i++) {
			col.add(i);
			i += 8;
		} return col;
	}
	
	public ArrayList<Integer> getRow(FieldCell fieldCell) {
		ArrayList<Integer> row = new ArrayList<Integer>();
		int a = fieldCells.indexOf(fieldCell);
		for (int i = a;i < a+8;i++) {
			row.add(i);
			i += 1;
		} return row;
	}
	
	public boolean isFieldPaneHasThis(FieldCell fieldCell) {
		for (int i = 0;i < fieldCells.size();i++) {
			if(fieldCell == fieldCells.get(i)) return true;
		}
		return false;
	}
	
	public boolean isSameRow(FieldCell fieldCell1, FieldCell fieldcell2) {
		int i, j;
		for (i = 0;i < fieldCells.size();i++) {
			if(fieldCells.get(i) == fieldCell1) break;	
		}
		for (j = 0;j < fieldCells.size();j++) {
			if(fieldCells.get(j) == fieldCell1) break;	
		}
		return (i/8) == (j/8);
	}
}
