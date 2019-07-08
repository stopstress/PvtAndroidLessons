package by.stress.pvt.android.lessons.cw9

import by.stress.pvt.android.lessons.cw9.entity.CoordParams
import by.stress.pvt.android.lessons.cw9.entity.Poi
import java.util.*

interface CarRepository {
    // репозиторий реализует CRUD
    // типа DAO
    // сохранили получили

        fun getCarByCoord(params: CoordParams, listener: CarRepositoryResult)
}

interface CarRepositoryResult {
    fun onSuccess(list: List<Poi>)
    fun onError(throwable: Throwable)
}