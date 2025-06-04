/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.medisaritmetica;

/**
 *
 * @author Gomes
 */
public class MedisAritmetica {

    public static void main(String[] args) {
        // Média dos números 8, 9 e 7
    double media1 = (8 + 9 + 7) / 3.0;
    System.out.println("Média dos números 8, 9 e 7: " + media1);

    // Média dos números 4, 5 e 6
    double media2 = (4 + 5 + 6) / 3.0;
    System.out.println("Média dos números 4, 5 e 6: " + media2);

    // Soma das duas médias
    double somaMedias = media1 + media2;
    System.out.println("Soma das duas médias: " + somaMedias);

    //Média das médias
    double mediaDasMedias = (media1 + media2) / 2.0;
    System.out.println("Média das médias: " + mediaDasMedias);
    }
}
