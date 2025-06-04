/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.antecessoresucessor;

/**
 *
 * @author Gomes
 */
  import java.util.Scanner;
public class AntecessorESucessor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número inteiro: ");
    int numero = scanner.nextInt();

    int antecessor = numero - 1;//numero de antes
    int sucessor = numero + 1; // próximo numero

    System.out.println("Antecessor: " + antecessor);
    System.out.println("Número: " + numero);
    System.out.println("Sucessor: " + sucessor);

    scanner.close();
    }
}
