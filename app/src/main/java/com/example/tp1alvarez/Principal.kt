package com.example.tp1alvarez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class Principal : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)


        var nombreGym = findViewById<TextView>(R.id.tvNombreGym)
        var direccionGym = findViewById<TextView>(R.id.tvDireccionGym)
        var login = findViewById<Button>(R.id.btnLogin)


        //INSTANCIO OBJETO DE LA CLASE GIMNASIO
        val objGym = Gimnasio("GIMNASIO LINAO","14-45123987-4","Necochea 520 CABA")

        nombreGym.text = objGym.nombre
        direccionGym.text = objGym.direccion


        login.setOnClickListener(){
            var intent = Intent(this,Login::class.java)

            startActivity(intent)

        }


    }
}


