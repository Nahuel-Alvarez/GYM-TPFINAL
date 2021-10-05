package com.example.tp1alvarez

class Empleado {
    var nombre :String = ""
    var objTarifas : TarifasSocios = TarifasSocios() //Composición
    companion object { //Declaración de variable static de Java. Con el companion object se puede declarar dentro, la cantidad de variables y métodos que uno quiera que sean estáticos
        var numIncremental : Int = 0
    }
    var dni :  String = ""
        get() = field
        set(value) {
            if(CheckDni(value)){
                field = value
            }
        }
    var fecContrato : String = ""
    var numLegajo : Int = 0


    constructor(nombre : String, dni : String, fecContrato : String){

        this.nombre = nombre
        this.dni = dni
        this.fecContrato = fecContrato
        this.numLegajo = CalcularNumLegajo() // Asigna el valor de la variable estática ya incrementada
    }
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

    fun CalcularNumLegajo(): Int { //Aumenta el Número de Socio a la variable estática del companion Object
        return numIncremental++
    }


    fun CalcularCobranza(objSocPlati : SocioPlatinum, impRecibido : Int){ //SobreCarga de Métodos para Calcular el cobro, si hay vuelto, a un socio Platinum
        var impRecibido = impRecibido
        var tarPlati = objTarifas.tarifaPlatinum

        println(" Recibo suma: " + impRecibido)
        while(impRecibido < tarPlati){
            println("Disculpe señor/a pero le faltaría abonar : $ " + (tarPlati - impRecibido))
            println("Ingrese lo que falta ")
            val dinero = readLine()!!.toInt()
            impRecibido += dinero
        }
        if(impRecibido > tarPlati){
            println("Su vuelto es: $ " + (impRecibido-tarPlati))
        }else{
            println("Perfecto, fueron cobrados " +tarPlati + " Muchas gracias" )
        }

    }

    fun CalcularCobranza(obSocBronce : SocioBronce, impRecibido : Int){ //SobreCarga de Métodos para Calcular el cobro, si hay vuelto,  a un socio Bronce
        var impRecibido = impRecibido
        var tarBronce= objTarifas.tarifaBronce

        println(" Recibo suma: " + impRecibido)
        while(impRecibido < tarBronce){
            println("Disculpe señor/a pero le faltaría abonar : $ " + (tarBronce - impRecibido))
            println("Ingrese lo que falta ")
            val dinero = readLine()!!.toInt()
            impRecibido += dinero
        }
        if(impRecibido > tarBronce){
            println("Su vuelto es: $ " + (impRecibido-tarBronce))
        }else{
            println("Perfecto, fueron cobrados " +tarBronce + " Muchas gracias" )
        }
    }
    fun CobrarCuotaSocio( objGym : Gimnasio ){//COBRA CUOTA, EL VALOR DEPENDE DEL TIPO DE SOCIO -- 1 para Platinum ; 2  para Bronce
        println("SECTOR DE COBRANZA")
        println("Soy ${nombre} ")
        print(" Para poder cobrarte Ingresá tu DNI: ")
        var dniIngr = readLine()!!
        println("Presione 1 si es Platinum o 2 si es Bronce")
        var tipoSoc = readLine()!!.toInt()

        if( tipoSoc == 1 ){
            val socioEncontrado = objGym.BuscarSocioPlatinum( dniIngr  )//Busca si Existe un socio Platinum con ese DNI

            if(socioEncontrado.dni != "") {
                CalcularCobranza(socioEncontrado, socioEncontrado.PagarCuota())//METODO QUE REALIZA LA OPERACIÓN DE COBRAR, VUELTO
            }else{
                println("DNI INCORRECTO")
            }
        } else if(tipoSoc == 2){
            val socioEncontrado = objGym.BuscarSocioBronce( dniIngr  )//Busca si Existe un socio Bronce con ese DNI
            if (socioEncontrado.dni != ""){
                CalcularCobranza(socioEncontrado, socioEncontrado.PagarCuota())//METODO QUE REALIZA LA OPERACIÓN DE COBRAR, VUELTO
            }else{
                println("DNI INCORRECTO")
            }
        } else{
            println("No ingresó una opción válida!!")
        }

    }

    override fun toString(): String {
        return "Nombre : $nombre , N° De Dni : $dni , Fecha de Contrato : $fecContrato , N° de Legajo : $numLegajo"
    }

}
