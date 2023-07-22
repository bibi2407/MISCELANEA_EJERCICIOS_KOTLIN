import kotlin.math.pow

fun main() {
    var optionM = ""
    println("MENU PRINCIPAL \n 1. Operadores \n 2. Condicionales \n 3. Ciclos \n Por favor seleccione una opcion: ")

    optionM = readln()

    when (optionM) {
        "1" -> println("${operadores()}")
        "2" -> println("${condicionales()}")
        "3" -> println("${ciclos()}")
        else -> println("WTF?")
    }

}//end main

fun operadores() {
    var optionOp = ""
    println(" MENU OPERADORES \n 1. Calcular Area del triangulo \n 2. Ingresar dos números por teclado y sumarlos. \n 3. Ingresar un número y visualizar el número elevado al cuadrado. \n 4. Escribir un algoritmo que convierta de euros a dólares. \n 5. Escribir un algoritmo que pida el lado de un cuadrado y muestre el valor del área y del perímetro. \n 6. Escribir un algoritmo que determine el área y el volúmen de un cilindro.\n 7. Realizar un algoritmo que lea el radio de una circunferencia y escriba la longitud de la misma y el área (pi*r)^2 del círculo inscrito.\n 8. Calcular el promedio de tres (3) números ingresados por teclado.\n 9.Menu principal")

    println("Por favor seleccione una opcion: ")

    optionOp = readln()

    when (optionOp) {
        "1" -> println("${triangle()}")
        "2" -> println("${addition()}")
        "3" -> println("${elevated()}")
        "4" -> println("${converter()}")
        "5" -> println("${square()}")
        "6" -> println("${cylinder()}")
        "7" -> println("${algorithm()}")
        "8" -> println("${average()}")
        "9" -> println("${main()}")
        else -> println("WTF?")
    }

}

fun condicionales() {
    var optionCon = ""
    println("MENU CONDICIONALES \n 1. Escribir un algoritmo para saber si el número ingresado por teclado es positivo o negativo \n 2. Escribir un algoritmo que reciba dos números por teclado y diga cuál es el mayor y cuál el menor.\n 3. Escriba un programa que lea tres números enteros positivos y que calcule e imprima en pantalla el menor y el mayor de ellos.\n 4. Dados dos números A y B, sumarlos si A es menor que B o sino restarlos.\n 5. Dados dos números A y B encontrar el cociente entre A y B. Recordar que la división por cero no está definida, en ese caso debe aparecer una leyenda anunciando que la división no es posible.\n 6. Dados dos números A y B, sumarlos si al menos uno de ellos es negativo, en caso contrario multiplicarlos \n 7. Escribir un algoritmo que determine si un año es bisiesto o no.\n 8.Menu principal")

    println("Por favor seleccione una opcion: ")

    optionCon = readln()

    when (optionCon) {
        "1" -> println("${positive()}")
        "2" -> println("${greaterOrLess()}")
        "3" -> println("${number()}")
        "4" -> println("${exercise()}")
        "5" -> println("${quotient()}")
        "6" -> println("${multiplication()}")
        "7" -> println("${leapYear()}")
        "8" -> println("${main()}")
        else -> println("WTF?")
    }

}

fun ciclos() {
    var optionCi = ""
    println("MENU CICLOS \n 1. Imprimir todos los múltiplos de 3 que hay entre 1 y 100.\n 2. Imprimir los números impares entre 0 y 100.\n 3. Imprimir los números pares del 1 al 100.\n 4. Escribir un programa que imprima por pantalla los cuadrados de los números del 1 al 30.\n 5. Escribir un programa que sume los cuadrados de los cien primeros números naturales,mostrando el resultado en pantalla.\n 6. Dados dos números naturales, el primero menor que el segundo, generar y mostrar todos los números comprendidos entre ellos en secuencia ascendente.\n 7. Sumar todos los números que se digitan por teclado mientras no sea cero \n 8. Menu principal")

    println("Por favor seleccione una opcion: ")

    optionCi = readln()

    when (optionCi) {
        "1" -> println("${multiples()}")
        "2" -> println("${odd()}")
        "3" -> println("${peers()}")
        "4" -> println("${squares()}")
        "5" -> println("${naturalNumbers()}")
        "6" -> println("${(upward())}")
        "7" -> println("${(numbers())}")
        "8" -> println("${main()}")
        else -> println("WTF?")
    }

}

fun operatorsMenu(){
    var optionMe= ""
    println("MENU DE REGRESO \n 1. Menu Principal. \n 2. Menu Operadores")
    println("Por favor seleccione una opción: ")
    optionMe= readln()

    when (optionMe){
        "1" -> println("${main()}")
        "2" -> println("${operadores()}")
        else -> println("WTF?")
    }
}

