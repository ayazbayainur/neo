package week1;

import java.io.IOException;
import java.util.*;

public class PopulationIncrease {
    public static void main(String[] args) throws IOException {

        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Map<Integer, List<Object>> cases = new TreeMap<>();
        ArrayList<Object> testcase;
        for(int i = 0; i < n; i++){
            testcase = new ArrayList<Object>();
            Object a = scan.nextInt();
            Object b = scan.nextInt();
            Object grA = scan.nextDouble();
            Object grB = scan.nextDouble();
            testcase.add(a);
            testcase.add(b);
            testcase.add(grA);
            testcase.add(grB);
            cases.put(i, testcase);
        }
        int year = 0;
        for(int i = 0; i < n; i++){
            int a = (int) cases.get(i).get(0);
            int b =(int) cases.get(i).get(1);
            year = 0;
            while(a <= b){
                a += a * (double) cases.get(i).get(2) / 100;
                b += b * (double) cases.get(i).get(3) / 100;
                year++;
                if(year > 100) break;
            }
            if(year > 100) System.out.println("Mais de 1 seculo.");
            else System.out.println(year + " anos.");
        }

    }
}
