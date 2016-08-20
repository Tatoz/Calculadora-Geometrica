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
public class PentagonoController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML Button btnSalir,btnArea,btnPerimetro;
    @FXML TextField lado,apotema;
    @FXML Label label_Resultado, label_Pulgadas, label_Pies;
    Crear nombre;
   
    @FXML
    private void regresar() throws IOException{
        Stage s = (Stage)btnSalir.getScene().getWindow();
        s.close();
    }
    
    @FXML void area() throws IOException {
        
        String pentagonoA = lado.getText();
        String pentagonoB = apotema.getText();
        float pentagonoAa = Float.parseFloat(pentagonoA);
        float pentagonoBb = Float.parseFloat(pentagonoB);
        Figura pentagoo = new Pentagono(pentagonoAa, pentagonoBb);
        String ssuper = Float.toString(pentagoo.area());
        label_Resultado.setText(ssuper);
        String pulgadas = Float.toString(pentagoo.tOInches());
        label_Pulgadas.setText(pulgadas);
        String pies = Float.toString(pentagoo.toFeet());
        label_Pies.setText(pies);
        nombre = new Crear();
        nombre.Crear("pentagono", ssuper, pulgadas, pies);
    } 
    
     @FXML void perimetro() throws IOException {
        
        String pentagonoA = lado.getText();
        float pentagonoAa = Float.parseFloat(pentagonoA);
        Figura pentagoo = new Pentagono(pentagonoAa);
        String ssuper = Float.toString(pentagoo.perimetro());
        label_Resultado.setText(ssuper);
        String pulgadas = Float.toString(pentagoo.tOInches());
        label_Pulgadas.setText(pulgadas);
        String pies = Float.toString(pentagoo.toFeet());
        label_Pies.setText(pies);
        nombre = new Crear();
        nombre.Crear("pentagono", ssuper, pulgadas, pies);
    } 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

