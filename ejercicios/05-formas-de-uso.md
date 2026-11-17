# 05 · Formas de uso: web vs CLI

**Objetivo:** observar qué cambia cuando el agente tiene acceso a los archivos.

1. En un chat web (claude.ai, chatgpt.com, gemini.google.com, chat.deepseek.com, etc.),
   consultar:

   ```
   ¿Qué pruebas fallan en el proyecto ayed-workshop-ia?
   ```

2. En la terminal, dentro del repositorio, abrir el agente (`opencode` o `claude`) y
   repetir la consulta.
3. Repetirla sin modo interactivo, como un comando más:

   ```bash
   opencode run "¿Cuántas pruebas tiene ListaCircularTest y qué verifica cada una?"
   # o bien: claude -p "…"
   ```

**Comparación:** ¿qué herramienta pudo leer el código? ¿Cuál ejecutó `mvn test`?
¿Se solicitó permiso antes de ejecutar comandos?