fun conditionalsMenu(){
    var optionC= ""
    println("MENU DE REGRESO \n 1. Menu Principal. \n 2. Menu Condicionales")
    println("Por favor seleccione una opción: ")
    optionC= readln()

    when (optionC){
        "1" -> println("${main()}")
        "2" -> println("${condicionales()}")
        else -> println("WTF?")
    }
}

fun cycleMenu(){
    var optionCy= ""
    println("MENU DE REGRESO \n 1. Menu Principal. \n 2. Menu Ciclos")
    println("Por favor seleccione una opción: ")
    optionCy= readln()

    when (optionCy){
        "1" -> println("${main()}")
        "2" -> println("${ciclos()}")
        else -> println("WTF?")
    }
}


fun triangle() {
    println("EJERCICIO N°1 (operadores)")
    println("Digite a la base")
    val base = readln().toInt()
    println("Digite la altura")
    val height = readln().toInt()
    val area = (base * height) / 2
    println("El area es: $area")
    println()
    println("${operatorsMenu()}")

}

fun addition() {
    println("EJERCICIO N°2 (operadores)")
    println("Por favor digite el primer número: ")
    val number1 = readln().toInt()
    println("Por favor ingrese el segundo número: ")
    val number2 = readln().toInt()
    val addition = number1 + number2
    println("La suma de los digitos ingresados es: $addition")
    println()
    println("${operatorsMenu()}")
}

fun elevated() {
    println("EJERCICIO N°3 (operadores)")
    println("Por favor digite el número: ")
    val number = readln().toInt()
    var power = number.toDouble().pow(2)
    println("El resultado de $number ^ 2 es: $power")
    println()
    println("${operatorsMenu()}")
}

fun converter() {
    println("EJERCICIO N°4 (operadores)")
    println("Por favor digite el numero que desea convertir de euros a dolares: ")
    val euro = readln().toInt()
    val dollars = euro * 1.11270
    println("La conversion de $euro euros son: $dollars dolares")
    println()
    println("${operatorsMenu()}")
}

fun square() {
    println("EJERCICIO N°5 (operadores)")
    println("Por favor digite el lado del cuadrado: ")
    val side = readln().toInt()
    val area = side * side
    val perimeter = 4 * side
    println("El área del cuadrado es: $area cm2")
    println("El perímetro del cuadrado es: $perimeter cm")
    println()
    println("${operatorsMenu()}")
}

fun cylinder() {
    println("EJERCICIO N°6 (operadores)")
    println("Por favor digite la radio de su cilindro: ")
    val radius = readln().toInt()
    println("Por favor digite la altura de su cilindro: ")
    val height = readln().toInt()
    val area = 2 * 3.1416 * radius * (radius + height)
    val volume = 3.1416 * height * radius.toDouble().pow(2)
    println("El área del cilindro es: $area cm2")
    println("El volumen del cilindro es: $volume ")
    println()
    println("${operatorsMenu()}")
}

fun algorithm() {
    println("EJERCICIO N°7 (operadores)")
    println("Por favor digite el radio de la circunferencia: ")
    val radious = readln().toInt()
    val length = 2 * 3.1416 * radious
    val area = 3.1416 * radious.toDouble().pow(2)
    println("La longitud de la circunferencia segun la radio que de $radious es: $length")
    println("El área del circulo es: $area")
    println()
    println("${operatorsMenu()}")
}

fun average() {
    println("EJERCICIO N°8 (operadores)")
    println("Por favor digite el primer digito: ")
    val number1 = readln().toInt()
    println("Por favor digite el segundo digito: ")
    val number2 = readln().toInt()
    println("Por favor digite el tercer  digito: ")
    val number3 = readln().toInt()
    val average = (number1 + number2 + number3) / 3
    println("El promedio de los números $number1,$number2,$number3 es: $average ")
    println()
    println("${operatorsMenu()}")
}

fun positive() {
    println("EJERCICIO N°1 (condicionales)")
    println("Por favor digíte un número: ")
    val number = readln().toInt()

    if (number >= 0) {
        println("El número ingresado $number es positivo")
    } else if (number < 0) {
        println("El número ingresado $number es negativo")
    }
    println()
    println("${conditionalsMenu()}")
}

fun greaterOrLess() {
    println("EJERCICIO N°2 (condicionales)")
    println("Por favor digite el primer número: ")
    val option1 = readln().toInt()
    println("Por favor digite el segundo número: ")
    val option2 = readln().toInt()

    if (option1 > option2) {
        println("El numero $option1 es mayor y el número $option2 es menor ")
    } else if (option1 < option2) {
        println("El numero $option2 es mayor y el número $option1 es menor ")
    } else {
        println("Los numeros son iguales")
    }
    println()
    println("${conditionalsMenu()}")
}

