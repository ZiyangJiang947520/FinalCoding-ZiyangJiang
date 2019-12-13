module StudentLoanCalc {
	
	exports app;
	requires javafx.base;
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires javafx.media;
	requires poi;
	requires org.junit.jupiter.api;

	opens app.controller to javafx.fxml;
}