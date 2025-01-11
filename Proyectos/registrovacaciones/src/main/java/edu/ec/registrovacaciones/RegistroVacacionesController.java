package edu.ec.registrovacaciones;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import edu.ec.registrovacaciones.entities.RegistroEntity;
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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class RegistroVacacionesController {

    @FXML
    private Button btnGuardar;

    @FXML
    private Button btnLimpiar;

    @FXML
    private Pane layoutPane;

    @FXML
    private TableView<RegistroEntity> tbFormulario;

    @FXML
    private TableColumn<RegistroEntity, String> tcIdentificacion;

    @FXML
    private TableColumn<RegistroEntity, Date> tcFechaInicio;

    @FXML
    private TableColumn<RegistroEntity, Date> tcFechaFin;

    @FXML
    private DatePicker tmpFechaFin;

    @FXML
    private DatePicker tmpFechaInicio;

    @FXML
    private TextField txtCedula;

    // Lista observable para almacenar los registros
    private ObservableList<RegistroEntity> registroList = FXCollections.observableArrayList();


    @FXML
    public void initialize() {

        // Usa Platform.runLater para ejecutar el código después de que la UI esté cargada
        javafx.application.Platform.runLater(() -> {
            Stage stage = (Stage) layoutPane.getScene().getWindow();
            if (stage != null) {
                stage.setTitle("Registro Vacaciones");
            }
        });

        // Vincula las columnas de la tabla con las propiedades del objeto RegistroEntity
        tcIdentificacion.setCellValueFactory(new PropertyValueFactory<RegistroEntity, String>("identificacion"));
        tcFechaInicio.setCellValueFactory(new PropertyValueFactory<RegistroEntity, Date>("fechaInicio"));
        tcFechaFin.setCellValueFactory(new PropertyValueFactory<RegistroEntity, Date>("fechaFin"));

        // Asigna la lista observable al TableView
        tbFormulario.setItems(registroList);
    }

    @FXML
    void guardarVacaciones(ActionEvent event) {
        // Validar campos antes de guardar
        if (txtCedula.getText().isEmpty() || tmpFechaInicio.getValue() == null || tmpFechaFin.getValue() == null) {
            mostrarAlerta("Error", "Por favor, llena todos los campos antes de guardar.");
            return;
        }

        // Crear un nuevo registro y agregarlo a la lista
        RegistroEntity registro = new RegistroEntity();
        registro.setIdentificacion(txtCedula.getText());
        registro.setFechaInicio(convertToDate(tmpFechaInicio.getValue()));
        registro.setFechaFin(convertToDate(tmpFechaFin.getValue()));

        registroList.add(registro);

        // Limpiar el formulario después de guardar
        //limpiarVacaciones(null);
    }

     private Date convertToDate(LocalDate localDate) {
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    @FXML
    void limpiarVacaciones(ActionEvent event) {
        txtCedula.clear();
        tmpFechaInicio.setValue(null);
        tmpFechaFin.setValue(null);
    }

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(titulo);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

}
