package sample

class Person {
    var name: String = ""
    var age: Int = 0
    val nameLength: Int
    get(): Int {
        return this.name.length
    }

    var name2: String = ""
    set(value) {
        println("${value}がsetされました")
        field = value
    }

    val nameLength2: Int
        get(): Int {
            return this.name.length
        }
}

fun main(args: Array<String>) {
   val hanako = Person()

    println(hanako.name) // からを出力
    println(hanako.age) // 0を出力

    hanako.name = "はなこ"
    hanako.age = 25

    println(hanako.name) // はなこを出力
    println(hanako.age) // 25を出力
    println(hanako.nameLength)


    hanako.name2 = "はなこ2"
    println(hanako.name2)
    println(hanako.nameLength2)
}