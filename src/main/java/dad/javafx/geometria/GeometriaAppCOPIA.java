package dad.javafx.geometria;

import dad.javafx.geometria.shapes.Hexagon;
import dad.javafx.geometria.shapes.Triangle;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class GeometriaAppCOPIA extends Application {
	
	private Rectangle rectangulo;
	private Circle circulo;
	private Triangle triangulo;
	private Hexagon hexagono;
	@Override
	public void start(Stage primaryStage) throws Exception {
		rectangulo = new Rectangle();
		rectangulo.setWidth(80);
		rectangulo.setHeight(60);
		rectangulo.setFill(Color.rgb(0,162,232));//color de fondo
		rectangulo.setStrokeWidth(2);//contorno
		rectangulo.setStroke(Color.BLACK);
		
		circulo= new Circle();
		circulo.setRadius(40);
		circulo.setFill(Color.RED);
		circulo.setStrokeWidth(2);
		circulo.setStroke(Color.BLACK);
		
		triangulo= new Triangle();
		triangulo.setBase(50);
		triangulo.setHeight(80);
		triangulo.setFill(Color.GREEN);
		triangulo.setStrokeWidth(2);
		triangulo.setStroke(Color.BLACK);
		
		hexagono = new Hexagon();
		hexagono.setRadio(40);
		hexagono.setFill(Color.PURPLE);
		hexagono.setStrokeWidth(2);
		hexagono.setStroke(Color.BLACK);
		
		GridPane root = new GridPane();
		root.setHgap(5);
		root.setVgap(5);
		root.setAlignment(Pos.CENTER);
		root.add(rectangulo, 0, 0);
		root.add(circulo, 1, 0);
		root.add(triangulo, 0, 1);
		root.add(hexagono, 1, 1);
		
		Scene scene = new Scene(root, 640,480);
		primaryStage.setTitle("Geometria");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
	launch(args);

	}

}
