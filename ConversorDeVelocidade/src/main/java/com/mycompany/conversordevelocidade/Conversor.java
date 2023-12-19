/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversordevelocidade;

/**
 *
 * @author rocha
 */
public class Conversor {
    private double valor;

    public Conversor(double valor) {
        this.valor = valor;
    }

    public double converter(ModeloConversor modeloConversor) {
        return modeloConversor.converter(valor);
    }

    public String getSimbolo(ModeloConversor modeloConversor) {
        return modeloConversor.getSimbolo();
    }
    
}
