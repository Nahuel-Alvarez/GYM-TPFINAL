package com.example.tp1alvarez

class SocioPlatinum() : Socio(nombre = "",dni = "",fechaNac = "") {

    companion object { //Declaración de variable static de Java. Con el companion object se puede declarar dentro, la cantidad de variables y métodos que uno quiera que sean estáticos
        var numIncremental: Int = 1
    }
    var contrasenia : String = ""
    var numSocioPlati: Int = 0

    constructor(nombre: String, dni: String, fechaNac: String, contrasenia :String) : this() {
        this.numSocioPlati = CalcularNumSocio()
        this.nombre = nombre
        this.dni = dni
        this.fechaNac = fechaNac
        this.contrasenia = contrasenia
    }


    fun CalcularNumSocio(): Int {//Aumenta el Número de Socio a la variable estática del companion Object

        return numIncremental++
    }

    override fun PagarCuota () : Int { //SOBREESCRITURA DEL MÉTODO ABSTRACTO
        val tarifa = TarifasSocios().tarifaPlatinum
        println("${this.nombre}| N° SOCIO ${this.numSocioPlati}| DNI ${this.dni} ")
        println(" Su importe a pagar es: $ $tarifa")
        println(" Con cuanto va a abonar? ")
        val dinero = readLine()!!.toInt()
        return dinero
    }

    override fun ListarClases() {//SOBREESCRITURA DEL MÉTODO ABSTRACTO
        println("Por ser socio Platinum, podrás asistir a estas clases las veces que quieras")
        println("Boxeo 15:30 16:30 17:30")
        println("Natación 9:30 11:30  15:00")
        println("Funcional 10:45 15:45 17:45")
        println("Spinning 7:00 8:00")

    }

    override fun toString(): String {

        return super.toString() + " numSocioPlati : $numSocioPlati)"
    }


}