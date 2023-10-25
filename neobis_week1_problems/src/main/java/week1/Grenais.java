package week1;

import java.io.IOException;
import java.util.Scanner;

public class Grenais {
    public static void main(String[] args) throws IOException {

        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner scan = new Scanner(System.in);
        int inter;
        int gremio;
        int winInter = 0;
        int winGremio = 0;
        int empates = 0;
        int response = 1;
        int grenais = 0;
        while(response != 2){
            grenais++;
            inter = scan.nextInt();
            gremio = scan.nextInt();
            System.out.println("Novo grenal (1-sim 2-nao)");
            if(inter > gremio) winInter++;
            else if(inter < gremio) winGremio++;
            else empates++;
            response = scan.nextInt();
        }
        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + winInter);
        System.out.println("Gremio:" + winGremio);
        System.out.println("Empates:" + empates);
        if(winInter > winGremio) System.out.println("Inter venceu mais");
        if(winInter < winGremio) System.out.println("Gremio venceu mais");

    }
}
