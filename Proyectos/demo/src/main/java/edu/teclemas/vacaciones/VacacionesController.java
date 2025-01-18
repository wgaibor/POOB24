package edu.teclemas.vacaciones;

import java.time.LocalDate;

import edu.teclemas.vacaciones.dao.VacacionesDAO;
import edu.teclemas.vacaciones.entity.Persona;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.control.cell.PropertyValueFactory;

public class VacacionesController {

    @FXML
    private Button btnIngresar;

    @FXML
    private Button btnLimpiar;

    @FXML
    private DatePicker dpFeInicio;

    @FXML
    private DatePicker dpFeFin;

    @FXML
    private TableColumn<Persona, LocalDate> feFin;

    @FXML
    private TableColumn<Persona, LocalDate> feInicio;

    @FXML
    private TableColumn<Persona, String> identificacion;

    @FXML
    private TableView<Persona> tcVacaciones;

    @FXML
    private TextField txtIdentificacion;

    private ObservableList<Persona> olVacaciones = FXCollections.observableArrayList();

    @FXML
    void initialize() {
        // Configurar las columnas
        identificacion.setCellValueFactory(new PropertyValueFactory<>("identificacion"));
        feInicio.setCellValueFactory(new PropertyValueFactory<>("feInicio"));
        feFin.setCellValueFactory(new PropertyValueFactory<>("feFin"));

        // Vincular la lista con el TableView
        tcVacaciones.setItems(olVacaciones);

        // Limitar el TextField a 10 caracteres
        txtIdentificacion.setTextFormatter(new TextFormatter<>(change -> {
            if (change.getControlNewText().length() <= 10) {
                return change;
            }
            return null; // Rechazar cambios que exceden el límite
        }));

        txtIdentificacion.setTextFormatter(new TextFormatter<>(change -> {
            String newText = change.getControlNewText();
            if (newText.matches("\\d{0,10}")) { // Solo números y máximo 10 caracteres
                return change;
            }
            return null;
        }));

    }

    @FXML
    void ingresar(ActionEvent event) {
        // Obtener datos de los campos de texto y datepickers
        String valorIdentificacion = txtIdentificacion.getText();
        LocalDate valorFeInicio = dpFeInicio.getValue();
        LocalDate valorFeFin = dpFeFin.getValue();

        // Validaciòn de campos vacios
        if (valorIdentificacion.isEmpty()) {
            alertasPersonalizables("La identificación es requerida");
            return;
        }
        if (valorFeInicio == null) {
            alertasPersonalizables("La fecha de inicio es requerida");
            return;
        }
        if (valorFeFin == null) {
            alertasPersonalizables("La fecha fin es requerida");
            return;
        }

        Persona objPersona = new Persona();
        objPersona.setIdentificacion(valorIdentificacion);
        objPersona.setFeInicio(valorFeInicio);
        objPersona.setFeFin(valorFeFin);

        VacacionesDAO vacacionesInsertar = new VacacionesDAO();
        if (vacacionesInsertar.insertarVacaciones(objPersona)) {
            alertasPersonalizables("Se registro las vacaciones");
        } else {
            alertasPersonalizables("No se registro las vacaciones");
        }

        olVacaciones.add(objPersona);

        limpiar(event);

    }

    @FXML
    void limpiar(ActionEvent event) {
        txtIdentificacion.setText("");
        dpFeInicio.setValue(null);
        dpFeFin.setValue(null);
    }

    void alertasPersonalizables(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setHeaderText("Falta valores");
        alert.setTitle("Vacaciones");
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

}
