package dad.javafx.geometria.hexagono;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyDoubleWrapper;
import javafx.beans.property.SimpleDoubleProperty;

public class HexagonoModel {
	private DoubleProperty radio = new SimpleDoubleProperty();
	private ReadOnlyDoubleWrapper area = new ReadOnlyDoubleWrapper();
	private ReadOnlyDoubleWrapper perimetro = new ReadOnlyDoubleWrapper();

	private DoubleProperty apotema = new SimpleDoubleProperty();

	public HexagonoModel() {
		apotema.bind(radio.multiply( (Math.sqrt(3))/2 ));
		perimetro.bind(radio.multiply(6));
		area.bind(perimetro.multiply(apotema).divide(2));
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

	public final javafx.beans.property.ReadOnlyDoubleProperty areaProperty() {
		return this.area.getReadOnlyProperty();
	}

	public final double getArea() {
		return this.areaProperty().get();
	}

	public final javafx.beans.property.ReadOnlyDoubleProperty perimetroProperty() {
		return this.perimetro.getReadOnlyProperty();
	}

	public final double getPerimetro() {
		return this.perimetroProperty().get();
	}
}
