# 06 · Ventana de contexto

**Objetivo:** medir cuánto contexto consume una sesión y cómo cambia la respuesta según
su contenido. El consumo se consulta en el indicador de tokens del agente
(en Claude Code, `/context`).

## A. Sesión limpia vs sesión con ruido

1. En una sesión nueva, pedir:

   ```
   Revisar src/main/java/org/ayed/ejemplos/Ranking.java y listar sus problemas.
   ```

2. En otra sesión nueva, cargar primero contenido ajeno a la tarea:

   ```
   Explicar el pom.xml línea por línea y resumir cada archivo de src/test.
   ```

   Luego repetir el pedido del paso 1.

## B. Sin vs con archivo de contexto

En una sesión nueva, pedir:

```
Revisar @src/main/java/org/ayed/ejemplos/Ranking.java según @docs/buenas-practicas.md.
Una fila por problema: línea, mandamiento y sugerencia.
```

**Comparación:** ¿cuántos tokens usó cada sesión? Sin las buenas prácticas, ¿se señaló
el `break`? ¿Se sugirió `ArrayList` o streams, que la cátedra no admite?
