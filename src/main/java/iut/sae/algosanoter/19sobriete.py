##################################################
#               Sobriete / Python                #
##################################################

def encodage_rle(texte):

    resultat = ""

    compteur = 0

    precedent = None

    for caractere in texte:

        if caractere != precedent:

            if precedent is not None:

                resultat += str(compteur) + precedent

            compteur = 1

            precedent = caractere

        else:

            compteur += 1

            if compteur > 9:

                resultat += "9" + precedent

                compteur -= 9

    if precedent is not None:
        
        resultat += str(compteur) + precedent
    
    return resultat

##################################################
#               Sobriete / Python                #
##################################################


import unittest

# Inserer les méthodes et remplace "XXX" par le nom de la class et 

class TestJUnit(unittest.TestCase):
    def test_RLE(self):
        self.assertEqual(encodage_rle(""), "")  # Test avec une chaîne vide
        self.assertEqual(encodage_rle("A"), "1A")  # Test avec une seule lettre
        self.assertEqual(encodage_rle("AAA"), "3A")  # Test avec une répétition simple
        self.assertEqual(encodage_rle("AAAAAAAAAA"), "9A1A")  # Test avec une répétition de plus de 9 caractères
        self.assertEqual(encodage_rle("AAABBB"), "3A3B")  # Test avec des caractères différents
        self.assertEqual(encodage_rle("AAABBBCCCCCCCCC"), "3A3B9C")  # Test avec une combinaison de cas

 

if __name__ == '__main__':
    unittest.main()