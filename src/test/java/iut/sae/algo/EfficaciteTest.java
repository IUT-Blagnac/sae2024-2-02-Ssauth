package iut.sae.algo;

import iut.sae.algosanoter.sobriete66;
import iut.sae.algosanoter.sobriete66;
import iut.sae.algosanoter.sobriete66;
import iut.sae.algosanoter.sobriete66;
import iut.sae.algosanoter.sobriete66;
import iut.sae.algosanoter.sobriete66;
import iut.sae.algosanoter.sobriete66;
import iut.sae.algosanoter.sobriete66;
import iut.sae.algosanoter.sobriete66;
import org.junit.Test;
import junit.framework.TestCase;


public class EfficaciteTest extends TestCase{

/*
 * RLE("")=""
 * RLE("abc")="1a1b1c"
 * RLE("abbccc")="1a2b3c"
 * RLE("aaabaa")="3a1b2a"
 * RLE("aAa")="1a1A1a"
 */
   @Test
   public void testRLE(){

      long startTime = System.nanoTime();
      for(int i=0;i<10000;i++){

         assertEquals("", sobriete66.RLE("") );

         assertEquals("1a1b1c", sobriete66.RLE("abc"));
         assertEquals("1a2b3c", sobriete66.RLE("abbccc"));
         assertEquals("3a1b2a", sobriete66.RLE("aaabaa"));
         assertEquals("1a1A1a", sobriete66.RLE("aAa"));
      }

      long endTime = System.nanoTime();
      long duration = endTime - startTime;

      System.out.println("Durée d'exécution en nanosecondes: " + duration);
      System.out.println("Durée d'exécution en millisecondes: " + (duration / 1_000_000.0));




   }


   /*
   * RLE(str, 1)=RLE(str)
   * RLE(str, 3)=RLE(RLE(RLE(str)))
   */
   @Test
   public void testRLERecursif(){
      try{
         assertEquals("", sobriete66.RLE("", 1));
         assertEquals("", sobriete66.RLE("", 3));
         
         assertEquals("1a1b1c", sobriete66.RLE("abc", 1));
         assertEquals("1a2b3c", sobriete66.RLE("abbccc", 1));
         assertEquals("3a1b2a", sobriete66.RLE("aaabaa", 1));
         assertEquals("1a1A1a", sobriete66.RLE("aAa", 1));

         assertEquals("111a111b111c", (sobriete66.RLE("abc", 2)));
         assertEquals("311a311b311c", (sobriete66.RLE("abc", 3)));



      }
      catch(Exception e){
         fail("Exception inatendue");
      }
   }

   /*
  * unRLE(RLE(str))=str
  *
  * unRLE("")=""
  * unRLE("1a1b1c")="abc"
  * unRLE("1a2b3c")="abbccc"
  * unRLE("3a1b2a")="aaabaa"
  * unRLE("1a1A1a")="aAa"
  */

   @Test
   public void testUnRLE(){
      try{
         assertEquals("", sobriete66.unRLE(""));
         assertEquals("abc", sobriete66.unRLE("1a1b1c"));
         assertEquals("abbccc", sobriete66.unRLE("1a2b3c"));
         assertEquals("aaabaa", sobriete66.unRLE("3a1b2a"));
         assertEquals("aAa", sobriete66.unRLE("1a1A1a"));
      }
      catch(Exception e){
         fail(e.getMessage());
      }
   }

   @Test
   public void testUnRLERecursif(){
      try{
         assertEquals("", sobriete66.unRLE("", 1));
         assertEquals("", sobriete66.unRLE("", 3));
         
         assertEquals("abc", sobriete66.unRLE("1a1b1c", 1));
         assertEquals("abbccc", sobriete66.unRLE("1a2b3c", 1));
         assertEquals("aaabaa", sobriete66.unRLE("3a1b2a", 1));
         assertEquals("aAa", sobriete66.unRLE("1a1A1a", 1));

         assertEquals("abc", (sobriete66.unRLE("111a111b111c", 2)));
         assertEquals("abc", (sobriete66.unRLE("311a311b311c", 3)));
      }
      catch(Exception e){
         fail("Exception inatendue");
      }
   }

}