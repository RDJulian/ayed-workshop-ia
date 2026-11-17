# Workshop: IA aplicada a la programación

Ejercicios breves para trabajar con un agente de código sobre un proyecto Java de
Algoritmos y Estructuras de Datos. Cada ejercicio compara dos formas de resolver la
misma tarea: sin y con la herramienta del tema.

## Requisitos

- JDK 21 o superior, Maven 3.9 o superior y git, con `java`, `mvn` y `git` disponibles en
  la terminal.
- Un agente de código por terminal, con cualquier modelo. Los ejercicios indican cómo
  activar cada configuración en dos agentes:
  - **opencode** (<https://opencode.ai>): libre y gratuito; admite cualquier proveedor,
    modelos gratuitos y modelos locales (Ollama).
  - **Claude Code** (<https://code.claude.com>): requiere un plan pago de Claude.

  Codex, Cursor, Copilot y otros agentes ofrecen los mismos conceptos con otros nombres
  de archivo.

## Inicio

```bash
git clone https://github.com/RDJulian/ayed-workshop-ia.git
cd ayed-workshop-ia
mvn -q test      # las pruebas de ListaCircular fallan: es el punto de partida
opencode         # o bien: claude
```

## Contenido

| Ruta | Descripción |
|---|---|
| `src/main/java/org/ayed/tda/lista/ListaCircular.java` | TDA a implementar (firmas y Javadoc) |
| `src/main/java/org/ayed/ejemplos/Ranking.java` | Código a revisar |
| `docs/buenas-practicas.md` | Los N mandamientos de la cátedra |
| `ejercicios/` | Un ejercicio por tema |

## Ejercicios

| # | Tema | Ejercicio |
|---|---|---|
| 05 | Formas de uso | [web vs CLI](ejercicios/05-formas-de-uso.md) |
| 06 | Ventana de contexto | [sesión limpia vs con ruido](ejercicios/06-contexto.md) |
| 07 | Prompting | [prompt deficiente vs adecuado](ejercicios/07-prompting.md) |
| 08 | AGENTS.md | [sin vs con reglas](ejercicios/08-reglas/README.md) |
| 09 | Permisos | [bloqueo de `rm` y `.env`](ejercicios/09-permisos/README.md) |
| 10 | Hooks | [compilación antes de cada commit](ejercicios/10-hooks/README.md) |
| 11 | Skills | [estado del TP y revisión de estilo](ejercicios/11-skills/README.md) |
| 12 | MCP | [documentación con Context7](ejercicios/12-mcp/README.md) |
| 13 | Conectores | [Google Drive](ejercicios/13-conectores.md) |
| 14 | Plugins | [paquetes de extensiones](ejercicios/14-plugins.md) |

## Reinicio

```bash
git restore src/                                                    # descarta el código generado
rm -rf .claude AGENTS.md CLAUDE.md .mcp.json opencode.json .env     # desactiva la configuración
git config --unset core.hooksPath                                   # desactiva el hook de git
```

La configuración que activan los ejercicios figura en `.gitignore`, de modo que no se
sube por error.
