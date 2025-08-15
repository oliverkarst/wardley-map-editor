/*
 * docToolchain 3.4.0 Konfiguration für Wardley Map Editor
 * Optimiert für arc42-Dokumentation mit GitHub Pages Deployment
 */

// Basis-Pfade
inputPath  = 'docs'
outputPath = 'build'

// Asciidoctor-Konfiguration
asciidoc = [
    // Basis-Attribute für arc42 und technische Dokumentation
    attributes : [
        // Syntax Highlighting
        'source-highlighter': 'coderay',
        'coderay-css': 'style',
        
        // Inhaltsverzeichnis
        'toc': 'left',
        'toclevels': '4',
        'toc-title': 'Inhalt',
        
        // Projekt-spezifische Attribute
        'project-name': 'Wardley Map Editor',
        'project-version': '1.0.0',
        'project-description': 'Web-basierter Editor für Wardley Maps mit draw.io Export',
        
        // Datum und Autor
        'revdate': new Date().format('yyyy-MM-dd'),
        'author': 'Software Architektur Team',
        
        // Erweiterte Features
        'sectanchors': '',
        'sectlinks': '',
        'experimental': '',
        'icons': 'font',
        'example-caption!': '',
        'figure-caption!': '',
        'table-caption!': '',
        
        // GitHub Integration
        'gh-repo': 'oliverkarst/wardley-map-editor',
        'gh-pages-url': 'https://oliverkarst.github.io/wardley-map-editor',
        
        // Kroki Integration (falls gewünscht)
        'kroki-server-url': 'https://kroki.io',
        
        // Plantuml Integration
        'plantuml-server-url': 'http://www.plantuml.com/plantuml'
    ],
    
    // Haupt-Eingabedatei
    inputFiles: ['arc42/arc42.adoc'],
    
    // Zusätzliche Asciidoctor-Optionen
    options: [
        'backend': 'html5',
        'safe': 'unsafe',
        'header_footer': true
    ]
]

// Aktive Tasks für den Build-Prozess
tasks = [
    'generateHTML',
    // Optional: Weitere Tasks für erweiterte Features
    // 'exportEA',           // Enterprise Architect Export
    // 'exportPPT',          // PowerPoint Export
    // 'generatePDF',        // PDF Generation
    // 'publishToConfluence' // Confluence Publishing
]

// Confluence-Konfiguration (optional, für spätere Nutzung)
confluence = [
    input: [
        [ file: 'arc42/arc42.adoc' ]
    ],
    ancestorId: '',
    spaceKey: '',
    createSubpages: true,
    pagePrefix: '[${project-name}] ',
    preambleTitle: 'Über dieses Dokument',
    extraPageContent: '''
        <ac:structured-macro ac:name="info">
            <ac:rich-text-body>
                <p>Diese Seite wurde automatisch generiert aus der arc42-Dokumentation.</p>
                <p>Quelle: <a href="${gh-repo}">${gh-repo}</a></p>
            </ac:rich-text-body>
        </ac:structured-macro>
    '''
]

// Export-Konfigurationen
export = [
    // HTML Export (Standard)
    html: [
        enabled: true,
        backend: 'html5',
        attributes: asciidoc.attributes
    ],
    
    // PDF Export (optional)
    pdf: [
        enabled: false,
        backend: 'pdf',
        theme: 'default'
    ]
]

// Template-Konfiguration für arc42
arc42 = [
    // Sprache der arc42-Templates
    language: 'DE',
    
    // Template-Typ
    type: 'full', // 'full' oder 'compact'
    
    // Optionale Abschnitte
    sections: [
        '01_introduction_and_goals',
        '02_architecture_constraints', 
        '03_system_scope_and_context',
        '04_solution_strategy',
        '05_building_block_view',
        '06_runtime_view',
        '07_deployment_view',
        '08_concepts',
        '09_architecture_decisions',
        '10_quality_requirements',
        '11_technical_risks',
        '12_glossary'
    ]
]