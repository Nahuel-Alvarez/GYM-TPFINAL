package com.example.tp1alvarez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisciplinasPlatinum : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_disciplinas_platinum)

        //RECIBO EL OBJETO DE LA DATA CLASS DISCIPLINA QUE IMPLEMENTA PARCELABLE

        var objDisciplina = intent.getParcelableExtra<Disciplina>("disciplina")


        //RECIBO EL OBJETO DE LA DATA CLASS TARIFASSOCIOS QUE IMPLEMENTA PARCELABLE

        var objTarifa = intent.getParcelableExtra<TarifasSocios>("tarifaPlatinum")



        var tvNomDisPlati = findViewById<TextView>(R.id.tvNomDisPlati)
        var tvHorDisPlati = findViewById<TextView>(R.id.tvHorDisPlati)
        var tvTarifaPlat = findViewById<TextView>(R.id.tvTarifaPlati)
        var tvDiaPlati= findViewById<TextView>(R.id.tvDiaPlatinum)


        //ASIGNO LA INFORMACIÓN QUE TRAIGO DEL OBJETO DE LAS DATACLASS
        tvNomDisPlati.text = objDisciplina?.nombre.toString()
        tvHorDisPlati.text = objDisciplina?.horario.toString()
        tvTarifaPlat.text = "Precio: $" + objTarifa?.tarifaPlatinum.toString()
        tvDiaPlati.text = "Día: " + objDisciplina?.dia.toString()


    }
}