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
public class PRController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML Button btnSalir, btnArea, btnPerimetro;
    @FXML TextField numLados, lado, apotema;
    @FXML Label label_Resultado, label_Pulgadas, label_Pies;
    Crear nombre;
   
    @FXML
    private void regresar() throws IOException{
        Stage s = (Stage)btnSalir.getScene().getWindow();
        s.close();
    }
    
    @FXML void area() throws IOException {
        
        String prA = numLados.getText();
        String prB = lado.getText();
        String prC = apotema.getText();
        float prAa = Float.parseFloat(prA);
        float prBb = Float.parseFloat(prB);
        float prCc = Float.parseFloat(prC);
        Figura pol = new Poligonoss(prBb, prCc, prAa);
        String ssuper = Float.toString(pol.area());
        label_Resultado.setText(ssuper);
        String pulgadas = Float.toString(pol.tOInches());
        label_Pulgadas.setText(pulgadas);
        String pies = Float.toString(pol.toFeet());
        label_Pies.setText(pies);
        nombre = new Crear();
        nombre.Crear("poligono regular", ssuper, pulgadas, pies);
    } 
    
    @FXML void perimetro() throws IOException{
         String prA = numLados.getText();
        String prB = lado.getText();
        float prAa = Float.parseFloat(prA);
        float prBb = Float.parseFloat(prB);
        Figura pol = new Poligonoss(prBb, prAa);
        String ssuper = Float.toString(pol.perimetro());
        label_Resultado.setText(ssuper);
        String pulgadas = Float.toString(pol.tOInches());
        label_Pulgadas.setText(pulgadas);
        String pies = Float.toString(pol.toFeet());
        label_Pies.setText(pies);
        nombre = new Crear();
        nombre.Crear("poligono regular", ssuper, pulgadas, pies);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
