/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_geometrica;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

/**
 *
 * @author juancarlos
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML Button btnCubo;
    @FXML Button btnCuadrado;
    @FXML Button btnPentagono;
    private Stage stage;
    
    /**
     *
     * @param stage
     */
    public void setData( Stage stage){
        this.stage= stage;
        
    }
    
    @FXML   public void CalcularCubo() throws IOException{
       Stage stage = new Stage();
       FXMLLoader myLoader;
       myLoader = new FXMLLoader(getClass().getResource("Cubo.fxml"));
       Parent root = (Parent) myLoader.load();
       Scene scene = new Scene(root);
       stage.setScene(scene);
       stage.setTitle("cubo");
       stage.show();
       
      
    }
    
    
    @FXML   public void CalcularCuadrado() throws IOException{
        Stage stage = new Stage();
       FXMLLoader myLoader;
       myLoader = new FXMLLoader(getClass().getResource("Cuadrado.fxml"));
       Parent root = (Parent) myLoader.load();
       Scene scene = new Scene(root);
       stage.setScene(scene);
       stage.setTitle("cuadrado");
       stage.show();
       
    
    }
    
    @FXML   public void CalcularPentagono() throws IOException{
       Stage stage = new Stage();
       FXMLLoader myLoader;
       myLoader = new FXMLLoader(getClass().getResource("Pentagono.fxml"));
       Parent root = (Parent) myLoader.load();
       Scene scene = new Scene(root);
       stage.setScene(scene);
       stage.setTitle("Pentagono");
       stage.show();
    
    }
    
    
    @FXML   public void CalcularTriangulo() throws IOException{
       Stage stage = new Stage();
       FXMLLoader myLoader;
       myLoader = new FXMLLoader(getClass().getResource("Triangulo.fxml"));
       Parent root = (Parent) myLoader.load();
       Scene scene = new Scene(root);
       stage.setScene(scene);
       stage.setTitle("Triangulo");
       stage.show();
    
    }
    
    @FXML   public void CalcularPR() throws IOException{
       Stage stage = new Stage();
       FXMLLoader myLoader;
       myLoader = new FXMLLoader(getClass().getResource("PR.fxml"));
       Parent root = (Parent) myLoader.load();
       Scene scene = new Scene(root);
       stage.setScene(scene);
       stage.setTitle("Poligono Regular");
       stage.show();
    
    }
    
    @FXML 
        private void Video (ActionEvent event) throws Exception{
        Stage stage10 = new Stage();
        BorderPane borderPane = new BorderPane();
        Media media = new Media(new File("presenta.mp4").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
        MediaView mediaView = new MediaView(mediaPlayer);
        borderPane.setCenter(mediaView);
        Scene scene = new Scene (borderPane, 975, 565);
        stage10.setScene(scene);
        stage10.show();
    }
        
        @FXML 
        private void Mostrar (ActionEvent event) throws Exception{
        Stage stage = new Stage();
       FXMLLoader myLoader;
       myLoader = new FXMLLoader(getClass().getResource("Mostrar.fxml"));
       Parent root = (Parent) myLoader.load();
       Scene scene = new Scene(root);
       stage.setScene(scene);
       stage.setTitle("Historial");
       stage.show();
    }
    
    
    @FXML private void salir(){
        this.stage.close();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
