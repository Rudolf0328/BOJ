import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    // buffer reader와 buffer writer 선언
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val n = br.readLine()!!.toInt()

    val counts = IntArray(10001)

    for (i in 0 until n) {
        counts[br.readLine()!!.toInt()] += 1
    }

    for (i in 1 until 10001) {
        bw.write("${i}\n".repeat(counts[i]))
    }

    bw.close()
    br.close()
}

///