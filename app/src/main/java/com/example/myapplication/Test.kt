fun main() {
    var myMathScore = readLine()!!.toInt()

    var myRank = checkRank(myMathScore)
    println("나의 등급은 : ${myRank}")
}

fun checkRank(score:Int) : String {
    return when(score) {
        in 90..100 ->	return "A"
        in 80..89 -> return "B"
        in 70..79 -> return "C"
        else -> return "D"
    }
}
//    Kotlin 컨벤션을 따르지 않은 형태
//    if(score >= 90) {
//        return "A"
//    } else if(score >= 80) {
//        return "B"
//    } else if(score >= 70) {
//        return "C"
//    } else {
//        return "D"
//    }
// }