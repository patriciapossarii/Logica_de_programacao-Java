package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class AlistamentoMiltar {
    public static void main(String[] args) {
        Scanner sexoInput = new Scanner(System.in);
        System.out.print("Digite o seu sexo. Utilize F para Feminino ou M para Masculino: ");
        String sexo = sexoInput.next();

        while (!sexo.equalsIgnoreCase("F") && !sexo.equalsIgnoreCase("M")) {
            System.out.println("Utilize F para Feminino ou M para Masculino");
            sexo = sexoInput.next();
        }

        Scanner idadeInput = new Scanner(System.in);
        System.out.print("Enter with number: ");
        int idade = idadeInput.nextInt();

        if (sexo.equalsIgnoreCase("m") && idade >= 18) {
            System.out.println("Alistamento Obrigatório");
        } else if (sexo.equalsIgnoreCase("f") && idade >= 18) {
            System.out.println("Deseja se alistar?");
        } else if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m") && idade < 18) {
            System.out.println("Alistamento não permitido");
        }

    }
}
