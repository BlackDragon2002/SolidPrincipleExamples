package `1-singleResponsibilityPrinciple`.Solution

import java.io.File

data class User(
    val id:String,
    val name:String,
    val email:String,
    val password:String
)
class MainRepository(
    private val auth:FirebaseAuth,
    private val fileLogger: FileLogger
){
    suspend fun loginUser(user:User){
        try {
            auth.basicAuthentication(user).await()
        }catch (e:Exception){
            fileLogger.logError(e.toString())
        }
    }
}
class FileLogger{
    fun logError(error:String){
        val file=File(error)
        file.appendText(
            text = error
        )
    }
}