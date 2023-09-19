/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebafigurasIG;

/**
 *
 * @author julian
 */
public class Rectangulo {
    int base; // Atributo que define la base de un rectangulo
    int altura; // Atributo que define la altura de un rectangulo
    
    /**
    * Constructor de la clase Rectangulo
    * @param base Parametro que define la base de un rectangulo
    * @param altura Parametro que define la altura de un rectangulo
    */
    Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    /**
    * Metodo que calcula y devuelve el area de un rectangulo como la
    * multiplicacion de la base por la altura
    * @return Área de un rectángulo
    */
    double calcularArea() {
        return base * altura;
    }
    
    /**
    * Metodo que calcula y devuelve el perimetro de un rectangulo
    * como (2 * base) + (2 * altura)
    * @return Perimetro de un rectangulo
    */
    double calcularPerimetro() {
        return (2 * base) + (2 * altura);
    }
}