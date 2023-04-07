/* Link -> https://www.hackerrank.com/challenges/between-two-sets/problem?isFullScreen=true&h_r=next-challenge&h_v=zen

Complejidad algoritmica:
La complejidad algorítmica de esta solución es O(nm), donde n es la longitud del arreglo a y m es la longitud del arreglo b.
Esto se debe a que el bucle for se ejecutará como máximo minB/maxA veces, lo que es igual a O(m/n), y dentro del bucle se realizan
operaciones de tiempo constante, como verificar si cada elemento de b es divisible por i y si i es divisible por cada elemento de a.
 */
fun main() {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val brr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val total = getTotalX(arr, brr)

    println(total)
}

fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    var count = 0
    val maxA = a.maxOrNull()!!
    val minB = b.minOrNull()!!

    for (i in maxA..minB step maxA) {
        if (b.all { it % i == 0 } && a.all { i % it == 0 }) {
            count++
        }
    }

    return count
}

/*
There will be two arrays of integers. Determine all integers that satisfy the following two conditions:
The elements of the first array are all factors of the integer being considered
The integer being considered is a factor of all elements of the second array
These numbers are referred to as being between the two arrays. Determine how many such numbers exist.
Example


There are two numbers between the arrays:  and .
, ,  and  for the first value.
,  and ,  for the second value. Return .
Function Description
Complete the getTotalX function in the editor below. It should return the number of integers that are betwen the sets.
getTotalX has the following parameter(s):
int a[n]: an array of integers
int b[m]: an array of integers
Returns
int: the number of integers that are between the sets
Input Format
The first line contains two space-separated integers,  and , the number of elements in arrays  and .
The second line contains  distinct space-separated integers  where .
The third line contains  distinct space-separated integers  where .
Constraints



Sample Input
2 3
2 4
16 32 96
Sample Output
3
Explanation
2 and 4 divide evenly into 4, 8, 12 and 16.
4, 8 and 16 divide evenly into 16, 32, 96.
4, 8 and 16 are the only three numbers for which each element of a is a factor and each is a factor of all elements of b.
 */