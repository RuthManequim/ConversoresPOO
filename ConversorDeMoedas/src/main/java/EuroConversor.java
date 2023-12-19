/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rocha
 */
public class EuroConversor implements ModeloConversor {
    @Override
    public double converter(double valor) {
        return valor * 6.20;
    }

    @Override
    public String getSimbolo() {
        return "EUR";
    }
}