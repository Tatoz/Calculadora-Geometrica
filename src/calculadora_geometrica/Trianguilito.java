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
public class Trianguilito implements Figura{
    private  float lado,Resultado,base,altura,pulgadas,pies;
    public Trianguilito(float triangulo) {
        lado = triangulo;
    }

    public Trianguilito(float base,float altura) {
        this.base = base;
        this.altura= altura;
       
    }
    
    
    
    @Override
    public float area() {
         Resultado = (base * altura)/2;
         return Resultado;
    }

    @Override
    public float perimetro() {
        Resultado = lado + lado + lado;
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
