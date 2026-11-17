# 11 · Skills

**Objetivo:** empaquetar un procedimiento como una "función" que el agente ejecuta de la
misma manera cada vez.

Una skill es una carpeta con un archivo `SKILL.md`: un encabezado (`name`, `description`)
y los pasos. El agente solo lee la descripción hasta que la necesita, por lo que casi no
ocupa contexto. Es un formato abierto: la carpeta `.claude/skills/` la leen tanto Claude
Code como opencode.

1. Instalar las dos skills y abrir una sesión nueva:

   ```bash
   mkdir -p .claude/skills
   cp -r ejercicios/11-skills/estado-tp ejercicios/11-skills/revisar-estilo .claude/skills/
   ```

2. Invocarlas por nombre (Claude Code: `/estado-tp`; opencode: `@estado-tp`):

   ```
   @estado-tp
   @revisar-estilo src/main/java/org/ayed/ejemplos/Ranking.java
   ```

3. Invocarlas sin nombrarlas: `¿Cuál es el estado del TP?`. El agente elige la skill
   según su descripción.

**Para analizar:** ¿qué procedimiento repetido convendría escribir como skill?
