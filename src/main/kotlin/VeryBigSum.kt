/**
 * Given an array of integers, find the sum of its elements.
For example, if the array: ar[1, 2, 3], 1 + 2 + 3 = 6, so return 6.

Function Description
Complete the simpleArraySum function in the editor below. It must return the sum of the array elements as an integer.

simpleArraySum has the following parameter(s):

ar: an array of integers
<b>Input Format</b>

The first line contains an integer, n, denoting the size of the array.
The second line contains n space-separated integers representing the array's elements.

Constraints
0 < n,ar[i] < 1000

Output Format

Print the sum of the array's elements as a single integer.

Sample Input
6
1 2 3 4 10 11

Sample Output
31

Explanation
We print the sum of the array's elements: 1 + 2 + 3 + 4 + 10 + 11 = 31
 */
fun main() {
    val arCount = readLine()!!.trim().toInt()
    val ar = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    val result = simpleArraySum(ar)
    println(result)
}

private fun simpleArraySum(args: Array<Int>): Int {
    var sum = 0
    args.forEach { sum+= it }
    return sum
}
