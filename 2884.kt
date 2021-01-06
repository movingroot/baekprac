fun main() {
    val (a,b) = readLine()!!.split(' ')
    var c = a.toInt()
    var d = b.toInt()
    
    if (d >= 45) d -= 45 else {
        if (c>0) {
            d += 15
            c -= 1
        } else {
            c = 23
            d += 15
        }
    }
    
    println("$c $d")
}
