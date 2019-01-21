package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args) {
        //float nota = 8.5f;
        /*imprimindo já formatado (.2 entre % e f, significa 2 casas decimais)
         * %s serve para formartar para String
         * nesse casso, pode se usar System.out.format
        */ 
        //String nome = "Aldo";
        //System.out.printf("A Nota de %s é %.2f \n",nome, nota);
     
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do Aluno: ");
        String nome = teclado.nextLine();
        System.out.println("Digite a nota do Aluno: ");
        float nota = teclado.nextFloat();
        System.out.format("A Nova Nota de %s é %.2f \n", nome,nota);
    }
}
