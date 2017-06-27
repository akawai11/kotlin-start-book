package sample

/* 様々なオブジェクト */
fun main(args: Array<String>) {

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
}
