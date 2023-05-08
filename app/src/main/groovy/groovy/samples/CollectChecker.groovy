package groovy.samples

class CollectChecker {
    def doubleClosure = { Integer n -> n * 2 }

    def capitalizeClosure = { String str -> str.toLowerCase().capitalize() }

    def mapCollector() {
        Map ids = [
                1: 'SUDHARMA',
                2: 'PRASANNA',
                3: 'GARGI'
        ]

        def trans = ids.collectEntries { key, value -> [doubleClosure(key), capitalizeClosure(value)] }
        println trans
    }
}
