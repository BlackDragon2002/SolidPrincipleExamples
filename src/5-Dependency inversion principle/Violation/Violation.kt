package `5-Dependency inversion principle`.Violation

class Email {
    fun sendEmail(){}
}

class Notification {
    private val email: Email = Email()

    fun promotionalNotification() {
        email.sendEmail()
    }
}
