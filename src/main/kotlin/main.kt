// =================== ABOUT ================
//Find a pair with the given sum in an array
//date : Tuesday, March 16, 2021
//created by : mohammad khedmati
//Every day learn something new :))

fun findPair(arr: Array<Int>, sum: Int) {
    // create an empty HashMap
    val map: MutableMap<Int, Int> = HashMap()

    for (i in arr.indices) {
        // check if pair `(arr[i], sum-arr[i])` exists
        // if the difference is seen before, print the pair
        if (map.containsKey(sum - arr[i])) {
            println(
                "Pair found at index " +
                        map[sum - arr[i]] + " and " + i + " : " + (sum - arr[i] )+ " + " + arr[i]
            )
            return
        }

        // store index of the current element in the map
        map[arr[i]] = i
    }
    println("Pair not found")
}

fun main() {
    val arr = arrayOf(1, 3, 4, 5, 7, 9, 10, 13, 17, 19)
    val toFind = 15

    findPair(arr, toFind)
}
