package academy.devdojo.estruturascondicionais.lacosderepeticao.whiles;

import java.util.Scanner;
public class Aula04Login {
    public static void main(String[] args) {
        final String Login = "Luffy";
        final String password = "ReiDosPiratas";
        boolean exibirTelaLogin = true;
        Scanner scanner = new Scanner(System.in);

        while(exibirTelaLogin) {
            System.out.println("Login : ");
            String loginInput = scanner.nextLine();
            System.out.println("Password : ");
            String passwordInput = scanner.nextLine();
            if (loginInput.equals(loginInput) && passwordInput.equals(password)) {
                System.out.println("ACESSO CONCEDIDO");
                exibirTelaLogin = false;
            } else { 
                System.out.println("ACESSO NEGADO");
            }
        }
        /*
        OPÇÃO 01
                System.out.print("Email : ");

        Scanner emailInput = new Scanner(System.in);
        String email = emailInput.next();
        System.out.print("Password : ");
        Scanner passwordInput = new Scanner(System.in);
        String password = passwordInput.next();
        final String emailBD = "email@email.com";
        final String passwordBD = "senha123";

        while (!email.equals(emailBD) || !password.equals(passwordBD)) {
            System.out.println("ACESSO NEGADO");
            emailInput = new Scanner(System.in);
            System.out.print("Email : ");
            email = emailInput.next();

            passwordInput = new Scanner(System.in);
            System.out.print("Password : ");
            password = passwordInput.next();
        }
        System.out.println("ACESSO CONCEDIDO");

         */


    }
}
