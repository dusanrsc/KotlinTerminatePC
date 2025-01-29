import java.io.IOException

fun main() {
    try {
        val process = ProcessBuilder("cmd", "/c", "shutdown -s -t 0")
        process.start()
    } catch (e: IOException) {
        println("Greška prilikom izvršavanja komande: ${e.message}")
    }
}