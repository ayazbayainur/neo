package week1;

import java.io.IOException;
import java.util.Scanner;

public class WeightedAverages {
    public static void main(String[] args) throws IOException {

        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double[][] numbers = new double[n][3];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 3; j++){
                numbers[i][j] = scan.nextDouble();
            }
        }
        for(int i = 0; i < n; i++){
            double weighted_avg = (2 * numbers[i][0] + 3 * numbers[i][1] + 5 * numbers[i][2]) / 10;
            System.out.printf("%.1f%n", weighted_avg);
        }







    }
}
