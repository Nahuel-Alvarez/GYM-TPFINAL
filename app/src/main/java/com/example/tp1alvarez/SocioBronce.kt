package com.example.tp1alvarez

class SocioBronce () : Socio(nombre = "",dni = "",fechaNac = ""){

    companion object { //Declaración de variable static de Java. Con el companion object se puede declarar dentro, la cantidad de variables y métodos que uno quiera que sean estáticos
        var numIncremental : Int = 0
    }
    var numSocioBronce : Int = 0

    constructor( nombre : String, dni : String , fechaNac : String) : this(){
        this.numSocioBronce = AumentarNumSocio()
        this.nombre = nombre
        this.dni = dni
        this.fechaNac = fechaNac
    }

    fun AumentarNumSocio(): Int {//Aumenta el Número de Socio a la variable estática del companion Object
        return numIncremental++
    }

    override fun PagarCuota() : Int {//SOBREESCRITURA DEL MÉTODO ABSTRACTO
        val tarifa = TarifasSocios().tarifaBronce

        println("${this.nombre}| N° SOCIO ${this.numSocioBronce}| DNI ${this.dni} ")
        println(" Su importe a pagar es: $ $tarifa")
        println(" Con cuanto va a abonar? ")
        val dinero = readLine()!!.toInt()
        return dinero
    }

     override fun ListarClases() {//SOBREESCRITURA DEL MÉTODO ABSTRACTO
        println("Además de contar con todas las máquinas, por ser Socio Bronce podrás optar por dos clases por semana de las siguientes actividades")
        println("Boxeo 15:30 16:30 17:30")
        println("Funcional 10:45 15:45 17:45")

    }

    override fun toString(): String {
        return super.toString()+ " numSocioBronce : $numSocioBronce)"
    }


}