package Desafios;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {

        Random random = new Random();

        Scanner leitura2 = new Scanner(System.in);

        int numInicial = leitura2.nextInt();
        int numFinal = leitura2.nextInt();
        int numeroAleatorioJogo = random.nextInt(numInicial,numFinal);


        boolean acertou = false;
        while (!acertou){
            int adivinha = leitura2.nextInt();
            if(adivinha == numeroAleatorioJogo){
                acertou=true;
            }
        }

    }
}
