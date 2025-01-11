module edu.teclemas.vacaciones {
    requires javafx.controls;
    requires javafx.fxml;

    opens edu.teclemas.vacaciones to javafx.fxml;
    opens edu.teclemas.vacaciones.entity to javafx.fxml;
    exports edu.teclemas.vacaciones;
    exports edu.teclemas.vacaciones.entity;
}
