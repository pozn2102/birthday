import javax.swing.border.Border

fun main() {
    val name = "Chawy"
    val age1 = 20 * 365
    val border = "`-._,-'"
    val timesToRepeat = 3 // Số nguyên kh sử dụng ""
    val age = 20
    val layer = 5

    printBorder(border, timesToRepeat)
    println("Happy Birthday ${name}")
    printBorder(border, timesToRepeat)
    println()
    // Cake
    printCakeCandles (age)
    printCakeTop(age)
    printCakeBottom(age, layer)
    println()

    println ("Nay đã tồn tại hơn được ${age1} ngày ")
    println ("Chúc ${name} mau ăn chóng lớn sớm lấy chồng")

}
fun printBorder (border: String, timesToRepeat: Int) {
//    println("====================")
//    Cách sử dụng khác
    repeat(timesToRepeat){
        print(border)
    }
    println()

}

fun printCakeTop (age: Int) {
    repeat(age + 2) {
        print("=")
    }
    println()
}
fun printCakeCandles (age: Int){
    print(" ")
    repeat(age){
        print(",")  // Tạo ra lửa
    }
    println()

    print(" ")
    repeat(age) {
        print("|") // Tạo ra thân
    }
    println()
}
fun printCakeBottom(age: Int , layer : Int) {
    repeat(layer) {
        repeat(age + 2){
            print("@")
        }
        println()
    }
}
