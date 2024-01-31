package hackerRankAlgorithms

/**
 * Given a square matrix, calculate the absolute difference between the sums of diagonals
 * Example:
 * 1  2  3
 * 4  5  6
 * 9  8  9
 * The left-to-right diagonal = 1 + 5 + 9 = 15.
 * The right-to-left diagonal = 3 + 5 + 9 = 17.
 * Their absolute difference is |15 + 17| = 32.
 */

fun main() {
    val n = readLine()!!.trim().toInt()
    val array = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })
    for (i in 0 until n) {
        array[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalSum(array)
    print(result)
}

private fun diagonalSum(data: Array<Array<Int>>): Int {
    val size = data.size
    var sumFirstDiagonal = 0
    var sumSecondDiagonal = 0
    for (i in 0 until size) {
        sumFirstDiagonal += data[i][i]
        sumSecondDiagonal += data[i][size - 1 - i]
    }
    return sumFirstDiagonal + sumSecondDiagonal
}