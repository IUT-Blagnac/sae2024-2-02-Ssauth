package iut.sae.algo;


public class Algo{
    public static String RLE(String in){
        if(in.length()<1)
            return in;

        int compteur=0;
        char last=in.charAt(0);
        String resultat="";
        for(int i=0;i<in.length();i++){
            if(in.charAt(i)==last){
                compteur++;
                if(compteur==9){
                    resultat+=compteur+""+in.charAt(i);
                    compteur=1;
                }
            }else {
                resultat+=compteur+""+last;
                compteur=1;
                last=in.charAt(i);
            }
        }

        return resultat+""+compteur+""+last;
    }

    public static String RLE(String in, int iteration) throws AlgoException{
        int it=0;
        String resultat=in;
        while(it<iteration){
            resultat=RLE(resultat);
            it++;
        }
        return resultat;
    }

    public static String unRLE(String in) throws AlgoException{
        String decode="";
        for(int i=0;i<in.length()-1;i+=2){
            for(int j=0;j<Integer.parseInt(String.valueOf(in.charAt(i)));j++)
                decode+=in.charAt(i+1);
        }
        return decode;
    }

    public static String unRLE(String in, int iteration) throws AlgoException{
        String decode=in;
        for(int i=0;i<iteration;i++){
            decode=unRLE(decode);
        }
        return decode;

    }
}

