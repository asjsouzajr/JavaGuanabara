/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votacao;

import java.util.Scanner;

/**
 *
 * @author Sabrina_Note
 */
public class Votacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Qual o ano de nascimento ? ");
        Scanner anoNasc = new Scanner(System.in);
        int nasc = anoNasc.nextInt();
        System.out.println("==============================");
        int idade = 2019 - nasc;
        if (idade < 16){
            System.out.println("Nao Vota!!!");
        } 
        else if ((idade >= 16) && (idade < 18) || (idade > 70)){
            System.out.println("Voto Opcional!!!");
        } else {
            System.out.println("Voto Obrigatório!!!");
        }   
    }
    
}
