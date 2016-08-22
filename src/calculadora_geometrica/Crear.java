/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_geometrica;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 *
 * @author juancarlos
 */
public class Crear {
    @FXML
    private Button button_atras, button_crear, button_seleccionar;
    private TextField espacio_archivo; 
    private String datos="";

    /**
     * Initializes the controller class.
     */
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
    /*private void handleButtonAction11(ActionEvent event) throws IOException {
        Stage stage5 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Ventanita.fxml"));
        Scene scene = new Scene(root);
        
        stage5.setScene(scene);
        stage5.setResizable(false); 
        salir();
        stage5.show();
    }*/
    
    /*@FXML 
    public void Recibir(ActionEvent Event) throws IOException{
         datos = espacio_archivo.getText();
    }*/
    
    @FXML
    public void Crear(String figura, String cm, String pulgadas, String pie) throws IOException{
        File historial = null;
        
        try{
            historial = new File ("historial.txt");//Aqui se crea el nombre del archivo txt
            BufferedWriter bf = new BufferedWriter(new FileWriter(datos,true));
        }catch(Exception e){
        }
        
        
			if(historial == null){
				 historial.createNewFile();
                        } else {
                            FileWriter fw = null;
				BufferedWriter bw = null;
				try {
					// EL segundo parametro es un boolean
					// En true escribe al final
					// En false escribe al inicio
					fw = new FileWriter(historial, true);
					bw = new BufferedWriter(fw);
                                        bw.write("Figura: "+figura);
                                        bw.write("\t");
                                        bw.write("Cm: "+cm);
                                        bw.write("\t");
                                        bw.write("Pulgadas: "+pulgadas);
                                        bw.write("\t");
					bw.write("Pie: "+pie);
                                        bw.newLine();
                                        
					//String texto = textArea.getText();
					//bw.write(texto, 0, texto.length());
				} catch (Exception e) {
					//textArea.appendText(e.toString());
				}
                            finally {
					try {
						bw.close();
					} catch (Exception e2) {
					//	textArea.appendText(e2.toString());
					}
				}
			}
    }
    
    @FXML
    private void Seleccionar(ActionEvent button_seleccionar) throws IOException{
        FileChooser fileChooser = new FileChooser();
        Window stage = null;
			File file = fileChooser.showOpenDialog(stage);
			if(file!=null){
				FileReader fr = null;
				BufferedReader br = null;
				String texto = "";
				try {
					fr = new FileReader(file);
					br = new BufferedReader(fr);
					String st = br.readLine();
					while (st != null) {
						texto = texto + st + "\n";
						st = br.readLine();
					}
				} catch (Exception e) {
					//textArea.appendText(e.toString());
				} finally {
					try {
					//	fr.close();
					} catch (Exception e2) {
					//	textArea.appendText(e2.toString());
					}
				}
				//textArea.appendText(texto);
			}
    }
    @FXML
    private void salir(){
        Stage s = (Stage)button_atras.getScene().getWindow();
        s.close();
    }
    
}

    

