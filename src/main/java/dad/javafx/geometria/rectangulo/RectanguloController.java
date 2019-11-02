package dad.javafx.geometria.rectangulo;

import javafx.beans.binding.Bindings;
import javafx.util.converter.NumberStringConverter;

public class RectanguloController {
	private RectanguloModel model = new RectanguloModel();
	private RectanguloView view = new RectanguloView();
	
	public RectanguloController() {
		view.getAltoText().textProperty().bindBidirectional(model.altoProperty(),new NumberStringConverter());
		view.getAnchoText().textProperty().bindBidirectional(model.anchoProperty(),new NumberStringConverter());
		//con el concat conseguimos mostrar en el label, el area
		//Hacemos concat porque area es de tipo Double y solo lectura, y el label necesita de tipo String
		view.getAreaLabel().textProperty().bind(Bindings.concat(model.areaProperty()));
		view.getPerimetroLabel().textProperty().bind(Bindings.concat(model.perimetroProperty()));
		view.getRectangulo().widthProperty().bind(model.anchoProperty());
		view.getRectangulo().heightProperty().bind(model.altoProperty());
	}
	public RectanguloView getRoot() {
		return view;
	}
}


