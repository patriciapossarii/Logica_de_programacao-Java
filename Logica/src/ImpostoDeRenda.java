import java.util.Scanner;

public class ImpostoDeRenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter with number: ");
        int salary = sc.nextInt();

        if (salary <= 1903.98) {
            System.out.println("FAIXA 1 - O valor R$" + salary + " é ISENTO");
        } else if (salary >= 1903.99 && salary <= 2826.65) {
            System.out.println("FAIXA 2 - O valor R$" + salary + " tem a alíquota de 7,5%, portando o imposto é de R$" + salary * 0.075);
        } else if (salary >= 2826.66 && salary <= 3751.05) {
            System.out.println("FAIXA 3 - O valor R$" + salary + " tem a alíquota de 15%, portando o imposto é de R$" + salary * 0.15);
        } else if (salary >= 3751.06 && salary <= 4664.68) {
            System.out.println("FAIXA 4 - O valor R$" + salary + " tem a alíquota de 22,5%, portando o imposto é de R$" + salary * 0.225);
        } else if (salary > 4664.69) {
            System.out.println("FAIXA 5 - O valor R$" + salary + " tem a alíquota de 27,5%, portando o imposto é de R$" + salary * 0.275);
        } else {
            System.out.println("Valor inválido");
        }
    }
}
