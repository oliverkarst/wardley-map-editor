// Minimal config for docToolchain
inputPath  = 'docs/arc42'
outputPath = 'build'

asciidoc = [
  // relative to inputPath
  inputFiles: ['arc42.adoc']
]

// optional: weitere Tasks später hinzufügen
// tasks = ['generateHTML', 'exportMarkdown', ...]