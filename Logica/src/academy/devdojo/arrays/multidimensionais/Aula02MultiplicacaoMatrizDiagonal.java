package academy.devdojo.arrays.multidimensionais;

public class Aula02MultiplicacaoMatrizDiagonal {
    public static void main(String[] args) {
        int[][] arrayMult = new int[3][3];
        arrayMult[0][0] = 22;
        arrayMult[0][1] = 11;
        arrayMult[0][2] = 4;
        arrayMult[1][0] = 44;
        arrayMult[1][1] = 55;
        arrayMult[1][2] = 9;
        arrayMult[2][0] = 2;
        arrayMult[2][1] = 5;
        arrayMult[2][2] = 21;
        int result = 1;

        for (int i = 0; i < arrayMult.length; i++) {
            for (int j = 0; j < arrayMult[i].length; j++) {
                if (i == j) {
                    result = result * arrayMult[i][j];
                }

            }
        }
        System.out.println(result);
    }
}