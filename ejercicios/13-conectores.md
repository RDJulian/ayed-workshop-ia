# 13 · Conectores

**Objetivo:** permitir que el asistente lea documentos en la nube, por ejemplo en
Google Drive.

Un conector es un servidor MCP preconfigurado que se habilita desde la aplicación, con la
cuenta del usuario.

1. Subir `docs/buenas-practicas.md` a Google Drive.
2. En claude.ai: **Configuración → Conectores → Google Drive → Conectar**, y autorizar
   el acceso. ChatGPT y Gemini ofrecen opciones equivalentes.
3. En un chat nuevo, pedir:

   ```
   Buscar en Drive el archivo buenas-practicas y armar una lista de control de 5 puntos
   para revisar el código antes de una entrega.
   ```

4. En Claude Code, con la misma cuenta, el conector aparece también en `/mcp`.

**Para analizar:** el conector da al modelo acceso a los archivos de la cuenta. ¿Qué no
convendría conectar?
