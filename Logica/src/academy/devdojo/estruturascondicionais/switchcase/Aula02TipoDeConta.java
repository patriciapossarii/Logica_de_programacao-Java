package academy.devdojo.estruturascondicionais.switchcase;

public class Aula02TipoDeConta {
    public static void main(String[] args) {
        String conta = "POUPANÇA";

        switch (conta) {
            case "POUPANÇA":
                System.out.println("Juros de 0.05%");
                break;
            case "CORRENTE":
                System.out.println("Juros de 0.02%");
                break;
            case "investimento":
                System.out.println("Juros de 0.01%");
                break;
            default:
                System.out.println("Conta inválida");
        }
    }
}
