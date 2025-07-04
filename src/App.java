import java.text.Normalizer;
import java.util.*;

public class App {
    public static void main(String[] args) {
        String frase = """
            La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades, la IA está presente en casi todos los aspectos de nuestra vida diaria. Sin embargo, este avance también plantea desafíos éticos, sociales y económicos que deben ser cuidadosamente analizados. ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía?
            Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, la educación y el medio ambiente. Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana, personalizar la enseñanza o monitorear los ecosistemas en tiempo real. No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente.
            En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en la innovación, sino también en el impacto que genera en la humanidad y en el planeta. El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas.""";

        String texto1 = "¡Hola! La programación en Java es muy divertida, sobre todo cuando se entienden los conceptos.";
        String texto2 = "Java es divertido. Aprender programación puede ser un reto, pero también muy gratificante.";

        System.out.println("Palabras únicas en la frase (DEBE SER 126): " + countPalabrasUnicas(frase));

        Set<String> palabrasTexto1 = limpiarTexto(texto1);
        Set<String> palabrasTexto2 = limpiarTexto(texto2);

        System.out.println("Palabras únicas en Texto 1: " + palabrasTexto1.size());
        System.out.println("Palabras únicas en Texto 2: " + palabrasTexto2.size());

        // Palabras comunes
        Set<String> comunes = new HashSet<>(palabrasTexto1);
        comunes.retainAll(palabrasTexto2);
        System.out.println("Palabras comunes (DEBE SER 4): " + comunes.size() + " -> " + comunes);

        // Coincidencia léxica
        double coincidenciaLexica = 100.0 * comunes.size() / palabrasTexto1.size();
        System.out.printf("Coincidencia léxica (DEBE SER 16.67%%): %.2f%%\n", coincidenciaLexica);

        // Solo en texto 1
        Set<String> soloTexto1 = new HashSet<>(palabrasTexto1);
        soloTexto1.removeAll(palabrasTexto2);
        System.out.println("Solo en texto 1 (≈7): " + soloTexto1.size() + " -> " + soloTexto1);

        // Solo en texto 2
        Set<String> soloTexto2 = new HashSet<>(palabrasTexto2);
        soloTexto2.removeAll(palabrasTexto1);
        System.out.println("Solo en texto 2 (≈11): " + soloTexto2.size() + " -> " + soloTexto2);
    }

    // Método para contar palabras únicas en un texto
    public static int countPalabrasUnicas(String texto) {
        return limpiarTexto(texto).size();
    }

    // Método para limpiar y normalizar palabras
    public static Set<String> limpiarTexto(String texto) {
        Set<String> palabras = new HashSet<>();
        if (texto == null || texto.isEmpty()) return palabras;

        String[] tokens = texto.split("\\s+");

        for (String palabra : tokens) {
            palabra = Normalizer.normalize(palabra, Normalizer.Form.NFD);
            palabra = palabra.replaceAll("\\p{M}", ""); // quitar tildes
            palabra = palabra.toLowerCase().replaceAll("[^\\p{L}\\p{N}]", ""); // quitar puntuación

            if (!palabra.isEmpty()) {
                palabras.add(palabra);
            }
        }

        return palabras;
    }
}
