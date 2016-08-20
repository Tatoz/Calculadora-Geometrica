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
public class Cubo implements Figura{
    private float lado,resultado;
    Cubo(float lado) {
        this.lado = lado;
        
    }

    @Override
    public float area() {
        float area = (float) Math.pow(lado,2);
        resultado = 6 * area;
        return resultado;
    }

    @Override
    public float perimetro() {
        return 0;
    }

    @Override
    public float tOInches() {
        float pulgadas= (float) (resultado /2.54);
        return pulgadas;
    }

    @Override
    public float toFeet() {
        float pies= (float) (resultado * 0.032808);
         return pies;
    }
    
}
