package com.example.tp1alvarez

import android.os.Parcel
import android.os.Parcelable

data class Disciplina(var nombre : String, var horario : String, var dia : String) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nombre)
        parcel.writeString(horario)
        parcel.writeString(dia)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Disciplina> {
        override fun createFromParcel(parcel: Parcel): Disciplina {
            return Disciplina(parcel)
        }

        override fun newArray(size: Int): Array<Disciplina?> {
            return arrayOfNulls(size)
        }
    }

}
