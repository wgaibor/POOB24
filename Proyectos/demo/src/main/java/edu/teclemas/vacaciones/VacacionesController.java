package edu.teclemas.vacaciones;

import java.time.LocalDate;
import java.util.List;

import edu.teclemas.vacaciones.dao.VacacionesDAO;
import edu.teclemas.vacaciones.entity.Persona;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.control.cell.PropertyValueFactory;

public class VacacionesController {

    private final String ALERTA = "Alerta";
    private final String PROCESO_GUARDADO = "Proceso de guardado";

    @FXML
    private Button btnIngresar;

    @FXML
    private Button btnLimpiar;

    @FXML
    private Button btnRefrescar;

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


        // Cargar los datos de la base de datos
        try {
            List<Persona> listaVacaciones = new VacacionesDAO().listarVacaciones();
            olVacaciones.addAll(listaVacaciones);
        } catch (Exception e) {
            System.out.println("Error al conectar a la base de datos: " + e);
            alertasPersonalizables(ALERTA, "No se puede conectar a la base de datos", Alert.AlertType.ERROR);
        }
        

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
            alertasPersonalizables(ALERTA, "La identificación es requerida", Alert.AlertType.WARNING);
            return;
        }
        if (valorFeInicio == null) {
            alertasPersonalizables(ALERTA, "La fecha de inicio es requerida", Alert.AlertType.WARNING);
            return;
        }
        if (valorFeFin == null) {
            alertasPersonalizables(ALERTA, "La fecha fin es requerida", Alert.AlertType.WARNING);
            return;
        }

        Persona objPersona = new Persona();
        objPersona.setIdentificacion(valorIdentificacion);
        objPersona.setFeInicio(valorFeInicio);
        objPersona.setFeFin(valorFeFin);

        VacacionesDAO vacacionesInsertar = new VacacionesDAO();
        if (vacacionesInsertar.insertarVacaciones(objPersona)) {
            alertasPersonalizables(PROCESO_GUARDADO, "Se registro las vacaciones", Alert.AlertType.CONFIRMATION);
        } else {
            alertasPersonalizables(PROCESO_GUARDADO, "No se registro las vacaciones", Alert.AlertType.ERROR);
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

    @FXML
    void refrescar(ActionEvent event) {
        olVacaciones.clear();
        List<Persona> listaVacaciones = new VacacionesDAO().listarVacaciones();
        olVacaciones.addAll(listaVacaciones);
    }

    void alertasPersonalizables(String titulo, String mensaje, AlertType icono) {
        Alert alert = new Alert(icono);
        alert.setHeaderText(titulo);
        alert.setTitle("Vacaciones");
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

}
