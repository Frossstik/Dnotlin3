fun lab1(num: Int): String{
    if (num<1000)
        return num.toString()
    else
        return (num/1000).toString()+"K"
}

fun Int.lab2(): String{
    return when {
        this % 10 == 1 && this % 100 != 11 -> "$this год"
        this % 10 in 2..4 && this % 100 !in 12..14 -> "$this года"
        else -> "$this лет"
    }
}

fun lab3(price: Double, sale: Double): String{
    return String.format("%.2f", (price*(1-(sale/100))))
}

fun lab4(string: String): Int{
    var counter: Int = 0
    var words = string.replace("\\s+".toRegex(), " ").split(" ")
    for(i in words)
        counter++
    return counter
}

fun main() {
    val num = readln()
    println(lab1(num.toInt()))
    println()

    val year = readln()
    println(year.toInt().lab2() + "\n")

    val price = 100
    val sale = 15
    println(lab3(price.toDouble(), sale.toDouble()))
    println()

    val string: String = "govno zalupa penis her davalka    huy  blyadina"
    println(lab4(string))
}