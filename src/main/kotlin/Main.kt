fun main() {
    sentence("Barnie bakes brown bagel")

    numbers(arrayOf(3,6,9,19))
    var v = vol(3.14159, 9, 1.333)
}
fun sentence(state:String){
    println(state.split("b"))
}
fun numbers(num:Array<Int>){
    println(num.sum(3,6,9,19))
    println(num.average(3,6,9,19))

}
fun vol(num1:Double, num2:Int, num3:Double) {

}


fun isPalindrome(word:String):Boolean {

}