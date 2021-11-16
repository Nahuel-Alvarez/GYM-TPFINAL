package com.example.tp1alvarez

import android.os.Parcel
import android.os.Parcelable

data class TarifasSocios (var tarifaPlatinum : Int = 3500,var tarifaBronce : Int = 2000) :
    Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(tarifaPlatinum)
        parcel.writeInt(tarifaBronce)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<TarifasSocios> {
        override fun createFromParcel(parcel: Parcel): TarifasSocios {
            return TarifasSocios(parcel)
        }

        override fun newArray(size: Int): Array<TarifasSocios?> {
            return arrayOfNulls(size)
        }
    }


}