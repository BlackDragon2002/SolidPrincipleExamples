package `5-Dependency inversion principle`.Solution


interface MessageService {
    fun sendMessage()
}
class Email:MessageService{
    override fun sendMessage(){}
}
class SMS:MessageService{
    override fun sendMessage(){}
}
class Notification() {
    private val iMessageService: MessageService=Email()
    fun promotionalNotification() {
        iMessageService.sendMessage()
    }
}