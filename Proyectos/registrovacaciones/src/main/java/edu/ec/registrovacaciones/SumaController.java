package edu.ec.registrovacaciones;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class SumaController {

    @FXML
    private Button btnLimpiar;

    @FXML
    private Button btnSumar;

    @FXML
    private Label lblResultado;

    @FXML
    private TextField txtNumero1;

    @FXML
    private TextField txtNumero2;

    @FXML
    private Pane layoutPane;

    @FXML
    public void initialize() {

        // Usa Platform.runLater para ejecutar el código después de que la UI esté cargada
        javafx.application.Platform.runLater(() -> {
            Stage stage = (Stage) layoutPane.getScene().getWindow();
            if (stage != null) {
                stage.setTitle("Suma");
            }
        });
    }

    @FXML
    void limpiar(ActionEvent event) {
        txtNumero1.setText("");
        txtNumero2.setText("");
        lblResultado.setText("");
    }

    @FXML
    void sumar(ActionEvent event) {
        int valor1 = Integer.valueOf(txtNumero1.getText().toString());
        int valor2 = Integer.valueOf(txtNumero2.getText().toString());
        int resultado = valor1 + valor2;
        lblResultado.setText(resultado+"");
    }

}
