# 10 · Hooks

**Objetivo:** ejecutar una acción automáticamente ante un evento, sin depender de que el
modelo la recuerde.

## A. Hook de git (cualquier agente)

Se ejecuta antes de cada commit y lo rechaza si el proyecto no compila. Es independiente
del agente: aplica igual a opencode, a Claude Code o a un commit manual.

1. Activarlo: `git config core.hooksPath ejercicios/10-hooks/git`
2. Romper la compilación: `echo "x" >> src/main/java/org/ayed/ejemplos/Ranking.java`
3. Pedir al agente: `Hacer commit de los cambios.`
4. Observar la salida: el commit se rechaza y el agente recibe el error de compilación.
   ¿Lo corrige y vuelve a intentarlo?

Para desactivarlo: `git config --unset core.hooksPath`.

## B. Hook del agente (Claude Code)

Los agentes también exponen eventos propios: antes o después de usar una herramienta,
al finalizar una respuesta, etc. Este hook se ejecuta después de cada edición y, si el
proyecto no compila, devuelve el error al agente en el momento (`exit 2`).

```bash
mkdir -p .claude && cp ejercicios/10-hooks/claude-settings.json .claude/settings.json
```

Pedir `En Ranking.java, renombrar el atributo p a puntajes.` y observar los avisos del
hook entre una edición y otra. En opencode, el equivalente se implementa como plugin.

**Para analizar:** ¿qué diferencia hay entre pedir "compilar antes del commit" en el
prompt y usar este hook?
