package academy.devdojo.estruturascondicionais.lacosderepeticao.fors;

public class Aula03Tabuada {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
            System.out.println("Imprimindo a tabuadado do número "+i);
            for (int j=0;j<=10;j++){
                System.out.println(i + " x "+j + " = "+i*j);
            }
        }
    }
}
