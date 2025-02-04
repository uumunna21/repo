module JavaFX_Test {
	requires javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
}
