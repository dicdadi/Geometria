package dad.javafx.geometria.shapes;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.shape.Polygon;

public class Hexagon extends Polygon {
	
	private static final int SIDES = 6;
	private DoubleProperty radio = new SimpleDoubleProperty();
	
	public Hexagon(double radio) {
		super();
		this.radio.set(radio);
		createPoints();
		this.radio.addListener( (o,ov,nv) -> createPoints());
	}
	
	public Hexagon() {
		this(0.0);
	}
	private void createPoints() {
		double radio = getRadio();
		getPoints().clear();
		for(int i = 0; i < SIDES;i++) {
			double x = radio + radio * Math.cos(i * 2 * Math.PI / SIDES);
			double y = radio + radio * Math.sin(i * 2 * Math.PI / SIDES);
			getPoints().addAll(x,y);
		}
		
	}

	public final DoubleProperty radioProperty() {
		return this.radio;
	}
	

	public final double getRadio() {
		return this.radioProperty().get();
	}
	

	public final void setRadio(final double radio) {
		this.radioProperty().set(radio);
	}
	

}
