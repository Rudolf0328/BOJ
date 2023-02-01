fun main() {
    var n = readLine()!!.toInt()
    var arr = IntArray(n, {0})

    for (i in 0 until n) {
        arr[i] = readLine()!!.toInt()
    }

    // bubble sort
    for (i in 0 until n) {
        for (j in 1 until n-i) {
            if (arr[j-1] > arr[j]) {
                var tmp = arr[j-1]
                arr[j-1] = arr[j]
                arr[j] = tmp
            }
        }
    }

    for (i in 0 until n) {
        println(arr[i])
    }
}