fun main() {
    println("Программа перевода натурального числа из десятичной системы счисления в двоичную ")
    val num = intValidateAboveZero("Введите натуральное число: ")
    val binary = num.toString(2)
    println(binary)
}


fun intValidateAboveZero(message: String): UInt {
    val int: UInt
    print(message)
    try {
        int = readln().toUInt()
        if (int == 0u){
            println("Ошибка ввода!\nДля корректной работы введите число > 0!")
            return intValidateAboveZero(message)
        }
    }
    catch(e: Exception){
        println("Ошибка ввода!\nДля корректной работы введите число > 0!")
        return intValidateAboveZero(message)
    }
    return int
}