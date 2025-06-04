/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.idadeemdias;

/**
 *
 * @author Gomes
 */
  import java.util.Scanner;
public class IdadeEmDias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    //Recolhendo informações
    System.out.print("Digite a idade em anos: ");
    int anos = scanner.nextInt();

    System.out.print("Digite a idade em meses: ");
    int meses = scanner.nextInt();

    System.out.print("Digite a idade em dias: ");
    int dias = scanner.nextInt();
    //Conta final
    int totalDias = (anos * 365) + (meses * 30) + dias;

    System.out.println("A idade expressa em dias é: " + totalDias);

    scanner.close();
    }
}
