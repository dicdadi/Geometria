package dad.javafx.geometria.triangulo;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyDoubleWrapper;
import javafx.beans.property.SimpleDoubleProperty;

public class TrianguloModel {
	private DoubleProperty base = new SimpleDoubleProperty();
	private DoubleProperty altura = new SimpleDoubleProperty();
	private ReadOnlyDoubleWrapper area = new ReadOnlyDoubleWrapper();
	private ReadOnlyDoubleWrapper perimetro = new ReadOnlyDoubleWrapper();
	private DoubleProperty lados = new SimpleDoubleProperty();
	private DoubleProperty hipotenusa = new SimpleDoubleProperty();
	
	//Creamos dos nuevas variables que nos harán falta para calcular el perimetro conociendo la base y la altura del triangulo
	public TrianguloModel() {
		
		//a^2*b2*2=h^2

		area.bind(base.multiply(altura).divide(2));
		lados.bind((base.divide(2).multiply(base.divide(2))).add(altura.multiply(altura)));
		//MathBindings.sqrt es una bindeo custom creado para poder calcular la hipotenusa
		hipotenusa.bind(MathBindings.sqrt(lados));
		perimetro.bind(base.add(hipotenusa).add(hipotenusa));
	
	}

	public final DoubleProperty baseProperty() {
		return this.base;
	}

	public final double getBase() {
		return this.baseProperty().get();
	}

	public final void setBase(final double base) {
		this.baseProperty().set(base);
	}

	public final DoubleProperty alturaProperty() {
		return this.altura;
	}

	public final double getAltura() {
		return this.alturaProperty().get();
	}

	public final void setAltura(final double altura) {
		this.alturaProperty().set(altura);
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
