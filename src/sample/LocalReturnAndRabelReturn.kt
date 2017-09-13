package sample

/* ローカルリターンとラベルリターン */
fun main(args: Array<String>) {
    containsDigit("abc1de")
}

/* 文字列を操作するインライン関数 */
inline fun forEach(str: String, f: (Char) -> Unit) {
    for (c in str) {
        f(c)
    }
}

/* ラベルへのリターン */
fun containsDigit(str: String): Boolean {
    var result = false
    forEach(str) {
        if (it.isDigit()) {
            result = true
            return@forEach
        }
    }
    return result
}
