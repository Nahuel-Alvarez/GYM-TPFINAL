package com.example.tp1alvarez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Bienvenida : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenida)

        //RECIBO LOS DATOS DEL SOCIO QUE ENVIÉ DESDE LA ACTIVITY LOGIN
        var bundle = intent.extras

        //CREO OBJETO DE LA DATA CLASS
        var tarifasSoc = TarifasSocios()

        //BOTONES DE MENÚ
        var infoPersonal = findViewById<Button>(R.id.btnInfoPersonal)
        var disciplinasBronce = findViewById<Button>(R.id.btnDisBronce)
        var disciplinasPlati = findViewById<Button>(R.id.btnDisPlatinum)


        //LAS 3 OPCIONES DE CAMBIO DE ACTIVITY

        //MUESTRA ACTIVIDAD PARA SOCIO BRONCE

        disciplinasBronce.setOnClickListener(){
            //CREO OBJETO DE LA DATACLASS
            var disNatacion = Disciplina("Natación","15:30 a 17:00","Lunes y Miércoles")
            var intent = Intent(this,DisciplinasBronce::class.java)

            intent.putExtra("disciplina",disNatacion)
            intent.putExtra("tarifaBronce", tarifasSoc)
            startActivity(intent)
        }


        //MUESTRA ACTIVIDAD PARA SOCIO PLATINUM
        disciplinasPlati.setOnClickListener(){
            //CREO OBJETO DE LA DATACLASS
            var disBoxeo = Disciplina("Boxeo","10:00 a 12:00","Viernes")
            var intent = Intent(this,DisciplinasPlatinum::class.java)

            intent.putExtra("disciplina",disBoxeo)
            intent.putExtra("tarifaPlatinum", tarifasSoc)
            startActivity(intent)

        }


        //MUESTRA LA INFORMACIÓN DEL SOCIO
        infoPersonal.setOnClickListener(){
            var intent = Intent(this,InformacionSocio::class.java)

            var b : Bundle =  Bundle()

            b.putString("dni",bundle?.getString("dni"))
            b.putString("nombre",bundle?.getString("nombre"))
            b.putString("nacimiento",bundle?.getString("nacimiento"))
            b.putString("socionumero",bundle?.getString("socionumero"))
            intent.putExtras(b)

            startActivity(intent)

        }

    }
}