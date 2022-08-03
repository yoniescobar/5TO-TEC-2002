class Triangulo {
    var lado1: Int =0
    var lado2: Int =0
    var lado3: Int =0

    fun inicializar(){
        print("Ingrese el lado 1: ")
        lado1 = readLine()!!.toInt()  //5
        print("Ingrese el lado 2: ")
        lado2 = readLine()!!.toInt()   //2
        print("Ingrese el lado 3: ")
        lado3 = readLine()!!.toInt()   //1

    }
    fun ladoMayor(){
        print("Lado Mayor del Triangulo: ")
        if(lado1>lado2 && lado1>lado3){
            print(lado1)
        }else if(lado2>lado1 && lado2>lado3){
            print(lado2)
        }else if(lado3>lado1 && lado3>lado2){
            print(lado3)
        }else{
            print("Todos los lados son Iguales")
        }

    }
    fun esEquilatero(){
        if(lado1==lado2 && lado1==lado3)
            println("\nEs un Triángulo Equilátero")
        else
            println("\nNo es un triangulo equilatero")
    }

}