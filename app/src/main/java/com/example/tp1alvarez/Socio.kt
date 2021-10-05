package com.example.tp1alvarez

import java.util.*

abstract class Socio {//CLASE ABSTRACTA. Son clases de las que nunca se instancearan  objetos. Una clase abstracta es incompleta o inútil sin algunas subclases concretas (no abstractas),
    //desde las cuales puede instanciar objetos. Una subclase concreta de una clase abstracta implementa todos los métodos y propiedades definidas en la clase abstracta padre. Sirve de modelo y guia
    //para saber que se debe implementar.

    var nombre : String
    var dni :  String
        get() = field
        set(value) {
            if(CheckDni(value)){
                field = value
            }
        }
    var fechaNac : String //Se podría verificar que sea mayor de 16


    constructor(nombre: String, dni: String, fechaNac: String) {
        this.nombre = nombre
        this.dni = dni
        this.fechaNac = fechaNac
    }
    abstract fun PagarCuota () : Int //MÉTODO QUE RETORNE EL VALOR QUE ABONA

    abstract fun ListarClases() //MÉTODO QUE MUESTRE LAS DIFERENTES OPCIONES DE CLASES A TOMAR

    fun CheckDni(dni : String) : Boolean{ //Método para chequear la longitud del dni antes de asignarlo a la variable de instancia
        var check : Boolean
        if(dni.length > 9){
            println("El dni es demasiado extenso")
            check = false
        }else{
            check = true
        }
        return check
    }

    override fun toString(): String {
        return "Nombre : $nombre , N° De Dni : $dni , Fecha de Nacimiento : $fechaNac "
    }


}