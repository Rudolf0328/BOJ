fun main() {
    // 100*100 크기의 도화지 0으로 초기화
    var paper = Array(101, { Array(101, {0}) })

    // 색종이의 수 입력 받기
    var n = readLine()!!.toInt()

    // 색종이가 놓이는 칸을 1로 색칠
    for (i in 0 until n) {
        var (x, y) = readLine()!!.split(" ").map { it.toInt() }
        for (j in 0 until 10) {
            for (k in 0 until 10) {
                paper[x+j][y+k] = 1
            }
        }
    }

    // 칠해진 칸의 수 구하고 출력
    var sum = 0

    for (i in paper) {
        sum += i.sum()
    }

    println(sum)
}

///