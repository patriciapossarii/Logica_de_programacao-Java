package academy.devdojo.estruturascondicionais.switchcase;

import java.util.Scanner;

public class Aula01DiasDaSemana {
    public static void main(String[] args) {
        Scanner diaInput = new Scanner(System.in);
        System.out.print("\n1 - Segunda-feira, \n2 - Terça-feira,\n3 - Quarta-feira,\n4 - Quinta-feira,\n5 - Sexta-feira,\n6 - Sábado,\n7 - Domingo.\n Digite o número dia da semana:  ");
        int dia = diaInput.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Segunda-feira - ( ˘︹˘ ) ");
                break;
            case 2:
                System.out.println("Terça-feira - (ㆆ_ㆆ)");
                break;
            case 3:
                System.out.println("Quarta-feira - ≧◉ᴥ◉≦");
                break;
            case 4:
                System.out.println("Quinta-feira - ٩(˘◡˘)۶");
                break;
            case 5:
                System.out.println("Sexta-feira - ((>‿◠)✌");
                break;
            case 6:
                System.out.println("Sábado - ☜(ˆ▿ˆc)");
                break;
            case 7:
                System.out.println("Domingo - ( ◡́.◡̀)(^◡^ )");
                break;
            default:
                System.out.println("Dia inválido");
        }
        System.out.println("Fim do Programa");
    }
}
