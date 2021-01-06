// 정석 
fun main() {
  val (a, b) = readLine()!!.split(' ')
  val c = a.toInt()
  val d = b.toInt()
  
  if (c > d) {
  println(">")
  } else if (c < d) {
  println("<")
  } else {
  println("==")
  }
}

// 축약
fun main() {
  val (a, b) = readLine()!!.split(' ')
  val c = a.toInt()
  val d = b.toInt()
  
  if (c>d) println(">") else if (c<d) println("<") else println("==")
}
