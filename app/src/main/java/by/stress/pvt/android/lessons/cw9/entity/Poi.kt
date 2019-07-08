package by.stress.pvt.android.lessons.cw9.entity

import com.google.gson.annotations.SerializedName

class Poi (

    @SerializedName("id")
    val id: String,

    val coordinate: Coordinate?,
    val fleetType: FleetType?,
    val heading: Double?
)
