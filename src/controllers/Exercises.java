package controllers;
import java.text.Normalizer;
import java.util.*;

public class Exercises {
    
    public boolean isIsogram (String palabra){
        if (palabra == null || palabra.isEmpty()) {
            return true; // Consideramos que una cadena vacía es un isograma
        }

        boolean[] letras = new boolean[26]; // Asumiendo solo letras minúsculas a-z
        for (char c : palabra.toLowerCase().toCharArray()) {
            if (c < 'a' || c > 'z') {
                continue; // Ignorar caracteres no alfabéticos
            }
            int index = c - 'a';
            if (letras[index]) {
                return false; // Si ya hemos visto esta letra, no es un isograma
            }
            letras[index] = true; // Marcar la letra como vista
        }
        return true; // Si no se repite ninguna letra, es un isograma
    }

    public int countWordsUnique(String frase){
    return countWordsUnique(frase, false);
}

public static int countWordsUniqueMostrar(String frase) {
    return countWordsUnique(frase, true);
}

private static int countWordsUnique(String frase, boolean mostrar) {
    if (frase == null || frase.isEmpty()) {
        return 0;
    }

    Set<String> palabrasUnicas = new HashSet<>();
    String[] palabras = frase.split("\\s+");

    for (String palabra : palabras) {
        // Normaliza, elimina tildes y caracteres especiales
        palabra = Normalizer.normalize(palabra, Normalizer.Form.NFD);
        palabra = palabra.replaceAll("\\p{M}", ""); // elimina tildes
        palabra = palabra.toLowerCase().replaceAll("[^\\p{L}\\p{N}]", ""); // solo letras/números

        if (!palabra.isEmpty()) {
            palabrasUnicas.add(palabra);
        }
    }

    if (mostrar) {
        palabrasUnicas.stream().sorted().forEach(System.out::println);
    }

    return palabrasUnicas.size();
}


}
