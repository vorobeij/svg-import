import java.io.File
import java.nio.file.Files
import java.nio.file.StandardCopyOption

val input = "../_icons_exported"
val output = "../_icons"

fun createIfNotExist(p: String) {
    val f = File(p)
    if (!f.exists()) f.mkdirs()
}

createIfNotExist(input)
createIfNotExist(output)

val exported = File(input)

fun files(): List<File> {
    return File(input).listFiles().filter { it.isFile && !it.name.contains(Regex("^\\.")) }
}

fun formatName(name: String): String {
    val space = "(\\(|\\)| |-)".toRegex()
    val bottom = "_+".toRegex()
    return "ic_$name"
        .replace(space, "_")
        .replace(bottom, "_")
        .replace("_.", ".")
        .toLowerCase()
}

val icons = files().sortedBy { it.name }

val res = File(output)

for (i in 0 until icons.size) {
    val name = formatName(icons[i].name)
//    println("${icons[i].name} -> $name")
    Files.copy(icons[i].toPath(), File(res, name).toPath(), StandardCopyOption.REPLACE_EXISTING)
}

println("renamed icons are under ${res.toPath()}")
