package dad.javafx.geometria.hexagono;

import javafx.beans.binding.Bindings;
import javafx.util.converter.NumberStringConverter;

public class HexagonoController {
private HexagonoView view= new HexagonoView();
private HexagonoModel model= new HexagonoModel();
public HexagonoController() {
	view.getRadioText().textProperty().bindBidirectional(model.radioProperty(), new NumberStringConverter());
	view.getAreaLabel().textProperty().bind(Bindings.concat(model.areaProperty()));
	view.getPerimetroLabel().textProperty().bind(Bindings.concat(model.perimetroProperty()));

	view.getHexagon().radioProperty().bind(model.radioProperty());
	
}
public HexagonoView getRoot() {
	return view;
}
}
