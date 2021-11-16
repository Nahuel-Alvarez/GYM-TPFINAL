package com.example.tp1alvarez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var socioPlat = SocioPlatinum("Lionel Messi","39123456","24/11/1978","password123")

        var ingresar = findViewById<Button>(R.id.btnIngresar)

        var dni = findViewById<EditText>(R.id.etDni)

        var contrasenia = findViewById<EditText>(R.id.etConrtaseña)


        ingresar.setOnClickListener() {
            var dniConvert = dni.text.toString()
            var contraConv = contrasenia.text.toString()

            Log.d("VALIDACION", dniConvert)
            Log.d("VALIDACION", contraConv)

            //COMPRUEBO LOGIN
            if(socioPlat.dni == dniConvert && socioPlat.contrasenia == contraConv ) {
                var intent = Intent(this, Bienvenida::class.java)

                var b: Bundle = Bundle()

                //MANDO LOS DATOS DEL SOCIO EN UN BUNDLE
                b.putString("dni", dni.text.toString())
                b.putString("nombre", socioPlat.nombre)
                b.putString("nacimiento", socioPlat.fechaNac)
                b.putString("socionumero", socioPlat.numSocioPlati.toString())
                intent.putExtras(b)

                startActivity(intent)
            }
        }
    }
}