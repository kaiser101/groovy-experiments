/*
 * This Groovy source file was generated by the Gradle 'init' task.
 */
package groovy.samples

class App {
    String getGreeting() {
        return 'Hello World!'
    }

    static void main(String[] args) {
        println new App().greeting
        new MyCustomFileReader().writeCapitalized()
        new MyCustomFileReader().readLinesOfFile()
        new CollectChecker().mapCollector()
    }
}