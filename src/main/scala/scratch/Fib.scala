package scratch

object Fib {

    def seq = {
        lazy val f: Stream[Integer] = 1 #:: 2 #:: ((f zip f.tail) map {case (x, y) => x + y})
        f
    }
}