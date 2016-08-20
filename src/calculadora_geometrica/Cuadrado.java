/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_geometrica;

/**
 *
 * @author juancarlos
 */
public class Cuadrado implements Figura{
    private float Resultado,Cuadro;
    
    Cuadrado(float cuadrado){
        Cuadro = cuadrado;
    }
    
    @Override
    public float area() {
        Resultado = Cuadro * Cuadro;
        return Resultado;
    }

    @Override
    public float perimetro() {
        Resultado = Cuadro + Cuadro + Cuadro + Cuadro;
        return Resultado;

    }

    @Override
    public float tOInches() {
      float pulgadas= (float) (Resultado /2.54);
        return pulgadas;  
    }

    @Override
    public float toFeet() {
        float pies= (float) (Resultado * 0.032808);
         return pies;
    }
    
}
