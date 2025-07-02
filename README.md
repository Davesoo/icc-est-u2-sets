# Práctica de Conjuntos en Java (HashSet, LinkedHashSet, TreeSet)

📌 **Información general**  
**Título:** Práctica de Conjuntos en Java  
**Asignatura:** Estructura de Datos  
**Carrera:** Computación  
**Estudiante:** Dave Fernando Sigüenza Vallejo - Grupo 2  
**Fecha:** 02/07/2025  
**Profesor:** Ing. Pablo Torres

---

## 🛠️ Descripción

Este proyecto implementa y compara diferentes tipos de colecciones `Set` en Java:

- `HashSet`
- `LinkedHashSet`
- `TreeSet`
- `TreeSet` con `Comparator` personalizado (orden por longitud)
- `TreeSet` con `Comparator` inverso (orden descendente por longitud)

### Objetivo

Comprender el funcionamiento interno de las distintas implementaciones de la interfaz `Set`, cómo manejan el orden de los elementos y cómo se pueden personalizar los criterios de ordenamiento mediante comparadores.

---

## 🚀 Ejecución

Para compilar y ejecutar el proyecto desde consola:

```bash
javac -d . App.java controllers/Sets.java
java App


![image](https://github.com/user-attachments/assets/70caacbd-ca8d-42b3-b7da-5c4cb4b52eba)

Agenda ordenada por Apellido - Nombre:
        Pedro Gonzales - 222222222
        Pablo Lopez - 222222222
        Pedro Lopez - 222222222
        Ana Perez - 987654321
        Luis Perez - 111111111

Agenda ordenada por Apellido - Nombre - Telefono:
        Pedro Gonzales - 222222222
        Pedro Lopez - 123456789
        Pedro Lopez - 222222222
        Pablo Lopez - 222222222
        Luis Perez - 111111111
        Ana Perez - 987654321

Agenda ordenada por HASHCODE:
        Pedro Gonzales - 222222222
        Ana Perez - 987654321
        Luis Perez - 111111111
        Pablo Lopez - 222222222
        Pedro Lopez - 222222222
