package academy.devdojo.estruturascondicionais.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula02NumerosImpares {
    public static void main(String[] args) {
        Scanner numberInput = new Scanner(System.in);
        System.out.print("Enter with value: ");
        int number = numberInput.nextInt();
        int i = 0;
        while (i <= number) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
            i = i + 1;
        }
    }
}
