module workshop {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires java.sql;
	
	
	opens application to javafx.graphics, javafx.fxml;
	opens gui to javafx.graphics, javafx.fxml, javafx.base;
	opens gui.util to javafx.graphics, javafx.fxml, javafx.base;
	opens model.entities to javafx.graphics, javafx.fxml, javafx.base;
	opens model.services to javafx.graphics, javafx.fxml, javafx.base;
	opens model.dao.impl to javafx.graphics, javafx.fxml;
	opens model.dao to javafx.graphics, javafx.fxml;
	opens db to javafx.graphics, javafx.fxml;
	

}
