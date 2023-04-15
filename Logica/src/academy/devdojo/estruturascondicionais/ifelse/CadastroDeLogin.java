package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class CadastroDeLogin {
    public static void main(String[] args) {
        Scanner nomeInput = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = nomeInput.next();

        if (nome.equals("") ||
                nome.isBlank() ||
                nome.equalsIgnoreCase("admin") ||
                nome.equalsIgnoreCase("administrador")) {
            System.out.println("Usuário inválido");
        } else {
            System.out.println("Cadastrado realizado com sucesso");
        }
    }

}
