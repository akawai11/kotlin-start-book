package sample

/* 初めてのプログラム */
fun main(args: Array<String>) {

    if(true) {
        println("Hello")
    }

    if(5 in 1..10) {
        println("wawa")
        println("hoho")
    }

    if(1 + 2 < 3) {
        println("hoge")
    }

    var score = 50
    if(score >= 60) {
        println("合格!")
    } else {
        println("不合格")
    }

    val message = if(score >= 60) "合格！" else "不合格"
    println(message)

    val x = if(true) {
        1
        2 // 最後に評価される式が返る
    } else {
        3
    }
    println(x)

    score = 75
    val grade =
            if(score >= 90) 'A'
            else if(score >= 80) 'B'
            else if(score >= 70) 'C'
            else if(score >= 60) 'D'
            else 'F'

    when(x) {
        1 -> "one"
        2, 3 -> "two or three"
        else -> {
            "unknown"
        }
    }

    when(x) {
        1 -> "one"
        // myFavoriteInt() -> "favorite: $x"
        in 2..10 -> "1 <= x <= 10"
        else -> x.toString()
    }

    val str = ""
    val blank = when(str) {
        is String -> str.isBlank()
        else -> true
    }

    when {
        score >= 90 -> 'A'
        score >= 80 -> 'B'
        score >= 70 -> 'C'
        score >= 60 -> 'D'
        else -> 'F'


    }
}
