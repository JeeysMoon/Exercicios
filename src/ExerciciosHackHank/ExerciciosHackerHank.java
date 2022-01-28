/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosHackHank;

import java.util.Scanner;

/**
 *
 * @author Ana
 */
public class ExerciciosHackerHank {

    public static void main(String[] args) {

        //EstruturaRepeticao exercicio3 = new EstruturaRepeticao();
        //exercicio3.executar();
        
        /**IdadeDias calculadora = new IdadeDias();
        Scanner leitor = new Scanner(System.in);
        int idade = leitor.nextInt();
        calculadora.calculaIdade(idade);*/
        
        int [] vetor1 = {8,9,7};
        int [] vetor2 = {4,5,6};
        int mediaVetor1 = 0;
        int mediaVetor2 = 0;
        int mediaDasMedias = 0;
        int somaDasMedias = 0;
        
        for (int item : vetor1) {
            mediaVetor1 += item;
        }
        
        for (int item : vetor2) {
            mediaVetor2 += item;
                   }
        mediaVetor1 = mediaVetor1 / vetor1.length;
        mediaVetor2 = mediaVetor2 / vetor2.length;
        somaDasMedias = mediaVetor1 + mediaVetor2;
        mediaDasMedias = somaDasMedias / 2;
        
        System.out.println(mediaVetor1);
        System.out.println(mediaVetor2);
        System.out.println(somaDasMedias);
        System.out.println(mediaDasMedias);

    }
}
