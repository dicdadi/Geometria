package dad.javafx.geometria;

import dad.javafx.geometria.circulo.CirculoController;
import dad.javafx.geometria.hexagono.HexagonoController;
import dad.javafx.geometria.rectangulo.RectanguloController;
import dad.javafx.geometria.triangulo.TrianguloController;
import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;

import javafx.stage.Stage;

public class GeometriaApp extends Application {
	private RectanguloController rectanguloController;
	private CirculoController circuloController;
	private HexagonoController hexagonoController;
	private TrianguloController trianguloController;
	@Override
	public void start(Stage primaryStage) throws Exception {
		rectanguloController= new RectanguloController();
		circuloController = new CirculoController();
		hexagonoController = new HexagonoController();
		trianguloController = new TrianguloController();
		TabPane root= new TabPane();
		root.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
		root.getTabs().add(new Tab("Rectángulo", rectanguloController.getRoot()));
		root.getTabs().add(new Tab("Circulo", circuloController.getRoot()));
		root.getTabs().add(new Tab("Hexagono", hexagonoController.getRoot()));
		root.getTabs().add(new Tab("Triangulo", trianguloController.getRoot()));
		Scene scene = new Scene(root, 640,480);
		primaryStage.setTitle("Geometria");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

	public static void main(String[] args) {
	launch(args);

	}

}
