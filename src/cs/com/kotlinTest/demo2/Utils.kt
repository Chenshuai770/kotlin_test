package cs.com.kotlinTest.demo2

var StringBuilder.lastChar: Char
    get() =
        this.get(this.length - 1)
    set(value: Char) {
        this.setCharAt(this.length - 1, value)
    }

fun <T> Collection<T>.joinToString(
        separator: String = ",",
        prefix: String = "",
        postfix: String = ""
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
        if (index > 0) {
            result.append(separator)
        }
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

