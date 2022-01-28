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
public class EstruturaCondicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        int numero = leitor.nextInt();
        leitor.close();
        
        if (numero %  2 != 0) {
            System.out.println("Esquisito");
        } else if (numero >= 2 && numero <= 5) {
            System.out.println("Normal");
        } else if (numero >= 6 && numero <= 20) {
            System.out.println("Esquisito");
        } else if (numero > 20) {
            System.out.println("Normal");
        }
        

    }

}
