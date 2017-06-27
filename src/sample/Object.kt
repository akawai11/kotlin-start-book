package sample

/* 様々なオブジェクト */
fun main(args: Array<String>) {

    // 文字列処理
    var name = "g0z4ru"
    println(name.length)
    println(name.capitalize())
    println(name.isBlank())
    println("Hello, " + name + "!")
    println("Hello, $name !")
    var rawString = """
        val name = "gozaru"
        "Hello, $name!"
    """
    println(rawString)
    rawString = """
        |It's
        |sunny
        |today.
    """
    println(rawString)
    println(rawString.trimMargin())

    // 配列
    var ints = arrayOfNulls<Int>(5)
    println(ints.size)
    println(ints[0])
    ints[0] = 123
    println(ints[0])
    val strs = arrayOf("red", "green", "blue")
    println(strs[0])
    val intArr: IntArray = intArrayOf(1, 2, 3)
    println(intArr[0])
    val chars: CharArray = charArrayOf('a', 'b', 'c')
    println("${chars[0]}, ${chars[1]}")

    // リスト
    val intList: List<Int> = listOf<Int>(1, 2, 3)
    println(intList)
    println(intList.size)
    println(intList[0])
    val charList: MutableList<Char> = mutableListOf('a', 'b')
    println(charList)
    charList[0] = 'c'
    println(charList)
    charList += 'X'
    println(charList)
    charList -= 'X'
    println(charList)
    charList.removeAt(0)
    println(charList)
}
