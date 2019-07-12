package by.stress.pvt.android.lessons.cw12

interface StudentRepository {

    fun get(pageSize: Int, offset: Int) : List<Student>

    fun delete(id: String): Boolean

    fun createOrUpdate(student: Student)

    fun getById(): Boolean

}