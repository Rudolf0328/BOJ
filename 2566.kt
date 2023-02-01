fun main() {
    // 사용할 변수들 선언 및 초기화
    val n = 9
    var row = 0
    var col = 0
    var max = 0

    // 한 줄 씩 읽으면서 최대값 확인
    // 그 줄의 최대값이 전체 최대값 보다 크면 그 수의 좌표 저장
    for (i in 0 until n) {
        var list = readLine()!!.split(" ").map { it.toInt() }
        var rowMax = list.maxOrNull()!!

        if (rowMax >= max) {
            max = rowMax
            row = i + 1
            for (j in 0 until n) {
                if (list[j] == max) {
                    col = j + 1
                }
            }
        }
    }

    // 최대값과 좌표 출력
    println(max)
    println("${row} ${col}")

}