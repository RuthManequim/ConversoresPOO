/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversordevelocidade;

/**
 *
 * @author rocha
 */
public class KMConversor implements ModeloConversor {
    @Override
    public double converter(double valor) {
        return valor * 3.6;
    }

    @Override
    public String getSimbolo() {
        return "km/h";
    }
}
