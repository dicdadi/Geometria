package dad.javafx.geometria.triangulo;

import javafx.beans.binding.DoubleBinding;
import javafx.beans.binding.DoubleExpression;

public class SqrtBinding extends DoubleBinding {
	
	private DoubleExpression radicando;
		public SqrtBinding(DoubleExpression radicando) {
		super();
		this.radicando=radicando;
		bind(radicando);
		}

	@Override
	protected double computeValue() {
		// TODO Auto-generated method stub
		return Math.sqrt(radicando.get());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
