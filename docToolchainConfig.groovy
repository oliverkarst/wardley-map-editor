/*
 * Minimal, stabile Konfiguration für docToolchain 3.x
 * Baut genau EINE Datei: docs/arc42/arc42.adoc -> build/html/index.html
 */

inputPath  = 'docs'
outputPath = 'build'

// Asciidoctor-Optionen
asciidoc = [
    attributes : [
        'source-highlighter': 'coderay',
        'toc': 'left',
        'toclevels': '3'
    ],
    inputFiles: ['arc42/arc42.adoc']
]

// Tasks für die HTML-Generierung
tasks = ['generateHTML']