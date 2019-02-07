def sumAndDifference(a: Int, b: Int): (Int, Int) = {
  val sum = a + b
  val difference = a - b
  (sum, difference)
}

val res = sumAndDifference(10, 5)

res._1
res._2

val (sm, df) = sumAndDifference(10, 5)

val (a,b,c,d,e) = (0, 'u', 8, 1, "too")


def sumAndDifference2(a: Int, b: Int): (Int, Int, String) = {
  val sum = a + b
  val difference = a - b
  val somethingElse = "Something else"
  (sum, difference, somethingElse)
}

val (sum, dif, something) = sumAndDifference2(10, 5)

val res2 = sumAndDifference2(10, 5)

val result :String = res2._3

println(result)