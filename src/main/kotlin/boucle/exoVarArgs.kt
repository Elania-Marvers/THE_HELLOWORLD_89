fun max(vararg input: Int): Int {
    if (input.size > 1) {
        var result = input[0]
        for (i in input) if (i > result) result = i
        return result
    }
    return -1
}