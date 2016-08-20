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
public class Poligonoss implements  Figura{
    private float lado,apotema,num_lados,Resultado;
    public Poligonoss(float lado,float apotema,float num_lados) {
        this.lado = lado;
        this.apotema = apotema;
        this.num_lados = num_lados;
    }

    public Poligonoss(float lado,float num_lados) {
        this.lado = lado;
        this.num_lados = num_lados;
    }
    
    

    @Override
    public float area() {
        float prPeri = num_lados * lado;
        Resultado = (prPeri * apotema)/2;
        return Resultado;
    }

    @Override
    public float perimetro() {
        Resultado = num_lados * lado;
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
