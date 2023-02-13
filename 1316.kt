import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()

    // 정답을 출력할 변수
    var answer = 0
    // 입력 받은 단어 1개를 저장할 변수
    var word = ""

    // n번 입력을 받아서 단어를 하나씩 검사
    for (i in 0 until n) {
        // 단어의 알파벳은 하나씩 저장할 배열 선언 및 초기화
        val alphabets : MutableList<Char> = mutableListOf()
        word = br.readLine()

        // 1글자 단어는 무조건 그룹 단어
        if (word.length == 1) {
            answer += 1
        } else {
            alphabets.add(word[0])
            for (j in 1 until word.length) {
                // 이미 나온 알파벳인데 직전 알파벳이 아닐 때는 그룹 단어가 아님
                if(word[j] in alphabets && word[j-1] != word[j])
                    break;
                else {
                    alphabets.add(word[j])
                    // 알파벳 계속 넣다가 마지막까지 확인되면 그룹 단어
                    if (j == word.length - 1)
                        answer += 1
                }

            }
        }
    }

    // 정답 출력
//    println(answer)
    bw.write("${answer}\n")

    br.close()
    bw.close()
}