def sobriete(text: str) -> str:
    if not text:
        return ""
    
    result = []
    count = 1
    prev_char = text[0]
    
    for char in text[1:]:
        if char == prev_char:
            count += 1
        else:
            result.append(f"{count}{prev_char}")
            prev_char = char
            count = 1
    
    result.append(f"{count}{prev_char}")
    
    return ''.join(result)


import unittest

# Inserer les méthodes et remplace "XXX" par le nom de la class et 

class TestJUnit(unittest.TestCase):
    def test_RLE(self):
        self.assertEqual(sobriete(""), "")  # Test avec une chaîne vide
        self.assertEqual(sobriete("A"), "1A")  # Test avec une seule lettre
        self.assertEqual(sobriete("AAA"), "3A")  # Test avec une répétition simple
        self.assertEqual(sobriete("AAAAAAAAAA"), "9A1A")  # Test avec une répétition de plus de 9 caractères
        self.assertEqual(sobriete("AAABBB"), "3A3B")  # Test avec des caractères différents
        self.assertEqual(sobriete("AAABBBCCCCCCCCC"), "3A3B9C")  # Test avec une combinaison de cas

if __name__ == '__main__':
    unittest.main()