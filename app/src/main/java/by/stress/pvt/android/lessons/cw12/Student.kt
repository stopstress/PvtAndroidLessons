package by.stress.pvt.android.lessons.cw12

import com.google.gson.annotations.SerializedName

data class Student(
    @SerializedName("objectId")
    val Id: String,

    val name: String,
    val imageUrl: String,
    val age: Int
)

// https://develop.backendless.com/Cw/data/tables/student
// chrome-extension://coohjcphdfgbiolnekdpbcijmhambjff/index.html