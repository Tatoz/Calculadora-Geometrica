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
public class Pentagono implements Figura{
    private float lado,apotema,Resultado;

    public Pentagono(float lado) {
        this.lado = lado;
    }

    public Pentagono(float lado,float apotema) {
        this.lado = lado;
        this.apotema= apotema;
    }
    
    @Override
    public float area() {
        float pentaPeri = lado * 5;
        Resultado = (pentaPeri * apotema)/2;
        return Resultado;
    }

    @Override
    public float perimetro() {
        Resultado = lado* 5;
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
