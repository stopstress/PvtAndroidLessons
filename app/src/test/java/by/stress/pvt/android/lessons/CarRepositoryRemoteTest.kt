package by.stress.pvt.android.lessons

import by.stress.pvt.android.lessons.cw9.CarRepositoryRemote
import by.stress.pvt.android.lessons.cw9.CarRepositoryResult
import by.stress.pvt.android.lessons.cw9.entity.CoordParams
import by.stress.pvt.android.lessons.cw9.entity.Coordinate
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class CarRepositoryRemoteTest {
    @Test

    fun addition_isCorrect() {

       // val rep = CarRepositoryRemote()

        val params = CoordParams(
            Coordinate(1.4, 2.4),
            Coordinate(1.5, 1.6)
        )
//
//        rep.getCarByCoord(params, CarRepositoryResult{
//            override fun onS
//
//        })


        //assertEquals(4, 2 + 2)
    }
}
