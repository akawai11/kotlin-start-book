package sample

/* ラムダ式 */
fun main(args: Array<String>) {
    println(square(1))
}

val square: (Int) -> Int = { i: Int ->
    i * i
}

