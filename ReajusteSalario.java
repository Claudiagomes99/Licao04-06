/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reajustesalario;

/**
 *
 * @author Gomes
 */
  import java.util.Scanner;
public class ReajusteSalario {

    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o saldo: R$ ");
    double saldo = scanner.nextDouble();

    double reajuste = saldo * 0.01;
    double novoSaldo = saldo + reajuste;

    System.out.printf("Saldo com reajuste de 1%%: R$ %.2f%n", novoSaldo);

    scanner.close();
    }
}
