package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

/*
Dado input de nome e idade, deve classificar a idade para qual categoria que a pessoa pertence e imprimir a mensagem no modelo abaixo:
Menor que 10 anos: <Nome>: participará da categoria Infantil.
Entre  11 e 15 anos: <Nome>: participará da categoria Juvenil.
Entre  16 e 19 anos: <Nome>: participará da categoria Pré-adulto.
Acima de 20 anos: <Nome>: participará da categoria Adulto.
 
 */
public class TorneioDeNatacao {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String name = s1.nextLine();

        Scanner s2 = new Scanner(System.in);
        System.out.print("Digite a idade: ");
        int age = s2.nextInt();

        if (age <= 10) {
            System.out.println(name + " participará da categoria Infantil");
        } else if (age >= 11 && age <= 15) {
            System.out.println(name + " participará da categoria Juvenil.");
        } else if (age >= 16 && age <= 19) {
            System.out.println(name + " participará da categoria Pré-adulto.");
        } else if (age >= 20 ) {
            System.out.println(name + " participará da categoria Adulto.");
        }else {
            System.out.println("Informe uma idade valida");
        }

    }
}
