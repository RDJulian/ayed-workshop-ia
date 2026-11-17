# 14 · Plugins

**Objetivo:** instalar en un solo paso skills, comandos, hooks y servidores MCP.

Un plugin reúne en un paquete lo visto en los ejercicios 10 a 12. En Claude Code tiene
esta estructura y se publica en un *marketplace* (un repositorio):

```
mi-plugin/
├── .claude-plugin/plugin.json
├── skills/          # como en el ejercicio 11
├── hooks/hooks.json # como en el ejercicio 10
└── .mcp.json        # como en el ejercicio 12
```

1. Recorrer el marketplace oficial: <https://github.com/anthropics/claude-plugins-official>.
   Por ejemplo, `plugins/commit-commands` (comandos) y `external_plugins/context7` (el MCP
   del ejercicio 12, empaquetado).
2. Instalar uno:
   - Claude Code: `/plugin`, buscar `commit-commands`, instalarlo y probar `/commit`.
   - opencode: `opencode plugin list` y `opencode plugin add <paquete>`
     (catálogo en <https://opencode.ai/docs/plugins/>).

**Para analizar:** ¿qué partes de este workshop convendría empaquetar para compartir con
el grupo?
