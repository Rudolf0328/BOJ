import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    // 버퍼 리더와 라이터 선언
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()
    val sb = StringBuilder()

    var n = br.readLine()!!.toInt()

    // 절대값이 1000000인 정수는 총 2000001개
    // 2000001 칸의 배열 선언
    val numbers = BooleanArray(2000001)

    // 해당하는 수의 칸을 true로 색칠
    for (i in 0 until n) {
        numbers[br.readLine()!!.toInt()+1000000] = true
    }

    // true로 칠해진 칸의 index에 1000000을 빼서 실제 수를 출력
    // println으로 한 줄씩 출력하면 시간초과
    for (i in numbers.indices) {
        if (numbers[i]) {
            sb.append("${i-1000000}\n")
        }
    }

    // 한 번에 출력
    bw.write(sb.toString())

    bw.close()
    br.close()
}

///