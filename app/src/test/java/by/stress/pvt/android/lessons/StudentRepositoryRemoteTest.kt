package by.stress.pvt.android.lessons

import by.stress.pvt.android.lessons.cw12.StudentApi
import by.stress.pvt.android.lessons.cw12.StudentRepositoryRemote
import by.stress.pvt.android.lessons.cw9.entity.NetProvider
import org.junit.Assert
import org.junit.Test

private var BASE_URL = "https://api.backendless.com/E163E673-36FD-B5FD-FF9E-C462159AB200/0A0C1DFA-86BF-A2C7-FFEA-DA10A0BCE500/"

class StudentRepositoryRemoteTest {

    private val api: StudentApi

    init {
        val retrofit = NetProvider.provideRetrofit(
            BASE_URL,
            NetProvider.provideOkHttp(),
            NetProvider.provideGson()
        )
        api = NetProvider.provideStudentApi(retrofit)
    }


    @Test
    fun callGetRequest() {
        val repository = StudentRepositoryRemote(api)

        val studentList = repository.get(20, 0)

        println(studentList.toString())

        Assert.assertTrue(studentList.size == 2)
    }

}