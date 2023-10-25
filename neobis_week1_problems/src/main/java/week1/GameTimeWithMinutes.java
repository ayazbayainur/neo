package week1;

import java.io.IOException;
import java.util.Scanner;

public class GameTimeWithMinutes {
    public static void main(String[] args) throws IOException {

        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner scan = new Scanner(System.in);
        int initialHour = scan.nextInt();
        int initialMinute = scan.nextInt();
        int finalHour = scan.nextInt();
        int finalMinute = scan.nextInt();
        int durationHour = 0;
        int durationMinute;

        if(initialHour > finalHour){
            durationHour = 24 - initialHour + finalHour;

        } else if(initialHour < finalHour){
            durationHour = finalHour - initialHour;
        }
        else if(initialHour == finalHour && initialMinute >= finalMinute) durationHour = 24;
        else if(initialHour == finalHour && initialMinute != finalMinute) durationHour = 0;
        if(initialMinute <= finalMinute){
            durationMinute = finalMinute - initialMinute;
        } else {
            durationHour -= 1;
            durationMinute = finalMinute + 60 - initialMinute;
        }
        System.out.println("O JOGO DUROU " + durationHour + " HORA(S) E " + durationMinute + " MINUTO(S)");
    }
}
