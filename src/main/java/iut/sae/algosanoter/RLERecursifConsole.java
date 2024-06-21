package iut.sae.algosanoter;

import iut.sae.algo.AlgoException;

import java.util.Scanner;

public class RLERecursifConsole{

    public static void main(String[] args){
        try{

            long startTime = System.nanoTime();

            for(int i=0;i<10;i++)
                efficacite62.RLE("abc", 65);

            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println("Durée d'exécution en nanosecondes: " + duration);
            System.out.println("Durée d'exécution en millisecondes: " + (duration / (1000000.0*10)));
        }
        catch(AlgoException e){
            System.err.println("Erreur lors de la transformation");
        }
    }
}