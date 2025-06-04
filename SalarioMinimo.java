/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salariominimo;

/**
 *
 * @author Gomes
 */
  import java.util.Scanner;
public class SalarioMinimo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    double salarioMinimo = 1000.00;

    System.out.print("Digite o valor do seu salário: R$ ");
    double salarioUsuario = scanner.nextDouble();

    double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;

    System.out.printf("Você ganha %.2f SM.%n", quantidadeSalariosMinimos);

    scanner.close();
    }
}
