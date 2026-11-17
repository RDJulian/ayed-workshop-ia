---
name: estado-tp
description: Muestra una tabla con el estado de cada clase según sus pruebas. Usar cuando se consulte el estado del TP, lo que falta o qué pruebas fallan.
---

1. Ejecutar `mvn -q test`. Que fallen pruebas es esperable: no corregirlas.
2. Leer los archivos `target/surefire-reports/*.txt`. Cada uno contiene una línea
   `Tests run: N, Failures: F, Errors: E, Skipped: S, ... - in <clase>`.
3. Mostrar una tabla, con las clases que tienen fallas primero:

   | Clase | Pruebas | Aprobadas | Estado |
   |---|---|---|---|

   Aprobadas = N − F − E − S. Estado: ✅ si aprueban todas, ❌ si no.
4. Debajo, para cada clase con fallas, el nombre de la primera prueba que falla.

No modificar ningún archivo.
