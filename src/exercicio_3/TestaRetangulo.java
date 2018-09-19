/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_3;

import model.Retangulo;

/**
 *
 * @author Luis
 */
public class TestaRetangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo();
        Retangulo retangulo2 = new Retangulo();
        
        retangulo1.setLargura(3);
        retangulo1.setAltura(34);
        System.out.println("A área do primeiro retângulo é " + retangulo1.calculaArea() 
        + " e o seu perímetro é " + retangulo1.calculaPerimetro());
        
        System.out.println("");
        retangulo2.setLargura(3);
        retangulo2.setAltura(2);
        System.out.println("A área do segundo retângulo é " + retangulo2.calculaArea() 
        + " e o seu perímetro é " + retangulo2.calculaPerimetro());
    }
    
}
