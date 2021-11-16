package com.example.tp1alvarez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class DisciplinasBronce : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_disciplinas_bronce)


        //RECIBO EL OBJETO DE LA DATA CLASS DISCIPLINA QUE IMPLEMENTA PARCELABLE
        var objDisciplina = intent.getParcelableExtra<Disciplina>("disciplina")


        //RECIBO EL OBJETO DE LA DATA CLASS TARIFASSOCIOS QUE IMPLEMENTA PARCELABLE
        var objTarifa = intent.getParcelableExtra<TarifasSocios>("tarifaBronce")



        var tvNombreDis = findViewById<TextView>(R.id.tvNombreDis)
        var tvHorarioDis = findViewById<TextView>(R.id.tvHorarioDis)
        var tvTarifaBron= findViewById<TextView>(R.id.tvTarifaBronce)
        var tvDiaBron= findViewById<TextView>(R.id.tvDiaBronce)


        //ASIGNO LA INFORMACIÓN QUE TRAIGO DEL OBJETO DE LAS DATA CLASS
        tvNombreDis.text = objDisciplina?.nombre.toString()
        tvHorarioDis.text = objDisciplina?.horario.toString()
        tvTarifaBron.text = "Precio: $" + objTarifa?.tarifaBronce.toString()
        tvDiaBron.text = "Días : " + objDisciplina?.dia.toString()


    }
}