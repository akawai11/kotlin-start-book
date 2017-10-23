package sample

class Person {
    var name: String = ""
    var age: Int = 0
}

fun main(args: Array<String>) {
   val hanako = Person()

    println(hanako.name) // からを出力
    println(hanako.age) // 0を出力

    hanako.name = "はなこ"
    hanako.age = 25

    println(hanako.name) // はなこを出力
    println(hanako.age) // 25を出力

}