/*
 * Minimal, stabile Konfiguration für docToolchain 3.x
 * Baut genau EINE Datei: docs/arc42/arc42.adoc -> build/html/index.html
 */

inputPath  = 'docs/arc42'
outputPath = 'build'

// Asciidoctor-Optionen (leer lassen ist okay)
asciidoc = [
    attributes : [:],
    // WICHTIG: Pfade RELATIV zu inputPath. Kein File()-Wrapper, keine GPath-Syntax.
    inputFiles: ['arc42.adoc']
]

// (optional) weitere Tasks später: tasks = ['generateHTML']