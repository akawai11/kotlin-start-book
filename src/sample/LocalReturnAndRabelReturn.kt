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

/* 非ローカルリターン */
fun containsDigit(str: String): Boolean {
    forEach(str) {
        if (it.isDigit())
            return true
    }
    return false
}
