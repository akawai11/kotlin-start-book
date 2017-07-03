package sample

/* ループ処理のプログラム */
fun main(args: Array<String>) {

    var count = 3;
    while(count-- > 0) {
        println("Hello")
    }

    do {
        println("Hello")
        val next = Math.random() < 0.5
    } while(next)

    for(x in arrayOf(1, 2, 3)) {
        println(x)
    }

    val nameList = listOf("foo", "bar", "baz")
    for(name in nameList) {
        println(name)
    }

    for(i in 1..10 step 2) {
        println(i)
    }
    
}
