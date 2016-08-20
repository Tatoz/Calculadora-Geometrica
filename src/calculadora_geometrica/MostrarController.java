/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_geometrica;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author juancarlos
 */
    

public class MostrarController implements Initializable {
   @FXML TextArea txtHistorial;
    
    @FXML void Split() throws IOException {
        
 
    }
            static ObservableList<Datos> listita;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        txtHistorial.setEditable(false);
        try {
            LeerFichero file = new LeerFichero();
            String Contenido = file.muestraContenido("historial.txt");
            txtHistorial.setText(Contenido);
            //file.muestraContenido("C:/Users/juancarlos/Desktop/Calculadora_Geometrica/historial.txt");
        } catch (IOException ex) {
            Logger.getLogger(MostrarController.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
    }    
    
}
