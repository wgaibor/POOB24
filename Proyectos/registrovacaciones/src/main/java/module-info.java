module edu.ec.registrovacaciones {
    requires javafx.controls;
    requires javafx.fxml;

    opens edu.ec.registrovacaciones to javafx.fxml;
    exports edu.ec.registrovacaciones;
}
