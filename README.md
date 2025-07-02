Práctica de Conjuntos en Java (HashSet, LinkedHashSet, TreeSet)
📌 Información general
Título: Práctica de Conjuntos en Java
Asignatura: Estructura de Datos
Carrera: Computación
Estudiante: Dave Fernando Sigüenza Vallejo - Grupo 2
Fecha: 02/07/2025
Profesor: Ing. Pablo Torres

🛠️ Descripción
Este proyecto implementa y compara diferentes tipos de colecciones Set en Java:

HashSet

LinkedHashSet

TreeSet

TreeSet con Comparator personalizado (orden por longitud)

TreeSet con Comparator inverso (orden descendente por longitud)

Cada estructura se analiza en cuanto a:

Inserción de elementos duplicados.

Conservación del orden de inserción.

Ordenamiento natural o personalizado.

Objetivo:
Comprender el funcionamiento interno de las distintas implementaciones de la interfaz Set, cómo manejan el orden de los elementos y cómo se pueden personalizar los criterios de ordenamiento mediante comparadores.

🚀 Ejecución

Para compilar y ejecutar el proyecto desde consola:

bash
Copiar
Editar
javac -d . App.java controllers/Sets.java
java App
También puede ejecutarse directamente desde un IDE como Eclipse o IntelliJ IDEA.

🧑‍💻 Ejemplo de Salida (Simulada)

mathematica
Copiar
Editar
HashSet:
	Celular
	Pera
	Laptop
	Manzana

Linked Hash Set:
	Laptop
	Manzana
	Pera
	Celular

Tree Set:
	Celular
	Laptop
	Manzana
	Pera

Tree Set con Comparador:
	Pera
	Laptop
	Manzana
	Celular

Tree Set con Comparador Inverso:
	Celular
	Manzana
	Laptop
	Pera
📎 Notas adicionales

HashSet no garantiza orden, y no admite duplicados.

LinkedHashSet mantiene el orden de inserción.

TreeSet ordena automáticamente los elementos de forma ascendente.

Al usar Comparator, se puede definir un criterio de orden personalizado, por ejemplo: longitud de palabras.

En todos los casos, los duplicados son ignorados automáticamente por las estructuras Set.

![image](https://github.com/user-attachments/assets/70caacbd-ca8d-42b3-b7da-5c4cb4b52eba)
