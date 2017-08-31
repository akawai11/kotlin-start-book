package sample

/* ラムダ式 */
fun main(args: Array<String>) {
    println(square(1))
    println(square1(2))
    println(square2(3))
}

val square: (Int) -> Int = { i: Int ->
    i * i   
}

// 型推論
val square1 = { i: Int ->
    i * i
}

val square2: (Int) -> Int = {
    it * it
}
