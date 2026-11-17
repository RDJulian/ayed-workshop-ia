# AGENTS.md

TDAs de Algoritmos y Estructuras de Datos en Java 21, con Maven.

## Comandos

- Compilar: `mvn -q compile`
- Probar un TDA: `mvn -q test -Dtest=ListaCircularTest`

## Reglas

- Sin estructuras de `java.util`: los TDA se implementan con arreglos o nodos.
- Las firmas y el Javadoc existentes son la especificación: no se modifican.
- No se modifican archivos de `src/test/`.
- Todo en español: nombres, comentarios y mensajes.
- Cada método nuevo lleva Javadoc con `@param`, `@return` y `@throws`.
- Seguir `docs/buenas-practicas.md`.
- Finalizar ejecutando las pruebas del TDA modificado e informar el resultado.
