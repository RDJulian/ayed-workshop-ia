# 08 · Archivos de reglas: AGENTS.md

**Objetivo:** que las reglas del proyecto lleguen al agente sin repetirlas en cada prompt.

1. Sin reglas, repetir el prompt deficiente del ejercicio 07 (`Implementar la lista
   circular`) y guardar el diff. Volver al inicio con `git restore src/`.
2. Activar las reglas:

   ```bash
   cp ejercicios/08-reglas/AGENTS.md .
   echo "@AGENTS.md" > CLAUDE.md   # solo para Claude Code
   ```

   `AGENTS.md` es un estándar que leen opencode, Codex, Cursor, Copilot y otros agentes.
   Claude Code lee `CLAUDE.md`, que en este caso solo importa al anterior.
3. En una sesión nueva, repetir el mismo prompt.

**Comparación:** con el mismo prompt deficiente, ¿se respetan ahora las reglas? ¿Qué
partes del prompt adecuado del ejercicio 07 quedan cubiertas por el archivo?

Para desactivar: `rm AGENTS.md CLAUDE.md`.
