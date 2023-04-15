package academy.devdojo.variaveis;

import java.util.Scanner;
/*
>> Reutilizando variáveis
-Entrar com um valor
-Calcula a porcentagem de 30%, 15% e 5%
-Cada vez que calcular a porcentagem deve armazenar na mesma variavel do resultado para o novo calculo
 */

public class CalculadoraImpostoII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter with number: ");
        float salary = sc.nextInt();
        float percentage = 30;
        float result = salary * (percentage / 100);
        System.out.println("30% é: " + result);
        percentage = 15;
        result = salary * (percentage / 100);
        System.out.println("15% é: " + result);
        percentage = 5;
        result = salary * (percentage / 100);
        System.out.println("5% é: " + result);
    }
}
