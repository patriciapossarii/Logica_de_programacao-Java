package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner diaInput = new Scanner(System.in);
        System.out.print("\n1 - Segunda-feira, \n2 - Terça-feira,\n3 - Quarta-feira,\n4 - Quinta-feira,\n5 - Sexta-feira,\n6 - Sábado,\n7 - Domingo.\n Digite o número dia da semana:  ");
        int dia = diaInput.nextInt();

        if(dia == 1 ){
            System.out.println("Segunda-feira - ( ˘︹˘ ) ");
        } else if (dia == 2 ) {
            System.out.println("Terça-feira - (ㆆ_ㆆ)");
        }else if (dia == 3 ) {
            System.out.println("Quarta-feira - ≧◉ᴥ◉≦");
        }else if (dia == 4 ) {
            System.out.println("Quinta-feira - ٩(˘◡˘)۶");
        }else if (dia == 5 ) {
            System.out.println("Sexta-feira - ((>‿◠)✌");
        }else if (dia == 6 ) {
            System.out.println("Sábado - ☜(ˆ▿ˆc)");
        }else if (dia == 7 ) {
            System.out.println("Domingo - ( ◡́.◡̀)(^◡^ )");
        }else  {
            System.out.println("Dia inválido");
        }
    }


}
