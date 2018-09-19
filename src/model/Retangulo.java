/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Luis
 */
public class Retangulo {
    private double altura;
    private double largura;

    public Retangulo() {
        altura = 1.0;
        largura = 1.0;
    }

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }
    
    public double calculaArea(){
        return largura * altura;
    }
    
    public double calculaPerimetro(){
        return 2 * (largura + altura);
    }

    public double getAltura() {
        if(altura > 0.0 && altura < 20.0){
            System.out.println("A altura está no intervalo permitido!");
        }else{
            System.out.println("A altura não está no intervalo permitido!");
        } 
        return altura;
    }

    public void setAltura(double altura) {
        if(altura > 0.0 && altura < 20.0){
            this.altura = altura;
            System.out.println("A altura está no intervalo permitido!");
        }else{
            System.out.println("A altura não está no intervalo permitido!");
        }        
    }

    public double getLargura() {
        if(largura > 0.0 && largura < 20.0){
            System.out.println("A largura está no intervalo permitido!");
        }else{
            System.out.println("A largura não está no intervalo permitido!");
        }
        return largura;
    }

    public void setLargura(double largura) {
        if(largura > 0.0 && largura < 20.0){
            this.largura = largura;
            System.out.println("A largura está no intervalo permitido!");
        }else{
            System.out.println("A largura não está no intervalo permitido!");
        }  
    }
    
    
}
