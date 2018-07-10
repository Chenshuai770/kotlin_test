package cs.com.kotlinTest.demo5

fun alphabet(): String {
    val result = StringBuilder()
    for (letter in 'A'..'z') {
        result.append(letter)
    }
    result.append("\nNow I know the alphabet!")
    return result.toString()
}

fun alphabet1(): String {
    val stringBuilder = StringBuilder()
    return with(stringBuilder) {
        for (letter in 'A'..'Z') {
            this.append(letter)
        }
        append("\nNow I know the alphabet1!")
        this.toString()
    }
}

fun alphabet2() = with(StringBuffer()) {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I Know the alphabet2!")
    toString()
}

fun alphabet3() = StringBuilder().apply {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I Know the alphabet3!")
}.toString()

fun alphabet4()= buildString {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I Know the alphabet4!")
}


fun main(args: Array<String>) {
    println(alphabet4())
}