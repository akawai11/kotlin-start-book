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

    // セット
    val intSet: Set<Int> = setOf(1, 2, 1, 3)
    println(intSet)
    val charSet: MutableSet<Char> = mutableSetOf('a', 'a', 'b')
    println(charSet)
    charSet -= 'a'
    println(charSet)

    // マップ
    val numberMap: MutableMap<String, Int> =
            mutableMapOf("one" to 1, "two" to 2)
    println(numberMap)
    println(numberMap.size)
    println(numberMap["one"])
    println(numberMap["three"])
    numberMap += "three" to 3
    println(numberMap)

    // レンジ
    print("5 in 1..10 :")
    println(5 in 1..10)
    val range: IntRange = 12..15
    print("5 in range")
    println(5 in range)
    print("5 !in range")
    println(5 !in range)
}
