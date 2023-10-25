package week1;

import java.io.IOException;
import java.util.Scanner;

public class Banknotes {
    public static void main(String[] args) throws IOException {

        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int helper = 0;
        int banknotes = 0;
        System.out.println(x);
        banknotes = x / 100;
        helper = x % 100;
        System.out.println(banknotes + " nota(s) de R$ 100,00");
        banknotes = helper / 50;
        helper = helper % 50;
        System.out.println(banknotes + " nota(s) de R$ 50,00");
        banknotes = helper / 20;
        helper = helper % 20;
        System.out.println(banknotes + " nota(s) de R$ 20,00");
        banknotes = helper / 10;
        helper = helper % 10;
        System.out.println(banknotes + " nota(s) de R$ 10,00");
        banknotes = helper / 5;
        helper = helper % 5;
        System.out.println(banknotes + " nota(s) de R$ 5,00");
        banknotes = helper / 2;
        helper = helper % 2;
        System.out.println(banknotes + " nota(s) de R$ 2,00");
        banknotes = helper / 1;
        System.out.println(banknotes + " nota(s) de R$ 1,00");

    }
}