fun number() {
    println("EJERCICIO N°3 (condicionales)")
    println("Por favor digite el primer numero positivo: ")
    val number1 = readln().toInt()
    println("Por favor digite el segundo numero positivo: ")
    val number2 = readln().toInt()
    println("Por favor digite el tercer numero positivo: ")
    val number3 = readln().toInt()

    if (number1 > 0 && number2 > 0 && number3 > 0) {
        val greater = maxOf(number1, number2, number3)
        val less = minOf(number1, number2, number3)

        println("El mayor de los número ingresados es: $greater y el menor es: $less")
    } else {
        println("Los números ingresados no son positivos")
    }
    println()
    println("${conditionalsMenu()}")
}

fun exercise() {
    println("EJERCICIO N°4 (condicionales)")
    println("Por favor digite el valor de A: ")
    val a = readln().toInt()
    println("Por favor digite el valor de B: ")
    val b = readln().toInt()

    if (a < b) {
        val addition = a + b
        println("El resultado de la suma es: $addition")
    } else if (a > b) {
        val subtraction = a - b
        println("El resultado de la resta es: $subtraction")
    } else {
        println("Los numeros son iguales")
    }
    println()
    println("${conditionalsMenu()}")
}

fun quotient() {
    println("EJERCICIO N°5 (condicionales)")
    println("Por favor digite el valor de A: ")
    val dividend = readln().toInt()
    println("Por favor digite el valor de B: ")
    val divider = readln().toInt()

    if (dividend > 0 && divider > 0) {
        val division = dividend / divider
        println("El cociente entre los numeros A=$dividend y B=$divider es: $division")
    } else {
        println("La division no se puede realizar")
    }
    println()
    println("${conditionalsMenu()}")
}

fun multiplication() {
    println("EJERCICIO N°6 (condicionales)")
    println("Por favor digite el valor de A: ")
    val number1 = readln().toInt()
    println("Por favor digite el valor de B: ")
    val number2 = readln().toInt()

    if (number1 < 0 || number2 < 0) {
        val addition = number1 + number2
        println("La suma de A=$number1 y B=$number2 es: $addition")
    } else {
        val multiplication = number1 * number2
        println("La multiplicación de A=$number1 y B=$number2 es: $multiplication ")
    }
    println()
    println("${conditionalsMenu()}")
}

fun years(year:Int):Boolean {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)

}

fun leapYear(){
    println("EJERCICIO N°7 (condicionales)")
    println("Por favor digite el año: ")
    val year = readln().toInt()

    if (year != null){
        if (years(year)){
            println("El año $year es BISIESTO")
        }else{
            println("El año $year NO ES BISIESTO ")
        }
    }
    println()
    println("${conditionalsMenu()}")
}

fun multiples(){
    println("EJERCICIO N°1 (ciclos)")
    println("Multiplos de 3 en un rango de 1 a 100")

    for (numbers in 1..100){
        if (numbers % 3 ==0){
            println(numbers)
        }
    }
    println()
    println("${cycleMenu()}")
}

fun odd(){
    println("EJERCICIO N°2 (ciclos)")
    println("Números impares entre 0 a 100")

    for (number in 0 .. 100){
        if (number % 2 != 0){
            println(number)
        }
    }
    println()
    println("${cycleMenu()}")
}
fun peers(){
    println("EJERCICIO N°3 (ciclos)")
    println("Números pares del 1 a 100")

    for (number in 1 .. 100){
        if (number % 2 == 0){
            println(number)
        }
    }
    println()
    println("${cycleMenu()}")
}

fun squares(){
    println("EJERCICIO N°4 (ciclos)")
    println("Cuadrados de los números del 1 al 30")

    for (i in 1..30){
        val square = i * i
        println("El cuadrado de $i es: $square")
    }
    println()
    println("${cycleMenu()}")
}

fun naturalNumbers(){
    println("EJERCICIO N°5 (ciclos)")
    var sumSquare = 0
    for (j in 1..100){
        val squaredNumbers = j * j
        sumSquare+=squaredNumbers
    }
    println("La suma de los cien primeros numeros naturales es: $sumSquare ")
    println()
    println("${cycleMenu()}")
}

fun upward(){
    println("EJERCICIO N°6 (ciclos)")
    println("Por favor digite el pimer número natural: ")
    val firstNumber = readln().toInt()
    println("Por favor digite el segundo número natural (Debe ser mayor que el primer digito): ")
    val secondNumber = readln().toInt()
    if (firstNumber > 0 && secondNumber >0 && firstNumber < secondNumber){
        println("Números comprendidos entre ellos en secuencia ascendente")
        for (b in firstNumber..secondNumber){
            println(b)
        }
    }else{
        println("¡Debe ingresar el primer digito menor que el segundo digito!")
    }
    println()
    println("${cycleMenu()}")
}

fun numbers(){
    println("EJERCICIO N°7 (ciclos")
    println("Por favor digite el número: ")
    var addition = 0

    while (true){
        var num = readln().toInt()
        if (num == 0){
            break
        }
        addition+=num
    }
    println("La suma de los números es: $addition")
    println()
    println("${cycleMenu()}")
}