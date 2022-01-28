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
public class Entrada_e_Saida_Padrao {

    public void executar() {
        Scanner leitor = new Scanner(System.in);
        String nome = leitor.next();
        int idade = leitor.nextInt();
        leitor.close();

        System.out.println("Minha String é: " + nome);
        System.out.println("Meu Int é: " + idade);

    }
}
