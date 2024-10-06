fun sortStrings(strings: Array<String>): Array<String> {
    return strings.sortedArray()
}
fun main() {
    val stringArray = arrayOf("мандарин", "персик", "манго", "лимон")
    val sortedArray = sortStrings(stringArray)
    println("Отсортированные строки: ")
    sortedArray.forEach { println(it) }

}