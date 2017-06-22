package sample

class Rational(n: Int, d: Int) {
    init {
        require(d != 0, {"denominator must not be null"})
    }
    private val g = gcd(Math.abs(n), Math.abs(d))

    // 呼び出された時に値が確定する
    val numerator: Int by lazy { n / g }
    val denominator: Int by lazy { d / g }

    //　operatorと一緒に決められたメソッド名で実装することによって演算子をオーバーロードできる
    operator fun plus(that: Rational): Rational =
    Rational(
            numerator * that.denominator + that.numerator * denominator,
            denominator * that.denominator
    )
    operator fun plus(n: Int): Rational =
    Rational(numerator + n * denominator, denominator)
    override fun toString(): String = "${numerator}/${denominator}"
    tailrec private fun gcd(a: Int, b: Int): Int =
            if (b == 0) a
            else gcd(b, a% b)
}