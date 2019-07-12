package by.stress.pvt.android.lessons

import by.stress.pvt.android.lessons.cw12.Student
import by.stress.pvt.android.lessons.cw12.StudentApi
import by.stress.pvt.android.lessons.cw12.StudentRepositoryRemote
import by.stress.pvt.android.lessons.cw9.entity.NetProvider
import org.junit.Assert
import org.junit.Test
import org.mockito.*
import org.mockito.Mockito
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


private var BASE_URL = "https://api.backendless.com/E163E673-36FD-B5FD-FF9E-C462159AB200/0A0C1DFA-86BF-A2C7-FFEA-DA10A0BCE500/"

class StudentRepositoryRemoteTest2 {

    @Mock
    lateinit var api: StudentApi


    init {

        MockitoAnnotations.initMocks(this)
    }


    @Test
    fun callGetRequest() {
/*
        Mockito
            .`when`(api.getSudents(Matchers.anyInt(), Matchers.any()))
            .thenReturn(object: Call<List<Student>>
            {
                override fun execute(): Response<List<Student>> {
                    return Response.success(emptyList())
                }

                override fun enqueue(callback: Callback<List<Student>>) {}

                override fun isExecuted(): Boolean {}

                override fun clone(): Call<List<Student>> {}
            )
        // если обратятся к такому методу с такими переменными, то вернуть это...
*/
        val repository = StudentRepositoryRemote(api)

        val studentList = repository.get(20, 0)

        //println(studentList.toString())

        //Assert.assertTrue(studentList.size == 2)
    }

}