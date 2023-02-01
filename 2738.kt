fun main() {
    // 행렬 크기 입력 받기
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }

    // 행렬 A와 B 선언 및 0으로 초기화
    var arrA = Array(n, { Array(m, {0}) })
    var arrB = Array(n, { Array(m, {0}) })


    // 행렬 A 입력 받기
    for(i in 0 until n) {
        arrA[i] = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
    }

    // 행렬 B 입력 받기
    for(i in 0 until n) {
        arrB[i] = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
    }

    // 행렬 A와 B를 더하면서 출력
    for(i in 0 until n) {
        for (j in 0 until m) {
            print(arrA[i][j] + arrB[i][j])
            print(" ")
        }
        println()
    }
}