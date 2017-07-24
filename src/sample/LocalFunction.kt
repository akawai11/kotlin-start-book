package sample

import java.util.concurrent.atomic.DoubleAccumulator

/* ローカル関数 */
fun main(args: Array<String>) {
   println(sum((1L..999).toList()))
}

fun sum(numberList: List<Long>): Long {

    tailrec fun sum(numberList: List<Long>, accumulator: Long): Long =
        if (numberList.isEmpty()) accumulator
        else sum(numberList.drop(1), accumulator + numberList.first())

    return sum(numberList, 0)
}
