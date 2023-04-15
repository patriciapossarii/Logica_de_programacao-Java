package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class CondicionaisII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year of birth: ");
        float year= sc.nextInt();

        if(year>=1944 && year<=1964){
            System.out.println("Geração Boomers");
        } else if (year>=1965 && year<=1979) {
            System.out.println("Geração X");
        }else if (year>=1980 && year<=1994) {
            System.out.println("Geração Y");
        }else if (year>=1995 && year<=2015) {
            System.out.println("Geração Z");
        }else{
            System.out.println("Geração não encontrada");
        }

    }
}
