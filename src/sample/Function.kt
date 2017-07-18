package sample

fun succ(i: Int): Int = i + 1

// 引数の2乗を返す関数
fun square(i: Int): Int = i * i

// mainメソッドの上に関数定義

/* 関数を使用したプログラム */
fun main(args: Array<String>) {

    println(succ(31))
    println(square(5))
    println(hello())
    println(hello("gozaru"))
    println(max(12, 13))
    println(max(0, -1))
    println(sum(arrayOf(1, 2, 3)))
    println(sum2(1, 2, 3))
    // *をつけて配列と明示的にする
    println(sum2(*intArrayOf(1, 2, 3)))
    val ints = intArrayOf(1, 2, 3)
    println(sum2(*ints))
    println(sub(10, 7))
    println(sum3((1L..123456).toList()))
}

// mainメソッドの下に関数定義

// 名前として指定した引数に対する挨拶文を返す関数
fun hello(name: String = "world"): String = "Hello $name"

// 引数を2つ渡して、大きい方を返す関数
fun max(a: Int, b: Int): Int = if(b <= a) a else b

fun sum(ints: Array<Int>): Int {

    var sum = 0
    for(i in ints) {
        sum += i
    }
    return sum
}

fun sum2(vararg ints: Int): Int {

    var sum = 0
    for(i in ints) {
        sum += i
    }
    return sum
}

tailrec fun sum3(numberList: List<Long>, accumulator: Long = 0): Long =

        if (numberList.isEmpty()) {
            accumulator
        } else {
            sum3(numberList.drop(1), accumulator + numberList.first())
        }


fun sub(minuted: Int, subtrahend: Int): Int = minuted - subtrahend


