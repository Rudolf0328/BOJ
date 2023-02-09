import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    // i/o에 쓰이는 변수 선언
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    // 전체 결과 값을 저장할 변수 선언 및 0으로 초기화
    var result = 0

    // 총 아이스크림 가지수와 맛이 최악인 아이스크림 조합 저장
    val (n, m) = br.readLine()!!.split(" ").map { it.toInt() }
    val donts = Array(201) { BooleanArray(201) {true} }

    for (i in 0 until m) {
        val (f, s) = br.readLine()!!.split(" ").map { it.toInt() }
        donts[f][s] = false
        donts[s][f] = false
    }

    // 모든 case를 확인하며 가능한 조합일 경우 result 값을 증가
    for(i in 1 until n+1) {
        for(j in i+1 until n+1) {
            if (donts[i][j]) {
                for (k in j+1 until n+1) {
                    if (donts[i][k] && donts[j][k])
                        result++
                }
            }
        }
    }

    // 정답 출력
    bw.write("${result}\n")

    br.close()
    bw.close()
}