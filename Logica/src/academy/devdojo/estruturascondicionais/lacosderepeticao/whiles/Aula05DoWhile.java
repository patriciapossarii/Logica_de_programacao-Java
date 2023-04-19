package academy.devdojo.estruturascondicionais.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula05DoWhile {
    public static void main(String[] args) {
        boolean condicao = false;
           int desejaContinuar = 1;
        Scanner scanner = new Scanner(System.in);
                do{
                    System.out.println("Player 1 : Digite um numero de 1 a 10:");
                    int player1 = scanner.nextInt();
                    System.out.println("Player 2 : Digite um numero de 1 a 10:");
                    int player2 = scanner.nextInt();

                    if(player1==player2){
                        System.out.println("Acertaram");
                    }else {
                        System.out.println("Erraram");
                    }
                    System.out.println("___________________________________________");
                    System.out.println("Deseja continuar jogando ? ");
                    System.out.println("1. Sim\n2. Não");
                    desejaContinuar = scanner.nextInt();
                }while (desejaContinuar==1);

        }
    }

