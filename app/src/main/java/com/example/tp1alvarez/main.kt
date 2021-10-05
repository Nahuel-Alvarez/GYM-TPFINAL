package com.example.tp1alvarez

fun main () {

    fun menu() :Int {

        println(" 1- MOSTRAR EMPLEADOS")
        println(" 2- INFORME SOCIOS PLATINUM")
        println(" 3- INFORME SOCIOS BRONCE")
        println(" 4- COBRAR CUOTA SOCIO")
        println(" 5- MOSTRAR LISTADO DE CLASES")
        println(" 6- SALIR")
        return readLine()?.toInt() as Int
    }

    fun MostrarClases(socio : Socio){//Dependiendo del tipo de Socio que ingrese por parametro, ejecutará el método de la clase
        //socioPlatinum() o de la clase socioBronce()

        socio.ListarClases()//El Parámetro al estar definido de tipo "Socio" puede ser cualquier objeto de sus clases hijas, actúa de manera polimorfica
    }


    val objGym = Gimnasio("Catalinas-Sur","14-45123987-4","Necochea 400")//Instancia de Gimmnasio()

    var listEmpleados : ArrayList<Empleado> = ArrayList()

    var objEmpleado1 = Empleado("Yolanda","35123456","8/4/2018")
    var objEmpleado2 = Empleado("Mati","42923456","13/9/2021")


    objEmpleado2.dni="54655456"
    objEmpleado2.dni="546554652"

    listEmpleados.add(objEmpleado1)
    listEmpleados.add(objEmpleado2)


    var listSociosPlati : ArrayList<SocioPlatinum> = ArrayList()

    var objsocioPlati = SocioPlatinum("Yoel","42043591","30/9/1999")
    var objsocioPlati2 = SocioPlatinum("Agustina","390145875","5/6/1996")

    listSociosPlati.add(objsocioPlati)
    listSociosPlati.add(objsocioPlati2)


    var listSociosBronce : ArrayList<SocioBronce> = ArrayList()

    var objsocioBronce = SocioBronce("Yamil","37375468","25/3/1993")
    var objsocioBronce2 = SocioBronce("Catalina","40053872","4/6/1998")

    listSociosBronce.add(objsocioBronce)
    listSociosBronce.add(objsocioBronce2)

    objGym.listEmpleados= listEmpleados
    objGym.listSociosPlatinum =listSociosPlati
    objGym.listSociosBronce =listSociosBronce

    var opcion=0
    println(objGym)
    while (opcion != 6) {

        opcion = menu()
        when (opcion) {
            1 -> {
                objGym.MostrarEmpleados()
            }
            2 -> {
                objGym.InformeSociosPlatinum()
            }
            3 -> {
                objGym.InformeSociosBronce()
            }
            4 -> {
                objEmpleado1.CobrarCuotaSocio(objGym)
            }
            5 -> {
                println("Presione 1 para Platinum o 2 para Bronce")
                var tipoS = readLine()!!.toInt()
                if (tipoS == 1){
                    MostrarClases(objsocioPlati)
                }else if (tipoS == 2){
                    MostrarClases(objsocioBronce)
                }else{
                    println("Opción Inválida")
                }

            }
            6 -> {
                println(" HASTA LA PROXIMA ")
            }
        }
    }

}


