class Persona {
    var nombre: String=""
    var edad: Int=0

    fun incializar(_nombre: String, _edad: Int){ //metodo 1
        this.nombre=_nombre;
        this.edad = _edad;
    }
    fun imprimir(){ //metodo 2
        println("Nombre: $nombre \n Edad: $edad años")
    }

    fun mostrarMayorEdad(){ //metodo 3
        if(edad>=18){
            println("Es Mayor de Edad $nombre")
        }else{
            println("Es Menor de Edad $nombre")
        }
    }

}