# Los N mandamientos de programación

Buenas prácticas de la cátedra para el código Java de Algoritmos y Estructuras de Datos.
El orden no indica importancia.

> "El código se escribe una vez pero se lee muchas veces."

## 1. No nombrarás funciones ni variables de forma no descriptiva

- Funciones: verbo en infinitivo + sustantivo (`mostrarMenu`, no `menu` ni `procesarMenu`).
- Las que devuelven `boolean`, como afirmación (`esMayorDeEdad`).
- Variables: por su contenido (`cantidadDeManzanas`, no `manzanas`, `cantManz` ni `cM`).
- Nada de variables numeradas (`resultado1`, `resultado2`).
- `i`, `j`, `k` solo como contador de un `for`.

## 2. No desearás el código del prójimo

El código es de autoría propia (o del grupo). Si se usa código externo, debe aclararse de dónde
salió y qué hace.

## 3. Usarás mayúsculas y snake case para nombrar constantes

Todo valor con significado de negocio es una constante: `public static final int VIDA_MAXIMA = 100;`.
No todo número suelto lo es: inicializar un contador en `0` no necesita constante.

## 4. No mezclarás idiomas en tu código

Elegido el idioma del proyecto, todo va en ese idioma: nombres, comentarios y commits.

## 5. Usarás pre y post condiciones o Javadoc

- Precondición: qué debe cumplir lo que recibe la función. No repite la firma
  ("recibe un número" no aporta). Violarla lanza una excepción.
- Postcondición: qué hace y qué devuelve. Toda función tiene una.
- Con Javadoc: `@param` por parámetro, `@return` salvo en `void`, `@throws` por excepción.

```java
/**
 * Si la opción está entre 0 y OPCIONES_VALIDAS, es válida.
 *
 * @param opcionElegida Número de la opción elegida.
 * @return true si la opción está entre 0 y OPCIONES_VALIDAS; false en otro caso.
 */
public boolean esOpcionValida(int opcionElegida);
```

## 6. Separarás los operadores de las variables

`contador < cantidad`, no `contador<cantidad`.

## 7. No harás ciclos innecesarios

El problema se analiza antes de codificarlo, y luego se revisa si los ciclos pueden simplificarse:
por ejemplo, no seguir recorriendo después de encontrar lo buscado.

## 8. No cortarás iteraciones con breaks o returns

Todo ciclo termina por su condición de corte. `for` cuando se conoce la cantidad de
iteraciones; si no, `while` con una variable booleana:

```java
boolean encontrado = false;
int indice = 0;
while (!encontrado && indice < cantidad) {
    encontrado = numeros[indice] == buscado;
    indice++;
}
```

Un `return` fuera de un ciclo, como al validar una precondición al principio, está permitido.

## 9. No implementarás funciones que hacen más de una cosa

Si la respuesta a "¿qué hace esta función?" lleva una "y", se puede modularizar más.
Con criterio: modularizar de más también es un problema.

## 10. No declararás variables dentro de ciclos for ni while

Se declaran antes del ciclo. Excepción: el contador del `for`.

## 11. Mantendrás la indentación del código

Indentación consistente; se recomienda 4 espacios por nivel.

## 12. No pondrás comentarios excesivos

No se comenta lo que el código ya dice. Si un bloque necesita explicación, primero
se intenta simplificarlo; si no es posible, se agrega un comentario corto antes del bloque.
