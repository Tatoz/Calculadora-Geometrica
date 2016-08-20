/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_geometrica;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author juancarlos
 */
public class CuboController implements Initializable {

   @FXML Button btnSalir;
   @FXML TextField lado;
   @FXML Label label_Area,label_Perimetro,label_Pies,label_Pulgadas;
   Crear nombre;
   
    @FXML
    private void regresar() throws IOException{
        Stage s = (Stage)btnSalir.getScene().getWindow();
        s.close();
    }

 @FXML void area() throws IOException {
        String cuboA = lado.getText();
        float cuboAa = Float.parseFloat(cuboA);
        Figura cuboo = new  Cubo(cuboAa);
        String ssuper = Float.toString(cuboo.area());
        label_Area.setText(ssuper);
        String pulgadas = Float.toString(cuboo.tOInches());
        label_Pulgadas.setText(pulgadas);
        String pies = Float.toString(cuboo.toFeet());
        label_Pies.setText(pies);
        nombre = new Crear();
        nombre.Crear("cubo", ssuper, pulgadas, pies);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
