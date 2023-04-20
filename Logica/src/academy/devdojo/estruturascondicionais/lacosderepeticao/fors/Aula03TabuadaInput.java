package academy.devdojo.estruturascondicionais.lacosderepeticao.fors;

import java.util.Scanner;

public class Aula03TabuadaInput {
    public static void main(String[] args) {

        System.out.println("Digite o numero da tabuada desejada (0 a 10): ");
                Scanner scanner = new Scanner(System.in);
        int tabuada = scanner.nextInt();

        for(int i=0;i<=10;i++) {
            System.out.println(tabuada + " x "+i + " = "+tabuada*i);
        }
    }
}
