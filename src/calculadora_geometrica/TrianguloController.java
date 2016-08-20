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
public class TrianguloController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML Button btnSalir,btnArea,btnPerimetro;
    @FXML TextField base,altura;
    @FXML Label label_Resultado, label_Pulgadas, label_Pies;
    Crear nombre;
    
   
    @FXML
    private void regresar() throws IOException{
        Stage s = (Stage)btnSalir.getScene().getWindow();
        s.close();
    }
    
    @FXML void area() throws IOException {
        
        String trianguloA = base.getText();
        String trianguloB = altura.getText();
        float trianguloAa = Float.parseFloat(trianguloA);
        float trianguloBb = Float.parseFloat(trianguloB);
        Figura triangul = new Trianguilito(trianguloAa, trianguloBb);
        String ssuper = Float.toString(triangul.area());
        label_Resultado.setText(ssuper);
        String pulgadas = Float.toString(triangul.tOInches());
        label_Pulgadas.setText(pulgadas);
        String pies = Float.toString(triangul.toFeet());
        label_Pies.setText(pies);
        nombre = new Crear();
        nombre.Crear("triangulo", ssuper, pulgadas, pies);
    } 
    
    @FXML void perimetro() throws IOException {
        String trianguloA = base.getText();
        float trianguloAa = Integer.parseInt(trianguloA);
        Figura triangulo = new Trianguilito(trianguloAa);
        String ssuper = Float.toString(triangulo.perimetro());
        label_Resultado.setText(ssuper);
        String pulgadas = Float.toString(triangulo.tOInches());
        label_Pulgadas.setText(pulgadas);
        String pies = Float.toString(triangulo.toFeet());
        label_Pies.setText(pies);
        nombre = new Crear();
        nombre.Crear("triangulo", ssuper, pulgadas, pies);
    }
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
