/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rocha
 */
public class LibraConversor implements ModeloConversor {
    @Override
    public double converter(double valor) {
        return valor * 7.50;
    }

    @Override
    public String getSimbolo() {
        return "GBP";
    }
}