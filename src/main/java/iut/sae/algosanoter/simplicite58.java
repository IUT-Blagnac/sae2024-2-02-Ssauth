package iut.sae.algosanoter;
import iut.sae.algo.AlgoException;

public class simplicite58 {

    public static String RLE(String in) {
        String code= "";
        int longueur = in.length();

        for(int i = 0; i < longueur; i++) {
            int cpt = 1;
            while (i + 1 < longueur && in.charAt(i) == in.charAt(i + 1) && cpt < 9) {
                cpt++;
                i++;
            }
            code += String.valueOf(cpt) + in.charAt(i);
        }
        return code;
    }

    public static String RLE(String in, int iteration) throws AlgoException {
        String code = in;
        for(int i = 0; i < iteration; i++) {
            code = RLE(code);
        }
        return code;
    }

    public static String unRLE(String in) throws AlgoException {
        int longueur = in.length();
        String code = "";
        for (int i = 0; i + 1 < longueur; i += 2) {
            int nombre = Integer.parseInt(String.valueOf(in.charAt(i)));
            String caractere = String.valueOf(in.charAt(i + 1));
            for (int j = 0; j < nombre; j++) {
                code += caractere;
            }
        }
        return code;
    }

    public static String unRLE(String in, int iteration) throws AlgoException {
        String unRle = in;
        for(int i = 0; i < iteration; i++) {
            unRle = unRLE(unRle);
        }
        return unRle;
    }
}
