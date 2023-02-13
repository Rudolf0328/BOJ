import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val n = br.readLine()
    var numbers = IntArray(10) {0}

    // 각 숫자의 개수를 numbers 배열에 저장
    // toInt()는 ASCII 값을 반환! 1 -> 49
    // Character.getNumericValue()를 사용해야된다.
    for (i in n.indices) {
        numbers[Character.getNumericValue(n[i])] += 1
    }

    // 6과 9는 뒤집어서 쓸 수 있으므로 반으로 나눠 준다.
    numbers[6] = (numbers[6] + numbers[9])
    numbers[9] = 0
    if(numbers[6] % 2 == 0)
        numbers[6] /= 2
    else
        numbers[6] = (numbers[6] / 2) + 1

//    println(numbers.maxOrNull())
    bw.write("${numbers.maxOrNull()}\n")

    // 안 쓰면 boj 채점 안 되는데 자꾸 안 쓰네
    br.close()
    bw.close()
}