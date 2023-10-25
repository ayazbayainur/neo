package week1;

import java.io.IOException;
import java.util.Scanner;

public class ColumnArray {
    public static void main(String[] args) throws IOException {

        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner scan = new Scanner(System.in);
        int column = scan.nextInt();
        char operation = scan.next().charAt(0);
        double[][] arr = new double[12][12];
        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 12; j++){
                arr[i][j] = scan.nextDouble();
            }
        }
        double sum = 0;
        for(int i = 0; i < 12; i++){
            sum += arr[i][column];
        }
        if(operation == 'S') System.out.printf("%.1f%n", sum);
        else System.out.printf("%.1f%n", (sum / 12));

    }
}
