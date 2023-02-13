import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()

    val list : MutableList<String> = mutableListOf()

    for (i in 0 until n) {
        val word = br.readLine()

        if (word in list)
            continue
        else
            list.add(word)
    }

    val sortedList = list.sortedWith(Comparator<String>{ a, b ->
        when{
            a.length > b.length -> 1
            a.length < b.length -> -1
            else -> when {
                a > b -> 1
                a < b -> -1
                else -> 0
            }
        }
    })

    for (word in sortedList) {
        bw.write("${word}\n")
    }

    br.close()
    bw.close()
}