/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversordevelocidade;

/**
 *
 * @author rocha
 */
import java.util.Scanner;

public class ConversorDeVelocidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor em m/s: ");
        double valor = scanner.nextDouble();

        Conversor conversor = new Conversor(valor);

        System.out.println("Escolha o tipo de velocidade para realizar a conversão:");
        System.out.println("1. Nó");
        System.out.println("2. km/h");
        System.out.println("3. mph");
        int escolha = scanner.nextInt();

        ModeloConversor modeloConversor = null;

        switch (escolha) {
            case 1:
                modeloConversor = new NoConversor();
                break;
            case 2:
                modeloConversor = new KMConversor();
                break;
            case 3:
                modeloConversor = new MPHConversor();
                break;
            default:
                System.out.println("Opção inválida");
                return;
        }

        double resultado = conversor.converter(modeloConversor);
        String simbolo = conversor.getSimbolo(modeloConversor);

        System.out.println("Resultado: " + resultado + " " + simbolo);
    }
}