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
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author juancarlos
 */
public class CuadradoController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML Button btnSalir,btnArea,btnPerimetro;
    @FXML TextField Lado;
    @FXML Label label_Resultado,label_Pulgadas, label_Pies;
    Crear nombre;
   
    @FXML
    private void regresar() throws IOException{
        Stage s = (Stage)btnSalir.getScene().getWindow();
        s.close();
    }
    
    @FXML void Area() throws IOException {
        String Cuadrado = Lado.getText();
        float Cuadro = Float.parseFloat(Cuadrado);
        Figura cuadradito = new  Cuadrado(Cuadro);
        String ssuper = Float.toString(cuadradito.area());
        label_Resultado.setText(ssuper);
        String pulgadas = Float.toString(cuadradito.tOInches());
        label_Pulgadas.setText(pulgadas);
        String pies = Float.toString(cuadradito.toFeet());
        label_Pies.setText(pies);
        nombre = new Crear();
        nombre.Crear("cuadrado", ssuper, pulgadas, pies);
    }
    
    @FXML void Perimetro() throws IOException {
        String Cuadrado = Lado.getText ();
        float Cuadro = Integer.parseInt(Cuadrado);
        Figura cuadradito = new  Cuadrado(Cuadro);
        String ssuper = Float.toString(cuadradito.perimetro());
        label_Resultado.setText(ssuper);
        String pulgadas = Float.toString(cuadradito.tOInches());
        label_Pulgadas.setText(pulgadas);
        String pies = Float.toString(cuadradito.toFeet());
        label_Pies.setText(pies);
        nombre = new Crear();
        nombre.Crear("cuadrado", ssuper, pulgadas, pies);
        
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
