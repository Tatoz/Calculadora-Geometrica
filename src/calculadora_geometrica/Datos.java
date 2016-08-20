/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_geometrica;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author juancarlos
 */
public class Datos {
        public final SimpleStringProperty nombre;
        public final SimpleStringProperty centimeters;
        public final SimpleStringProperty inches;
        public final SimpleStringProperty feet;
        
        Datos() {
            this.nombre = new SimpleStringProperty("");
            this.centimeters = new SimpleStringProperty("");
            this.inches = new SimpleStringProperty("");
            this.feet = new SimpleStringProperty("");
        }

        public String getnombre() {
            return nombre.get();
        }
        public void setnombre(String fName) {
            nombre.set(fName);
        
        }
        
         public String getcentimeters() {
            return centimeters.get();
        }
        public void setcentimeters(String fName) {
            centimeters.set(fName);
        
        }
        
         public String getinches() {
            return inches.get();
        }
        public void setinches(String fName) {
            inches.set(fName);
        
        }
        
         public String getfeet() {
            return feet.get();
        }
        public void setfeet(String fName) {
            feet.set(fName);
        
        }
        
        Datos(String nombre, String centimeters, String inches, String feet) {
            this.nombre = new SimpleStringProperty(nombre);
            this.centimeters = new SimpleStringProperty(centimeters);
            this.inches = new SimpleStringProperty(inches);
            this.feet = new SimpleStringProperty(feet);
            
        }
}
