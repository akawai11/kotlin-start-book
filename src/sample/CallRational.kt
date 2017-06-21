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
    println("-----------------------")
    println(Rational(1, 4).plus(Rational(1, 2)))
    println(Rational(1, 3).plus(Rational(4, 7)))
    println(Rational(1, 2) + Rational(1, 5))
    println(Rational(1, 6) + Rational(1, 3) + Rational(1, 2))

}

