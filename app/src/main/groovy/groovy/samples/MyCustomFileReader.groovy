package groovy.samples

class MyCustomFileReader {
    def capitalize() {
        List<String> capitalized = []

        def lines = new File(getClass().getResource("/models.txt").toURI()) as String[]
        capitalized = lines.collect { line ->
            {
                def splitted = line.split("\\s+").collect { it.toLowerCase().capitalize() }
                splitted.inject(' ') { accumulator, current -> accumulator + current + ' ' }.trim()
            }
        }

        capitalized
    }

    def writeCapitalized() {
        List<String> capitalized = capitalize().sort()
        File f = new File(getClass().getResource("/capitalized_models.txt").toURI())
        capitalized.forEach { line -> f.append(line + '\n') }
    }

    def readLinesOfFile() {
        def lines = new File(getClass().getResource("/capitalized_models.txt").toURI()) as String[]
        lines.each { line -> println(line) }
    }

}