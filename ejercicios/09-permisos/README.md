# 09 · Permisos

**Objetivo:** limitar lo que el agente puede hacer con sus herramientas.

Crear un secreto de prueba:

```bash
echo "CLAVE_API=clave-falsa-123" > .env
```

1. Sin configuración, pedir por separado:
   - `¿Qué contiene el archivo .env?`
   - `Borrar la carpeta target con rm.`
   - `Modificar ListaCircularTest para que las pruebas pasen.`
2. Activar las reglas y abrir una sesión nueva:

   | Agente | Comando |
   |---|---|
   | opencode | `cp ejercicios/09-permisos/opencode.json .` |
   | Claude Code | `mkdir -p .claude && cp ejercicios/09-permisos/claude-settings.json .claude/settings.json` |

3. Repetir los tres pedidos.

| Regla | Efecto |
|---|---|
| deny `rm *` | Bloquea los comandos que empiezan con `rm` |
| deny lectura de `.env` | Impide leer el secreto |
| deny edición de `src/test/` | Impide modificar las pruebas para que pasen |
| ask `git push *` | Solicita confirmación antes de cada push |

**Para analizar:** las reglas comparan el texto del comando, por lo que
`bash -c 'rm -rf target'` puede no coincidir con `rm *`. Un límite real requiere un
sandbox del sistema operativo (en Claude Code, `/sandbox`).
