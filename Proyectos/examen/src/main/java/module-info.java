module ec.edu.examen {
    requires javafx.controls;
    requires javafx.fxml;

    opens ec.edu.examen to javafx.fxml;
    opens ec.edu.examen.entidad to javafx.fxml;
    exports ec.edu.examen;
    exports ec.edu.examen.entidad;
}
