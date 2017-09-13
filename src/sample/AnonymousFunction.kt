package sample

fun main(args: Array<String>) {
    val anonymousFunction = AnonymousFunction()
    println(anonymousFunction.square1(2))
    println(anonymousFunction.square1(3))
    println(anonymousFunction.square1(4))
}

class AnonymousFunction {

    /* ラムダ式 */
    val square1: (Int) -> Int = { i: Int ->
        i * i
    }

    /* 無名関数 */
    val square2: (Int) -> Int = fun(i: Int): Int {
        return i * i
    }

    /* 無名関数 省略バージョン */
    val square3: (Int) -> Int = fun(i: Int) = i * i
}