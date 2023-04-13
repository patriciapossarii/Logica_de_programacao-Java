import java.util.Scanner;

/*/
Dado um determinado salário, se o valor for maior que 4500 imprima 30% do valor, senão 15%
 */
public class CalculadoraImpostoCondicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter with value salary: ");
        float salary = sc.nextInt();
        float result = 0F;
        float percentage = 0;
        if (salary >= 4500) {
            percentage = 30F;
        } else {
            percentage = 15F;
        }
        result = salary * percentage / 100;
        System.out.println(percentage + "% de R$" + salary + " é : R$" + result);
    }
}
