package week1;

import java.io.IOException;
import java.util.Scanner;

public class BanknotesAndCoins {
    public static void main(String[] args) throws IOException {

        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner scan = new Scanner(System.in);
        double value = scan.nextDouble();
        int note = (int) value;
        int helper = note;
        int nota;
        System.out.println("NOTAS:");

        if(note >= 100){
            nota = note / 100;
            helper = note % 100;
            System.out.println(nota + " nota(s) de R$ 100.00");
        } else System.out.println("0 nota(s) de R$ 100.00");
        if(helper >= 50){
            nota = helper / 50;
            helper = helper % 50;
            System.out.println(nota + " nota(s) de R$ 50.00");

        } else System.out.println("0 nota(s) de R$ 50.00");
        if(helper >= 20){
            nota = helper / 20;
            helper = helper % 20;
            System.out.println(nota + " nota(s) de R$ 20.00");
        } else System.out.println("0 nota(s) de R$ 20.00");
        if(helper >= 10){
            nota = helper / 10;
            helper = helper % 10;
            System.out.println(nota + " nota(s) de R$ 10.00");
        } else System.out.println("0 nota(s) de R$ 10.00");
        if(helper >= 5){
            nota = helper / 5;
            helper = helper % 5;
            System.out.println(nota + " nota(s) de R$ 5.00");
        } else System.out.println("0 nota(s) de R$ 5.00");
        if(helper >= 2){
            nota = helper / 2;
            helper = helper % 2;
            System.out.println(nota + " nota(s) de R$ 2.00");
        } else System.out.println("0 nota(s) de R$ 2.00");


        System.out.println("MOEDAS:");
        int coin = (int) ((value - note) * 100);
        if(helper != 0) System.out.println("1 moeda(s) de R$ 1.00");
        else System.out.println("0 moeda(s) de R$ 1.00");
        helper = coin;
        if(coin >= 50){
            nota = coin / 50;
            helper = coin % 50;
            System.out.println(nota + " moeda(s) de R$ 0.50");
        } else System.out.println("0 moeda(s) de R$ 0.50");
        if(helper >= 25){
            nota = helper / 25;
            helper = helper % 25;
            System.out.println(nota + " moeda(s) de R$ 0.25");
        } else System.out.println("0 moeda(s) de R$ 0.25");
        if(helper >= 10){
            nota = helper / 10;
            helper = helper % 10;
            System.out.println(nota + " moeda(s) de R$ 0.10");
        } else System.out.println("0 moeda(s) de R$ 0.10");
        if(helper >= 5){
            nota = helper / 5;
            helper = helper % 5;
            System.out.println(nota + " moeda(s) de R$ 0.05");
        } else System.out.println("0 moeda(s) de R$ 0.05");
        if(helper >= 1){
            nota = helper / 1;
            helper = helper % 1;
            System.out.println(nota + " moeda(s) de R$ 0.01");
        } else System.out.println("0 moeda(s) de R$ 0.01");

    }
}
