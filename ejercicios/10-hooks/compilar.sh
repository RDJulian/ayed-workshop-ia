#!/bin/sh
# Recibe por stdin el JSON de la edición. Si tocó un .java y el proyecto no compila,
# sale con 2: el agente recibe el error de compilación y lo tiene que corregir.
case "$(cat)" in
  *'.java"'*) ;;
  *) exit 0 ;;
esac

cd "$CLAUDE_PROJECT_DIR" || exit 0
if ! salida=$(mvn -q compile 2>&1); then
  echo "$salida" >&2
  exit 2
fi
