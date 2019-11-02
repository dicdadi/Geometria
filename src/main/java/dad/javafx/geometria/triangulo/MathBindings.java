package dad.javafx.geometria.triangulo;

import javafx.beans.binding.DoubleExpression;


public class MathBindings {
	
	public static SqrtBinding sqrt(DoubleExpression r) {
		return new SqrtBinding(r);
	}
	
}
