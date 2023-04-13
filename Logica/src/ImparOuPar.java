import java.util.Scanner;

public class ImparOuPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter with number: ");
        int input = sc.nextInt();

        if(input%2==0){
            System.out.println("O número "+input+" é par");
        }else {
            System.out.println("O número "+input+" é impar");
        }
    }
}
