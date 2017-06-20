package sample

fun main(args: Array<String>) {

    // require に引っかかることを確認
    try {
        println(Rational(1, 0))
    } catch(e: IllegalArgumentException) {
        println(e)
    }
    println(Rational(1, 2))
    println(Rational(17, 17))
    println(Rational(55, 100))
    println(Rational(1234, 5678))
}

