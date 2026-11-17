# 07 · Prompting

**Objetivo:** implementar el mismo TDA con un prompt deficiente y con uno adecuado.

## Prompt deficiente

```
Implementar la lista circular
```

Guardar el resultado (`git diff > deficiente.diff`) y volver al punto de partida con
`git restore src/`.

## Prompt adecuado

```
Implementar ListaCircular en src/main/java/org/ayed/tda/lista/ListaCircular.java.

Contexto: es un TDA de Algoritmos y Estructuras de Datos. Las firmas y el Javadoc
existentes son la especificación y no deben modificarse.

Requisitos:
- Lista simplemente enlazada y circular: el último nodo apunta al primero.
- Agregar al final en O(1), como indica el Javadoc.
- Sin estructuras de java.util.
- Errores mediante ExcepcionLista, según el Javadoc.
- Respetar docs/buenas-practicas.md.
- No modificar src/test/.

Al finalizar, ejecutar mvn -q test -Dtest=ListaCircularTest e informar el resultado.
```

**Comparación:** ¿se usó `java.util`? ¿Se respetaron las firmas? ¿Se modificaron las
pruebas? ¿Se ejecutaron las pruebas antes de dar la tarea por terminada?
