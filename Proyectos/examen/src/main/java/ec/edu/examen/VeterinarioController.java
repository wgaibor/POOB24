package ec.edu.examen;

import ec.edu.examen.entidad.VeterinarioEntity;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class VeterinarioController {

    @FXML
    private Button btnGuardar;

    @FXML
    private Button btnLimpiar;

    @FXML
    private TableColumn<VeterinarioEntity, Integer> tcEdad;

    @FXML
    private TableColumn<VeterinarioEntity, String> tcNombre;

    @FXML
    private TableColumn<VeterinarioEntity, String> tcObservacion;

    @FXML
    private TableView<VeterinarioEntity> tvVeterinario;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtObservacion;

    private ObservableList<VeterinarioEntity> olVeterinarios = FXCollections.observableArrayList();

    @FXML
    void initialize() {
        //Configurar las columnas de la tabla
        tcNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        tcEdad.setCellValueFactory(new PropertyValueFactory<>("edad"));
        tcObservacion.setCellValueFactory(new PropertyValueFactory<>("observacion"));

        // Vincular la lista con el TableView
        tvVeterinario.setItems(olVeterinarios);
    }

    @FXML
    void guardar(ActionEvent event) {
        // Crear un objeto de tipo VeterinarioEntity
        VeterinarioEntity veterinario = new VeterinarioEntity(txtNombre.getText(), 
                                                              Integer.parseInt(txtEdad.getText()), 
                                                              txtObservacion.getText());

        // Agregar el objeto a la lista
        olVeterinarios.add(veterinario);

        // Limpiar los campos
        limpiarCampos();
    }

    @FXML
    void limpiar(ActionEvent event) {
        limpiarCampos();
    }

    private void limpiarCampos() {
        txtNombre.clear();
        txtEdad.clear();
        txtObservacion.clear();
    }

}
