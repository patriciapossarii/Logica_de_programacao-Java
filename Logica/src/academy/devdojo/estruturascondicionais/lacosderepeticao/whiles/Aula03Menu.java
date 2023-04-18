package academy.devdojo.estruturascondicionais.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula03Menu {
    public static void main(String[] args) {
        Scanner numberInput = new Scanner(System.in);
        System.out.print("1 - Calcular Imposto\n2 - Depositar Salário\n3 - Sair\nDigite a sua opção: ");
        int input = numberInput.nextInt();

        while (input ==1 || input ==2){
         numberInput = new Scanner(System.in);
            System.out.print("\n - Calcular Imposto\n2 - Depositar Salário\n3 - Sair\nDigite a sua opção: ");
           input = numberInput.nextInt();
        }
        System.out.println("Programa Encerrado!Obrigad@");
    }
}
