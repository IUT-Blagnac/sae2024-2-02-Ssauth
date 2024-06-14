package iut.sae.algo;

import java.util.Scanner;

public class RLERecursifConsole{

    public static void main(String[] args){
        String in="";
        int iterations=1;
        
        if(args.length>=2){
            in=args[0];
            iterations=Integer.valueOf(args[1]);
        }
        else{
            Scanner scanner = new Scanner(System.in);

            System.out.println("Chaine à transformer : ");
            in = scanner.next();

            System.out.println("Nombre d'itérations : ");
            iterations = scanner.nextInt();

            scanner.close();
        }

        try{
            System.out.println("Entrée : "+in);
            System.out.println("Itérations : "+iterations);

            long startTime = System.nanoTime();

            System.out.println("Sortie : "+ Algo.RLE(in, iterations));

            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println("Durée d'exécution en nanosecondes: " + duration);
            System.out.println("Durée d'exécution en millisecondes: " + (duration / 1000000.0));
        }
        catch(AlgoException e){
            System.err.println("Erreur lors de la transformation");
        }
    }
}