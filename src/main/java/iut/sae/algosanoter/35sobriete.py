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

# Exemple d'utilisation
if __name__ == "__main__":
    test_string = "WWWWWWWWWBWWWWWWWWBBBWWWBWWWWWWW"
    compressed = sobriete(test_string)
    print(compressed)  # devrait imprimer "9W1B8W3B3W1B7W"
