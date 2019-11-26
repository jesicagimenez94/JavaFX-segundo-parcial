package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;


public class Controller {
    @FXML
    private TextField nombre;
    @FXML
    private TextField apellido;
    @FXML
    private TextField dni;
    @FXML
    private TextField mail;
    @FXML
    private TextField nota;
    @FXML
    private TextField promedio;
    @FXML
    private ComboBox materias;
    @FXML
    private TableView table;

    @FXML
    private void initialize(){
        materias.setValue("-------");
        materias.setItems(listaMaterias);
        cargarListaAlumnos();



    }

    ObservableList<String> listaMaterias= FXCollections.observableArrayList("matematica","programacion","estadistica");
//    ObservableList<String> data= FXCollections.observableArrayList(nombre.getText(),apellido.getText(),dni.getText(),mail.getText());

    private void cargarListaAlumnos(){

        table.setEditable(true);
        table.getColumns().clear();

        TableColumn name= new TableColumn("Nombre");
        name.setMinWidth(100);
        name.setCellValueFactory(new PropertyValueFactory<>("nombre"));

        TableColumn apellido= new TableColumn("Apellido");
        apellido.setMinWidth(100);
        apellido.setCellValueFactory(new PropertyValueFactory<>("apellido"));

        TableColumn mail= new TableColumn("mail");
        mail.setMinWidth(100);
        mail.setCellValueFactory(new PropertyValueFactory<>("mail"));

        TableColumn dni= new TableColumn("dni");
        dni.setMinWidth(100);
        dni.setCellValueFactory(new PropertyValueFactory<>("dni"));

        TableColumn materia= new TableColumn("materias");
        materia.setMinWidth(100);
        materia.setCellValueFactory(new PropertyValueFactory<>("materia"));

        TableColumn notas= new TableColumn("notas");
        notas.setMinWidth(100);

        notas.setCellValueFactory(new PropertyValueFactory<>("nota"));

        table.getColumns().addAll(name,apellido,mail,dni,materia,notas);

    }

    public void mensajeOk(String mensaje){
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("OK");
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    public void MensajeError(String mensaje){
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("ERROR");
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    @FXML
    public void aceptar(MouseEvent mouseEvent){
        nombre.getText();
        apellido.getText();
        dni.getText();
        mail.getText();
        int not= Integer.parseInt(nota.getText());
      //  double pro= Double.parseDouble(promedio.getText());

     if(nombre.getText().length()<5 && apellido.getText().length()<5 && dni.getText().length()<5 && mail.getText().length()<5){
         MensajeError("la cantidad de caracteres es incorrecta");
         if(nombre.getText().equals("") && apellido.getText().equals("") && dni.getText().equals("")&& mail.getText().equals("")&&nota.getText().equals("")){
          MensajeError("hay campos vacios");
         }

     }
     else {
         Alumnos a= new Alumnos();
         a.setNombre(nombre.getText());
         a.setApellido(apellido.getText());
         a.setDni(dni.getText());
         a.setMail(mail.getText());
         a.setNota(not);
         String opc= (String) materias.getSelectionModel().getSelectedItem();
         a.setMateria(opc);
         table.getItems().add(a);

         Integer result=0;
         int i;
       /*  for ( i = 1; i < 5; ++i) {
              a=table.getItems().get(i+);
             result=a.getNota();

         }
        // promedio.getText()=result/table.fixedCellSizeProperty();

*/

     }


}






    @FXML
    public void borrar(MouseEvent mouseEvent){
        nombre.setText("");
        apellido.setText("");
        dni.setText("");
        mail.setText("");
        materias.setValue(false);
        nota.setText("");
        promedio.setText("");

    }



}
