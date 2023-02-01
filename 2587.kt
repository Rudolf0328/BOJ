fun main() {
    var numbers = IntArray(5)

    for (i in 0 until 5) {
        numbers[i] = readLine()!!.toInt()
    }
    var avg: Int = numbers.sum()/5

    var sortedNumbers = numbers.sorted()
    var med = sortedNumbers[2]

    println(avg)
    println(med)
}