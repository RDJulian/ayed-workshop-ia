# 12 · MCP

**Objetivo:** agregar una herramienta al agente mediante un servidor MCP.

MCP separa dos roles: el **cliente** (el agente) descubre qué herramientas ofrece un
**servidor** y las invoca. En este ejercicio el servidor es Context7, que devuelve
documentación actualizada de bibliotecas. Es gratuito y no requiere clave.

1. Activarlo y abrir una sesión nueva:

   | Agente | Comando | Servidores activos |
   |---|---|---|
   | opencode | `cp ejercicios/12-mcp/opencode.json .` | `opencode mcp list` |
   | Claude Code | `cp ejercicios/12-mcp/mcp.json .mcp.json` | `/mcp` |

2. Pedir:

   ```
   Usar context7 para buscar en la documentación de JUnit 5 cómo escribir una prueba
   parametrizada con @CsvSource. Mostrar un ejemplo para ListaCircular, sin editar archivos.
   ```

**Comparación:** repetir la consulta sin el servidor. ¿Cambia la respuesta? ¿De dónde
proviene la información en cada caso?
