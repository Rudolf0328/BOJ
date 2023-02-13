import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    // i/o에 쓰이는 변수 선언
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    // x 값 입력 받기
    var x = br.readLine().toInt()

    // 정답을 출력할 변수 선언 및 0으로 초기화
    var answer = 0

    // 입력된 x를 이진법으로 변경했을 때 1의 개수 세기
    while(x > 0) {
        if (x % 2 == 1)
            answer += 1
        x /= 2
    }

    // 정답 출력 - 개행 안 쓰면 에러남
    bw.write("${answer}\n")

    br.close()
    bw.close()
}
