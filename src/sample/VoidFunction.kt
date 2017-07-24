package sample

/* void関数 */
fun main(args: Array<String>) {

    var counter = Counter()
    println(counter.getCnt())
    counter.countUp()
    println(counter.getCnt())

}

class Counter {
    private var cnt = 0

    fun  countUp(): Unit {
        cnt++
    }

    fun getCnt(): Int = cnt

}