package com.example.tp1alvarez

class Gimnasio {

    var nombre : String
    var CUIT : String

    var direccion : String
    var listEmpleados : ArrayList<Empleado> = ArrayList() // Composición

    var listSociosPlatinum : ArrayList <SocioPlatinum> = ArrayList()// Composición
    var listSociosBronce : ArrayList <SocioBronce> = ArrayList() // Composición

    constructor(nombre: String, CUIT: String, direccion: String) {
        this.nombre = nombre
        this.CUIT = CUIT
        this.direccion = direccion
    }
    constructor(nombre: String, CUIT: String, direccion: String, listSociosPlat : ArrayList <SocioPlatinum>, listSociosBron : ArrayList <SocioBronce>) { //Sobre-Carga de Constructor
        this.nombre = nombre
        this.CUIT = CUIT
        this.direccion = direccion
        this.listSociosPlatinum = listSociosPlat
        this.listSociosBronce = listSociosBron
    }

    override fun toString(): String {
        return "Gimnasio : $nombre  CUIT: $CUIT Direccion : $direccion"
    }

    fun MostrarEmpleados(){//MÉTODO PARA MOSTRAR LA INFORMACIÓN DE LOS EMPLEADOS
        for ( empleado in listEmpleados.indices ){
            println(listEmpleados[empleado])//Uso de toString()
        }

    }
    fun InformeSociosPlatinum(){//MÉTODO PARA MOSTRAR LA INFORMACIÓN DE LOS SOCIOS PLATINUM
        for ( socPlati in listSociosPlatinum.indices ){
            println(listSociosPlatinum[socPlati])//Uso de toString()
        }
    }
    fun InformeSociosBronce(){//MÉTODO PARA MOSTRAR LA INFORMACIÓN DE LOS SOCIOS BRONCE
        for ( socBronce in listSociosBronce.indices ){
            println(listSociosBronce[socBronce])//Uso de toString()
        }
    }

    fun BuscarSocioPlatinum( dniSocio : String ) : SocioPlatinum{ //REALIZA BÚSQUEDA DE SOCIO PLATI POR DNI Y LO RETORNA
        var socPlatiCheck : SocioPlatinum = SocioPlatinum()
        for (socPlati in listSociosPlatinum.iterator() ){

            if(dniSocio == socPlati.dni){
                socPlatiCheck = socPlati
            }
        }
        return socPlatiCheck
    }

    fun BuscarSocioBronce( dniSocio: String): SocioBronce { //REALIZA BÚSQUEDA DE SOCIO BRONCE POR DNI Y LO RETORNA
        var socBronceCheck : SocioBronce = SocioBronce()
        for ( socBronce in listSociosBronce.iterator() ){

            if(dniSocio == socBronce.dni){
                socBronceCheck = socBronce
            }
        }
        return socBronceCheck
    }

}