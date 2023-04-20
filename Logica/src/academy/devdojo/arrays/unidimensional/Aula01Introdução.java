package academy.devdojo.arrays.unidimensional;

public class Aula01Introdução {
    public static void main(String[] args) {
        double[] notas = new double [4];
        notas[0] = 8;
        notas[1] = 7;
        notas[2]= 6.6;
        notas[3]= 4;

        for(int i=0; i<notas.length;i++){
            System.out.println(notas[i]);
        }
    }
}
