fun main() {
    var opcion: Int? = null
    do {
        println("Calculadora de áreas. Ingresa una opción: \n1. Cuadrado \n2. Círculo \n3. Triángulo \n4. Salir")
        opcion = readLine()?.toIntOrNull()

        if (opcion == null || opcion !in 1..4) {
            println("Opción no encontarda. Ingrese un valor correcto.")
            continue
        }

        when (opcion) {
            1 -> {
                println("Ingrese el lado del cuadrado:")
                val lado = leerDouble("lado del cuadrado")
                if (lado != null) {
                    println("El área del cuadrado es: ${areaCuadrado(lado)}")
                }
            }
            2 -> {
                println("Ingrese el radio del circuloo:")
                val radio = leerDouble("radio del círculo")
                if (radio != null) {
                    println("El área del círculo es: ${areaCirculo(radio)}")
                }
            }
            3 -> {
                println("Ingrese la base del triángulo:")
                val base = leerDouble("base del triángulo")
                println("Ingrese la altura del triángulo:")
                val altura = leerDouble("altura del triángulo")
                if (base != null && altura != null) {
                    println("El area del triangulo es: ${areaTriangulo(base, altura)}")
                }
            }
            4 -> {
                println("SAliendo de la calculadora.")
            }
        }
    } while (opcion != 4)
}


fun areaCuadrado(lado: Double): Double {
    return lado * lado
}

fun areaCirculo(radio: Double): Double {
    return Math.PI * radio * radio
}

fun areaTriangulo(base: Double, altura: Double): Double {
    return (base * altura) / 2
}


fun leerDouble(mensaje: String): Double? {
    var valor: Double? = null
    while (valor == null) {
        val input = readLine()?.toDoubleOrNull()
        if (input != null && input > 0) {
            valor = input
        } else {
            println("Ingresa un valor válido en  $mensaje .")
        }
    }
    return valor
}