package `1-singleResponsibilityPrinciple`.Violation

import java.io.File

data class User(
    val id:String,
    val name:String,
    val email:String,
    val password:String
)
class MainRepository(
    private val auth:FirebaseAuth
){
    suspend fun loginUser(user:User){
        try {
            auth.basicAuthentication(user).await()
        }catch (e:Exception){
            val file= File("error.txt")
            file.appendText(
                text = e.message.toString()
            )
        }
    }
}
