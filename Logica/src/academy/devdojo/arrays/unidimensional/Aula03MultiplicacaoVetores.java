package academy.devdojo.arrays.unidimensional;

import java.util.Scanner;

public class Aula03MultiplicacaoVetores {
    public static void main(String[] args) {
        int[] v1 = new int[4];
        int[] v2 = new int[4];
        int[] multiplicacao = new int[4];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < v1.length; i++) {
            System.out.println("Digite valor " + (i + 1) + " : ");
            v1[i] = scanner.nextInt();
        }
        for (int i = 0; i < v2.length; i++) {
            System.out.println("Digite valor " + (i + 1) + " : ");
            v2[i] = scanner.nextInt();
        }
        for (int i = 0; i < v1.length ; i++) {
            multiplicacao[i] = v1[i]*v2[i];
            System.out.println(v1[i] +" x "+ v2[i] + " = " +multiplicacao[i]);
        }
    }
}
