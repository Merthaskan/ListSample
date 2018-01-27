package androideduio.com.listsample.singleton

import androideduio.com.listsample.model.StudentInfo

/**
 * Created by merthaskan on 1/27/2018.
 */
object AppUtil {
    fun getStudents(): List<StudentInfo> {
        val students = ArrayList<StudentInfo>()
        students.add(StudentInfo(150115823,"Mert HASKAN","Marmara Univesitesi"))
        students.add(StudentInfo(150115822,"Özge GÜNAY","Marmara Univesitesi"))
        return students
    }
}