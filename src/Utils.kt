import java.io.File
import java.math.BigInteger
import java.nio.file.Paths
import java.security.MessageDigest

/**
 * Reads lines from the given input txt file.
 */

fun readInput(year: String, name: String) =
    File(Paths.get("src", "resources", "y$year", "$name.input").toUri()).readLines()

/**
 * Converts string to app.md5 hash.
 */
fun String.md5(): String = BigInteger(1, MessageDigest.getInstance("MD5").digest(toByteArray())).toString(16)
