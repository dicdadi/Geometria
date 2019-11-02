package dad.javafx.geometria.hexagono;

import dad.javafx.geometria.shapes.Hexagon;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;


public class HexagonoView extends BorderPane {
	private TextField radioText;
	private Label areaLabel, perimetroLabel;
	private Hexagon hexagono;

	public HexagonoView() {
		super();

		areaLabel = new Label();
		perimetroLabel = new Label();
		radioText = new TextField();
		hexagono = new Hexagon();

		HBox radioBox = new HBox(5, new Label("Radio: "), radioText);
		radioBox.setAlignment(Pos.BASELINE_CENTER);

		HBox areaBox = new HBox(5, new Label("Area: "), areaLabel);
		areaBox.setAlignment(Pos.BASELINE_CENTER);
		HBox perimetroBox = new HBox(5, new Label("Perímetro: "), perimetroLabel);
		perimetroBox.setAlignment(Pos.BASELINE_CENTER);

		hexagono.setFill(Color.PURPLE);
		hexagono.setStrokeWidth(2);
		hexagono.setStroke(Color.BLACK);

		VBox vistaPrincipal = new VBox();
		vistaPrincipal.setPadding(new Insets(10));
		vistaPrincipal.setSpacing(15);
		vistaPrincipal.getChildren().addAll(radioBox, hexagono, areaBox, perimetroBox);
		vistaPrincipal.setAlignment(Pos.BASELINE_CENTER);

		this.setCenter(vistaPrincipal);

	}

	public Label getAreaLabel() {
		return areaLabel;
	}

	public TextField getRadioText() {
		return radioText;
	}

	public Label getPerimetroLabel() {
		return perimetroLabel;
	}

	public Hexagon getHexagon() {
		return hexagono;
	}
}
