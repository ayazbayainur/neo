package week1;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class TriangleTypes {
    public static void main(String[] args) throws IOException {

        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner scan = new Scanner(System.in);
        double[] sides = new double[3];
        sides[0] = scan.nextDouble(); //C
        sides[1] = scan.nextDouble(); // B
        sides[2] = scan.nextDouble(); // A
        Arrays.sort(sides);
        boolean possible = true;
        if(sides[2] >= sides[1] + sides[0]){
            System.out.println("NAO FORMA TRIANGULO");
            possible = false;
        }
        if(possible && sides[2] * sides[2] == sides[1] * sides[1] + sides[0] * sides[0])
            System.out.println("TRIANGULO RETANGULO");
        if(possible && sides[2] * sides[2] > sides[1] * sides[1] + sides[0] * sides[0])
            System.out.println("TRIANGULO OBTUSANGULO");
        if(possible && sides[2] * sides[2] < sides[1] * sides[1] + sides[0] * sides[0])
            System.out.println("TRIANGULO ACUTANGULO");
        if(possible && sides[2] == sides[1] && sides[2] == sides[0] && sides[0] == sides[1])
            System.out.println("TRIANGULO EQUILATERO");
        if(possible && (sides[2] == sides[1] && sides[2] != sides[0]) || (sides[0] == sides[1] && sides[0] != sides[2]))
            System.out.println("TRIANGULO ISOSCELES");
    }
}
