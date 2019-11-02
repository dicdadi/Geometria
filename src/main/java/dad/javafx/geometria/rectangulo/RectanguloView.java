package dad.javafx.geometria.rectangulo;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class RectanguloView extends BorderPane{
	private TextField altoText,anchoText;
	private Label areaLabel,perimetroLabel;
	private Rectangle rectangulo;
public RectanguloView() {
	super();
	altoText= new TextField();
	anchoText= new TextField();
	areaLabel= new Label();
	perimetroLabel = new Label();
	rectangulo= new Rectangle();
	
	
	HBox altoBox= new HBox(5,new Label("Alto: "),altoText);
	altoBox.setAlignment(Pos.BASELINE_CENTER);
	HBox anchoBox = new HBox(5,new Label("Ancho: "),anchoText);
	anchoBox.setAlignment(Pos.BASELINE_CENTER);
	HBox areaBox= new HBox(5,new Label("Area: "),areaLabel);
	areaBox.setAlignment(Pos.BASELINE_CENTER);
	HBox perimetroBox= new HBox(5,new Label("Perímetro: "),perimetroLabel);
	perimetroBox.setAlignment(Pos.BASELINE_CENTER);
	
	rectangulo.setFill(Color.rgb(0,162,232));//color de fondo
	rectangulo.setStrokeWidth(2);//contorno
	rectangulo.setStroke(Color.BLACK);
	
	
	VBox vistaPrincipal = new VBox();
	vistaPrincipal.setPadding(new Insets(10));
	vistaPrincipal.setSpacing(15);
	vistaPrincipal.getChildren().addAll(altoBox,anchoBox,rectangulo,areaBox,perimetroBox);
	vistaPrincipal.setAlignment(Pos.BASELINE_CENTER);
	
	this.setCenter(vistaPrincipal);
	
	
}
public TextField getAltoText() {
	return altoText;
}
public TextField getAnchoText() {
	return anchoText;
}
public Label getAreaLabel() {
	return areaLabel;
}
public Label getPerimetroLabel() {
	return perimetroLabel;
}
public Rectangle getRectangulo() {
	return rectangulo;
}
}
