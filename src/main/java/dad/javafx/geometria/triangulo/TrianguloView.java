package dad.javafx.geometria.triangulo;

import dad.javafx.geometria.shapes.Triangle;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;


public class TrianguloView extends BorderPane {
	private TextField baseText, alturaText;
	private Label areaLabel, perimetroLabel;
	private Triangle triangulo;

	public TrianguloView() {
		super();
		baseText = new TextField();
		alturaText = new TextField();
		areaLabel = new Label();
		perimetroLabel = new Label();
		triangulo = new Triangle();

		HBox altoBox = new HBox(5, new Label("Base: "), baseText);
		altoBox.setAlignment(Pos.BASELINE_CENTER);
		HBox anchoBox = new HBox(5, new Label("Altura: "), alturaText);
		anchoBox.setAlignment(Pos.BASELINE_CENTER);
		HBox areaBox = new HBox(5, new Label("Area: "), areaLabel);
		areaBox.setAlignment(Pos.BASELINE_CENTER);
		HBox perimetroBox = new HBox(5, new Label("Perímetro: "), perimetroLabel);
		perimetroBox.setAlignment(Pos.BASELINE_CENTER);

		triangulo.setFill(Color.rgb(0, 162, 232));// color de fondo
		triangulo.setStrokeWidth(2);// contorno
		triangulo.setStroke(Color.GREEN);

		VBox vistaPrincipal = new VBox();
		vistaPrincipal.setPadding(new Insets(10));
		vistaPrincipal.setSpacing(15);
		vistaPrincipal.getChildren().addAll(altoBox, anchoBox, triangulo, areaBox, perimetroBox);
		vistaPrincipal.setAlignment(Pos.BASELINE_CENTER);

		this.setCenter(vistaPrincipal);

	}

	public TextField getBaseText() {
		return baseText;
	}

	public TextField getAlturaText() {
		return alturaText;
	}

	public Label getAreaLabel() {
		return areaLabel;
	}

	public Label getPerimetroLabel() {
		return perimetroLabel;
	}

	public Triangle getTriangle() {
		return triangulo;
	}

}
