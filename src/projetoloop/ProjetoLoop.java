package projetoloop;

import java.util.Scanner;

/**
 *
 * @author Jeferson
 */
public class ProjetoLoop {

    public static void main(String[] args) {

        int contMaior, contMenor, n, idade;
        Scanner ler = new Scanner(System.in);
        contMaior = 0;
        contMenor = 0;
        n = 1;
        idade = 0;
        while (n != 0) {
            System.out.println("Digite 1 para continuar ou 0 (zero) para sair:");
            n = ler.nextInt();
            if (n < 0 || n > 1) {
                System.out.println("Por gentileza apenas 1 ou zero");
            } else if (n != 0) {
                System.out.println("Informe uma idade:");
                idade = ler.nextInt();
                if (idade >= 18) {
                    contMaior++;
                } else {
                    contMenor++;
                }
            }//fim do if
        }//fim do while
        System.out.println("O sistema identificou " + contMaior + " pessoas maiores de idade");
        System.out.println("O sistema identificou " + contMenor + " pessoas menores de idade");
    }

}
