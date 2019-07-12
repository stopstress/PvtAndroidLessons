package by.stress.pvt.android.lessons.cw12

class StudentRepositoryRemote (private val api: StudentApi): StudentRepository {

    override fun get(pageSize: Int, offset: Int): List<Student> {
        val result = api.getSudents(pageSize, offset).execute()

            // в проекте реальном - заменить на листенер

        return result.body() ?: emptyList()
    }

    override fun delete(id: String): Boolean {
return true
    }

    override fun createOrUpdate(student: Student) {

    }

    override fun getById(): Boolean {
return true
    }
}