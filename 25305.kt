fun main() {
    var (n, k) = readLine()!!.split(" ").map { it.toInt() }

    var scores = readLine()!!.split(" ").map { it.toInt() }
    scores = scores.sortedDescending()

    println(scores[k-1])
}