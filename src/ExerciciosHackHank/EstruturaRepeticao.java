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
public class EstruturaRepeticao {
    public void executar() {
    Scanner leitor = new Scanner(System.in);
    int numero = leitor.nextInt ();
    leitor.close();
    
    for (int i = 1; i <= 10; i++) {
        int resultado = numero * i;
        System.out.println(numero + " x " + i + " = " + resultado);
    }
    
    
}
    
}
