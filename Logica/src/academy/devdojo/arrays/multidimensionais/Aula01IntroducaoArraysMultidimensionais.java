package academy.devdojo.arrays.multidimensionais;

public class Aula01IntroducaoArraysMultidimensionais {
    public static void main(String[] args) {
        int [] [] arrayMult = new int[2][2];
        arrayMult [0] [0] = 22;
        arrayMult [0] [1] = 11;
        arrayMult [1] [0] = 44;
        arrayMult [0] [1] = 55;
        System.out.println(arrayMult [0] [0]);
        System.out.println(arrayMult [0] [1]);
        System.out.println(arrayMult [1] [0]);
        System.out.println(arrayMult [0] [1]);

    }
}
