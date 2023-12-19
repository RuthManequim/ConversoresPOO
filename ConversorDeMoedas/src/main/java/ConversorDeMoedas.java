/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 *
 * @author rocha
 */
import java.util.Scanner;

public class ConversorDeMoedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor em Real: ");
        double valor = scanner.nextDouble();

        Conversor conversor = new Conversor(valor);

        System.out.println("Escolha o tipo de moeda para realizar a conversão:");
        System.out.println("1. Euro");
        System.out.println("2. Dolar");
        System.out.println("3. Libra");
        int escolha = scanner.nextInt();

        ModeloConversor modeloConversor = null;

        switch (escolha) {
            case 1:
                modeloConversor = new EuroConversor();
                break;
            case 2:
                modeloConversor = new DolarConversor();
                break;
            case 3:
                modeloConversor = new LibraConversor();
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