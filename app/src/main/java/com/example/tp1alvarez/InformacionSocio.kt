package com.example.tp1alvarez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class InformacionSocio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informacion_socio)

        //TRAIGO LOS DATOS QUE ENVIÉ DESDE LA ACTIVITY BIENVENIDA Y QUE ANTERIORMENTE VENIAN DE LOGIN Y LOS MUESTRO
        var bundle = intent.extras


        //NOMBRE SOCIO
        var nombreUser = findViewById<TextView>(R.id.tvNombreSocio)
        var nombre = "Nombre: " + bundle?.getString("nombre") // bundle?.getString("dni") + bundle?.getString("nacimiento") +

        nombreUser.text = nombre


        //NUMERO DE DOCUMENTO SOCIO
        var dniUser = findViewById<TextView>(R.id.tvDniSocio)
        var dni = "Número de Documento: " + bundle?.getString("dni") // bundle?.getString("dni") + bundle?.getString("nacimiento") +

        dniUser.text = dni


        //FECHA DE NACIMIENTO SOCIO
        var fecNacUser = findViewById<TextView>(R.id.tvNacimientoSocio)
        var fecNac = "Fecha Nacimiento: " + bundle?.getString("nacimiento") // bundle?.getString("dni") + bundle?.getString("nacimiento") +

        fecNacUser.text = fecNac


        //NUMERO DE SOCIO
        var numeroUser = findViewById<TextView>(R.id.tvNumeroSocio)
        var numero = "Número de Socio: " + bundle?.getString("socionumero") // bundle?.getString("dni") + bundle?.getString("nacimiento") +

        numeroUser.text = numero

    }
}