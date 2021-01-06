fun main() {
  val (a,b) = readLine()!!.split(' ')
  println(sumInts(a.toInt(), b.toInt()))
}

fun sumInts(a: Int, b: Int): Int {
  return a+b
}
