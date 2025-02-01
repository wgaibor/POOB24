package ec.edu.examen;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    final String USER = "admin";
    final String PASS = "admin";

    @FXML
    private Button btnIngresar;

    @FXML
    private PasswordField pwdContrasena;

    @FXML
    private TextField txtUser;

    @FXML
    void ingresar(ActionEvent event) {
        validarFormulario();
    }

    private void validarFormulario() {
        if (txtUser.getText().equals(USER) && pwdContrasena.getText().equals(PASS)) {
            try {
                App.setRoot("veterinario");
            } catch (IOException e) {
                alertar("Error al cargar la vista", Alert.AlertType.ERROR);
            }
        } else {
            alertar("Usuario o contraseña incorrectos", Alert.AlertType.ERROR);
        }
    }

    private void alertar(String mensaje, Alert.AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setContentText(mensaje);
        alert.show();
    }
}
