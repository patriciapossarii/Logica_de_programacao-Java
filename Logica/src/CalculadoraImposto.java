import java.util.Scanner;
public class CalculadoraImposto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter with number: ");
        float salary = sc.nextInt();
        float percentage = 30;
        float result =salary -  salary * (percentage/100);
        System.out.println("O valor líquido é: "+result);
    }

}


/*float salary = 2500F;
double salary = 2500D
 */

