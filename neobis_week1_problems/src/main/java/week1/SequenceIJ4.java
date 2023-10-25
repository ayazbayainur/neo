package week1;

import java.io.IOException;

public class SequenceIJ4 {
    public static void main(String[] args) throws IOException {

        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        float i = 0;
        float j = 1;
        System.out.println("I=" + 0 + " J=" + 1);
        System.out.println("I=" + 0 + " J=" + (1 + 1));
        System.out.println("I=" + 0 + " J=" + (1 + 2));
        boolean isInteger = false;

        while (i < 2){
            i += 0.2;
            isInteger = false;
            if( (int)(i * 10) - (int) (i) * 10== 0){
                isInteger = true;
            }

            System.out.print("I=");
            if(isInteger){
                double ihelper = i;
                System.out.print((int) ihelper);
            }
            else System.out.printf("%.1f", i);
            System.out.print(" J=");
            if(!isInteger) System.out.printf("%.1f%n", (j + i));
            else System.out.println((int) (i + j));

            System.out.print("I=");
            if(isInteger){
                double ihelper = i;
                System.out.print((int) ihelper);
            }
            else System.out.printf("%.1f", i);
            System.out.print(" J=");
            if(!isInteger) System.out.printf("%.1f%n", (j + i + 1));
            else System.out.println((int) (i + j + 1));

            System.out.print("I=");
            if(!isInteger) System.out.printf("%.1f", i);
            else{
                double ihelper = i;
                System.out.print((int) ihelper);
            }
            System.out.print(" J=");
            if(!isInteger) System.out.printf("%.1f%n", (j + i + 2));
            else System.out.println((int) (j + i + 2));


        }
    }
}
